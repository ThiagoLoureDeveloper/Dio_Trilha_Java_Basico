public class Saldo {
    
    private double valor;

    public Saldo(double saldoInicial) {
        this.valor = saldoInicial;
    }

    public boolean retirar(double quantia) {
        if (quantia > 0 && quantia <= valor) {
            valor -= quantia;
            return true;
        }
        return false;
    }

    public double getValor() {
        return valor;
    }
}
