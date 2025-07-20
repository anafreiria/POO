package banco.dominio;

public class Excecoes extends Exception {
    private double deficit;

    public Excecoes (String mensagem, double deficit) {
        super(mensagem); // envia a mensagem para a superclasse (Exception)
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}
