package defaultconstructor;

public class DefaultConstructor {

	int rNo;
	String name;
	public DefaultConstructor() {
		rNo=1;
		name="Shweta";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor dc=new DefaultConstructor();
		System.out.println("roll no:"+dc.rNo);
	}

}
