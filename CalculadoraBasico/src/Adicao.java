import java.util.List;
class Adicao implements Operacao {
    @Override
    public double calcular(List<Double> numeros) {
        double resultado = 0;
        for (Double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
}
