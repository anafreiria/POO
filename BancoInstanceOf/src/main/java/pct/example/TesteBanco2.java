//package pct.example;
//import banco.*;
//
//public class TesteBanco2 {
//    public static void main(String[] args) {
//        Banco banco = new Banco();
//
//        Cliente c1 = new Cliente("Bruno", "Henrique");
//        c1.adicionarConta(new ContaPoupanca(50000, 0.03));
//        c1.adicionarConta(new ContaCorrente(220000, 10000));
//        banco.adicionarCliente(c1);
//
//        Cliente c2 = new Cliente("Everton", "Ribeiro");
//        c2.adicionarConta(new ContaCorrente(45000, 5000));
//        banco.adicionarCliente(c2);
//
//        Cliente c3 = new Cliente("Filipe", "Luis");
//        c3.adicionarConta(new ContaPoupanca(150000, 0.02));
//        c3.adicionarConta(new ContaCorrente(70000, 7000));
//        banco.adicionarCliente(c3);
//
//        Cliente c4 = new Cliente("Gabriel", "Barbosa");
//        c4.adicionarConta(new ContaCorrente(70000, 5000));
//        c4.adicionarConta(new ContaPoupanca(220000, 0.04));
//        banco.adicionarCliente(c4);
//
//        System.out.println("RELATÓRIO DE CLIENTES");
//        System.out.println("=====================");
//
//        for (int i = 0; i < banco.getNumeroDeClientes(); i++) {
//            Cliente cliente = banco.getCliente(i);
//            System.out.println("Cliente: " + cliente.getNome() + " " + cliente.getSobrenome());
//
//            for (int j = 0; j < cliente.getNumeroDeContas(); j++) {
//                Conta conta = cliente.getConta(j);
//                String tipoConta;
//
//                if (conta instanceof ContaPoupanca) {
//                    tipoConta = "Conta Poupança";
//                } else if (conta instanceof ContaCorrente) {
//                    tipoConta = "Conta Corrente";
//                } else {
//                    tipoConta = "Conta Desconhecida";
//                }
//
//                System.out.println("O saldo da " + tipoConta + " é de R$ " + conta.getSaldo());
//            }
//
//            System.out.println(); // linha em branco entre clientes
//        }
//    }
//}
