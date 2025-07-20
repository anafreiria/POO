package model.animais;

import java.sql.SQLOutput;

public class TesteAnimais {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Nemo");
        Gato gato = new Gato("Tom");
        Animal animal1 = new Peixe("Peixoto");
        Animal animal2 = new Aranha("Aracnilda");
        AnimalDeEstimacao ae = new Gato("Pudim");

        System.out.println("O peixe " + peixe.getNome() + " possui " + peixe.getNumeroDePernas() + " pernas");
        peixe.caminhar();
        peixe.brincar();
        peixe.comer();

        System.out.println();

        System.out.println("O gato " + gato.getNome() + " possui " + gato.getNumeroDePernas() + " pernas");
        gato.caminhar();
        gato.brincar();
        gato.comer();

        System.out.println();
        System.out.println("O animal " + animal1.getNome() + " possui " + animal1.getNumeroDePernas() + " pernas");
        animal1.caminhar();
        if(animal1 instanceof Peixe) {
            Peixe p = (Peixe) animal1;
            p.brincar();
        }
        animal1.comer();


        System.out.println();
        System.out.println("O animal " + animal2.getNome() + " possui " + animal2.getNumeroDePernas() + " pernas");
        animal2.caminhar();
        animal2.comer();

        System.out.println();
        ae.brincar();
        if(ae instanceof Gato) {
            Gato g = (Gato) ae;
            System.out.println("O animal de estimação " + g.getNome() + " possui " + g.getNumeroDePernas() + " pernas");
            g.caminhar();
            g.comer();
        }


    }
}
