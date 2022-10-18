package Strategy;

public class ServiceFreteFedEx implements Fretavel{
	@Override
	public double calcularValor(double pesoEmKg)
	{
		//dhl
		if(pesoEmKg < 20.00)
		{
			return 0.00;
		}
		else if(pesoEmKg>=20.1 && pesoEmKg<=39.9)
		{
			return 45.00;
		}
		else
		{
			return 75.00;
		}
	}
}
