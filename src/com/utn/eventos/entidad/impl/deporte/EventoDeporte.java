package com.utn.eventos.entidad.impl.deporte;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.utn.eventos.entidad.CostoEntrada;
import com.utn.eventos.entidad.EventoAbstracto;
import com.utn.eventos.enums.TipoEvento;

public class EventoDeporte extends EventoAbstracto {
	private static final double RECARGO_INTERNACIONAL = 1.3;
	private Contrincantes contrincantes;
	private boolean esInternacional = false;
	
	public EventoDeporte(Contrincantes contrincantes, boolean esInternacional, LocalDateTime fechaHora, Integer duracionEnMinutos) {
		super(fechaHora, duracionEnMinutos);
		setContrincantes(contrincantes);
		setEsInternacional(esInternacional);
	}

	@Override
	public String getTipoEvento() {
		return TipoEvento.DEPORTE.name();
	}

	@Override
	public String getNombreEvento() {
		return isValid() ? getContrincantes().getNombre() : "Evento incorrecto";
	}

	@Override
	public boolean isValid() {
		return contrincantes != null && getFechaHora() != null && getDuracionEnMinutos() != null;
	}

	public boolean isEsInternacional() {
		return esInternacional;
	}

	public void setEsInternacional(boolean esInternacional) {
		this.esInternacional = esInternacional;
	}

	public Contrincantes getContrincantes() {
		return contrincantes;
	}

	public void setContrincantes(Contrincantes contrincantes) {
		this.contrincantes = contrincantes;
	}

	@Override
	public void comprarEntrada(Long numeroEntrada, CostoEntrada costoEntrada) {
		if (esInternacional) {
			BigDecimal costoConRecargo = costoEntrada.getCosto().multiply(BigDecimal.valueOf(RECARGO_INTERNACIONAL));
			costoEntrada.setCosto(costoConRecargo);
		}
		super.comprarEntrada(numeroEntrada, costoEntrada);
	}
}
