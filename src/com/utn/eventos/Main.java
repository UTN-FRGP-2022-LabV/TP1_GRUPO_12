package com.utn.eventos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.utn.eventos.entidad.CostoEntradaInterface;
import com.utn.eventos.entidad.EventoInterface;
import com.utn.eventos.entidad.impl.Banda;
import com.utn.eventos.entidad.impl.CostoRecitalGeneral;
import com.utn.eventos.entidad.impl.CostoRecitalVIP;
import com.utn.eventos.entidad.impl.EventoRecital;
import com.utn.eventos.entidad.impl.EventoTeatro;

public class Main {

	public static void main(String[] args) {
		//List<EventoInterface> eventos = new ArrayList();
		
		Banda bandaPrincipal = new Banda("Rata Blanca", LocalDateTime.now(), 100);
		Banda bandaSoporte1 = new Banda("Hermetica", LocalDateTime.now(), 30);
		Banda bandaSoporte2 = new Banda("Almafuerte", LocalDateTime.now(), 30);
		List<Banda> bandasSoporte = Arrays.asList(bandaSoporte1, bandaSoporte2);
		CostoEntradaInterface costoVIP = new CostoRecitalVIP(BigDecimal.valueOf(1500));
		CostoEntradaInterface costoGeneral = new CostoRecitalGeneral(BigDecimal.valueOf(800));
		
		EventoInterface recital = new EventoRecital(bandaPrincipal, EventoRecital.GeneroRecital.HEAVY_METAL, bandasSoporte);
		
		recital.comprarEntrada(1L, costoVIP);
		recital.comprarEntrada(2L,  costoGeneral);
		recital.mostrarEntradas();
		
//		ObraTeatro obraTeatro = new ObraTeatro("Dracula");
//		EventoInterface teatro = new EventoTeatro();
//		teatro.crearEntrada();
/*		
		EventoInterface infantil = new EventoInfantil();
		infantil.crearEntrada();
		
		EventoInterface deporte = new EventoDeporte();
		deporte.crearEntrada();
		*/
		//eventos.forEach(e -> System.out.println(e));
		
	}

}
