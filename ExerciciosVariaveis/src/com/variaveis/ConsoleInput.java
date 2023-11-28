import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);

        System.out.println("Seja Bem Vindo(a) ao Formulario!");
        System.out.println("------------------------------------------");

        System.out.print("Digite seu nome: ");
        String nome = insert.nextLine();

        System.out.print("Agora sua idade: ");
        int idade = insert.nextInt();

        System.out.print("Por ultimo seu telefone: ");
        int telefone = insert.nextInt();


        System.out.println("------------------------------------------");

        System.out.println("Ola " + nome);
        System.out.println("Voce tem " + idade + " anos.");
        System.out.println("Seu telefone e " + telefone + ".");
        System.out.println("------------------------------------------");

        insert.close();
    }
}
