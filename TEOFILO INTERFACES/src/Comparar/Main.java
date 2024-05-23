package Comparar;

public class Main {

	public static void main(String[] args) {
		 Pessoa pessoa1 = new Pessoa("Alice", 30);
	        Pessoa pessoa2 = new Pessoa("Bob", 25);
	        Pessoa pessoa3 = new Pessoa("Charlie", 30);

	        System.out.println("Comparando Alice e Bob: " + pessoa1.comparar(pessoa2)); 
	        System.out.println("Comparando Bob e Alice: " + pessoa2.comparar(pessoa1)); 
	        System.out.println("Comparando Alice e Charlie: " + pessoa1.comparar(pessoa3)); 
	    }
	}
