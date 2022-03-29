package com.utn.eventos.entidad.impl;

import java.time.LocalDateTime;

import com.utn.eventos.entidad.CostoEntrada;
import com.utn.eventos.utils.FuncionesFecha;

public class Entrada {
	private Long numero;
	private String nombreEvento;
	private String tipoEvento;
	private LocalDateTime fechaHora;
	private Integer duracionEnMinutos;
	private CostoEntrada costoEntrada;
	
	public Entrada(Long numero, String nombreEvento, String tipoEvento, LocalDateTime fechaHora, Integer duracionEnMinutos, CostoEntrada costoEntrada) {
		this.numero = numero;
		this.nombreEvento = nombreEvento;
		this.tipoEvento = tipoEvento;
		this.fechaHora = fechaHora;
		this.duracionEnMinutos = duracionEnMinutos;
		this.setCostoEntrada(costoEntrada);
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
		StringBuilder sb = new StringBuilder();
		sb.append("\nEntrada [numero= ");
		sb.append(numero);
		sb.append(", nombreEvento= ");
		sb.append(nombreEvento);
		sb.append(", tipoEvento=");
		sb.append(tipoEvento);
		sb.append(", fechaHora=");
		sb.append(FuncionesFecha.getFechaHoraFormateada(fechaHora));
		sb.append(", duracionEnMinutos=");
		sb.append(duracionEnMinutos);
		sb.append(", precio=");
		sb.append(costoEntrada);
		sb.append("]");
		
		return sb.toString();
	}

	public CostoEntrada getCostoEntrada() {
		return costoEntrada;
	}

	public void setCostoEntrada(CostoEntrada costoEntrada) {
		this.costoEntrada = costoEntrada;
	}
		
}
