import exercicio2.Exercicio2;

import java.util.Scanner;
public class Main {

    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);

        /*Exercicio1 salario = new Exercicio1();
        String temp = salario.informeValorDoImpostoStatic(6000);
        System.out.println(temp);

    }
}*/
        Exercicio2 dois = new Exercicio2();
        System.out.println("Digite as horas");
        dois.hora = teclado.nextInt();
        dois.verificaPeriodo(dois.hora);


    }
}