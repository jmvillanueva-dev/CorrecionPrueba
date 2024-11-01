
// Autor: Jhonny Villanueva M.
import FigurasRegulares.Circulo;
import FigurasRegulares.Cuadrado;
import FigurasRegulares.Rectangulo;
import FigurasRegulares.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Objetos sin valores:
        Cuadrado cuadrado1 = new Cuadrado();
        Rectangulo rectangulo1 = new Rectangulo();
        Circulo circulo1 = new Circulo();
        Triangulo triangulo1 = new Triangulo();

        // Setear parámetros:
        System.out.println("Bienvenido! \nPor favor, ingresa los valores para cada objeto:");
        System.out.println("> Datos del Cuadrado");
        System.out.print("  >> Ingrese el tamaño de lado (cm): ");
        double ladoCuadrado = entrada.nextDouble();
        cuadrado1.setLado(ladoCuadrado);
        System.out.printf("  Cálculos: |Área| = %s  &  |Perímetro| = %s",cuadrado1.calcularArea(),cuadrado1.calcularPerimetro());

        System.out.println();
        System.out.println("\n> Datos del Rectangulo");
        System.out.print("  >> Ingrese el tamaño de la base (cm): ");
        double baseRectangulo = entrada.nextDouble();
        rectangulo1.setBase(baseRectangulo);
        System.out.print("  >> Ingrese el tamaño de la altura (cm): ");
        double alturaRectangulo = entrada.nextDouble();
        rectangulo1.setAltura(alturaRectangulo);
        System.out.printf("  Cálculos: |Área| = %s  &  |Perímetro| = %s",rectangulo1.calcularArea(),rectangulo1.calcularPerimetro());

        System.out.println();
        System.out.println("\n> Datos del Círculo");
        System.out.print("  >> Ingrese el tamaño del radio (cm): ");
        double radioCirculo = entrada.nextDouble();
        circulo1.setRadio(radioCirculo);
        System.out.printf("  Cálculos: |Área| = %s  &  |Perímetro| = %s",circulo1.calcularArea(),circulo1.calcularPerimetro());

        System.out.println();
        System.out.println("\n> Datos del Triángulo Rectángulo");
        System.out.print("  >> Ingrese el tamaño de la base (cm): ");
        double baseTriangulo= entrada.nextDouble();
        triangulo1.setBase(baseTriangulo);
        System.out.print("  >> Ingrese el tamaño de la altura (cm): ");
        double alturaTriangulo = entrada.nextDouble();
        triangulo1.setAltura(alturaTriangulo);
        System.out.print("  >> Ingrese el tamaño del lado (cm) restante: ");
        double hipTriangulo = entrada.nextDouble();
        triangulo1.setHipotenusa(hipTriangulo);
        System.out.printf("  Cálculos: |Área| = %s  &  |Perímetro| = %s",triangulo1.calcularArea(),triangulo1.calcularPerimetro());


        // Imprimir valores:
        System.out.println();
        System.out.println("\n---------- [Imprimir Resultados] ----------");
        cuadrado1.imprimirDatos();
        rectangulo1.imprimirDatos();
        circulo1.imprimirDatos();
        triangulo1.imprimirDatos();

        // Sumatoria de las areas:
        System.out.println("\n---------- [Imprimir Sumatoria] ----------");
        double sumatoriaAreas = cuadrado1.calcularArea() + rectangulo1.calcularArea() + circulo1.calcularArea() + triangulo1.calcularArea();
        System.out.println("La sumatoria de las áreas es igual a: " + sumatoriaAreas);
        System.out.println("\n ------ [Fin del Programa] ------");
    }
}