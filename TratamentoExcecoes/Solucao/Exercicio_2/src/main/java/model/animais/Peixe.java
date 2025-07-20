package model.animais;

public class Peixe extends Animal implements AnimalDeEstimacao {

    public Peixe(String nome) {
        super(nome, 0);
    }

    @Override
    public void comer() {
        System.out.println(this.nome + " come minhoca");
    }

    @Override
    public void brincar() {
        System.out.println(this.nome + " brinca com anzol.");
    }

    @Override
    public void caminhar() {
        System.out.println(this.nome + " não anda, nada.");
    }
}
