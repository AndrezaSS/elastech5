package Exercicio4;  //DIA 18/10 EXERCÍCIO - IMPRIMA OS VALORES IMARES DE 1 A 100

public class ListaImpares {
    public void listar() {


        for (int x = 0; x <= 100; x++) {
            if (x % 2 == 1) {
                System.out.println(x);
            }
        }
    }

        public static void main (String[]args){
            ListaImpares num = new ListaImpares();
            num.listar();

        }
    }


