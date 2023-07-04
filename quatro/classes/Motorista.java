package exerciciosnt.quatro.classes;

public class Motorista extends Funcionario {
    private String cnh;
    private String placaCarro;

    public Motorista(String nome, String cpf, String rg, int idade, String cnh, String placaCarro,
                     String cargo, double salario) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setRg(rg);
        this.setIdade(idade);
        this.cnh = cnh;
        this.placaCarro = placaCarro;
        this.setCargo(cargo);
        this.setSalario(salario);
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }
    public void imprime() {
        System.out.println("Nome: "+this.getNome());
        System.out.println("Cargo: "+this.getCargo());
        System.out.println("Placa carro: "+this.getPlacaCarro());
    }
}
