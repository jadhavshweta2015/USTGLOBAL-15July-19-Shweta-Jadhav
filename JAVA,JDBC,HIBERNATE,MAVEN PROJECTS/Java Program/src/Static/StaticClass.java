package Static;

public class StaticClass {

	/**
	 * @param args
	 */
	public Integer count=0;
	public static Integer staticcount=0;
	public void display(){
		count ++;
		staticcount ++;
		System.out.println("count::"+count);
		System.out.println("staticcount::"+StaticClass.staticcount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StaticClass s=new  StaticClass();
		 s.display();
		 StaticClass s1=new  StaticClass();
		 s1.display();
		 
	}

}
