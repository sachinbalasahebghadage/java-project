package String;

import java.util.HashMap;

public class HashmapCharCount {
	public static void charcount(String inputstring) {
		HashMap<Character, Integer> charmap = new HashMap<Character, Integer>();
		char[] arrmap = inputstring.toCharArray();
		for (char c : arrmap) {
			if (charmap.containsKey(c)) {

				charmap.put(c, charmap.get(c) + 1);
			} else {
				charmap.put(c, 1);
			}
		}
		System.out.println(inputstring+":"+charmap);
		
	}
	public static void main(String[] args) {
		charcount("welcome to pune city");
		charcount("welcome to pune city");
		charcount("welcome to pune city");
	}
}
