package banco.teste;
import banco.dominio.*;
import banco.relatorios.RelatoriosClientes;

public class TesteBanco {
    public static void main(String[] args) {
        Banco banco = Banco.getBanco();

        System.out.println("Criando uma conta corrente para o cliente Bruno Henrique.");
        Cliente c1 = new Cliente("Bruno", "Henrique");
        c1.adicionarConta(new ContaPoupanca(50000.0, 0.10));
        c1.adicionarConta(new ContaCorrente(220000.0, 40000.0));
        banco.adicionarCliente(c1);

        System.out.println("Criando uma conta corrente para o cliente Everton Ribeiro.");
        Cliente c2 = new Cliente("Everton", "Ribeiro");
        c2.adicionarConta(new ContaCorrente(45000.0, 30000.0));
        banco.adicionarCliente(c2);

        System.out.println("Criando uma conta corrente para o cliente Filipe Luis.");
        Cliente c3 = new Cliente("Filipe", "Luis");
        c3.adicionarConta(new ContaCorrente(70000.0, 0.0));
        c3.adicionarConta(new ContaPoupanca(220000.0, 0.10));
        banco.adicionarCliente(c3);

        System.out.println("Criando uma conta corrente para o cliente Gabriel Barbosa.");
        Cliente c4 = new Cliente("Gabriel", "Barbosa");
        banco.adicionarCliente(c4);

        System.out.println("Criando uma conta corrente para o cliente Diego Alves.");
        Cliente c5 = new Cliente("Diego", "Alves");
        ContaCorrente contaConjunta = new ContaCorrente(50000.0, 0.0);
        c5.adicionarConta(contaConjunta);
        banco.adicionarCliente(c5);

        System.out.println("Diego Alves autorizou o cadastro de sua conta corrente como sendo conjunta com a cliente Lorena Lara.");
        Cliente c6 = new Cliente("Lorena", "Lara");
        c6.adicionarConta(contaConjunta); // mesma conta compartilhada
        banco.adicionarCliente(c6);

        // Geração do relatório
        RelatoriosClientes.gerarRelatorio();
    }
}

