package pct.example;

public class leituraArrays {
     public static void main(String[] args) {
         int [] numbers;
         numbers = new int[10];
         for (int i = 0; i < numbers.length; i++) {
             numbers[i] = i + 1;
             System.out.println(numbers[i]);

         }
         //Outro modo de percorrer Arrays em Java (loop for aprimorado)
         for (int x: numbers){
             System.out.println(x);
         }

         String [] names = new String[10];
         for (int i = 0; i < names.length; i++) {
             System.out.println(names[i]);
         }
         names[0]= "Ana";
         names[1]= "Carlos";
         names[2]= "Bob";

         for (int i = 0; i < 3; i++) {
             System.out.println(names[i]);
         }

         String [] diasSemana = {"Sabado", "Domingo"};
         for (int i = 0; i < diasSemana.length; i++) {
             System.out.println(diasSemana[i]);
         }

         //Matrizes

         int [][] duasDimen;
         duasDimen = new int[2][2];
         duasDimen[0][0] = 1;
         duasDimen[0][1] = 2;
         duasDimen[1][0] = 3;
         duasDimen[1][1] = 4;

         for (int i = 0; i < duasDimen.length; i++) {
             for (int j = 0; j < duasDimen.length; j++) {
                 System.out.println(duasDimen[i][j]);

             }
         }

         System.out.println(duasDimen[duasDimen.length-1][1]);
         System.out.println(duasDimen.length);


     }
}
