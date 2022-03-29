package com.utn.eventos.entidad.impl.teatro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.utn.eventos.entidad.EventoAbstracto;
import com.utn.eventos.enums.TipoEvento;

public class EventoTeatro extends EventoAbstracto {
	private ObraTeatro obraTeatro;
	private List<Actor> actores = new ArrayList();

	public EventoTeatro(ObraTeatro obraTeatro, List<Actor> actores, LocalDateTime fechaHora, Integer duracionEnMinutos) {
		super(fechaHora, duracionEnMinutos);
		setObraTeatro(obraTeatro);
		setActores(actores);
	}

	@Override
	public String getTipoEvento() {
		return TipoEvento.TEATRO.name();
	}


	@Override
	public String getNombreEvento() {
		return isValid() ? getObraTeatro().getNombre() : "Evento incorrecto";
	}


	public ObraTeatro getObraTeatro() {
		return obraTeatro;
	}


	public void setObraTeatro(ObraTeatro obraTeatro) {
		this.obraTeatro = obraTeatro;
	}


	public List<Actor> getActores() {
		return actores;
	}


	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}

	@Override
	public boolean isValid() {
		return obraTeatro != null && actores != null && !actores.isEmpty() && getFechaHora() != null && getDuracionEnMinutos() != null;
	}

}
