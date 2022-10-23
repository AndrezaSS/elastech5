package exercicio3;
import java.util.Scanner;
public class testeMatriz {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double matriz [][];
        matriz = new double [3][5];

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("digite o valor da matriz [" + l + "][" + c + "]=");
                matriz[l][c] = teclado.nextDouble();
            }
        }
        teclado.close();
    }
}
