import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        calculoMedia(calculoSomaNotas());
    }

    public static double calculoSomaNotas() {
        Scanner scanner = new Scanner(System.in);

        double somaNotas = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");

            boolean hasNextDouble = scanner.hasNextDouble();

            if (hasNextDouble) {
                double nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    somaNotas += nota;
                } else {
                    System.out.println("Nota inválida");
                    i--;

                    scanner.nextLine();
                    continue;
                }
            } else {
                System.out.println("Nota inválida.");
                i--;
            }

            scanner.nextLine();
        }

        return somaNotas;
    }

    public static void calculoMedia(double somaNotas) {
        double media = somaNotas / 4;

        System.out.println("A média das notas digitadas é " + media + ".");

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5) {
            System.out.println("Aluno de recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
