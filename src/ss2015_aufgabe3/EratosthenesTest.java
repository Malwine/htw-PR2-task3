package ss2015_aufgabe3;

//import java.util.Iterator;

public class EratosthenesTest {

	public static void main(String[] args) {
		
		Eratosthenes e1 = new Eratosthenes(5);
		
		System.out.println("isEmpty: " + e1.all.isEmpty());
		System.out.println("Size: " + e1.all.size());
		System.out.println("toString: " + e1.all.toString());
		System.out.println("contains(1): " + e1.all.contains((Integer)1));
		System.out.println("contains(5): " + e1.all.contains((Integer)5));
		
		/*
		e1.all.remove((Integer)2);
		e1.all.remove((Integer)3);
		System.out.println("toString: " + e1.all.toString());
		e1.all.add((Integer)2);
		System.out.println("toString: " + e1.all.toString());
		*/
		
		System.out.println();
		System.out.println("toString: " + e1.sieve.toString());
		
		/*//Go through set.
		Iterator<Integer> it = e1.sieve.iterator();
		while(it.hasNext()){
			System.out.println((Integer)it.next());
		}
		*/
	}

}
