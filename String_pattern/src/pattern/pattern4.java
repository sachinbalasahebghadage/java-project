package pattern;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for (i = 1; i <= 3; i++) {
			for (j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (i = 1; i <= 3; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 3; k >= i; k--) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
