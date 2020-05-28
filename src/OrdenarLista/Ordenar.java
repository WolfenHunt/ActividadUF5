package OrdenarLista;

import uf5_a01_guillermo.Circulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ordenar {

    List<Circulo> circulos = new ArrayList<>();

    public static void main(String[] args) {
        Ordenar app = new Ordenar();
        app.start();
    }

    private void start() {
        listaRadio();
        tipoOrden();
        imprimirCirculo();
    }

    private void listaRadio() {
        double radio;
        do {
            radio = numAleatorio();

            if (radio >= 0.01) {
                circulos.add(new Circulo(radio));
            }
        } while (radio >= 0.01);
    }

    private double numAleatorio() {
        return Math.random();
    }

    private void orAscendente() {
        Collections.sort(circulos);
    }

    private void orDescendente() {
        Collections.sort(circulos, Collections.reverseOrder());
    }

    private void tipoOrden() {
        Scanner scanner = new Scanner(System.in);

        boolean tipoOr = false;
        int respuesta;
        do {
            System.out.println("Tipo de Orden escogido:\n"
                    + "1 = De forma ascendente\n"
                    + "2 = De gorma descendente\n");
            if (scanner.hasNextInt()) {
                respuesta = scanner.nextInt();
                tipoOr = Ordenar.this.tipoOrden(respuesta);
            } else {
                System.out.println("Una respuesta valida\n");
                scanner.nextLine();
            }
        } while (!tipoOr);
    }

    private boolean tipoOrden(int respuesta) {
        switch (respuesta) {
            case 1:
                orAscendente();
                return true;
            case 2:
                orDescendente();
                return true;
            default:
                return false;
        }
    }

    private void imprimirCirculo() {
        int index = 0;
        for (var circulo : circulos) {
            System.out.println("Circulo numero " + (++index) + ":\n" + circulo);
        }
    }

}
