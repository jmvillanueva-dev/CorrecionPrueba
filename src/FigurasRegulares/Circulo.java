package FigurasRegulares;

public class Circulo {
    // Atributos:
    private double radio;

    // Constructor:
    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    // Getter & Setter:
    private double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos perzonalizados:
    public double calcularArea(){
        return  Math.PI* (radio*radio);
    }

    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }

    public void imprimirDatos() {
        System.out.println("\n> Datos del Círculo");
        System.out.printf("  >> El cículo de radio %s (cm) tiene un área y perímetro de:", getRadio());
        System.out.println("\n   >>> Área = " + calcularArea());
        System.out.println("   >>> Perímetro = " + calcularPerimetro());
    }
}
