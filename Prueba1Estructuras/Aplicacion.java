package com.epn;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		
		Materia mat=new Materia();
		
		llenarProfesor();
		llenarAlumno();
		
	
		
		String nomAlum[]={"Acurio","Sanchez","Vaca","Paredes","Revelo"};
		Persona prof= new Persona(nomProf);
		
		
		Persona alum= new Persona(nomAlum);
		
		JOptionPane.showMessageDialog(null, prof);
		
	

}

	public static Profesor[] llenarProfesor(){
		Profesor prof[]= new Profesor[5];
		prof[0]=setNom="miguel";
		prof[1]=setNom="andrea";
		prof[2]=setNom="mike";
		prof[3]=setNom="marlon";
		prof[4]=setNom="paul";
		

	return prof;
	
	}
	
	public static Alumno[] llenarAlumno(){
		Alumno alum[]= new Profesor[5];
		alum[0]=setNom="miguel";
		alum[1]=setNom="andrea";
		alum[2]=setNom="mike";
		alum[3]=setNom="marlon";
		alum[4]=setNom="paul";
		
	
	}}