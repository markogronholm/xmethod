package fi.xmethod.crm_db;

// Generated Feb 20, 2014 8:20:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Person generated by hbm2java
 */
public class Person implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int personId;
	private short sex;
	private short role;
	private short nativeLanguage;
	private Set personNames = new HashSet(0);
	private Set personalTrainerClientsForPersonId = new HashSet(0);
	private Set personAddresses = new HashSet(0);
	private Set personalTrainerClubs = new HashSet(0);
	private Set workoutCards = new HashSet(0);
	private Set personIdentifications = new HashSet(0);
	private Set periodEvents = new HashSet(0);
	private Set personalTrainerClientsForTrainerId = new HashSet(0);
	private Set personEmails = new HashSet(0);
	private Set personPhones = new HashSet(0);

	public Person() {
	}

	public Person(int personId, short sex, short role, short nativeLanguage) {
		this.personId = personId;
		this.sex = sex;
		this.role = role;
		this.nativeLanguage = nativeLanguage;
	}

	public Person(int personId, short sex, short role, short nativeLanguage,
			Set personNames, Set personalTrainerClientsForPersonId,
			Set personAddresses, Set personalTrainerClubs, Set workoutCards,
			Set personIdentifications, Set periodEvents,
			Set personalTrainerClientsForTrainerId, Set personEmails,
			Set personPhones) {
		this.personId = personId;
		this.sex = sex;
		this.role = role;
		this.nativeLanguage = nativeLanguage;
		this.personNames = personNames;
		this.personalTrainerClientsForPersonId = personalTrainerClientsForPersonId;
		this.personAddresses = personAddresses;
		this.personalTrainerClubs = personalTrainerClubs;
		this.workoutCards = workoutCards;
		this.personIdentifications = personIdentifications;
		this.periodEvents = periodEvents;
		this.personalTrainerClientsForTrainerId = personalTrainerClientsForTrainerId;
		this.personEmails = personEmails;
		this.personPhones = personPhones;
	}

	public int getPersonId() {
		return this.personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public short getSex() {
		return this.sex;
	}

	public void setSex(short sex) {
		this.sex = sex;
	}

	public short getRole() {
		return this.role;
	}

	public void setRole(short role) {
		this.role = role;
	}

	public short getNativeLanguage() {
		return this.nativeLanguage;
	}

	public void setNativeLanguage(short nativeLanguage) {
		this.nativeLanguage = nativeLanguage;
	}

	public Set getPersonNames() {
		return this.personNames;
	}

	public void setPersonNames(Set personNames) {
		this.personNames = personNames;
	}

	public Set getPersonalTrainerClientsForPersonId() {
		return this.personalTrainerClientsForPersonId;
	}

	public void setPersonalTrainerClientsForPersonId(
			Set personalTrainerClientsForPersonId) {
		this.personalTrainerClientsForPersonId = personalTrainerClientsForPersonId;
	}

	public Set getPersonAddresses() {
		return this.personAddresses;
	}

	public void setPersonAddresses(Set personAddresses) {
		this.personAddresses = personAddresses;
	}

	public Set getPersonalTrainerClubs() {
		return this.personalTrainerClubs;
	}

	public void setPersonalTrainerClubs(Set personalTrainerClubs) {
		this.personalTrainerClubs = personalTrainerClubs;
	}

	public Set getWorkoutCards() {
		return this.workoutCards;
	}

	public void setWorkoutCards(Set workoutCards) {
		this.workoutCards = workoutCards;
	}

	public Set getPersonIdentifications() {
		return this.personIdentifications;
	}

	public void setPersonIdentifications(Set personIdentifications) {
		this.personIdentifications = personIdentifications;
	}

	public Set getPeriodEvents() {
		return this.periodEvents;
	}

	public void setPeriodEvents(Set periodEvents) {
		this.periodEvents = periodEvents;
	}

	public Set getPersonalTrainerClientsForTrainerId() {
		return this.personalTrainerClientsForTrainerId;
	}

	public void setPersonalTrainerClientsForTrainerId(
			Set personalTrainerClientsForTrainerId) {
		this.personalTrainerClientsForTrainerId = personalTrainerClientsForTrainerId;
	}

	public Set getPersonEmails() {
		return this.personEmails;
	}

	public void setPersonEmails(Set personEmails) {
		this.personEmails = personEmails;
	}

	public Set getPersonPhones() {
		return this.personPhones;
	}

	public void setPersonPhones(Set personPhones) {
		this.personPhones = personPhones;
	}

}
