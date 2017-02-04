package br.com.caelum.argentum.testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class TestaDuvidas {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();
		Calendar ontem = Calendar.getInstance();
		ontem.set(2017, Calendar.FEBRUARY, 3);
		
		Negociacao petrobras = new Negociacao(30.0, 0, hoje);
		Negociacao negociacao2 = new Negociacao(30.0, 0, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(petrobras, negociacao2);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		
		Candlestick candle = fabrica.constroiCandleParaData(ontem, negociacoes);
		
		System.out.println(candle.toString());
		
		
		
	}
	
}
