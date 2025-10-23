import java.util.Scanner;

public class TrianguloEquilatero {
    // Atributo: longitud de un lado del triángulo
    private double lado;

    // Constructor
    public TrianguloEquilatero(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado debe ser mayor que cero.");
        }
        this.lado = lado;
    }

    // Getter
    public double getLado() {
        return lado;
    }

    // Setter
    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado debe ser mayor que cero.");
        }
        this.lado = lado;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 3 * lado;
    }

    // Método para calcular el área
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    // Método para mostrar la información del triángulo
    @Override
    public String toString() {
        return String.format("Triángulo equilátero de lado %.2f - Área: %.2f - Perímetro: %.2f",
                lado, calcularArea(), calcularPerimetro());
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor del lado del triángulo equilátero: ");
        double lado = sc.nextDouble();

        try {
            TrianguloEquilatero t = new TrianguloEquilatero(lado);
            System.out.println(t);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
