import java.util.Scanner;


public class RemoveDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[20];
		int initial_ele,next_ele;
		int i;
		System.out.println("Enter array size:");
		Scanner s=new Scanner(System.in);
		int arr_len=s.nextInt();
		System.out.println("Enter array element:");
		for(i=0;i<arr_len;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Elements before removing duplicate value:");
		for(i=0;i<arr_len;i++)
		{
			System.out.println(+arr[i]);	
		}
		System.out.println("Elements after removing duplicate value:");
		for(initial_ele=0;initial_ele<arr_len;initial_ele++)
		{
			for(next_ele=initial_ele+1;next_ele<arr_len;){
				if(arr[initial_ele]==arr[next_ele])
				{
					for(int temp=next_ele;temp<arr_len;temp++){
						arr[temp]=arr[temp+1];
					}
					arr_len=arr_len-1;
				}
				else
					next_ele++;
			}
		}
		for(i=0;i<arr_len;++i)
			System.out.println(arr[i]);
	}

}
