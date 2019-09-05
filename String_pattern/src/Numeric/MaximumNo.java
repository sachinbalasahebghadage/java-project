package Numeric;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumNo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(
				Arrays.asList(2, 6, 8, 11, 77, 99, 02, 66, 33, 221, 22, 33, 44, 55, 6));
		int maxno = al.get(0);
		for (int i = 0; i < al.size(); i++) {
			if (maxno < al.get(i)) {
				maxno = al.get(i);
			}
		}
		System.out.println("arraylist element as: " + al);
		System.out.println("maximum number is:" + maxno);
	}

}
