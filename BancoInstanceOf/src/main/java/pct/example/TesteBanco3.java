package pct.example;
 import banco.*;

import java.util.ArrayList;

public class TesteBanco3 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criando e adicionando clientes ao banco

        Cliente c1 = new Cliente("Bruno", "Henrique");
        c1.adicionarConta(new ContaPoupanca(50000, 0.03));
        c1.adicionarConta(new ContaCorrente(220000, 10000));
        banco.adicionarCliente(c1);

        Cliente c2 = new Cliente("Everton", "Ribeiro");
        c2.adicionarConta(new ContaCorrente(45000, 10000));
        banco.adicionarCliente(c2);

        Cliente c3 = new Cliente("Filipe", "Luis");
        c3.adicionarConta(new ContaPoupanca(150000, 0.02));
        c3.adicionarConta(new ContaCorrente(70000, 5000));
        banco.adicionarCliente(c3);

        Cliente c4 = new Cliente("Gabriel", "Barbosa");
        c4.adicionarConta(new ContaCorrente(70000, 5000));
        c4.adicionarConta(new ContaPoupanca(220000, 0.03));
        banco.adicionarCliente(c4);

        // Outro cliente com mesmo nome do primeiro
        Cliente c5 = new Cliente("Bruno", "Henrique");
        c5.adicionarConta(new ContaPoupanca(2000, 0.01));
        banco.adicionarCliente(c5);

        // ========== PRIMEIRA BUSCA ==========
        buscarEExibir(banco, "Bruno", "Henrique");

        // ========== SEGUNDA BUSCA ==========
        buscarEExibir(banco, "Gabriel", "Barbosa");

        // ========== TERCEIRA BUSCA ==========
        buscarEExibir(banco, "Giorgian", "De Arrascaeta");
    }

    private static void buscarEExibir(Banco banco, String nome, String sobrenome) {
        System.out.println("===============================================");
        System.out.println("Nome fornecido para busca...: " + nome + " " + sobrenome);

        ArrayList<Cliente> encontrados = banco.getCliente(nome, sobrenome);
        System.out.println("Temos " + encontrados.size() + " cliente(s) com o nome fornecido\n");

        for (int i = 0; i < encontrados.size(); i++) {
            Cliente c = encontrados.get(i);
            System.out.println("Cliente " + (i + 1) + " ...: " + c.getNome() + " " + c.getSobrenome());

            for (int j = 0; j < c.getNumeroDeContas(); j++) {
                Conta conta = c.getConta(j);
                String tipo = (conta instanceof ContaPoupanca) ? "Conta Poupanca" : "Conta Corrente";
                System.out.printf("Tipo de conta: %s com saldo de R$ %.1f\n", tipo, conta.getSaldo());
            }
            System.out.println();
        }
    }
}
