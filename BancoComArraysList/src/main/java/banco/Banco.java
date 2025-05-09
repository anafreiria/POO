package banco;
import java.util.ArrayList;
public class Banco {

    private ArrayList <Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
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

}
