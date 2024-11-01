package FigurasRegulares;

public class Rectangulo {
    // Atributos:
    private double base;
    private double altura;

    // Constructor:
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    // Getter & Setter:
    private double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    private double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos perzonalizados:
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * base + 2 * altura;
    }

    public void imprimirDatos() {
        System.out.println("\n> Datos del Rectángulo");
        System.out.printf("  >> El Rectángulo de base %s (cm) y altura %s (cm) tiene un área y perímetro de:", getBase(), getAltura());
        System.out.println("\n   >>> Área = " + calcularArea());
        System.out.println("   >>> Perímetro = " + calcularPerimetro());
    }
}
