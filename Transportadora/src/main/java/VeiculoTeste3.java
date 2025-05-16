import encapsulamento.versao3.Veiculo;

import java.util.Scanner;

public class VeiculoTeste3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da carga máxima
        System.out.print("Informe a carga máxima do veículo (em kg): ");
        double cargaMaxima = scanner.nextDouble();
        Veiculo veiculo = new Veiculo(cargaMaxima);

        System.out.println("Carga máxima definida: " + veiculo.getCargaMaxima() + " kg");

        // Loop para adicionar caixas
        char continuar;
        do {
            System.out.print("Informe o peso da caixa a ser adicionada (em kg): ");
            double pesoCaixa = scanner.nextDouble();

            veiculo.adicionarCaixa(pesoCaixa);

            System.out.print("Deseja adicionar outra caixa? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);
        } while (continuar == 's');

        System.out.println("Carga final do veículo: " + veiculo.getCarga() + " kg");
        scanner.close();
    }
}
