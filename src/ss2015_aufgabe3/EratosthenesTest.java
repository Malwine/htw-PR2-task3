package ss2015_aufgabe3;

public class EratosthenesTest {

	public static void main(String[] args) {
		
		Eratosthenes e1 = new Eratosthenes(5);
		
		System.out.println(e1.all.isEmpty());
		System.out.println(e1.all.size());
		System.out.println(e1.all.toString());
		System.out.println(e1.all.contains((Integer)1));
		System.out.println(e1.all.contains((Integer)5));
	}

}
