package String;

public class RemoveSpace {

	public static void main(String[] args) {
		String str = "p u n e";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) != ' ' && str.charAt(i) != '\t') {
				sb.append(str.charAt(i));
			}
		}
		System.out.print(sb);
	}

}
