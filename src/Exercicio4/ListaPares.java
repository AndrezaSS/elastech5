package Exercicio4;    //DIA 18.10 C:\Users\Maria do Carmo\Documents\ANDREZA\#ElasTech\elastech5\out\production\elastech5\Exercicio4

public class ListaPares {
    public void listar() {  //método "listar"

        int x = 105;


        while (x >= 0 && x <= 100) {

            x++;

            if (x % 2 == 0)
                break;
            System.out.print(x);
        }
            }

            public static void main (String[] args){


                ListaPares num = new ListaPares();
                num.listar();



            }
        }




