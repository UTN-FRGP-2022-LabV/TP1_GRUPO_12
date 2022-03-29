package com.utn.eventos.entidad.impl;

import java.time.LocalDateTime;

import com.utn.eventos.utils.FuncionesFecha;

public class Entrada {
	private Long numero;
	private String nombreEvento;
	private String tipoEvento;
	private LocalDateTime fechaHora;
	private Integer duracionEnMinutos;
	
	public Entrada(Long numero, String nombreEvento, String tipoEvento, LocalDateTime fechaHora, Integer duracionEnMinutos) {
		this.numero = numero;
		this.nombreEvento = nombreEvento;
		this.tipoEvento = tipoEvento;
		this.fechaHora = fechaHora;
		this.duracionEnMinutos = duracionEnMinutos;
	}
	
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getNombreEvento() {
		return nombreEvento;
	}
	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}
	public String getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
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
		
		return "\nEntrada [numero=" + numero + ", nombreEvento=" + nombreEvento + ", tipoEvento=" + tipoEvento
				+ ", fechaHora=" + FuncionesFecha.getFechaHoraFormateada(fechaHora) + ", duracionEnMinutos=" + duracionEnMinutos + "]";
	}
		
}
