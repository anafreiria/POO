package encapsulamento.versao2;



public class Veiculo {

    //Armazena o peso em kg
    private double  carga;
    private double  cargaMaxima;

    public Veiculo(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;

    }

    //Retorna o peso em kg
    public double getCarga() {
        return carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public boolean adicionarCaixa(double peso) {
        if ((carga + peso) > cargaMaxima || (carga + peso) > 10000) {
            System.out.println("Carga excedida! Não é possível adicionar " + peso + " kg.");
            return false;
        }
        carga += peso;
        System.out.println("Caixa de " + peso + " kg adicionada. Carga atual: " + carga + " kg.");
        return true;
    }

}
