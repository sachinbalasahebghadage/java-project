package pattern;

public class pattern2 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++) {
			for(j=3;j>=i;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
