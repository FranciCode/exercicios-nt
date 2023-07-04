package exerciciosnt.tres;

public class Palindromo {

    public static void main(String[] args) {

        String palavra = "caixa";
        String reversa = new StringBuffer(palavra).reverse().toString();

        if (reversa.toLowerCase().equals(palavra.toLowerCase())) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo.");
        }
        System.out.println("Palavra original: "+ palavra.toLowerCase());
        System.out.println("Palavra reversa: "+ reversa.toLowerCase());
    }
}