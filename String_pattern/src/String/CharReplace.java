package String;

public class CharReplace {

	public static void main(String[] args) {
		String str = "Mumbal", output = "";
		int i;
		char[] arr = str.toCharArray();
		char oldchar = 'l';
		char newchar = 'i';
		for (i = 0; i < arr.length ; i++) {
			if (arr[i] == oldchar) {
				arr[i] = newchar;
			}

			System.out.print(arr[i]);
		}

		/*
		 * String str2=new String(arr[i]); System.out.println(str2); String replaced =
		 * word.replace("J", "K"); System.out.println("Replacing character in String");
		 * System.out.println("Original String before replace : " + word);
		 * System.out.println("Replaced String : " + replaced);
		 * 
		 * //replacing substring on String in Java String str =
		 * "Scala is good programming language"; replaced = str.replaceAll("Scala",
		 * "Java"); System.out.println("String before replace : " + str);
		 * System.out.println("String after replace : " + replaced);
		 */}

}
