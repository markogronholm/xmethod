package fi.xmethod.crm_db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class DBTestCase {
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private static final Logger logger = LoggerFactory.getLogger(DBTestCase.class);

	@Before
	public void createEntityManager () {
		//final Logger logger = LoggerFactory.getLogger(DBTestCase.class);
		logger.debug("Opening database connection");
		entityManagerFactory = Persistence.createEntityManagerFactory("TestingPersistenceUnit");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	@After
	public void closeEntityManager() {
		entityManager.close();
	}
	
	public EntityManager getEntityManager () {
		return this.entityManager;
	}
}
