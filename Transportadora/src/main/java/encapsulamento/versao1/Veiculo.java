package encapsulamento.versao1;



public class Veiculo {

    //Armazena o peso em kg
    public double  carga;
    public double  cargaMaxima;

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

}
