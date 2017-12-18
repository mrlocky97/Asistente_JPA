package cursoj.aplicacion;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "beanApplication") // ,eager=true
@ApplicationScoped
public class MBeanApp implements Serializable {
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init() {
		System.out.println("beanAplicacion INICIALIZANDO...");
	}

}
