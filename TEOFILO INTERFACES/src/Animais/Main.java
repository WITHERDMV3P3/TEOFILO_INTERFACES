package Animais;

public class Main {

	public static void main(String[] args) {
		 Animal meuCachorro = new Cachorro();
	        Animal meuGato = new Gato();
	        
	        System.out.println("Interações com o cachorro:");
	        meuCachorro.emitirsom();
	        meuCachorro.mover();
	        
	        System.out.println("\nInterações com o gato:");
	        meuGato.emitirsom();
	        meuGato.mover();
	}

}
