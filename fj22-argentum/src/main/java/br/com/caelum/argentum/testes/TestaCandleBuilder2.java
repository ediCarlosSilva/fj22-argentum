package br.com.caelum.argentum.testes;

import java.util.GregorianCalendar;

import br.com.caelum.argentum.modelo.CandleBuilder;
import br.com.caelum.argentum.modelo.Candlestick;

public class TestaCandleBuilder2 {

	public static void main(String[] args) {
		
		// padrão de projeto fluent interface
		Candlestick candle = new CandleBuilder().comAbertura(40.5).comFechamento(42.5).comMinimo(39.8)
				.comMaximo(45.0).comVolume(145234.20)
				.comData( new GregorianCalendar(2008, 8, 12, 0, 0, 0) ).geraCandle();
		
		System.out.println(candle.toString());
		
	}
	
}
