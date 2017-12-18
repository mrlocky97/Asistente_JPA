package cursoj.datos.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class DaoBase {
public static final String JPA_UNIT = "cursoj";
	
	public EntityManagerFactory factory;
	public EntityManager entityManager;
	
	//CONSTRUCTOR
	public DaoBase(EntityManagerFactory factory, EntityManager entityManager) {
		this.factory = factory;
		this.entityManager = entityManager;
	}
	
	public void close(){
		this.entityManager.close();
		this.factory.close();
	}
	//transacciones
	//..................................................................
	public void beginTransaction(){
		this.entityManager.getTransaction().begin();
	}
	
	public void commit(){
		this.entityManager.getTransaction().commit();
	}
	
	public void rollBack(){
		entityManager.getTransaction().rollback();
	}

	
	
}
