package br.com.caelum.reader;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.Test;

public class LeitorXMLTest {

	@Test
	public void carregaXmlComUmaNegociacaoEmListaUnitaria() {
		String xmlDeTeste = "<list>" + 
								"<negociacao>" +
									"<preco>43.5</preco>" +
									"<quantidade>1000</quantidade>" +
									"<data>" +
										"<time>1322233344455</time>" +
									"</data>" +
								"</negociacao>" +
							"</list>";
		
		LeitorXML leitor = new LeitorXML();
		
		InputStream xml = new ByteArrayInpustStream(xmlDeTeste.getBytes());
		
		List<Negociacao> negociacoes = leitor.carrega(xml);
	}

}
