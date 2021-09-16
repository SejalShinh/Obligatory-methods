package studentSystem;

import java.util.Comparator;

class ProfByNameComparator implements Comparator<Prof>{

	public ProfByNameComparator()  {
		// TODO Auto-generated constructor stub
	}
	
	public int compare(Prof a, Prof b) {
		return a.getName().compareTo(b.getName());
	}

}
