package Method;

public class Method_Java {

	/**
	 * @param args
	 */
	public static int clacAreaSqaure(int side){
		int area=side*side;
		return area;
	}
	public static float clacAreaCircle(int radius){
		float pi=3.14f;
		float area=pi*radius;
		return area;
		
	}
	public static void clacAreaTriangle(int base,int height){
		int area=base*height;
		System.out.println("Triangle ="+area);
	}
	public static void clacAreaAverage(int a,int b,int c){
		int area=(a+b+c)/3;
		System.out.println("Aveage5"+area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=clacAreaSqaure(5);
		System.out.println(x);
		float y=clacAreaCircle(2);
		System.out.println(y);
		clacAreaTriangle(2,2);
		clacAreaAverage(2,2,2);
		
	}

}
