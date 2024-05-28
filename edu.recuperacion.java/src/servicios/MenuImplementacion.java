package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion(Scanner sc) {
		
		int opcion;
		System.out.println("#####################");
		System.out.println("0. Cerrar menu");
		System.out.println("1. Dar alta objeto");
		System.out.println("#####################");
		System.out.println("Introduzca una opcion: ");
		opcion= sc.nextInt();
		
		return  opcion;
	}

}
