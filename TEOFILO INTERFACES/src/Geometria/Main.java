package Geometria;

public class Main {
		 public static void main(String[] args) {
		        FormaGeometrica circulo = new Circulo(5.0);
		        FormaGeometrica retangulo = new Retangulo(4.0, 7.0);

		        System.out.println("Circulo:");
		        System.out.println("Área: " + circulo.calcularArea());
		        System.out.println("Perímetro: " + circulo.calcularPerimetro());

		        System.out.println("\nRetangulo:");
		        System.out.println("Área: " + retangulo.calcularArea());
		        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
		    
	}

}
