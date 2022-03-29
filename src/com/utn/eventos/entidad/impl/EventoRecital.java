package com.utn.eventos.entidad.impl;

import java.util.ArrayList;
import java.util.List;

import com.utn.eventos.entidad.EventoAbstracto;
import com.utn.eventos.entidad.CostoEntradaInterface;

public class EventoRecital extends EventoAbstracto {
	private static String EVENTO_RECITAL = "RECITAL";
	private GeneroRecital genero;
	private Banda banda;
	private List<Banda> bandasSoporte = new ArrayList();
	private List<Entrada> entradas = new ArrayList();
	
	public EventoRecital(Banda banda, GeneroRecital genero, List<Banda> bandasSoporte) {
		super(banda.getNombre(), banda.getFechaHora(), banda.getDuracionEnMinutos());
		this.setBanda(banda);
		this.setGenero(genero);
		this.setBandasSoporte(bandasSoporte);		
	}

	@Override
	public void comprarEntrada(Long numeroEntrada, CostoEntradaInterface CategoriaEntrada) {
		entradas.add(
				new Entrada(
						numeroEntrada, 
						getBanda().getNombre(), 
						getTipoEvento(), 
						getBanda().getFechaHora(), 
						getBanda().getDuracionEnMinutos()
						)
				);
	}

	@Override
	public void mostrarEntradas() {
		entradas.forEach(e -> System.out.println(e));
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

	public List<Entrada> getEntradas() {
		return this.entradas;
	}
	
	public enum GeneroRecital {
		ROCK, HEAVY_METAL, REGGEATON, TRAP, LATINO, POP;
	}

	@Override
	public String getTipoEvento() {
		return EVENTO_RECITAL;
	}

}
