package Operacoes;

public class Main {

	public static void main(String[] args) {

        Operacao adicao = (a, b) -> a + b;
        Operacao subtracao = (a, b) -> a - b;
        Operacao multiplicacao = (a, b) -> a * b;
        Operacao divisao = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero");
            }
            return a / b;
        };


        int a = 10;
        int b = 5;

        System.out.println("Adição: " + executarOperacao(adicao, a, b));
        System.out.println("Subtração: " + executarOperacao(subtracao, a, b));
        System.out.println("Multiplicação: " + executarOperacao(multiplicacao, a, b));
        System.out.println("Divisão: " + executarOperacao(divisao, a, b));
    }

    public static int executarOperacao(Operacao operacao, int a, int b) {
        return operacao.executar(a, b);
    }
}
