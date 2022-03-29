package com.utn.eventos.entidad.impl.costo;

import java.math.BigDecimal;

import com.utn.eventos.entidad.CostoEntradaBase;

public class CostoGeneral extends CostoEntradaBase{
	
	public CostoGeneral(BigDecimal costo) {
		super("General", costo);
	}
}
