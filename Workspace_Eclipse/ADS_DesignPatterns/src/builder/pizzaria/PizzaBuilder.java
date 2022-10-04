package builder.pizzaria;

public class PizzaBuilder {

	private Pizza pizza;

	public PizzaBuilder() {
		this.pizza = new Pizza();
	}

	public PizzaBuilder setSize(Integer size) {
	 pizza.setSize(size);
	 return this;
 }

	public PizzaBuilder addCheese() {
		pizza.setFlagCheese( true );
		return this;
	}

	public PizzaBuilder addPeperoni() {
		pizza.setFlagPepperoni( true );
		return this;
	}

	public Pizza getPizza() {
		validarIngredientes();
		validarTamanho();
		return pizza;
	}
	
	private void validarTamanho() {
		if(pizza.getSize()<= 0 || pizza.getSize()>=4)
		{
			throw new IllegalStateException("Pizza deve ter os tamanhos 1, 2 ou 3");
		}
		
	}

	private void validarIngredientes() {
		if(!pizza.getFlagCheese() && !pizza.getFlagPepperoni())
		{
			throw new IllegalStateException("Pizza sem ingredientes");
		}
		
	}

	
}
