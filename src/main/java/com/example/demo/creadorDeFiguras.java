package com.example.demo;

public class creadorDeFiguras {
    Figura figura;
     Figura getFigura(int opcion) {
        Figura figura;
        switch (opcion) {
            case 1:
                figura = new Circulo();

                break;
            case 2:
                figura = new Cuadrado();

                break;
            case 3:
                figura = new Triangulo();

                break;
            case 4:

            default:

                throw new IllegalStateException("Unexpected value: " + opcion);
        }
        return figura;
    }

}
