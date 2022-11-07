package strategy_comparator;

import java.util.Comparator;

public class ComparadorPorId implements Comparator<Animal> {

	@Override
	public int compare(Animal a1, Animal a2) {
		// TODO Auto-generated method stub
		return a1.getId().compareTo(a2.getId());
	}
}
