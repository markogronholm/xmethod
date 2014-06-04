package fi.xmethod.crm_db;

import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import fi.xmethod.util.ConstantList;
import fi.xmethod.util.Username;

/**
 * 
 * @author markogronholm
 *
 */
@Entity
@Table(name = "xmthd_user")
public class User extends DBEntity {

	private static final long serialVersionUID = 1L;	
	
	/**
	 * Username
	 */
	@NotNull
	@Size(min = ConstantList.USERNAME_LENGTH_MIN, max = ConstantList.USERNAME_LENGTH_MAX)
	@Embedded
    @AttributeOverrides({
        @AttributeOverride(	name="username", 
        					column=@Column(name="username", 
        					length = ConstantList.USERNAME_LENGTH_MAX))
    })	
	//@Column(name = "username", length = ConstantList.USERNAME_LENGTH_MAX, nullable = false)
	private Username username;
	

	public User () {}

	
	public Username getUsername() {
		return username;
	}
	
	public void setUsername(Username username) {
		this.username = username;
	}
	
	/**
	 * Password
	 */
	@NotNull
	@Size(min = ConstantList.PASSWORD_LENGTH_MIN, max = ConstantList.PASSWORD_LENGTH_MAX)
	@Column(name = "password", length = ConstantList.PASSWORD_LENGTH_MAX)
	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Forename
	 */
	@NotNull
	@Size(min = ConstantList.FORENAME_LENGTH_MIN, max = ConstantList.FORENAME_LENGTH_MAX)
	@Column(name = "forename", length = ConstantList.FORENAME_LENGTH_MAX)
	private String forename;
	
	public String getForename() {
		return forename;
	}
	
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	/**
	 * Surname
	 */
	@NotNull
	@Size(min = ConstantList.SURNAME_LENGTH_MIN, max = ConstantList.SURNAME_LENGTH_MAX)
	@Column(name = "surname", length = ConstantList.SURNAME_LENGTH_MAX)
	private String surname;
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
