package model;

import java.util.Comparator;

class Arraycomparator implements Comparator<Object[]> {

	public int compare(Object[] o1, Object[] o2) {
		return ((Integer) o1[0]).compareTo((Integer) o2[0]);
	}

}
