package Assignments;

public class Assi4Star {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		for(int i=1;i<=4;i++){
			n=i;
			for(int j=1;j<=i;j++){
				System.out.print(n);
				
				n=n+4-j;
			}
			System.out.println();
		}
	}

}
