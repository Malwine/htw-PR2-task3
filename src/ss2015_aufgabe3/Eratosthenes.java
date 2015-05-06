package ss2015_aufgabe3;

import java.util.Set;
import java.util.TreeSet;

public class Eratosthenes {
	Set<Integer> all;
	Set<Integer> sieve;
	
	public Eratosthenes(int n) {
		
		all = new TreeSet<Integer>();
		
		for(int i = 0; i < n; i++){
			all.add((Integer)i);
			System.out.println(i);
		}
	}
}
