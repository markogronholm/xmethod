package fi.xmethod.crm_db;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fi.xmethod.crm_db.User;
import fi.xmethod.util.Username;

public class DBEntityTest extends DBTestCase {
	private static final Logger logger = LoggerFactory.getLogger(DBEntityTest.class);
	
	private Integer persistEntity(DBEntity entity) {
		logger.debug("Persisting User entity into the database");
		EntityManager em = getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(entity);
		tx.commit();
		return entity.getId();
	}
	
	private <T extends DBEntity> T loadEntity (final Class<T> entityClass, final Integer dbkey) {
		EntityManager em = getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		T entity = em.find(entityClass, dbkey);
		tx.commit();
		return entity;
	}
	
	@Test
	public void testUserEntry () {
		// Creating User
		logger.debug("Creating User entity");
		Integer dbkey;
		User user = new User();
		user.setUsername(new Username("testuser"));
		user.setForename("Teppo");
		user.setSurname("Testaaja");
		user.setPassword("password");
		
		// Persisting User entity
		logger.debug("Persisting User entity into the database");		
		dbkey = this.persistEntity(user);
		
		// Reading User entity from the database
		logger.debug("Reading User Entity from the database");
		loadEntity(User.class, dbkey);
		
		// Checking username was stored correctly in the database
		assertEquals("Username is not correct in the database", "testuser", user.getUsername().rawString());
	}
}
