package com.utn.eventos.entidad.impl.recital;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.utn.eventos.entidad.EventoAbstracto;
import com.utn.eventos.enums.GeneroRecital;
import com.utn.eventos.enums.TipoEvento;

public class EventoRecital extends EventoAbstracto {
	private GeneroRecital genero;
	private Banda banda;
	private List<Banda> bandasSoporte = new ArrayList();
	
	public EventoRecital(Banda banda, GeneroRecital genero, List<Banda> bandasSoporte, LocalDateTime fechaHora, Integer duracionEnMinutos) {
		super(fechaHora, duracionEnMinutos);
		this.setBanda(banda);
		this.setGenero(genero);
		this.setBandasSoporte(bandasSoporte);		
	}
	
	public GeneroRecital getGenero() {
		return genero;
	}

	public void setGenero(GeneroRecital genero) {
		this.genero = genero;
	}

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}

	public List<Banda> getBandasSoporte() {
		return bandasSoporte;
	}

	public void setBandasSoporte(List<Banda> bandasSoporte) {
		this.bandasSoporte = bandasSoporte;
	}
	
	@Override
	public String getTipoEvento() {
		return TipoEvento.RECITAL.name();
	}

	@Override
	public String getNombreEvento() {
		return isValid() ? banda.getNombre() : "Evento incorrecto";
	}

	@Override
	public boolean isValid() {
		return genero != null && banda != null && getFechaHora() != null && getDuracionEnMinutos() != null;
	}

}
