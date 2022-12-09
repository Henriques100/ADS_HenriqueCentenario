package strategy_comparator;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void deveListaAnimaisPeloNome() 
	{
	  List<Animal> listaDeAnimais = new ArrayList<>();
	  
	  Animal a1 = new Animal(1L, "Tartaruga");
	  Animal a2 = new Animal(2L, "Coelho");
	  Animal a3 = new Animal(3L, "Cachorro");
	  Animal a4 = new Animal(4L, "Gato");
	  Animal a5 = new Animal(5L, "Girafa");
	  Animal a6 = new Animal(6L, "Gato");
	  
	  listaDeAnimais.add(a1);
	  listaDeAnimais.add(a2);
	  listaDeAnimais.add(a3);
	  listaDeAnimais.add(a4);
	  listaDeAnimais.add(a5);
	  listaDeAnimais.add(a6);
	  
	  System.out.println( "Lista Original: " );
      listaDeAnimais.forEach(System.out::println);
	  
	  listaDeAnimais.sort(new ComparadorPeloNome() );
	  
	  System.out.println( listaDeAnimais );
	  
	  System.out.println( "Lista ordenada pelo nome: " );
	  listaDeAnimais.forEach(System.out::println);
	}

	void deveOrdenarListaDeAnimaisPeloID() 
	{
	
		 List<Animal> listaDeAnimais = new ArrayList<>();
		  
		  Animal a1 = new Animal(13L, "Tartaruga");
		  Animal a2 = new Animal(9L, "Coelho");
		  Animal a3 = new Animal(4L, "Cachorro");
		  Animal a4 = new Animal(8L, "Gato");
		  Animal a5 = new Animal(7L, "Girafa");
		  Animal a6 = new Animal(1L, "Gato");
		  
		  listaDeAnimais.add(a1);
		  listaDeAnimais.add(a2);
		  listaDeAnimais.add(a3);
		  listaDeAnimais.add(a4);
		  listaDeAnimais.add(a5);
		  listaDeAnimais.add(a6);
		  
		  System.out.println( "Lista Original: " );
			
	      listaDeAnimais.forEach(System.out::println);
		  
		  listaDeAnimais.sort(new ComparadorPorId() );
		  
		  System.out.println( listaDeAnimais );
		  
		  System.out.println( "Lista ordenada pelo id: " );
		  listaDeAnimais.forEach(System.out::println);
		  }
	}
