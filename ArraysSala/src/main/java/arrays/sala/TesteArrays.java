package arrays.sala;
import java.util.Arrays;

public class TesteArrays {
    public static void exibirArray(int[] array) {
        System.out.print("<");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if ((i + 1) < array.length) {
                System.out.print(",");
            }
        }
        System.out.println(">");


    }

    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] array2; // Declarado, mas não inicializado
        int[][] matriz = new int[5][]; // Matriz 5x0

        exibirArray(array1); // Chamada do método exibirArray

        array2 = array1;

        for (int i = 0; i < array2.length; i+=2) {
            array2[i] = i;
        }

        System.out.println("array2:");
        exibirArray(array2);

        System.out.println("array1:");
        exibirArray(array1);


        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[i];
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
            }
        }

        for (int[] matriz1 : matriz) { // Para cada vetor dentro da matriz faço alguma coisa
            exibirArray(matriz1);
        }

        System.out.println("Inmprimindo array1, array2 e matriz utilizando métodos estáticos da classe Arrays");

        System.out.println("array1:");
        System.out.println(Arrays.toString(array1));
        
        System.out.println("array2:");
        System.out.println(Arrays.toString(array2));

        System.out.println("matriz:");
        System.out.println(Arrays.deepToString(matriz));
    


    }
}