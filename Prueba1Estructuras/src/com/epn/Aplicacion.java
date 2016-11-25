package com.epn;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		String nomProf[]={"Parra","Perez","Bernal","Mena","Caceres"};
		String nomAlum[]={"Acurio","Sanchez","Vaca","Paredes","Revelo"};
		Persona prof= new Persona(nomProf);
		
		
		Persona alum= new Persona(nomAlum);
		
		JOptionPane.showMessageDialog(null, prof);
		

	}

}
