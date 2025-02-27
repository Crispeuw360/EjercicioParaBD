package main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.TreeMap;

import clases.*;
import utilidades.Utilidades;

public class Main {
	public static void actualizar(ImplementacionBD im) {
		String usuario, contraseña;
		System.out.println("Introduce usuario: ");
		usuario=Utilidades.introducirCadena();
		System.out.println("Introduce la nueva contraseña:");
		contraseña=Utilidades.introducirCadena();
		if (im.actualizarUsuario(new Usuario(usuario, contraseña))) {
			System.out.println("ok");
		}else {
			System.out.println("no ok");
		}
	}
	public static void insertar(ImplementacionBD im) {
		String usuario, contraseña;
		System.out.println("Introduce usuario: ");
		usuario=Utilidades.introducirCadena();
		System.out.println("Introduce contraseña:");
		contraseña=Utilidades.introducirCadena();
		if (im.insertarUsuario(new Usuario(usuario, contraseña))) {
			System.out.println("ok");
		}else {
			System.out.println("no ok");
		}
	}
	
	public static void borrar(ImplementacionBD im) {
		String usuario;
		System.out.println("Introduce usuario: ");
		usuario=Utilidades.introducirCadena();
		if (im.borrarUsuario(usuario)) {
			System.out.println("ok");
		}else {
			System.out.println("no ok");
		}
	}
	public static void mostrar(ImplementacionBD im) {
		Map<String, Usuario> usuarios = new TreeMap<>();
		usuarios=im.consultaUsuarios();
		for (Usuario u:usuarios.values()) {
			System.out.println(u);
		}
	}
	
	public static int menu() {
		System.out.println("1-Insertar");
		System.out.println("2-Modificar");
		System.out.println("3-Borrar");
		System.out.println("4-Mostrar");
		System.out.println("0-Salir");
		return Utilidades.leerInt("¿Que quieres hacer?", 0, 4);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		String usuario, contraseña;
		
		ImplementacionBD im=new ImplementacionBD();
		System.out.println("Introduce usuario: ");
		usuario=Utilidades.introducirCadena();
		System.out.println("Introduce contraseña:");
		contraseña=Utilidades.introducirCadena();
		
		if ((im.comprobarUsuario(new Usuario(usuario, contraseña)))) {
			do {
				opcion=menu();
				switch (opcion) {
					case 1:insertar(im);
						break;
					case 2: actualizar(im);
						break;
					case 3: borrar(im);
						break;
					case 4: mostrar(im);
						break;
					case 0: System.out.println("Agur");
					break;
				}
			
			}while(opcion!=0);
		}else {
			System.out.println("Login error");
		}
	}
	

}
