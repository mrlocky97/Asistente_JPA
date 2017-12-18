package cursoj.datos.modelo;

import java.io.Serializable;

import javax.persistence.Column;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	@Column(name = "nombre", nullable = false, unique = true, length = 30)
	private String nombre;

	@Column(name = "apellido1", nullable = false, unique = true, length = 30)
	private String apellido1;

	@Column(name = "apellido2", nullable = false, unique = true, length = 30)
	private String apellido2;

	@Column(name = "mail", nullable = false, unique = true, length = 40)
	private String mail;

	@Column(name = "password", nullable = false, unique = true, length = 10)
	private String password;

	@Column(name = "das", nullable = false, unique = true, length = 10)
	private String das;

	@Column(name = "enable", nullable = false, unique = true, length = 1)
	private Integer enabled;

	// metodos get y set
	// ********************************************************************

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDas() {
		return das;
	}

	public void setDas(String das) {
		this.das = das;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", mail=" + mail + ", password=" + password + ", das=" + das + ", enabled=" + enabled + "]";
	}

}
