import java.util.Scanner;


public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		int i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many element you want to insert:");
		int n=s.nextInt();
		System.out.println("enter element you want to insert:");
		for(i=0;i<=n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<=n;i++)
		{
		System.out.println("element you insert at posyion "+i+":"+arr[i]);
		}
		for(i=0;i<=n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("element sum:"+sum);
		System.out.println("enter element you want to delete:");
		int x=s.nextInt();
		for(i=0;i<=n;i++)
		{
			if(arr[i]==x)
			{
				for(int j=i;j<=n;j++)
				{
					arr[j]=arr[j+1];
				}
				break;
			}
			/*else
			{
				System.out.println("element nf");
			}*/
		}
		for(i=0;i<=n;i++)
		{
		System.out.println("element you insert at posyion "+i+":"+arr[i]);
		}
		int index_pos=3;
		int value=8;
		for(i=arr.length-1;i>index_pos;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[index_pos]=value;
		for(i=0;i<=n;i++)
		{
		System.out.println("newelement you insert at posyion "+i+":"+arr[i]);
		}
	}

}
