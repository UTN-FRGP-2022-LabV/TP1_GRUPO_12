package com.utn.eventos.entidad;

import java.math.BigDecimal;

public class CostoEntradaAbstracto implements CostoEntradaInterface {
	private String categoria;
	private BigDecimal costo;
	
	public CostoEntradaAbstracto(String categoria, BigDecimal costo) {
		super();
		this.categoria = categoria;
		this.costo = costo;
	}

	@Override
	public String getCategoria() {
		return categoria;
	}

	@Override
	public BigDecimal getCosto() {
		return costo;
	}

}
