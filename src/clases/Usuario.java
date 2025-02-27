package clases;

public class Usuario {

	private String nombre;
	private String contraseña;
	
	public Usuario(String nombre, String contraseña) 
	{
		this.nombre = nombre;
		this.contraseña = contraseña;
	}
	public Usuario() 
	{
		this.nombre = "";
		this.contraseña = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contraseña;
	}

	public void setContrasena(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contraseña=" + contraseña + "]";
	}
	
	
}
