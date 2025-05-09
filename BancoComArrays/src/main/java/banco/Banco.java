package banco;

public class Banco {

    private Cliente[] clientes;
    private int numeroDeClientes;

    public Banco() {
        clientes = new Cliente[5]; // tamanho inicial, pode ser ajustado se necessário
        numeroDeClientes = 0;
    }

    public void adicionarCliente(Cliente cliente) {
        if (numeroDeClientes < clientes.length) {
            clientes[numeroDeClientes] = cliente;
            numeroDeClientes++;
        } else {
            System.out.println("Limite de clientes atingido.");
        }
    }

    public Cliente getCliente(int indice) {
        return clientes[indice];
    }

    public int getNumeroDeClientes() {
        return numeroDeClientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
}
