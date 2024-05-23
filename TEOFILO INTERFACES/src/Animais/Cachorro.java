package Animais;

public class Cachorro implements Animal {

	@Override
	public void emitirsom() {
		System.out.println("O cachorro faz: Au Au");
		
	}

	@Override
	public void mover() {
		System.out.println("O cachorro está correndo");
	}

}
