import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        System.out.print("Digite o valor da altura: ");
        double altura = sc.nextDouble();

        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        double areaEsfera = 4.0 * Math.PI * Math.pow(raio, 2);

        double volumeCilindro = Math.PI * Math.pow(raio, 2) * altura;
        double areaCilindro = 2 * Math.PI * raio * altura + 2 * Math.PI * Math.pow(raio, 2);

        double volumeCone = (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;
        double slantHeight = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
        double areaCone = Math.PI * raio * slantHeight + Math.PI * Math.pow(raio, 2);

        System.out.println("Volume da esfera: " + volumeEsfera);
        System.out.println("Área da superfície da esfera: " + areaEsfera);

        System.out.println("Volume do cilindro: " + volumeCilindro);
        System.out.println("Área da superfície do cilindro: " + areaCilindro);

        System.out.println("Volume do cone: " + volumeCone);
        System.out.println("Área da superfície do cone: " + areaCone);

        sc.close();
    }

}
