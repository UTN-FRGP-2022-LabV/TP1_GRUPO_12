package com.utn.eventos.entidad;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CostoEntradaBase implements CostoEntrada {
	private String categoria;
	private BigDecimal costo;
	
	public CostoEntradaBase(String categoria, BigDecimal costo) {
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

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nPrecio [precio= ");
		sb.append(costo.setScale(2, RoundingMode.HALF_EVEN));
		sb.append(", categoria= ");
		sb.append(categoria);
		sb.append("]");
		
		return sb.toString();	}

	@Override
	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

}
