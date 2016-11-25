package com.epn;

public class Alumno extends Persona {
	
	
	
	private String nom;
	
	
public Alumno(String nombre, String nom) {
		super(nombre);
		this.nom = nom;
	}


public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


@Override
public void setNombre(String nombre) {
	// TODO Auto-generated method stub
	super.setNombre(nombre);
}
}
