package exerciciosnt.cinco;

public class MatrizIdentidade {
    public static int[][] gerarMatrizIdentidade(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        return matriz;
    }

    public static void main(String[] args) {
        int numero = 3;
        int[][] matrizIdentidade = gerarMatrizIdentidade(numero);

        System.out.println("Número: " + numero);
        System.out.println("Matriz Identidade:");
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.print(matrizIdentidade[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
