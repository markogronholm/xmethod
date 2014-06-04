package fi.xmethod.crm_db;

// Generated Feb 20, 2014 8:20:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * PersonalTrainerClub generated by hbm2java
 */
public class PersonalTrainerClub implements java.io.Serializable {

	private int rowId;
	private Club club;
	private Person person;
	private Date since;
	private short status;

	public PersonalTrainerClub() {
	}

	public PersonalTrainerClub(int rowId, Club club, Person person, Date since,
			short status) {
		this.rowId = rowId;
		this.club = club;
		this.person = person;
		this.since = since;
		this.status = status;
	}

	public int getRowId() {
		return this.rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	public Club getClub() {
		return this.club;
	}

	public void setClub(Club club) {
		this.club = club;
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

	public short getStatus() {
		return this.status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

}