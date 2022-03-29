package com.utn.eventos.entidad.impl;

import java.math.BigDecimal;

import com.utn.eventos.entidad.CostoEntradaAbstracto;

public class CostoRecitalGeneral extends CostoEntradaAbstracto{
	
	public CostoRecitalGeneral(BigDecimal costo) {
		super("General", costo);
	}
	
}
