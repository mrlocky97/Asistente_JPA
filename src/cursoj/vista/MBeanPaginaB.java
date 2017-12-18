package cursoj.vista;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import cursoj.datos.modelo.Usuario;

import cursoj.negocio.MBeanServiceUsuarios;

@ManagedBean(name = "mBeanPaginaB")
@ViewScoped
public class MBeanPaginaB implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{mBeanServiceUsuarios}")
	MBeanServiceUsuarios mBeanServiceUsuarios;

	private List<Usuario> listUsuarios;

	// inicializacion
	// .............................................................
	@PostConstruct
	public void init() {
		this.listUsuarios = mBeanServiceUsuarios.obtenerInformePersonal();
	}

	// metodos get y set
	// .............................................................

	public MBeanServiceUsuarios getmBeanServiceUsuarios() {
		return mBeanServiceUsuarios;
	}

	public void setmBeanServiceUsuarios(MBeanServiceUsuarios mBeanServiceUsuarios) {
		this.mBeanServiceUsuarios = mBeanServiceUsuarios;
	}

	public List<Usuario> getListUsuarios() {
		return listUsuarios;
	}

	public void setListUsuarios(List<Usuario> listUsuarios) {
		this.listUsuarios = listUsuarios;
	}

}
