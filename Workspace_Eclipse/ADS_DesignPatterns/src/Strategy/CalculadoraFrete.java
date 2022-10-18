package Strategy;

public class CalculadoraFrete {

	public  double  calcular( Fretavel fretavel, double pesoEmKg ) 
	{
		double valor = fretavel.calcularValor(pesoEmKg);
		return valor;
	}
	
}
