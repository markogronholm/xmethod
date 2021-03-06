package fi.xmethod.crm_db;

// Generated Feb 20, 2014 8:20:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Club generated by hbm2java
 */
public class Club implements java.io.Serializable {

	private int clubId;
	private String name;
	private Set clubContactInformations = new HashSet(0);
	private Set clubAddresses = new HashSet(0);
	private Set personalTrainerClubs = new HashSet(0);

	public Club() {
	}

	public Club(int clubId, String name) {
		this.clubId = clubId;
		this.name = name;
	}

	public Club(int clubId, String name, Set clubContactInformations,
			Set clubAddresses, Set personalTrainerClubs) {
		this.clubId = clubId;
		this.name = name;
		this.clubContactInformations = clubContactInformations;
		this.clubAddresses = clubAddresses;
		this.personalTrainerClubs = personalTrainerClubs;
	}

	public int getClubId() {
		return this.clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getClubContactInformations() {
		return this.clubContactInformations;
	}

	public void setClubContactInformations(Set clubContactInformations) {
		this.clubContactInformations = clubContactInformations;
	}

	public Set getClubAddresses() {
		return this.clubAddresses;
	}

	public void setClubAddresses(Set clubAddresses) {
		this.clubAddresses = clubAddresses;
	}

	public Set getPersonalTrainerClubs() {
		return this.personalTrainerClubs;
	}

	public void setPersonalTrainerClubs(Set personalTrainerClubs) {
		this.personalTrainerClubs = personalTrainerClubs;
	}

}
