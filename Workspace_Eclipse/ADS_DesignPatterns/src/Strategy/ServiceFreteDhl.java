package Strategy;

public class ServiceFreteDhl implements Fretavel {
	@Override
	public double calcularValor(double pesoEmKg)
	{
		//dhl
		if(pesoEmKg < 20.00)
		{
			return 100.00;
		}
		else
		{
			return 90.00;
		}
	}
}
