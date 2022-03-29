package com.utn.eventos.entidad.impl.costo;

import java.math.BigDecimal;

import com.utn.eventos.entidad.CostoEntradaBase;

public class CostoDeporteHockey extends CostoEntradaBase{
	
	public CostoDeporteHockey(BigDecimal costo) {
		super("HOCKEY", costo);
	}
	
}
