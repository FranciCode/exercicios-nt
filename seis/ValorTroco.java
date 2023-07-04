package exerciciosnt.seis;

public class ValorTroco {
    public static void main(String[] args) {
        float custo = 17.35f;
        float pagamento = 20.0f;
        calcularTroco(custo, pagamento);
    }
    public static void calcularTroco(float custo, float pagamento) {
        float troco = pagamento - custo;
        System.out.println("Custo: "+custo);
        System.out.println("Pagamento: "+pagamento);
        System.out.println("Valor do troco: R$"+troco);
//OBS: Utilizei float, doble e não consegui trazer o valor exato/arredondado do troco (R$2,65).

        float[] notasEMoedas = { 100, 50, 20, 10, 5, 2, 1, 0.50f, 0.25f, 0.10f, 0.05f};

        String[] nomeNotaMoeda = { "nota de 100", "nota de 50", "nota de 20", "nota de 10", "nota de 5",
                "nota de 2", "nota de 1", "moeda de 50", "moeda de 25", "moeda de 10", "moeda de 05"};

        System.out.println("\nMenor troco:");

        for (int i = 0; i < notasEMoedas.length; i++) {
            int quantidade = (int) (troco / notasEMoedas[i]);
            if (quantidade > 0) {
                System.out.println(quantidade + " - " + nomeNotaMoeda[i]);
                troco = troco % notasEMoedas[i];
            }
        }
    }

}