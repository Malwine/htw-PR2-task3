package ss2015_aufgabe3;

import java.util.Iterator;

public class EratosthenesTest {

	public static void main(String[] args) {
		
		Eratosthenes e1 = new Eratosthenes(70);
		
		System.out.println("An object with 2 sets was created with n = 70.");
		
		System.out.println("Numbers in ALL: " + e1.all.size());
		System.out.println("Numbers in SIEVE: " + e1.sieve.size());
		
		System.out.println();
		System.out.println("Output all prime numbers in ALL:");
		e1.findPrimes();

		Iterator<Integer> it = e1.all.iterator();
		while(it.hasNext()){
			System.out.println((Integer)it.next());
		}
		System.out.println();
		
		
		Eratosthenes e2 = new Eratosthenes(1000);
		System.out.println("An object with 2 sets was createdwith n = 1000.");
		
		System.out.println("Numbers in ALL: " + e2.all.size());
		System.out.println("Numbers in SIEVE: " + e2.sieve.size());
		
		System.out.println();
		System.out.println("Output all prime numbers in ALL:");
		e2.findPrimes();
		Iterator<Integer> it2 = e2.all.iterator();
		while(it2.hasNext()){
			System.out.println((Integer)it2.next());
		}
	}

}
