import java.util.List;
abstract class Calculadora {
    public double executarOperacao(Operacao operacao, List<Double> numeros) {
        return operacao.calcular(numeros);
    }
}
