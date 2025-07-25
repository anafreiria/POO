package banco.dominio;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private static Banco banco;

    private Banco() {
        this.clientes = new ArrayList<>();
    }

    public static Banco getBanco() {
        if (banco == null) {
            banco = new Banco();
        }
        return banco;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public Cliente getCliente(int indice) {
        return clientes.get(indice);
    }

    public int getNumeroDeClientes() {
        return clientes.size();
    }

    public ArrayList<Cliente> getCliente(String nome, String sobrenome) {
        ArrayList<Cliente> resultado = new ArrayList<>();

        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome) &&
                    cliente.getSobrenome().equalsIgnoreCase(sobrenome)) {
                resultado.add(cliente);
            }
        }

        return resultado;
    }
}
