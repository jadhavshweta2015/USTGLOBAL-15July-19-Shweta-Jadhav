package ControlFlow;

public class Switch_Break_Statement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		switch(num){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("weekday");
			break;		//all the cases from 1 to till 5 is executed,bcoz case 5 have break
		case 6:
		case 7:
			System.out.println("weekends");
			break;
		default :
			System.out.println("invalis day");
			
			
		}
	}

}
