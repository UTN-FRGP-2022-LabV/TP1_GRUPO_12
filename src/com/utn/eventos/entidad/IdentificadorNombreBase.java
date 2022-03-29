package com.utn.eventos.entidad;

public abstract class IdentificadorNombreBase implements IdentificadorNombre {
	private String nombre;
	
	public IdentificadorNombreBase(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
