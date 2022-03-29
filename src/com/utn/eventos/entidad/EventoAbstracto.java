package com.utn.eventos.entidad;

import java.time.LocalDateTime;

public abstract class EventoAbstracto implements EventoInterface{
	private String nombreEvento;
	private LocalDateTime fechaHora;
	private Integer duracionEnMinutos;
	
	public EventoAbstracto(String nombreEvento, LocalDateTime fechaHora, Integer duracionEnMinutos) {
		this.setNombreEvento(nombreEvento);
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
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
	
	public abstract String getTipoEvento();
}
