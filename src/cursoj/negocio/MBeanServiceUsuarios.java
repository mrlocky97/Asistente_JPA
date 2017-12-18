package cursoj.negocio;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import cursoj.datos.modelo.DaoUsuarios;
import cursoj.datos.modelo.Usuario;

public class MBeanServiceUsuarios implements Serializable {

	private static final long serialVersionUID = 1L;

	// atributos
	// ...............................................
	//mirar el otro atributo id de tipo string  esta en la misma clase del proyecto jsf2
	private DaoUsuarios daoUsuarios;

	// inicializacion
	// .............................................................

	@PostConstruct
	public void init() {
		this.daoUsuarios = new DaoUsuarios();
	}

	public List<Usuario> obtenerInformePersonal() {
		return this.daoUsuarios.findAll();
	}

	public Boolean altaUsuario(Usuario persona) {
		Boolean res = Boolean.TRUE;
		this.daoUsuarios.save(persona);
		return res;
	}
	
	// metodos get y set
	// **************************************************************

	public DaoUsuarios getDaoUsuarios() {
		return daoUsuarios;
	}

	public void setDaoUsuarios(DaoUsuarios daoUsuarios) {
		this.daoUsuarios = daoUsuarios;
	}

}
