import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Person> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        while (!quit) {
            printMenu();
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int action = scanner.nextInt();
                scanner.nextLine();

                switch (action) {
                    case 1:
                        System.out.println("Digite o nome: ");
                        String name = scanner.nextLine();

                        System.out.println("Digite o gênero sexual (M ou F): ");
                        String gender = scanner.nextLine();

                        if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")) {
                            Person person = new Person(name, gender);

                            arrayList.add(person);
                        } else {
                            System.out.println("Digite uma opção válida (M ou F)");
                        }

                        break;
                    case 2:
                        System.out.println("Cadastro encerrado");
                        System.out.println("");
                        quit = true;

                        break;
                    default:
                        System.out.println("Digite uma opção válida (1 ou 2)");

                        break;
                }
            } else {
                System.out.println("Digite uma opção válida (1 ou 2)");
                scanner.nextLine();
            }
        }

        Collections.sort(arrayList);

        printArrayList("m");
        printArrayList("f");
    }

    private static void printArrayList(String gender) {
        String titleList = gender.equalsIgnoreCase("m") ? "** Homens Cadastrados **" : "** Mulheres Cadastradas ** ";
        System.out.println(titleList);

        for (Person person : arrayList) {
            if (person.getGender().equalsIgnoreCase(gender)) {
                System.out.println(person);
            }
        }

        System.out.println("");
    }

    private static void printMenu() {
        System.out.println("Digite uma das opções: ");
        System.out.println("1 - Cadastrar uma pessoa");
        System.out.println("2 - Encerrar cadastro");
    }
}
