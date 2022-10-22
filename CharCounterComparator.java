package homework;

import java.util.Comparator;

public class CharCounterComparator implements Comparator<CharCounter> {

	@Override
	public int compare(CharCounter o1, CharCounter o2) {
		if (o1.getCount()<o2.getCount()) {
			return 1;
		}
		if (o1.getCount()>o2.getCount()) {
			return -1;
		}
		if (o1.getCh() > o2.getCh()) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
