package Exercicio5;

public class Tabuada2 {
    public void escreveTabuada() {
        int tabuada = 1;

                for (int x = 0 ; x < 10 ; x++) {

                    System.out.println(tabuada + "*" + x + "=" + x );
                    tabuada++;
                }

    }

    public static void main(String[] args) {
        Tabuada2 n = new Tabuada2();
        n.escreveTabuada();


    }




