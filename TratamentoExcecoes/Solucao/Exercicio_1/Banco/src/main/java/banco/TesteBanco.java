package banco;

import banco.dominio.*;
import banco.dominio.Excecoes;
import banco.relatorios.RelatorioClientes;

public class TesteBanco {

  public static void main(String[] args) {
    Banco banco = Banco.getBanco();
    Cliente cliente;
    RelatorioClientes relatorio = new RelatorioClientes();

    System.out.println("Criando uma conta corrente para o cliente Bruno Henrique.");
    Cliente brunoHenrique = new Cliente("Bruno", "Henrique");
    banco.adicionarCliente(brunoHenrique);
    cliente = banco.getCliente(0);
    cliente.adicionarConta(new ContaPoupanca(50000.00, 0.03));
    cliente.adicionarConta(new ContaCorrente(220000.00, 40000.00));

    System.out.println("Criando uma conta corrente para o cliente Everton Ribeiro");
    Cliente evertonRibeiro = new Cliente("Everton", "Ribeiro");
    Conta contaER = new ContaCorrente(45000, 30000.00);
    evertonRibeiro.adicionarConta(contaER);
    banco.adicionarCliente(evertonRibeiro);

    System.out.println("Criando uma conta corrente para o cliente Filipe Luis.");
    Cliente filipeLuis = new Cliente("Filipe", "Luis");
    Conta contaFilipeLuis = new ContaCorrente(70000);
    filipeLuis.adicionarConta(contaFilipeLuis);
    banco.adicionarCliente(filipeLuis);

    System.out.println("Criando uma conta corrente para o cliente Gabriel Barbosa.");
    Cliente gabrielBarbosa = new Cliente("Gabriel", "Barbosa");
    banco.adicionarCliente(gabrielBarbosa);
    cliente = banco.getCliente(2);
    cliente.adicionarConta(new ContaPoupanca(220000.00, 0.03));

    System.out.println("Criando uma conta corrente para o cliente Diego Alves.");
    Cliente diegoAlves = new Cliente("Diego", "Alves");
    Conta contaDA = new ContaCorrente(50000);
    diegoAlves.adicionarConta(contaDA);
    banco.adicionarCliente(diegoAlves);

    System.out.println("Diego Alves autorizou o cadastro de sua conta corrente como sendo conjunta com a cliente Lorena Lara.");
    Cliente lorenaLara = new Cliente("Lorena", "Lara");
    lorenaLara.adicionarConta(contaDA);
    banco.adicionarCliente(lorenaLara);

    // Testes com exceções
    System.out.println("\n=== Testando saques com exceções ===");

    try {
      System.out.println("Tentando sacar R$ 80000 da conta do Filipe Luis (sem cheque especial)...");
      contaFilipeLuis.sacar(80000);
    } catch (Excecoes e) {
      System.out.println("Exceção: " + e.getMessage());
      System.out.println("Déficit: R$ " + e.getDeficit());
    }

    try {
      System.out.println("Tentando sacar R$ 80000 da conta do Everton Ribeiro (saldo + cheque especial suficientes)...");
      contaER.sacar(80000); // Deve funcionar sem lançar exceção
    } catch (Excecoes e) {
      System.out.println("Exceção: " + e.getMessage());
      System.out.println("Déficit: R$ " + e.getDeficit());
    }

    try {
      System.out.println("Tentando sacar R$ 100000 da conta do Everton Ribeiro (excedendo o cheque especial)...");
      contaER.sacar(100000); // Deve lançar exceção
    } catch (Excecoes e) {
      System.out.println("Exceção: " + e.getMessage());
      System.out.println("Déficit: R$ " + e.getDeficit());
    }

    // Gera o relatório
    //relatorio.geraRelatorio();
  }
}
