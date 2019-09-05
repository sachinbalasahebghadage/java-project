package String;

public class WrodCountInString {

	public static void main(String[] args) {
		String str = "welcome to pune metro";// 4
		int count = 1;
		String[] split = str.split(" ");
		for (int i = 0; i < split.length - 1; i++) {
			count++;
		}
		System.out.print("words are in string :"+count);
	}

}
