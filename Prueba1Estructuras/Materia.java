package com.epn;

import java.util.Arrays;

public class Materia {
	
private String materia[];

public Materia() {
	super();
}

public Materia(String[] materia) {
	super();
	this.materia = materia;
}

public String[] getMateria() {
	return materia;
}

public void setMateria(String[] materia) {
	this.materia = materia;
}

@Override
public String toString() {
	return "Materia [materia=" + Arrays.toString(materia) + "]";
}






}




