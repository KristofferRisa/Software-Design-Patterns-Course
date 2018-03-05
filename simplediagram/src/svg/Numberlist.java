package svg;

import java.util.Hashtable;

public class Numberlist extends Hashtable<String, Integer> {

	public String number(String key) {
		if (!containsKey(key)) {
			put(key, 0);
		}
		put(key, get(key) + 1);
		return key + "_" + get(key);
	}

}
