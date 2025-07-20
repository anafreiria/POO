package banco;

public class ContaCorrente extends Conta{
    private ContaPoupanca protecaoContaPoupanca;


    public ContaCorrente (double saldoInicial, ContaPoupanca protecao){
        super(saldoInicial);
        this.protecaoContaPoupanca = protecao;

    }

    public ContaCorrente (double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) return false;

        // Tenta sacar normalmente da conta corrente
        if (super.sacar(valor)) {
            return true;
        }

        // Se não conseguiu sacar e tem conta poupança para proteção
        if (protecaoContaPoupanca != null) {
            double saldoCorrente = super.getSaldo();
            double saldoPoupanca = protecaoContaPoupanca.getSaldo();
            double totalDisponivel = saldoCorrente + saldoPoupanca;

            if (valor <= totalDisponivel) {
                // Zera conta corrente e retira o restante da poupança
                super.sacar(saldoCorrente); // saldoCorrente pode ser 0
                double restante = valor - saldoCorrente;
                return protecaoContaPoupanca.sacar(restante);
            }
        }

        return false; // Saque não possível
    }


    public ContaPoupanca  getContaPoupanca() {
        return protecaoContaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
         this.protecaoContaPoupanca = contaPoupanca;
    }
}

