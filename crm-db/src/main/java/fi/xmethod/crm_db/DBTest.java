package fi.xmethod.crm_db;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBTest {
	private static SessionFactory factory;
	static final Logger logger = Logger.getLogger(DBTest.class);
	
	
	public DBTest () {
		
	}

	public static void main (String args[]) {
		try{
			//Configure logger
			BasicConfigurator.configure();
			if (logger.isInfoEnabled())
				logger.info("Testing...");

			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        List<Person> result = session.createQuery("from Person").list();
	        Iterator<Person> i = result.iterator();
	        while (i.hasNext()) {
	        	System.out.println(((Person) i.next()).getPersonId());
	        }
	        session.getTransaction().commit();
	        HibernateUtil.getSessionFactory().close();
	        
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
		System.out.println("Closing...");
		System.exit(0);
	}
}
