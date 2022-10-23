package exercicio3;
import java.util.Scanner;
public class Exercicio17 {


    public static void main(String args[]){
            Scanner teclado = new Scanner (System.in);
            int A, B, C, D;

            //ENTRADA
            System.out.println ("digite o valor inteiro A:");
            A = teclado.nextInt();
            System.out.println ("digite o valor inteiro B:");
            B = teclado.nextInt();
            System.out.println ("digite o valor inteiro C:");
            C = teclado.nextInt();
            System.out.println ("digite o valor inteiro D:");
            D = teclado.nextInt();

            //PROCESSAMENTO
            if ((B > C)&&(D > A)&&((C + D)>(A + B))&&(C > 0 && D > 0)&&(A % 2 == 0)){
                System.out.print ("valores aceitos");
            } else {
                System.out.print ("valores nao aceitos");
            }
            teclado.close();
        }
    }
