package Numeric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class RemoveDublicate {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2, 2, 15, 66, 77, 44, 33, 22, 1, 5, 5, 66, 6, 7, 8));

		System.out.println("list" + al);
	/*	for (int i = 0; i < al.size(); i++) {
			for (int j = 1; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
				al.remove(j);}
			}
		}
	*/
		TreeSet t=new TreeSet(al);
		System.out.println("dublicate removes"+t);

	}

}
