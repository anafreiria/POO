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
        saldo = saldo + valor;
        return true;
    }

    public void sacar(double valor) throws Excecoes {
        if ((this.saldo - valor) >= 0) {
            this.saldo -= valor;
        } else {
            double deficit = valor - this.saldo;
            throw new Excecoes("Saldo insuficiente", deficit);
        }
    }


}
