package com.utn.eventos.entidad.impl;

import java.math.BigDecimal;

import com.utn.eventos.entidad.CostoEntradaAbstracto;

public class CostoRecitalVIP extends CostoEntradaAbstracto{
	
	public CostoRecitalVIP(BigDecimal costo) {
		super("VIP", costo);
	}
	
}
