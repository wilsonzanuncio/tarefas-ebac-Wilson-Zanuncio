import java.util.Scanner;

public class TarefaWrapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        double numero = scanner.nextDouble();
        Double numberWrapper = numero;

        System.out.println("O número digitado foi o " + numberWrapper);

        scanner.close();
    }
}
