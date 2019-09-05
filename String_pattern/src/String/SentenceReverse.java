package String;

public class SentenceReverse {

	public static void main(String[] args) {
		String str = "metro pune to welcome";
		String[] split = str.split(" ");
		String newstr = " ";
		for (int i = split.length - 1; i >= 0; i--) {
			newstr = newstr + split[i] + " ";
		}
		System.out.print(newstr);
	}

}
