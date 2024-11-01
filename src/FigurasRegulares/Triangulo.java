package FigurasRegulares;

public class Triangulo {
    // Atributos:
    private double base;
    private double altura;
    private double hipotenusa;

    // Constructor:
    public Triangulo(double base, double altura, double hipotenusa) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
    }

    public Triangulo() {
    }

    // Setter & getter:
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
    private double getHipotenusa() {
        return hipotenusa;
    }
    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    // Métodos perzonalizados:
    public double calcularArea() {
        return (base * altura)/2;
    }

    public double calcularPerimetro() {
        return base + altura + hipotenusa;
    }

    public void imprimirDatos() {
        System.out.println("\n> Datos del Triángulo Rectángulo");
        System.out.printf("  >> El Triángulo Rectángulo de hipotenusa %s (cm), base %s (cm) y altura %s (cm) tiene un área y perímetro de:",getHipotenusa(), getBase(), getAltura());
        System.out.println("\n   >>> Área = " + calcularArea());
        System.out.println("   >>> Perímetro = " + calcularPerimetro());
    }

}
