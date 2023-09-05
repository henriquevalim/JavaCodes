import java.util.List;
class Divisao implements Operacao {
    @Override
    public double calcular(List<Double> numeros) {
        if (numeros.size() < 2) {
            throw new IllegalArgumentException("Pelo menos dois números são necessários para a divisão.");
        }
        double resultado = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            resultado /= numeros.get(i);
        }
        return resultado;
    }
}