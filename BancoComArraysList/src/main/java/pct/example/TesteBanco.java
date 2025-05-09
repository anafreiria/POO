package pct.example;
import banco.*;

public class TesteBanco {
//    public static void main(String[] args) {
//        Cliente brunohenrique = new Cliente("Bruno", "Henrique");
//        Cliente evertonribeiro = new Cliente("Everton", "Ribeiro");
//        Cliente filipeluis = new Cliente("Filipe", "Luis");
//        Cliente gabrielbarbosa = new Cliente("Gabriel", "Barbosa");
//        Cliente diegoalves = new Cliente("Diego", "Alves");
//
//        Conta contaBrunoHenrique = new Conta(50000);
//        brunohenrique.setConta(contaBrunoHenrique);
//
//        Conta contaEvertonRibeiro = new Conta(45000);
//        evertonribeiro.setConta(contaEvertonRibeiro);
//
//        Conta contaFilipeLuis = new Conta(70000);
//        filipeluis.setConta(contaFilipeLuis);
//
//        Conta contaGabrielBarbosa = new Conta(220000);
//        gabrielbarbosa.setConta(contaGabrielBarbosa);
//
//        Conta contaDiegoAlves = new Conta(50000);
//        diegoalves.setConta(contaDiegoAlves);
//
//        Banco banco = new Banco();
//        banco.adicionarCliente(brunohenrique);
//        banco.adicionarCliente(evertonribeiro);
//        banco.adicionarCliente(filipeluis);
//        banco.adicionarCliente(gabrielbarbosa);
//        banco.adicionarCliente(diegoalves);
//
//        for (int i = 0; i < banco.getNumeroDeClientes(); i++) {
//            Cliente cliente = banco.getCliente(i);
//            Conta conta = cliente.getConta();
//            System.out.println("Cliente: [" + (i + 1) + "]: " + cliente.getNome() + " " + cliente.getSobrenome() + " .Saldo R$: " + conta.getSaldo());
//        }
//
public static void main(String[] args) {
    System.out.println("--------------- CRIAÇÃO DE CONTAS BANCÁRIAS ------------------");

    Cliente brunohenrique = new Cliente("Bruno", "Henrique");
    ContaPoupanca contaBruno = new ContaPoupanca(50000, 0.03);
    brunohenrique.setConta(contaBruno);
    System.out.println("Criando uma conta poupanca para o cliente Bruno Henrique com saldo de R$ 50.000,00 e taxa de rendimentos de 3%.");

    Cliente evertonribeiro = new Cliente("Everton", "Ribeiro");
    ContaCorrente contaEverton = new ContaCorrente(45000, 30000);
    evertonribeiro.setConta(contaEverton);
    System.out.println("Criando uma conta corrente para o cliente Everton Ribeiro com saldo de R$ 45.000,00 e cheque especial de R$ 30.000,00.");

    Cliente filipeluis = new Cliente("Filipe", "Luis");
    ContaCorrente contaFilipe = new ContaCorrente(70000);
    filipeluis.setConta(contaFilipe);
    System.out.println("Criando uma conta corrente para o cliente Filipe Luis com saldo de R$ 70.000,00 e sem cheque especial.");

    Cliente gabrielbarbosa = new Cliente("Gabriel", "Barbosa");
    ContaPoupanca contaGabriel = new ContaPoupanca(220000, 0.03);
    gabrielbarbosa.setConta(contaGabriel);
    System.out.println("Criando uma conta poupanca para o cliente Gabriel Barbosa com saldo de R$ 220.000,00 e taxa de rendimentos de 3%.");

    Cliente diegoalves = new Cliente("Diego", "Alves");
    Cliente lorenalara = new Cliente("Lorena", "Lara");
    ContaCorrente contaConjunta = new ContaCorrente(50000);
    diegoalves.setConta(contaConjunta);
    lorenalara.setConta(contaConjunta);
    System.out.println("Criando uma conta corrente para o cliente Daniel Alves com saldo de R$ 50.000,00 e sem cheque especial.");
    System.out.println("Diego Alves autorizou o cadastro de sua conta corrente como sendo conjunta com a cliente Lorena Lara.");

    Banco banco = new Banco();
    banco.adicionarCliente(brunohenrique);
    banco.adicionarCliente(evertonribeiro);
    banco.adicionarCliente(filipeluis);
    banco.adicionarCliente(gabrielbarbosa);
    banco.adicionarCliente(diegoalves);
    banco.adicionarCliente(lorenalara); // para registrar Lorena também

    System.out.println("\n--------------- RELATÓRIO DE TRANSAÇÕES ------------------");

    Cliente c = banco.getCliente(0); // Bruno Henrique
    System.out.println("Recuperando o cliente " + c.getNome() + " " + c.getSobrenome());
    System.out.println("Sacando R$ 1.200,00: " + c.getConta().sacar(1200));
    System.out.println("Depositando R$ 8.525,00: " + c.getConta().depositar(8525));
    System.out.println("Sacando R$ 12.800,00: " + c.getConta().sacar(12800));
    System.out.println("Sacando R$ 50.000,00: " + c.getConta().sacar(50000));
    System.out.println("Cliente [" + c.getNome() + ", " + c.getSobrenome() + "] tem o saldo de R$ " + c.getConta().getSaldo());
    System.out.println();

    c = banco.getCliente(1); // Everton Ribeiro
    System.out.println("Recuperando o cliente " + c.getNome() + " " + c.getSobrenome());
    System.out.println("Saque de R$ 12.500,00: " + c.getConta().sacar(12500));
    System.out.println("Saque de R$ 18.500,00: " + c.getConta().sacar(18500));
    System.out.println("deposito de R$ 3.500,00: " + c.getConta().depositar(3500));
    System.out.println("Saque de R$ 17.000,00: " + c.getConta().sacar(17000));
    System.out.println("Saque de R$ 25.000,00: " + c.getConta().sacar(25000));
    System.out.println("Cliente [" + c.getNome() + ", " + c.getSobrenome() + "] tem o saldo de R$ " + c.getConta().getSaldo());
    System.out.println();

    c = banco.getCliente(2); // Filipe Luis
    System.out.println("Recuperando o cliente " + c.getNome() + " " + c.getSobrenome());
    System.out.println("Saque de R$ 25500.00: " + c.getConta().sacar(25500));
    System.out.println("deposito de R$ 2000.00: " + c.getConta().depositar(2000));
    System.out.println("Saque de R$ 37200.00: " + c.getConta().sacar(37200));
    System.out.println("Saque de R$ 15000.00: " + c.getConta().sacar(15000));
    System.out.println("Cliente [" + c.getNome() + ", " + c.getSobrenome() + "] tem o saldo de R$ " + c.getConta().getSaldo());
}
        
}

