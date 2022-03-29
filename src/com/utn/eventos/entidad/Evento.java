package com.utn.eventos.entidad;

import java.math.BigDecimal;

public interface Evento {
	public void comprarEntrada(Long numero, CostoEntrada costo);
	public void mostrarEntradas();
	public BigDecimal calcularTotalRecaudado();
}
