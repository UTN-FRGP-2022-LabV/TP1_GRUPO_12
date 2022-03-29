package com.utn.eventos.utils;

public class IdentificacionEntrada {
	private static Long numero = 0L;
	
	public static Long getProximoNumero() {
		return ++numero;
	}
	public static Long getNumeroActual() {
		return numero;
	}
}
