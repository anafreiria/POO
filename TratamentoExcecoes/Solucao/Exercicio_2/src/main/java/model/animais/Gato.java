package model.animais;

public class Gato extends Animal implements AnimalDeEstimacao{

    public Gato(String nome) {
        super(nome, 4);
    }

    public Gato() {
        this("");
    }
    @Override
    public void comer() {
        System.out.println(this.nome + " come ração.");
    }

    @Override
    public void brincar() {
        System.out.println(this.nome + " brinca com com a bola de meia.");
    }
}
