public class ExemplobreakContinue {
    public static void main(String[] args) {
        /*utilizando Break quando chega no 3 ele interrompe imprimindo o 
         * 1 e o 2
        */
        for(int numero = 1; numero <= 5; numero ++){
            if (numero == 3)   
            break;          
            System.out.println("Número: " + numero);
        }
        /*Utilizando o continue, imprime todos os números menos o 3*/
        for(int numero = 1; numero <= 5; numero ++){
            if (numero == 3)   
            continue;          
            System.out.println("Número: " + numero);
        }
    }

}
