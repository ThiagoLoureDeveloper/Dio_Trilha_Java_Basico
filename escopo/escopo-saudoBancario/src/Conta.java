public class Conta {

    private Saldo saldo;

    public Conta(double saldoInicial) {
        this.saldo = new Saldo(saldoInicial);
    }

    public void sacar(double valor) {
        if (saldo.retirar(valor)) {
            System.out.println("Saque realizado com sucesso. Novo saldo: R$ " + saldo.getValor());
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente ou valor inválido.");
        }
    }

    public double getSaldo() {
        return saldo.getValor();
    }

    
}
