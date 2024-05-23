package Veiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		   List<Veiculo> veiculos = new ArrayList<>();

	        Veiculo carro = new Carro();
	        Veiculo moto = new Moto();

	        veiculos.add(carro);
	        veiculos.add(moto);

	        for (Veiculo veiculo : veiculos) {
	            veiculo.acelerar();
	            veiculo.frear();
	        }

	}

}
