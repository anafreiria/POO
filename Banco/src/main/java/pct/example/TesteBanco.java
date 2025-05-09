package pct.example;

import banco.Cliente;
import banco.Conta;

import java.util.Scanner;

public class TesteBanco {
    // Criando múltiplas contas
    //        Conta conta1 = new Conta(1000.0);
    //        Conta conta2 = new Conta(500.0);
    //        Conta conta3 = new Conta(200.0);
    //
    //        // Operações na conta1
    //        System.out.println("Conta 1 - Saldo inicial: R$ " + conta1.getSaldo());
    //        conta1.depositar(100.0);
    //        conta1.sacar(50.0);
    //        System.out.println("Conta 1 - Saldo final: R$ " + conta1.getSaldo());
    //
    //        // Operações na conta2
    //        System.out.println("\nConta 2 - Saldo inicial: R$ " + conta2.getSaldo());
    //        conta2.sacar(600.0); // deve mostrar mensagem de saldo insuficiente
    //        conta2.depositar(200.0);
    //        conta2.sacar(300.0);
    //        System.out.println("Conta 2 - Saldo final: R$ " + conta2.getSaldo());
    //
    //        // Operações na conta3
    //        System.out.println("\nConta 3 - Saldo inicial: R$ " + conta3.getSaldo());
    //        conta3.depositar(50.0);
    //        conta3.sacar(100.0);
    //        conta3.depositar(25.0);
    //        System.out.println("Conta 3 - Saldo final: R$ " + conta3.getSaldo());]

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos clientes deseja cadastrar? ");
        int totalClientes = scanner.nextInt(); // Lê o número digitado
        scanner.nextLine(); // Limpar quebra de linha

        // Cria um array para armazenar os objetos Cliente
        Cliente[] clientes = new Cliente[totalClientes];

        // Criação de clientes e contas
        for (int i = 0; i < totalClientes; i++) {
            System.out.println("\nCadastro do cliente #" + (i + 1));

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Saldo inicial da conta: R$ ");
            double saldoInicial = scanner.nextDouble();
            scanner.nextLine(); // Limpar quebra de linha

            Conta conta = new Conta(saldoInicial);
            Cliente cliente = new Cliente(nome, sobrenome);
            cliente.setConta(conta);

            clientes[i] = cliente;
        }

        // Menu de operações
        int opcao;
        do {
            System.out.println("\n===== Menu Banco =====");
            for (int i = 0; i < totalClientes; i++) {
                Cliente cliente = clientes[i];
                System.out.println(i + " - " + cliente.getNome() + " " + cliente.getSobrenome());
            }
            System.out.println("-1 - Sair");
            System.out.print("Escolha o número do cliente para acessar a conta: ");
            int escolha = scanner.nextInt();

            if (escolha == -1) break;

            if (escolha < 0 || escolha >= totalClientes) {
                System.out.println("Cliente inválido.");
                continue;
            }

            // Obtém o cliente e a conta selecionados
            Cliente clienteSelecionado = clientes[escolha];
            Conta contaSelecionada = clienteSelecionado.getConta();

            do {
                System.out.println("\nOperações para " + clienteSelecionado.getNome() + " " + clienteSelecionado.getSobrenome());
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Ver saldo");
                System.out.println("0 - Voltar");
                System.out.print("Opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Valor para depositar: R$ ");
                        double valorDep = scanner.nextDouble();
                        if (contaSelecionada.depositar(valorDep)) {
                            System.out.println("Depósito realizado com sucesso.");
                        } else {
                            System.out.println("Valor inválido para depósito.");
                        }
                        break;
                    case 2:
                        System.out.print("Valor para sacar: R$ ");
                        double valorSaq = scanner.nextDouble();
                        if (contaSelecionada.sacar(valorSaq)) {
                            System.out.println("Saque realizado com sucesso.");
                        } else {
                            System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido.");
                        }
                        break;
                    case 3:
                        System.out.println("Saldo atual: R$ " + contaSelecionada.getSaldo());
                        break;
                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcao != 0);

        } while (true);

        scanner.close();
        System.out.println("Encerrando o sistema bancário.");
    }
}
