package Racine;

public class NegativeNumberException extends Exception {
	
	public NegativeNumberException () {
		System.out.println("le nombre est négatif");
	}
	
	public String toString() 
	{
		return "le nombre est négatif";
	}
	
	
}
