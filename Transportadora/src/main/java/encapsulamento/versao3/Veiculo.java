package encapsulamento.versao3;

public class Veiculo {
    // Agora armazenamos o peso em Newtons
    private double carga;
    private double cargaMaxima;

    public Veiculo(double cargaMaxima) {
        // Convertendo a carga máxima de kg para Newtons
        this.cargaMaxima = quilogramasParaNewtons(cargaMaxima);
    }

    // Retorna a carga em kg
    public double getCarga() {
        return Math.round(newtonsParaQuilogramas(carga));
    }

    // Retorna a carga máxima em kg
    public double getCargaMaxima() {
        return newtonsParaQuilogramas(cargaMaxima);
    }

    // Adiciona uma caixa convertendo de kg para Newtons antes de armazenar
    public boolean adicionarCaixa(double peso) {
        double pesoEmNewtons = quilogramasParaNewtons(peso);

        if ((carga + pesoEmNewtons) > cargaMaxima) {
            System.out.println("Carga excedida! Não é possível adicionar " + peso + " kg.");
            return false;
        }

        carga += pesoEmNewtons;
        System.out.println("Caixa de " + peso + " kg adicionada. Carga atual: " + getCarga() + " kg.");
        System.out.println("Caixa de " + pesoEmNewtons + " Newtons adicionada. Carga atual: " + getCarga() + " kg.");

        return true;
    }

    // Método para converter kg para Newtons
    private double quilogramasParaNewtons(double peso) {
        return (peso) * 9.8;
    }

    // Método para converter Newtons para kg
    private double newtonsParaQuilogramas(double peso) {
        return peso / 9.8;
    }
}
