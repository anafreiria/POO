import encapsulamento.versao1.*;


public class VeiculoTeste1 {
        public static void main(String[] args) {
            Veiculo veiculo = new Veiculo(1000); // Exemplo com carga máxima de 1000kg

            System.out.println("Carga atual do veículo: " + veiculo.getCarga() + " kg");
            System.out.println("Carga máxima do veículo: " + veiculo.getCargaMaxima() + " kg");

            System.out.println("Adicionando caixa numero 1 (500kg)");
            veiculo.carga = 500;
            System.out.println("Adicionando caixa numero 2 (250kg)");
            veiculo.carga += 250;
            System.out.println("Adicionando caixa numero 3 (5000kg)");
            veiculo.carga += 5000;

            System.out.println("Adicionando caixa numero 4 (4000kg)");
            veiculo.carga += 4000;
            System.out.println("Adicionando caixa numero 5 (300kg)");
            veiculo.carga += 300;

            System.out.println("Carga atual do veículo: " + veiculo.getCarga() + " kg");
        }
    }

