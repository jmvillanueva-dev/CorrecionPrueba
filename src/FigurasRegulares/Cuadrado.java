package FigurasRegulares;

public class Cuadrado {

    // Atributos:
    private double lado;

    // Constructor:
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    // Getter & Setter:
    private double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Métodos perzonalizados:
    public double calcularArea(){
        return  lado * lado;
    }

    public double calcularPerimetro(){
        return lado * 4;
    }

    public void imprimirDatos(){
        System.out.println("\n> Datos del Cuadrado");
        System.out.printf("  >> El cuadrado de lado %s (cm) tiene un área y perímetro de:",getLado());
        System.out.println("\n   >>> Área = " + calcularArea());
        System.out.println("   >>> Perímetro = " + calcularPerimetro());
    }

}
