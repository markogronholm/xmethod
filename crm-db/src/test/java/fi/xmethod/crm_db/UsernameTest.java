package fi.xmethod.crm_db;

import fi.xmethod.util.Username;
import fi.xmethod.util.SuspiciousOperation;
import junit.framework.TestCase;

import org.junit.Test;

public class UsernameTest extends TestCase {

	@Test(expected = SuspiciousOperation.class)
	public void testUsername () {
		Username username = new Username ("admin");
		assertTrue(username.toString(), true);
	}
}
