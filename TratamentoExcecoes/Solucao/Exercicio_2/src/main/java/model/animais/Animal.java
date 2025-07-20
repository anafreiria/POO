package model.animais;

public abstract class Animal {
    protected int numeroDePernas;
    protected String nome;

    protected Animal(String nome, int numeroDePernas){
        this.nome = nome;
        this.numeroDePernas = numeroDePernas;
    }

    public abstract void comer();

    public void caminhar() {
        System.out.println(this.nome + " anda com " + numeroDePernas + " pernas.");
     }

    public int getNumeroDePernas() {
        return numeroDePernas;
    }

    public void setNumeroDePernas(int numeroDePernas) {
        this.numeroDePernas = numeroDePernas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
