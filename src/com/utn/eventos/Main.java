package com.utn.eventos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import com.utn.eventos.entidad.CostoEntrada;
import com.utn.eventos.entidad.Evento;
import com.utn.eventos.entidad.impl.costo.CostoDeporteFutbol;
import com.utn.eventos.entidad.impl.costo.CostoDeporteHockey;
import com.utn.eventos.entidad.impl.costo.CostoDeporteRugby;
import com.utn.eventos.entidad.impl.costo.CostoGeneral;
import com.utn.eventos.entidad.impl.costo.CostoRecitalVIP;
import com.utn.eventos.entidad.impl.deporte.Contrincantes;
import com.utn.eventos.entidad.impl.deporte.EventoDeporte;
import com.utn.eventos.entidad.impl.infantil.EventoInfantil;
import com.utn.eventos.entidad.impl.infantil.ObraInfantil;
import com.utn.eventos.entidad.impl.recital.Banda;
import com.utn.eventos.entidad.impl.recital.EventoRecital;
import com.utn.eventos.entidad.impl.teatro.Actor;
import com.utn.eventos.entidad.impl.teatro.EventoTeatro;
import com.utn.eventos.entidad.impl.teatro.ObraTeatro;
import com.utn.eventos.enums.GeneroRecital;
import com.utn.eventos.utils.FuncionesFecha;
import com.utn.eventos.utils.IdentificacionEntrada;

public class Main {

	public static void main(String[] args) {
		//List<EventoInterface> eventos = new ArrayList();
		
		//Recital
		Banda banda = new Banda("Rata Blanca");
		List<Banda> bandasSoporte = Arrays.asList(new Banda("Hermetica"), new Banda("Almafuerte"));
		
		CostoEntrada costoVIP = new CostoRecitalVIP(BigDecimal.valueOf(1500));
		CostoEntrada costoGeneralRecital = new CostoGeneral(BigDecimal.valueOf(800));
		LocalDateTime fechaRecital = FuncionesFecha.getFechaHora("28/03/2022 21:25");
		Integer duracionEnMinutos = 100;
		
		Evento recital = new EventoRecital(banda, GeneroRecital.HEAVY_METAL, bandasSoporte, fechaRecital, duracionEnMinutos);
		
		Long numeroEntradaRecitalVip = IdentificacionEntrada.getProximoNumero();
		Long numeroEntradaRecitalGeneral = IdentificacionEntrada.getProximoNumero();
		
		recital.comprarEntrada(numeroEntradaRecitalVip, costoVIP);
		recital.comprarEntrada(numeroEntradaRecitalGeneral,  costoGeneralRecital);
		recital.mostrarEntradas();
		
		//------------------------------------------------------------------------------
		
		//Teatro
		CostoEntrada costoGeneralTeatro = new CostoGeneral(BigDecimal.valueOf(1350.50));
		List<Actor> actores = Arrays.asList(new Actor("Pepe"), new Actor("Van Helsing"));
		ObraTeatro obraTeatro = new ObraTeatro("Dracula");
		LocalDateTime fechaObra = FuncionesFecha.getFechaHora("28/03/2022 23:30");
		Integer duracionEnMinutosDracula = 120;

		Evento teatro = new EventoTeatro(obraTeatro, actores, fechaObra, duracionEnMinutosDracula);
		
		Long numeroEntradaTeatro = IdentificacionEntrada.getProximoNumero();
		
		teatro.comprarEntrada(numeroEntradaTeatro, costoGeneralTeatro);		
		teatro.mostrarEntradas();

		//------------------------------------------------------------------------------

		//Infantil
		CostoEntrada costoMenor8Anios = new CostoGeneral(BigDecimal.valueOf(250));
		CostoEntrada costoMayor8Anios = new CostoGeneral(BigDecimal.valueOf(500));
		ObraInfantil obraInfantil = new ObraInfantil("La casa de Mickey Mouse");
		boolean tieneSouvernir = true;
		LocalDateTime fechaObraInfantil = FuncionesFecha.getFechaHora("29/03/2022 00:15");
		Integer duracionEnMinutosObraInfantil = 120;

		Evento infantil = new EventoInfantil(obraInfantil, tieneSouvernir, fechaObraInfantil, duracionEnMinutosObraInfantil);
		
		Long numeroEntradaInfantil1 = IdentificacionEntrada.getProximoNumero();
		Long numeroEntradaInfantil2 = IdentificacionEntrada.getProximoNumero();
		
		infantil.comprarEntrada(numeroEntradaInfantil1, costoMenor8Anios);
		infantil.comprarEntrada(numeroEntradaInfantil2, costoMayor8Anios);
		infantil.mostrarEntradas();
		
		//------------------------------------------------------------------------------
	
		//Deporte
		CostoEntrada costoFutbol = new CostoDeporteFutbol(BigDecimal.valueOf(300));
		CostoEntrada costoRugby = new CostoDeporteRugby(BigDecimal.valueOf(450));
		CostoEntrada costoJockey = new CostoDeporteHockey(BigDecimal.valueOf(380));
		
		LocalDateTime fechaDeporte = FuncionesFecha.getFechaHora("29/03/2022 00:35");
		Integer duracionEnMinutosDeporte = 120;
		boolean esInternacional = true;
		Contrincantes contrincantes = new Contrincantes("Argentina vs Brasil"); 
		
		Evento deporte = new EventoDeporte(contrincantes, esInternacional, fechaDeporte, duracionEnMinutosDeporte);
		
		Long numeroEntradaFutbol = IdentificacionEntrada.getProximoNumero();
		
		deporte.comprarEntrada(numeroEntradaFutbol, costoFutbol);
		
		deporte.mostrarEntradas();
		//eventos.forEach(e -> System.out.println(e));
		
	}

}
