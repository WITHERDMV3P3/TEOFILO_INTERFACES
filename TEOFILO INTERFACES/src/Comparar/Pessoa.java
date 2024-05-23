package Comparar;

public class Pessoa implements Comparavel {
	 private String nome;
	    private int idade;

	    public Pessoa(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    @Override
	    public int comparar(Object o) {
	        if (o instanceof Pessoa) {
	            Pessoa outraPessoa = (Pessoa) o;
	            return Integer.compare(this.idade, outraPessoa.idade);
	        }
	        throw new IllegalArgumentException("Objeto não é do tipo Pessoa");
	    }
}
