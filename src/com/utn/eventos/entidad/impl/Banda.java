package com.utn.eventos.entidad.impl;

import java.time.LocalDateTime;

public class Banda {
	private String nombre;
	private LocalDateTime fechaHora;
	private Integer duracionEnMinutos;

	
	public Banda(String nombre, LocalDateTime fechaHora, Integer duracionEnMinutos) {
		super();
		this.nombre = nombre;
		this.fechaHora = fechaHora;
		this.duracionEnMinutos = duracionEnMinutos;
	}

	public Banda(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Integer getDuracionEnMinutos() {
		return duracionEnMinutos;
	}

	public void setDuracionEnMinutos(Integer duracionEnMinutos) {
		this.duracionEnMinutos = duracionEnMinutos;
	}

	@Override
	public String toString() {
		return "Banda [nombre=" + nombre + ", fechaHora=" + fechaHora + ", duracionEnMinutos=" + duracionEnMinutos
				+ "]";
	}
	
	
}
