package org.example;



public class Main {
    public static void main(String[] args) {

        Guest pont = new Guest();

        pont.setTitle("Mister");
        String resposta = pont.getTitle();
        System.out.println(resposta);

        pont.setFistName("Pontes");
        System.out.println(pont.getFistName());
    }
}

