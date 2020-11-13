package p674_ColApi;

import java.util.Comparator;

public class BirthDataComparator implements Comparator<Party>{

	@Override
	public int compare(Party o1, Party o2) {
		return o1.getBirthDate().compareTo(o2.getBirthDate());
	}

}
