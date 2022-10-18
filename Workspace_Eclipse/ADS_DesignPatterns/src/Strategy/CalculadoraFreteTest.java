package Strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class CalculadoraFreteTest {

	@Test
	void deveCalcularFreteParaDHL() 
	{
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteDHL = new ServiceFreteDhl();
		double valorEsperado = 100.0;
		double valorRetornado = calculadora.calcular(servicoFreteDHL, 15.0);
		
		assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	void deveCalcularFreteParaSedex()
	{
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteSedex = new ServiceFreteSedex();
		double valorEsperado = 50.00;
		double valorRetornado = calculadora.calcular(servicoFreteSedex, 9.99);
		
		assertEquals(valorEsperado, valorRetornado);
	}

	@Test
	void deveCalcularFreteParaJadLog()
	{
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteJadLog = new ServiceFreteJadLog();
		double valorEsperado = 0.0;
		double valorRetornado = calculadora.calcular(servicoFreteJadLog, 15.0);
		
		assertEquals(valorEsperado, valorRetornado);
	}
	
	/*
	@Test
	void deveLancarExceptionParaServiçoDesconhecido() {
		try
		{
			CalculadoraFrete cf = new CalculadoraFrete();
			cf.calcular(null, 0);
			fail("Devia ter lançado exception");
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
	}
	*/
	
	@Test
	void deveCalcularFreteParaFedEx()
	{
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel serviceFreteFedEx = new ServiceFreteFedEx();
		double valorEsperado = 45.00;
		double valorRetornado = calculadora.calcular(serviceFreteFedEx, 20.5);
		
		assertEquals(valorEsperado, valorRetornado);
	}
}
