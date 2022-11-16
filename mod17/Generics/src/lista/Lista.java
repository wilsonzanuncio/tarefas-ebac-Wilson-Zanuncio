package lista;

import carros.Car;

import java.util.ArrayList;

public class Lista<T extends Car> {

    private ArrayList<T> lista;

    public Lista() {
        this.lista = new ArrayList<T>();
    }

    public void adicionar(T car) {
        lista.add(car);
    }

    public void imprimirTodos() {
        for (T car : lista) {
            car.informaDados();
        }
    }
}
