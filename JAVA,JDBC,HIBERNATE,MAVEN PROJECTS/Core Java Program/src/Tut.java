import java.util.Scanner;


public class Tut {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rows and columns:");
		int row=s.nextInt();
		int coloumn=s.nextInt();
		int array[][]=new int[row][coloumn];
		System.out.println("Enter element:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<coloumn;j++)
			{
				array[i][j]=s.nextInt();
				System.out.println(" ");
			}
		}
		System.out.println("Above elements ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<coloumn;j++)
			{
				System.out.print(""+array[i][j]);
			}
			System.out.println(" ");
		}
	}

}
