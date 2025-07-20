package banco.dominio;

public class ContaCorrente extends Conta{

    private double chequeEspecial;

    public ContaCorrente(double saldoInicial, double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) throws Excecoes {
        double totalDisponivel = this.saldo + this.chequeEspecial;

        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else if (this.chequeEspecial == 0) {
            double deficit = valor - this.saldo;
            throw new Excecoes("Não há cheque especial", deficit);
        } else if (valor <= totalDisponivel) {
            double usadoDoCheque = valor - this.saldo;
            this.saldo = 0;
            this.chequeEspecial -= usadoDoCheque;
        } else {
            double deficit = valor - totalDisponivel;
            throw new Excecoes("Saldo insuficiente no cheque especial", deficit);
        }
    }


    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }


}
