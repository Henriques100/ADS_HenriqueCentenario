package strategy_comparator;

import java.util.Comparator;

public class ComparadorPeloNome implements Comparator<Animal>{

	@Override
	public int compare(Animal a1, Animal a2) 
	{
		
		return a1.getNome().compareTo(a2.getNome());
	}
	
}
