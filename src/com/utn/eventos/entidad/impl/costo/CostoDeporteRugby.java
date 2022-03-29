package com.utn.eventos.entidad.impl.costo;

import java.math.BigDecimal;

import com.utn.eventos.entidad.CostoEntradaBase;

public class CostoDeporteRugby extends CostoEntradaBase{
	
	public CostoDeporteRugby(BigDecimal costo) {
		super("RUGBY", costo);
	}
	
}
