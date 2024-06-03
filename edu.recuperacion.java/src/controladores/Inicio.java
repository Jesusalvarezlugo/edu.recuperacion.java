package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.AlumnoDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;
import utilidades.Util;

public class Inicio {

	static public final String rutaRaizLogs="C:\\Users\\Jesús\\workspace-recuperacion-java\\logs\\";
	static public final String nombreLog="log.txt";
	static public final String rutaCompletaLog=rutaRaizLogs.concat(Util.nombreFichero());
	static public List<AlumnoDto> listaAlumnos = new ArrayList<AlumnoDto>();
	static public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		int opcion;
		boolean cerrarMenu=false;
		fi.leerFichero();
		
		do {
			try {
				
				opcion=mi.mostrarMenuYSeleccion(sc);
				
				switch(opcion) {
				
				case 0:
					System.out.println("[INFO] se cerrara la aplicacion.");
					fi.ficheroLog ("[INFO] se cerrara la aplicacion.");
					cerrarMenu=true;
					break;
					
				case 1:
					System.out.println("[INFO] se dara de alta un nuevo alumno");
					fi.ficheroLog ("[INFO] se dara de alta un nuevo alumno");
					oi.darAltaAlumno();
					break;
					
				case 2:
					System.out.println("[INFO] se escribira en fichero la informacion");
					fi.ficheroLog ("[INFO] se escribira en fichero la informacion");
					fi.escribirFichero();
					break;
					
				default:
					System.out.println("[ERROR] opcion introducida no valida.");
					fi.ficheroLog ("[ERROR] opcion introducida no valida.");
					break;
				}
			}catch(Exception e) {
				
				System.out.println("ERROR");
				fi.ficheroLog ("ERROR");
				
			}
			
		}while(!cerrarMenu);

	}
	

}
