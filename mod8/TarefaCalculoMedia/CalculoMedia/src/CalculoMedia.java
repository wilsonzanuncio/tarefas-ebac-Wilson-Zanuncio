public class CalculoMedia {

    public static void main(String[] args) {
        calculoMedia(10.0, 6.5, 8.5, 9.0);
        calculoMedia(4.0, 4.0, 4.0, 4.0);
    }

    public static void calculoMedia(double nota1, double nota2, double nota3, double nota4) {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas informadas é " + media + ".");
    }
}
