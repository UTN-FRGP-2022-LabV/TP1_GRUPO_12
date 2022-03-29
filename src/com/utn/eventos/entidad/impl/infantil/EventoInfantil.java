package com.utn.eventos.entidad.impl.infantil;

import java.time.LocalDateTime;

import com.utn.eventos.entidad.EventoAbstracto;
import com.utn.eventos.enums.TipoEvento;

public class EventoInfantil extends EventoAbstracto{
	private boolean tieneSouvenir = false;
	ObraInfantil obraInfantil;
	
	public EventoInfantil(ObraInfantil obraInfantil, boolean tieneSouvenir, LocalDateTime fechaHora, Integer duracionEnMinutos) {
		super(fechaHora, duracionEnMinutos);
		setTieneSouvenir(tieneSouvenir);
	}

	@Override
	public String getTipoEvento() {
		return TipoEvento.INFANTIL.name();
	}

	@Override
	public String getNombreEvento() {
		return isValid() ? obraInfantil.getNombre() : "Evento incorrecto";
	}

	public boolean isTieneSouvenir() {
		return tieneSouvenir;
	}

	public void setTieneSouvenir(boolean tieneSouvenir) {
		this.tieneSouvenir = tieneSouvenir;
	}

	@Override
	public boolean isValid() {
		return obraInfantil != null && getFechaHora() != null && getDuracionEnMinutos() != null;
	}


}
