package exerciciosnt.um;

public class NumerosParesZeroAteCem {
    public static void main(String[] args) {
        //1 - Imprima todos os números pares de 0 a 100.

        int valor = 100;
        System.out.println(" Imprima todos os números pares de 0 a 100.");
        for (int i = 0; i <= valor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
