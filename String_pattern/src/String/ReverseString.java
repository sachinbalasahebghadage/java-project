package String;

public class ReverseString {

	public static void main(String[] args) {

		String str="enup";//pune
		char[]arr=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}

}
