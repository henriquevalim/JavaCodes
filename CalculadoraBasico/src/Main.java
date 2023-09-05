import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Criar uma instância da calculadora
        Calculadora calculadora = new Calculadora() {};

        // Definir os números para as operações
        List<Double> numeros = List.of(10.0, 5.0, 2.0);

        // Realizar operações e imprimir os resultados
        Operacao adicao = new Adicao();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();

        double resultadoAdicao = calculadora.executarOperacao(adicao, numeros);
        double resultadoSubtracao = calculadora.executarOperacao(subtracao, numeros);
        double resultadoMultiplicacao = calculadora.executarOperacao(multiplicacao, numeros);
        double resultadoDivisao = calculadora.executarOperacao(divisao, numeros);

        System.out.println("Resultado da Adição: " + resultadoAdicao);
        System.out.println("Resultado da Subtração: " + resultadoSubtracao);
        System.out.println("Resultado da Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Resultado da Divisão: " + resultadoDivisao);
    }
}