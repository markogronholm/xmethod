package fi.xmethod.crm_db;

// Generated Feb 20, 2014 8:20:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * PersonName generated by hbm2java
 */
public class PersonName implements java.io.Serializable {

	private int rowId;
	private Person person;
	private Date since;
	private String forename;
	private String surname;

	public PersonName() {
	}

	public PersonName(int rowId, Person person, Date since, String forename,
			String surname) {
		this.rowId = rowId;
		this.person = person;
		this.since = since;
		this.forename = forename;
		this.surname = surname;
	}

	public int getRowId() {
		return this.rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Date getSince() {
		return this.since;
	}

	public void setSince(Date since) {
		this.since = since;
	}

	public String getForename() {
		return this.forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
