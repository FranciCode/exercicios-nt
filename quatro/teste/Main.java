package exerciciosnt.quatro.teste;
import exerciciosnt.quatro.classes.Motorista;

public class Main {
    public static void main(String[] args) {
        Motorista motorista = new Motorista("Gaudencio", "123.456.789-00", "987654321", 50,
                "3597", "ABC1234", "Motorista", 4500);

        Motorista motorista2 = new Motorista("Juruna", "987.654.321-00", "123456789", 49,
                "1564", "DEF5678", "Motorista", 5500);

        System.out.println("\nInformações:\n");
        motorista.imprime();
        System.out.println("----------");
        motorista2.imprime();
    }
}
