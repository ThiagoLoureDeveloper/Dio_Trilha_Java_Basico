public class ExemploFor {
    public static void main(String[] args) {
       /*  for(int carneirinhos = 0; carneirinhos <=20; carneirinhos ++){
            System.out.println("Contando Carneirinhos: " + carneirinhos);
        }
        System.out.println("Joãozinho Dormiu");
    }*/

    /*for com array

    String alunos[] = {"Thiago", "julia", "Juliana", "Eduardo"};
    
    for(int x = 0; x < alunos.length; x++){
        System.out.println("O aluno na posição x: " + x + " -> " + alunos [x]);
        }*/
        
        
        /*for each */
        String alunos[] = {"Thiago", "julia", "Juliana", "Eduardo"};

        for( String aluno : alunos){
            System.out.println("Nome do aluno é = " + aluno );

        }
        

    }
}
