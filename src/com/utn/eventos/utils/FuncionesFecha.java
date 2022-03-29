package com.utn.eventos.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FuncionesFecha {
	public static String getFechaHoraFormateada(LocalDateTime fechaHora) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return fechaHora.format(formatter);
	}

}
