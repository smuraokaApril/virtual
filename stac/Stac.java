package stac;

import java.util.LinkedList;
import java.util.List;

public class Stac {

	private List<Integer> numberStac;

	public Stac() {
		numberStac = new LinkedList<Integer>();
	}

	public void push(Integer value) {
		numberStac.add(value);
	}

	public Integer pop() {
		if (numberStac.isEmpty()) {
			return null;
		}
		return numberStac.get(numberStac.size() - 1);
	}
}
