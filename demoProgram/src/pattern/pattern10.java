package pattern;

public class pattern10 {
	
	public static void main(String[] args) {
		int sp=5;
		char ch1='a';
		for(int r=1;r<=5;r++) {
			ch1='a';
			for(int k=1;k<=(sp-r);k++) {
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {
				System.out.print((ch1++)+"");
			}
			System.out.println();
		}
	}

}
