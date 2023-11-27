import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String input = scanner.nextLine();

        System.out.println("Você digitou: " + input);

        scanner.close();
    }
}

