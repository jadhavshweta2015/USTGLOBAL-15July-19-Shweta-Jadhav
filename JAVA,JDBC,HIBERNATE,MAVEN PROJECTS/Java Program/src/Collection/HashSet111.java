package Collection;

import java.util.HashSet;

public class HashSet111 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hh= new HashSet();
		hh.isEmpty();
		hh.add(1);
		hh.add(2);
		hh.add(3);
		System.out.print(hh);
		hh.remove(3);
		System.out.print(hh);
		hh.add(3);
		System.out.print(hh);
		HashSet hh1= new HashSet();
		hh1.add(4);
		hh1.add(5);
		hh1.add(6);
		System.out.print(hh1);
		hh1.contains(5);
		System.out.print(hh1.addAll(hh));
		System.out.print(hh1);
		
}

}
