package Collection;

import java.util.TreeSet;

public class treeset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		
		boolean ss=ts.isEmpty();
		System.out.println(ss);
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		System.out.println(ts);
		ts.remove(4);
		System.out.println(ts);
		boolean s=ts.contains(4);
		System.out.println(s);
		ts.clear();
		System.out.println(ts);
		
	}

}
