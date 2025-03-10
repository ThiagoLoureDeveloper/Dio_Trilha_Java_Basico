public class SaqueValor {
    public static void main(String[] args) {
        double saldo = 60.00;
        double SaqueValor = 50.00;

        if (SaqueValor < saldo) {

            saldo = saldo - SaqueValor;
            System.out.println("seu novo saldo é R$: " + saldo);

            
        }else
        System.out.println("Desculpe, Saldo insuficiente!");
    }
}
