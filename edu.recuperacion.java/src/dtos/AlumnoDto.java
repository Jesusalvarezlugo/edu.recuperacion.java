package dtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AlumnoDto {
	
	//Atributos
	
	long idAlumno;
	String nombreAlumno="aaaaa";
	String apellido1Alum="aaaaa";
	String apellido2Alum="aaaaa";
	String dniAlumno="aaaaa";
	String direccion="aaaaa";
	String telefono="aaaaa";
	String email="aaaaa";
	LocalDate fechaNacimiento=LocalDate.now();
	DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String fechaNacString=formato.format(fechaNacimiento);
	
	//Getters y setters
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public long getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(long idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getApellido1Alum() {
		return apellido1Alum;
	}
	public void setApellido1Alum(String apellido1Alum) {
		this.apellido1Alum = apellido1Alum;
	}
	public String getApellido2Alum() {
		return apellido2Alum;
	}
	public void setApellido2Alum(String apellido2Alum) {
		this.apellido2Alum = apellido2Alum;
	}
	public String getDniAlumno() {
		return dniAlumno;
	}
	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String toString() {
		
		String texto= nombreAlumno.concat(";").concat(dniAlumno).concat(";").concat(telefono).concat(";").concat(fechaNacString);
		
		return texto;
	}
	
	
	
	

}
