package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
        System.out.println("elija una figura");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        Scanner in = new Scanner(System.in);
        Figura figura;
        int opcion = in.nextInt();

        creadorDeFiguras creadorDeFiguras = new creadorDeFiguras();
        figura = creadorDeFiguras.getFigura(opcion);
        figura.dibujar();
    }




}
