package model.animais;

public class Aranha extends Animal{

    public Aranha(String nome) {
        super(nome, 8);  // nome da aranha?
    }

    @Override
    public void comer() {
        System.out.println(this.nome +  " come insetos");
    }
}
