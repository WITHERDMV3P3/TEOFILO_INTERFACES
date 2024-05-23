package Animais;

public class Gato implements Animal{

	@Override
	public void emitirsom() {
		 System.out.println("O gato faz: Miau");
	}

	@Override
	public void mover() {
        System.out.println("O gato está andando furtivamente");		
	}

}
