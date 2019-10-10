package defaultconstructor;

public class CopyConstructor {

	int rNo;
	String name;
	public CopyConstructor(int rNo,String name) {
		this.rNo=rNo;
		this.name=name;
	}
	public CopyConstructor(CopyConstructor c) {
		this.rNo=c.rNo;
		this.name=c.name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructor pc=new CopyConstructor(12,"Shweta");
		System.out.println("roll no:"+pc.rNo);
		CopyConstructor pc1=new CopyConstructor(pc);
		System.out.println("roll no:"+pc1.rNo);
	}

}
