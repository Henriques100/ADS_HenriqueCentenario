package builder.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderTest {

	@Test
	void deveConstruirUmCarroPeloBuilder() {
		// partes
		Porta portasMotorista = new Porta();
		Porta portasPassageiro = new Porta();
		Porta[] portas = { portasMotorista, portasPassageiro };
		Motor motorVTEC = new Motor();
		ComputadorBordo computadorBordo = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();

		// builder
		CarroBuilder carroBuilder = new CarroBuilder();
		carroBuilder.buildPortas(portas);
		carroBuilder.buildMotor(motorVTEC);
		carroBuilder.buildComputadorBordo(computadorBordo);
		carroBuilder.buildFreioABS(freioBosch);

		Carro carroConstruido = carroBuilder.getCarro();

		assertNotNull(carroConstruido);
		assertNotNull(carroConstruido.getPortas());
		assertEquals( carroConstruido.getPortas().length, 2);
		assertNotNull(carroConstruido.getMotor());
		assertNotNull(carroConstruido.getComputadorBordo());
		assertNotNull(carroConstruido.getFreioABS());

	}

}
