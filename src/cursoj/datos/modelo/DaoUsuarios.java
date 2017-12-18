package cursoj.datos.modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


public class DaoUsuarios {
	// creo la bariable db para llamar a sus metodos
	private DaoBase db;
	public EntityManager entityManager;

	public DaoUsuarios() {
		super();
	}

	// guardar usuario
	public void save(Usuario usuario) {
		try {
			db.beginTransaction();
			db.entityManager.persist(usuario);
			db.commit();
		} catch (Exception e) {
			e.printStackTrace();
			db.rollBack();
		}
	}

	// editar usuario
	public void update(Usuario usuario) {
		try {
			db.beginTransaction();
			db.entityManager.merge(usuario);
			db.commit();
		} catch (Exception e) {
			e.printStackTrace();
			db.rollBack();
		}
	}

	// borrar usuario
	public void delete(Usuario usuario) {
		try {
			db.beginTransaction();
			db.entityManager.remove(usuario);
			db.commit();
		} catch (Exception e) {
			e.printStackTrace();
			db.rollBack();
		}
	}

	// guardar lista
	public void saveList(List<Usuario> usuario) {
		try {
			db.beginTransaction();
			for (Usuario elem : usuario) {
				db.entityManager.persist(elem);
			}
			db.commit();
		} catch (Exception e) {
			e.printStackTrace();
			db.rollBack();
		}

	}
	// CONSULTAS
	// .........................................................................

	@SuppressWarnings("unchecked")
	public List<Usuario> findAll() {
		return entityManager.createQuery(("FROM  USUARIOS")).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> findByGrupo(String grupo) {
		List<Usuario> personas = null;
		try {
			personas = this.entityManager.createNamedQuery("usuarios_findByGrupo").setParameter("uGrupo", grupo)
					.getResultList();

		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return personas;
	}
	
	@SuppressWarnings("unchecked")
	public Integer getCountByGrupo(String grupo){		
		Integer count = null;
		try {
			Query q = entityManager.createNamedQuery("usuarios_countByGroup")
					 .setParameter("uGrupo",grupo);
			count = new Integer(q.getSingleResult().toString());
		} 
		catch (RuntimeException e) {
			e.printStackTrace();
		}
		return count;	
	}
	
	public String findNameById(Integer id,String coTabla){
		String name = null;
		try {
			name = (entityManager.createNamedQuery("usuarios_getNameById")
					.setParameter("uGrupo",id)
					.getSingleResult()).toString();
		} 
		catch (RuntimeException e) {
			e.printStackTrace();
		}		
		return name;
	};
}