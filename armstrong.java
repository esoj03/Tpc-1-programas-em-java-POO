import java.util.Scanner;
import java.lang.Math;

public class armstrong {
    public static void main(String[] args){
        int n1;
        boolean valor;
        System.out.println("Digite um valor: ");
        Scanner num = new Scanner(System.in);
        n1 = num.nextInt();
        valor = checkArmstrong(n1);
        if (valor){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("nao é armstrong");
        }
    }
    static boolean checkArmstrong(int numero){
        int contador = 0, soma = 0, soma1 = 0;
        String number = String.valueOf(numero);
        char[] digits1 = number.toCharArray();
        for (int i=0; i<digits1.length; i++){
            contador++;
        }
        for (int i=0; i<digits1.length; i++){
            soma1 += Math.pow(Integer.parseInt(String.valueOf(digits1[i])), contador);
        }
        if (soma1 == numero){
            return true;
        }
        else {
            return false;
        }

    }
}