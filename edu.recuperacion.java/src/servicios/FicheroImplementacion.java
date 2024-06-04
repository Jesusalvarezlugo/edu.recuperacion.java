package servicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;
import dtos.AlumnoDto;

public class FicheroImplementacion implements FicheroInterfaz {
	
	
	public  void ficheroLog(String texto) {
		try {
			FileWriter escritor= new FileWriter(Inicio.rutaCompletaLog,true);
			
			
			escritor.write(texto+"\n");
			
			
			escritor.close();
		}catch(IOException ex) {
			System.out.println("[001] error en la aplicacion");
		}
	}

	@Override
	public void escribirFichero() {
		
		try {
			String rutaFichero= "C:\\Users\\Jesús\\workspace-recuperacion-java\\Datos\\";
			String nombreFichero="datosAlumnos.txt";
			String rutaCompletaFichero=rutaFichero.concat(nombreFichero);
			FileWriter escritor = new FileWriter(rutaCompletaFichero,true);
			
			for(AlumnoDto alumno:Inicio.listaAlumnos) {
				
				escritor.write(alumno.toString().concat("\n"));
			}
			escritor.close();
		}catch(IOException ex) {
			ficheroLog("Error al escribir en fichero");
		}
		
		
	}

	@Override
	public void leerFichero() {
		
		try {
			FileReader lector = new FileReader("C:\\Users\\Jesús\\workspace-recuperacion-java\\Datos\\".concat("datosAlumnos.txt"));
			BufferedReader bf = new BufferedReader(lector);
			String linea;
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			while((linea=bf.readLine())!=null) {
				String[] alumno=linea.split(";");
				AlumnoDto alum = new AlumnoDto();
				alum.setNombreAlumno(alumno[0]);
				alum.setDniAlumno(alumno[1]);
				alum.setTelefono(alumno[2]);
				alum.setFechaNacimiento(LocalDate.parse(alumno[3],formato));
				
				Inicio.listaAlumnos.add(alum);
				
			}
			
			lector.close();
			bf.close();
		}catch(IOException ex) {
			ficheroLog("Error al leer en fichero");
		}
		
	}

}
