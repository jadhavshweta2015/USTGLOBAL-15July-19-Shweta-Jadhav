package Collection;

import java.util.LinkedList;

public class Linkedlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		boolean s=ll.contains(3);
		System.out.println(s);
		ll.addFirst(8);
		System.out.println(ll);
		ll.addLast(8);
		System.out.println(ll);
		ll.remove(8);
		System.out.println(ll);
		
	}

}
