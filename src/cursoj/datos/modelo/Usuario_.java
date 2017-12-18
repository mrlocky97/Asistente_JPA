package cursoj.datos.modelo;

import javax.persistence.metamodel.SingularAttribute;

public class Usuario_ {
	public static volatile SingularAttribute<Usuario, Integer> id;
	public static volatile SingularAttribute<Usuario, String> nombre;
	public static volatile SingularAttribute<Usuario, String> apellido1;
	public static volatile SingularAttribute<Usuario, String> apellido2;
	public static volatile SingularAttribute<Usuario, String> mail;
	public static volatile SingularAttribute<Usuario, String> password;
	public static volatile SingularAttribute<Usuario, Integer> enabled;

}
