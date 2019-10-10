
public class simple {
//int c;
//	public int add(int x,int b) {
//		return x+b;
//		
//	}
	
	String ISBN;
	simple(String val){
		ISBN=val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		simple s=new simple();
//		int c=s.add(1,2);
//		System.out.println(c);
		
//		int i=10,j=1;
//		//i++;
//		System.out.println(i++);
//		i++;
//		System.out.println(++i);
//		int c=i+j;
//		System.out.println(c);
		
		simple s1=new simple("1234-4657");
		simple s2=new simple("1234-4657");
		
		//String s=;
		//String s1="1234-4657";
		System.out.print(s1.equals(s2)+":");
		System.out.println(s1==s2);
	}

}
