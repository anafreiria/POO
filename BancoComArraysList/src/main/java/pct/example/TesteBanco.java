package pct.example;

import banco.Banco;
import banco.Cliente;
import banco.Conta;

public class TesteBanco {
    public static void main(String[] args) {
        Cliente brunohenrique = new Cliente("Bruno", "Henrique");
        Cliente evertonribeiro = new Cliente("Everton", "Ribeiro");
        Cliente filipeluis = new Cliente("Filipe", "Luis");
        Cliente gabrielbarbosa = new Cliente("Gabriel", "Barbosa");
        Cliente diegoalves = new Cliente("Diego", "Alves");
        
        Conta contaBrunoHenrique = new Conta(50000);
        brunohenrique.setConta(contaBrunoHenrique);

        Conta contaEvertonRibeiro = new Conta(45000);
        evertonribeiro.setConta(contaEvertonRibeiro);

        Conta contaFilipeLuis = new Conta(70000);
        filipeluis.setConta(contaFilipeLuis);

        Conta contaGabrielBarbosa = new Conta(220000);
        gabrielbarbosa.setConta(contaGabrielBarbosa);

        Conta contaDiegoAlves = new Conta(50000);
        diegoalves.setConta(contaDiegoAlves);

        Banco banco = new Banco();
        banco.adicionarCliente(brunohenrique);
        banco.adicionarCliente(evertonribeiro);
        banco.adicionarCliente(filipeluis);
        banco.adicionarCliente(gabrielbarbosa);
        banco.adicionarCliente(diegoalves);

        for (int i = 0; i < banco.getNumeroDeClientes(); i++) {
            Cliente cliente = banco.getCliente(i);
            Conta conta = cliente.getConta();
            System.out.println("Cliente: [" + (i + 1) + "]: " + cliente.getNome() + " " + cliente.getSobrenome() + " .Saldo R$: " + conta.getSaldo());
        }
        

        
    }
}

