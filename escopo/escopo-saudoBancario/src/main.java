public class main {

    public static void main(String[] args) {
        
        Conta minhaConta = new Conta(1000.0);
        System.out.println("Saldo inicial: R$ " + minhaConta.getSaldo());
        
        minhaConta.sacar(200.0);
        minhaConta.sacar(900.0);
    }
    
}
