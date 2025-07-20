package banco.dominio;


public class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {

        this.saldo = saldoInicial;
    }

    public double getSaldo() {

        return saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false; // Depósito inválido (valor negativo ou zero)
    }

    // Método para sacar um valor da conta
    public boolean sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            return true;
        }
        return false; // Saldo insuficiente ou valor inválido
    }
}

