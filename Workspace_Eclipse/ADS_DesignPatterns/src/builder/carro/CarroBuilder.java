package builder.carro;

public class CarroBuilder {
  
	private Carro carro;
	
	
	public CarroBuilder()
	{
		carro = new Carro();
	}
	
	public void buildPortas(Porta[] portas) {
		carro.setPortas(portas);
	}
	
	public void buildMotor(Motor motor) {
		carro.setMotor(motor);
	}
	
	public void buildComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
	}
	
	public void buildFreioABS(FreioABS f) {
		carro.setFreioABS(f);
	}

	public Carro getCarro() {
		return carro;
	}
	
	private void validarPortas()
	{
		if(carro.getPortas()==null) {
			throw new IllegalStateException("Carro deve ter portas");
		}
		
		int numeroDePortas = carro.getPortas().length;
		if (numeroDePortas != 2 && numeroDePortas != 4) {
			throw new IllegalStateException("Numero de portas invalido: "+numeroDePortas);
		}
	}
}
