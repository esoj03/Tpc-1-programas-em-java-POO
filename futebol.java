import java.util.Scanner;

public class futebol {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o número total de crianças: ");
        int totalCriancas = leitura.nextInt();

        System.out.print("Digite o tamanho dos grupos: ");
        int tamanhoGrupo = leitura.nextInt();

        int numGrupos = totalCriancas / tamanhoGrupo;
        int criancasSemGrupo = totalCriancas % tamanhoGrupo;

        System.out.println("Número de grupos formados: " + numGrupos);
        System.out.println("Número de crianças sem grupo: " + criancasSemGrupo);

        leitura.close();
    }
}
