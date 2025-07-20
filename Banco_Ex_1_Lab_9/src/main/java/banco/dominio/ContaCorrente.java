package banco.dominio;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(double saldoInicial, double chequeEspecial) {
        super (saldoInicial);
        this.chequeEspecial = chequeEspecial;

    }

    public boolean sacar(double valor) {
        if (valor > saldo + chequeEspecial){
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
