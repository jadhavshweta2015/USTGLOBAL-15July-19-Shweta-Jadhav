package defaultconstructor;

public class ParaConstructor {

	int rNo;
	String name;
	public ParaConstructor(int a,String b) {
		this.rNo=a;
		this.name=b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParaConstructor pc=new ParaConstructor(12,"Shweta");
		System.out.println("roll no:"+pc.rNo);
	}

}
