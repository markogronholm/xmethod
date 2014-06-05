package fi.xmethod.util;

import javax.persistence.Embeddable;

@Embeddable
public class Username extends SecureString {
	protected static final String pattern = "[\\w_\\d]+";
	
	private String username;
	
	public Username() {
		super();
	}
	
	public Username(String username) {
		super(username, pattern);
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.setValue(username);
	}
	
}
