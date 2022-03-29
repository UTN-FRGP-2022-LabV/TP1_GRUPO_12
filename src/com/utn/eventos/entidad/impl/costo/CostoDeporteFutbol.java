package com.utn.eventos.entidad.impl.costo;

import java.math.BigDecimal;

import com.utn.eventos.entidad.CostoEntradaBase;

public class CostoDeporteFutbol extends CostoEntradaBase{
	
	public CostoDeporteFutbol(BigDecimal costo) {
		super("FUTBOL", costo);
	}
	
}
