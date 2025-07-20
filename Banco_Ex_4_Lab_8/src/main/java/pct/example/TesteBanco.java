package banco;

public class TesteBanco {
    public static void main(String[] args) {
        System.out.println("Criando uma conta conta poupança com saldo de R$ 50.000,00 para o Cliente Bruno Henrique.");
        ContaPoupanca poupancaBruno = new ContaPoupanca(50000.0, 0.01);

        System.out.println("Criando uma conta corrente com saldo de R$ 220.000,00 para o Cliente Bruno Henrique.");
        ContaCorrente correnteBruno = new ContaCorrente(220000.0, poupancaBruno);

        System.out.println("Criando uma conta corrente com saldo de R$ 50.000,00 para o Cliente Diego Alves, sem conta poupança de proteção");
        ContaCorrente correnteDiego = new ContaCorrente(50000.0);

        Cliente bruno = new Cliente("Bruno", "Henrique");
        bruno.setContaCorrente(correnteBruno);
        bruno.setContaPoupanca(poupancaBruno);

        Cliente diego = new Cliente("Diego", "Alves");
        diego.setContaCorrente(correnteDiego);

        System.out.println("\nContas criadas com sucesso\n");

        System.out.println("---------------- RELATÓRIO DE TRANSAÇÕES ------------------");

        // Transações Bruno
        System.out.println("Recuperando o Cliente " + bruno.getNome() + " " + bruno.getSobrenome());
        System.out.println("Sacando R$ 230.000,00: " + bruno.getContaCorrente().sacar(230000.0));
        System.out.println("Depositando R$ 8.525,00: " + bruno.getContaCorrente().depositar(8525.0));
        System.out.println("Sacando R$ 12.800,00: " + bruno.getContaCorrente().sacar(12800.0));
        System.out.println("Sacando R$ 40.000,00: " + bruno.getContaCorrente().sacar(40000.0));

        System.out.printf("Cliente [%s, %s] tem uma conta corrente com saldo R$ %.1f\ne uma proteção em conta poupança com saldo R$ %.1f\n\n",
                bruno.getNome(), bruno.getSobrenome(),
                bruno.getContaCorrente().getSaldo(),
                bruno.getContaPoupanca().getSaldo()
        );

        // Transações Diego
        System.out.println("Recuperando o Cliente " + diego.getNome() + " " + diego.getSobrenome());
        System.out.println("Saque de R$ 2.500,00: " + diego.getContaCorrente().sacar(2500.0));
        System.out.println("Saque de R$ 18.500,00: " + diego.getContaCorrente().sacar(18500.0));
        System.out.println("Deposito de R$ 3.500,00: " + diego.getContaCorrente().depositar(3500.0));
        System.out.println("Saque de R$ 17.000,00: " + diego.getContaCorrente().sacar(17000.0));
        System.out.println("Saque de R$ 25.000,00: " + diego.getContaCorrente().sacar(25000.0));

        System.out.printf("Cliente [%s, %s] tem uma conta corrente com saldo R$ %.1f\n",
                diego.getNome(), diego.getSobrenome(),
                diego.getContaCorrente().getSaldo()
        );
    }
}
