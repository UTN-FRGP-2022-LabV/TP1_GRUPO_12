package com.utn.eventos.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FuncionesFecha {
	public static String DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm"; 
	
	/**
	 * Obtiene un String desde un objeto LocalDateTime, con el formato 'dd/MM/yyyy HH:mm'
	 * @param fechaHora
	 * @return
	 */
	public static String getFechaHoraFormateada(LocalDateTime fechaHora) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
		return fechaHora.format(formatter);
	}
	
	/**
	 * Obtiene el objeto LocalDateTime desde un String de fecha con el formato 'dd/MM/yyyy HH:mm'
	 * @param fechaHora
	 * @return LocalDateTime
	 */
	public static LocalDateTime getFechaHora(String fechaHora) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
		return LocalDateTime.parse(fechaHora, formatter);
	}

}
