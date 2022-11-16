import carros.Honda;
import carros.Toyota;
import lista.Lista;

public class Main {

    public static void main(String[] args) {
        Honda civic = new Honda("Civic", 2022);
        Honda city = new Honda("City", 2019);

        Toyota etios = new Toyota("Etios", 2020);

        Lista<Honda> listaHonda = new Lista<>();
        listaHonda.adicionar(civic);
        listaHonda.adicionar(city);
        System.out.println("Imprimindo os carros da listaHonda:");
        listaHonda.imprimirTodos();

        Lista<Toyota> listaToyota = new Lista<>();
        listaToyota.adicionar(etios);
        System.out.println("Imprimindo os carros da listaToyota:");
        listaToyota.imprimirTodos();
    }
}
