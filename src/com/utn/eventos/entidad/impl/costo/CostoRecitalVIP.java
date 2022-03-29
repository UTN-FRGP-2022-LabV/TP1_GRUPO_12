package com.utn.eventos.entidad.impl.costo;

import java.math.BigDecimal;

import com.utn.eventos.entidad.CostoEntradaBase;

public class CostoRecitalVIP extends CostoEntradaBase{
	
	public CostoRecitalVIP(BigDecimal costo) {
		super("VIP", costo);
	}
	
}
