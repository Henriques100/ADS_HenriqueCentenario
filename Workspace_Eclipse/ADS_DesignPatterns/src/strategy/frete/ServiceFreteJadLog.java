package strategy.frete;

public class ServiceFreteJadLog implements Fretavel {

	@Override
	public double calcularValor(double pesoEmKg)
	{
		
		//jadlog
			if(pesoEmKg < 30.00)
			{
				return 0.00;
			}
			else
			{
				return 150.00;
			}
	}
}
