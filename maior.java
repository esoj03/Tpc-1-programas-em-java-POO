import java.util.Scanner;

public class maior {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = leitura.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = leitura.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = leitura.nextInt();

        int maior = determinarMaior(num1, num2, num3);

        if (maior == -1) {
            System.out.println("Os números não são distintos.");
        } else {
            System.out.println("O maior número é " + maior);
        }
    }

    public static int determinarMaior(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            return -1; // os números não são distintos
        }

        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        return maior;
    }
}

