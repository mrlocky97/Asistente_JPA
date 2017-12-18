package cursoj.negocio;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import cursoj.aplicacion.MBeanSesion;

@ManagedBean(name = "mBeanServiceSecurity")
@SessionScoped
public class MBeanServiceSecurity implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String PAGE_AUT_SUCCESS = "paginaA";
	public static final String PAGE_AUT_FAILED = "error";

	@ManagedProperty(value = "#{mBeanSesion}")
	MBeanSesion mBeanSesion;
	// mirar estas variables porque pueden variar para nuestra validacion
	private String loginId;
	private String loginPassword;

	// inicializacion
	// .............................................................
	@PostConstruct
	public void init() {
	}

	public String authenticate() {
		String pageNavigate = null;
		if (this.loginId.equals("cursoj") && loginPassword.equals("cursoj")) {
			this.mBeanSesion.setUserId(this.loginId);
			pageNavigate = MBeanServiceSecurity.PAGE_AUT_SUCCESS;
		} else {
			pageNavigate = MBeanServiceSecurity.PAGE_AUT_FAILED;
		}
		return pageNavigate;
	}

	// metodos get y set
	// .............................................................

	MBeanSesion getmBeanSesion() {
		return mBeanSesion;
	}

	public void setmBeanSesion(MBeanSesion mBeanSesion) {
		this.mBeanSesion = mBeanSesion;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	};

}
