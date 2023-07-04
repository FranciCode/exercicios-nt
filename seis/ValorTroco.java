package exerciciosnt.seis;
import java.math.BigDecimal;

public class ValorTroco {
    public static void main(String[] args) {
        double custo = 17.35;
        double pagamento = 20.0;
        calcularTroco(custo, pagamento);
    }
    public static void calcularTroco(double custo, double pagamento) {
        BigDecimal valorCusto = new BigDecimal(Double.toString(custo));
        BigDecimal valorPagamento = new BigDecimal(Double.toString(pagamento));
        BigDecimal troco = valorPagamento.subtract(valorCusto);
        System.out.printf("Valor do troco: R$%.2f%n", troco);

        BigDecimal[] notasEMoedas = {  BigDecimal.valueOf(100), BigDecimal.valueOf(50), BigDecimal.valueOf(20),
                BigDecimal.valueOf(10), BigDecimal.valueOf(5), BigDecimal.valueOf(2), BigDecimal.valueOf(1),
                BigDecimal.valueOf(0.5), BigDecimal.valueOf(0.25), BigDecimal.valueOf(0.1), BigDecimal.valueOf(0.05),
                BigDecimal.valueOf(0.01) };

        String[] nomeNotaMoeda = { "nota de 100", "nota de 50", "nota de 20", "nota de 10", "nota de 5",
                "nota de 2", "nota de 1", "moeda de 50", "moeda de 25", "moeda de 10", "moeda de 05"};

        System.out.println("\nMenor troco:");

        for (int i = 0; i < notasEMoedas.length; i++) {

            BigDecimal[] divisao = troco.divideAndRemainder(notasEMoedas[i]);
            int quantidade = divisao[0].intValue();
            if (quantidade > 0) {
                System.out.println(quantidade + " - " + nomeNotaMoeda[i]);
                troco = divisao[1];
            }
        }
    }
}