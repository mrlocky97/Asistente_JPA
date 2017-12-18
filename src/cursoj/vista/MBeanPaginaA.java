package cursoj.vista;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import cursoj.aplicacion.MBeanSesion;
import cursoj.datos.modelo.Usuario;
import cursoj.negocio.MBeanServiceUsuarios;

@ManagedBean(name = "mBeanPaginaA")
@SessionScoped
public class MBeanPaginaA implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String PAGE_ALTA_SUCCESS = "paginaB";

	@ManagedProperty(value = "#{mBeanSesion}")
	MBeanSesion mBeanSesion;

	@ManagedProperty(value = "#{MBeanServiceUsuarios}")
	MBeanServiceUsuarios mBeanServiceUsuarios;

	private Usuario usuario;

	// inicializacion
	// .............................................................

	@PostConstruct
	public void init() {
		this.usuario = new Usuario();
	}

	public String ejecutarAlta() {
		String pageNavigate = MBeanPaginaA.PAGE_ALTA_SUCCESS;
		this.mBeanServiceUsuarios.altaUsuario(this.usuario);
		return pageNavigate;
	};

	// metodos get y set
	// .............................................................

	public MBeanServiceUsuarios getmBeanServiceUsuarios() {
		return mBeanServiceUsuarios;
	}

	public void setmBeanServicePersonas(MBeanServiceUsuarios mBeanServiceUsuarios) {
		this.mBeanServiceUsuarios = mBeanServiceUsuarios;
	}

	public MBeanSesion getmBeanSesion() {
		return mBeanSesion;
	}

	public void setmBeanSesion(MBeanSesion mBeanSesion) {
		this.mBeanSesion = mBeanSesion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}