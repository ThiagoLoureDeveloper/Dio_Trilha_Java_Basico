import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {

    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu Nome: ");
        String nome = scanner.next();
        
        System.out.print("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sea idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.print(", tenho " + idade + " Anos");
        System.out.print(" e tenho a altura de " + altura + " cm ");
        }
        catch (InputMismatchException e) {
            System.out.println("Os topicos asdfasdfasfd");
        }
    }

}
