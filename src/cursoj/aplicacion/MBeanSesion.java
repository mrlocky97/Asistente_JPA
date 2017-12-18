package cursoj.aplicacion;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mBeanSession") // ,eager=true
@SessionScoped
public class MBeanSesion {
	private static final long serialVersionUID = 1L;
	private String userId;

	// inicializacion
	// .............................................................
	@PostConstruct
	public void init() {
		System.out.println("mBeanSession init");
	}// fin de metodo

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
