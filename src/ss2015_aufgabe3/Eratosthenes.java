package ss2015_aufgabe3;

import java.util.Set;
import java.util.TreeSet;
/**
 * Eratosthenes creates an object with two sets 
 * to find the prime numbers in the given range of numbers.
 * @author Malwine
 *
 */
public class Eratosthenes {
	Set<Integer> all;
	Set<Integer> sieve;
	
	/**
	 * Constructor of an Eratosthenes object, 
	 * which created the object and two sorted sets.
	 * @param n
	 */
	public Eratosthenes(int n) {
		all = new TreeSet<Integer>();	//create sorted set "all"
		for(int i = 2; i <= n; i++){  
			all.add((Integer)i);     	//fill set with number from 2 to n
		}

		sieve = new TreeSet<Integer>(); 	  //create sorted set "sieve"
		for(int i = 2; i <= n; i++){     	  //for all numbers n
			for(int p = 2; p <= n; p++){ 
				int multiple = i * p;    	  //find all multiples of all n * n(p) numbers
				sieve.add((Integer)multiple); //fill set with multiples
			}
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public TreeSet<Integer> findPrimes(){
		//TODO
		return null;
	}
}
