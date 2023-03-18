import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        Scanner leitura= new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        double valorRaio = leitura.nextDouble();

        double area = calcularArea(valorRaio);
        double circunferencia = 2 * Math.PI * valorRaio;

        System.out.println("Área do círculo: " + area);
        System.out.println("Circunferência do círculo: " + circunferencia);

        leitura.close();
    }

    public static double calcularArea(double valorRaio) {
        return Math.PI * Math.pow(valorRaio, 2);
    }
}
