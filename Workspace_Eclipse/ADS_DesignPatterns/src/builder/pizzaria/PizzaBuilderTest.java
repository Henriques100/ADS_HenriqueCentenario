package builder.pizzaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaBuilderTest {

	@Test
	void deveConstruirPizzaValida() 
	{
      Pizza pizza = new PizzaBuilder()
            .setSize(1)
            .addCheese()
            .addPeperoni()
            .getPizza();
      
      assertNotNull( pizza );
      assertNotNull( pizza.getSize() );
      assertTrue( pizza.getFlagCheese() );
      assertTrue( pizza.getFlagPepperoni() );
	}

}
