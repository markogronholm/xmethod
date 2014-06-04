package fi.xmethod.crm_db;

// Generated Feb 20, 2014 8:20:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * PeriodEvent generated by hbm2java
 */
public class PeriodEvent implements java.io.Serializable {

	private int rowId;
	private Period period;
	private Person person;
	private short event;
	private Date eventDate;

	public PeriodEvent() {
	}

	public PeriodEvent(int rowId, Period period, Person person, short event,
			Date eventDate) {
		this.rowId = rowId;
		this.period = period;
		this.person = person;
		this.event = event;
		this.eventDate = eventDate;
	}

	public int getRowId() {
		return this.rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	public Period getPeriod() {
		return this.period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public short getEvent() {
		return this.event;
	}

	public void setEvent(short event) {
		this.event = event;
	}

	public Date getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

}