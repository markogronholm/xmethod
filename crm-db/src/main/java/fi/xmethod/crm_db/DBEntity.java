package fi.xmethod.crm_db;

import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;

/**
 * Upper class for all database entity classes
 */
@MappedSuperclass
public abstract class DBEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id = null;
	
	public Integer getId() {
		return id;
	}
	
	protected void setId(final Integer id) {
		this.id = id;
	}

}
