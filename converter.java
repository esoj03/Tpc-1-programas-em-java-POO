import java.util.Scanner;

public class converter {
    public static void main(String[] args){
        double tempcelsius, n1;
        System.out.println("Digite a temperatura: ");
        Scanner temp = new Scanner(System.in);
        n1 = temp.nextInt();
        tempcelsius = converter1(n1);
        System.out.println("A temperatura em graus é: "+ tempcelsius);
    }
    static double converter1(double tempf){
        double celsius;
        celsius = (tempf - 32 ) / 1.8;
        return celsius;
    }
}