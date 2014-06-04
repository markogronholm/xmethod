package fi.xmethod.crm;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;


public class ExcelManager {
	private Workbook wb;
	private File excelFile;
	
	public ExcelManager(File file) {
		this.excelFile = file;
	}
	
	public void loadExcel() throws InvalidFormatException, IOException {
		// import org.apache.poi.ss.usermodel.*;

		Workbook wb = WorkbookFactory.create(this.excelFile);
	    Sheet sheet1 = wb.getSheetAt(0);
	    
	    Row r = sheet1.getRow(8);
	    System.out.println(	r.getCell(0).getRichStringCellValue().getString() + " : " + 
	    					r.getCell(1).getRichStringCellValue().getString() + " : " + 
	    					r.getCell(2).getRichStringCellValue().getString());
	    
	    for (Row row : sheet1) {
	        for (Cell cell : row) {
	            CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
	            System.out.print(cellRef.formatAsString());
	            System.out.print(" - ");

	            switch (cell.getCellType()) {
	                case Cell.CELL_TYPE_STRING:
	                    System.out.println(cell.getRichStringCellValue().getString());
	                    break;
	                case Cell.CELL_TYPE_NUMERIC:
	                    if (DateUtil.isCellDateFormatted(cell)) {
	                        System.out.println(cell.getDateCellValue());
	                    } else {
	                        System.out.println(cell.getNumericCellValue());
	                    }
	                    break;
	                case Cell.CELL_TYPE_BOOLEAN:
	                    System.out.println(cell.getBooleanCellValue());
	                    break;
	                case Cell.CELL_TYPE_FORMULA:
	                    System.out.println(cell.getCellFormula());
	                    break;
	                default:
	                    System.out.println();
	            }
	        }
	    }
	}
	
	public static void main (String argv[]) {
		ExcelManager manager = new ExcelManager(new File("/Users/markogronholm/Documents/Projects/x-method/H1_seurantakaavake.xlsx"));
		try {
			manager.loadExcel();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
