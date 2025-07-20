package banco.relatorios;

import banco.dominio.*;

public class RelatoriosClientes {

    public static void gerarRelatorio() {
        Banco banco = Banco.getBanco();

        System.out.println("\n\tRELATÓRIO DE CLIENTES");
        System.out.println("\t=========================\n");

        for (int i = 0; i < banco.getNumeroDeClientes(); i++) {
            Cliente cliente = banco.getCliente(i);
            System.out.println("Cliente: " + cliente.getNome() + ", " + cliente.getSobrenome());

            for (int j = 0; j < cliente.getNumeroDeContas(); j++) {
                Conta conta = cliente.getConta(j);
                if (conta instanceof ContaCorrente) {
                    ContaCorrente cc = (ContaCorrente) conta;
                    System.out.printf("  Conta Corrente: Saldo atual de R$ %.2f.\n", cc.getSaldo());
                    System.out.printf("  Cheque especial de R$ %.2f\n", cc.getChequeEspecial());
                } else if (conta instanceof ContaPoupanca) {
                    ContaPoupanca cp = (ContaPoupanca) conta;
                    System.out.printf("  Conta Poupança: Saldo atual de R$ %.2f.\n", cp.getSaldo());
                }
            }
            System.out.println();
        }
    }
}
