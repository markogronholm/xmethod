package fi.xmethod.crm_db;

// Generated Feb 20, 2014 8:20:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ClubContactInformation generated by hbm2java
 */
public class ClubContactInformation implements java.io.Serializable {

	private int rowId;
	private Club club;
	private Date since;
	private String person;
	private String phoneNumber;
	private String emailAddress;

	public ClubContactInformation() {
	}

	public ClubContactInformation(int rowId, Club club, Date since,
			String person, String phoneNumber, String emailAddress) {
		this.rowId = rowId;
		this.club = club;
		this.since = since;
		this.person = person;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
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

	public Date getSince() {
		return this.since;
	}

	public void setSince(Date since) {
		this.since = since;
	}

	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
