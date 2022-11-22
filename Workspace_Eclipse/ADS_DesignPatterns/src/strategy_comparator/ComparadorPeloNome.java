<<<<<<< HEAD
package strategy_comparator;

import java.util.Comparator;

public class ComparadorPeloNome implements Comparator<Animal>{

	@Override
	public int compare(Animal a1, Animal a2) 
	{
		
		return a1.getNome().compareTo(a2.getNome());
	}
	
}

=======
package strategy_comparator;

import java.util.Comparator;

public class ComparadorPeloNome implements Comparator<Animal>{

	@Override
	public int compare(Animal a1, Animal a2) 
	{
		
		return a1.getNome().compareTo(a2.getNome());
	}
	
}

>>>>>>> 8a3526c26622fc2f070fbcdff95008fb8820a218
