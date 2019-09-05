package Numeric;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimunmNo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(2, 4, 5, 6, 7, 8, 11, 9, 0, 77));
		int minno = al.get(0);
		try {
			for (int i = 0; i <= al.size()-1; i++) {
				if (minno > al.get(i)) {
					minno = al.get(i);
				}
			}
			System.out.println(al);
			System.out.println("Minimum number is: " + minno);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
