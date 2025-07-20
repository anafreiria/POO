package banco;

public class ContaPoupanca extends Conta {
    private double taxarendimento;

    public ContaPoupanca(double saldoInicial, double rendimento) {
        super(saldoInicial);
        this.taxarendimento = rendimento;
    }
}
