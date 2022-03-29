package com.utn.eventos.entidad;

import java.math.BigDecimal;

public interface CostoEntrada {
	public String getCategoria();
	public BigDecimal getCosto();
	public void setCosto(BigDecimal costo);
}
