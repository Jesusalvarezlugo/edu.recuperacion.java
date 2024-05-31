package servicios;

import controladores.Inicio;
import dtos.AlumnoDto;

public class OperativaImplementacion implements OperativaInterfaz {

	@Override
	public void darAltaAlumno() {
		
		AlumnoDto alumno = nuevoAlumno();
		
		Inicio.listaAlumnos.add(alumno);
		
	}
	
	private AlumnoDto nuevoAlumno() {
		
		AlumnoDto alumnoNuevo= new AlumnoDto();
		
		System.out.println("Introduzca el nombre del alumno: ");
		alumnoNuevo.setNombreAlumno(Inicio.sc.next());
		System.out.println("Introduzca el primer apellido del alumno: ");
		alumnoNuevo.setApellido1Alum(Inicio.sc.next());
		System.out.println("Introduzca el segundo apellido del alumno: ");
		alumnoNuevo.setApellido2Alum(Inicio.sc.next());
		System.out.println("Introduzca el DNI del alumno: ");
		alumnoNuevo.setDniAlumno(Inicio.sc.next());
		System.out.println("Introduzca la direccion del alumno: ");
		alumnoNuevo.setDireccion(Inicio.sc.next());
		System.out.println("Introduzca el telefono del alumno: ");
		alumnoNuevo.setTelefono(Inicio.sc.next());
		System.out.println("Introduzca el email del alumno: ");
		alumnoNuevo.setEmail(Inicio.sc.next());
		
		alumnoNuevo.setIdAlumno(autoId());
		
		return alumnoNuevo;
		
		
	}
	
	private long  autoId() {
		
		int tamanioLista=Inicio.listaAlumnos.size();
		long nuevoId;
		
		if(tamanioLista>0) {
			
			nuevoId=Inicio.listaAlumnos.get(tamanioLista - 1).getIdAlumno()+1;
		}else {
			
			nuevoId=1;
		}
		
		return nuevoId;
	}

}
