package Exercicio4; //  DIA 18/10 EXERCÍCIO - IMPRIMA OS VALORES PARES DE 1 A 100

public class ListaPares22 {
    public void listar() {
        for (int x = 1 ; x <= 100 ; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }


    public static void main(String[] args) {
        ListaPares22 lp = new ListaPares22();
        lp.listar();
    }
}


