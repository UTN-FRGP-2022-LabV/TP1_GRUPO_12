package com.utn.eventos.entidad;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.utn.eventos.entidad.impl.Entrada;

public abstract class EventoAbstracto implements Evento{
	private LocalDateTime fechaHora;
	private final Integer duracionEnMinutos = 120;
	private List<Entrada> entradas = new ArrayList();

	public EventoAbstracto(LocalDateTime fechaHora, Integer duracionEnMinutos) {
//		this.setDuracionEnMinutos(duracionEnMinutos); 
		this.setFechaHora(fechaHora);
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

//	public void setDuracionEnMinutos(Integer duracionEnMinutos) {
//		this.duracionEnMinutos = duracionEnMinutos;
//	}
	
	public void comprarEntrada(Long numeroEntrada, CostoEntrada costoEntrada) {
		entradas.add(
				new Entrada(
						numeroEntrada, 
						getNombreEvento(), 
						getTipoEvento(), 
						getFechaHora(), 
						getDuracionEnMinutos(),
						costoEntrada
						)
				);
	}
	
	public void mostrarEntradas() {
		System.out.println("\n------Entradas " + getTipoEvento() + "------");
		getEntradas().forEach(e -> System.out.println(e));
		System.out.println("Total Recaudado: $ " + calcularTotalRecaudado());
	}

	public List<Entrada> getEntradas() {
		return this.entradas;
	}
	
	public BigDecimal calcularTotalRecaudado() {
		BigDecimal total = getEntradas().stream()
		.map(entrada -> entrada.getCostoEntrada().getCosto())
		.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		return total.setScale(2, RoundingMode.HALF_EVEN);	
	}
	
	public abstract String getTipoEvento();
	public abstract String getNombreEvento();
	public abstract boolean isValid();
	
}
