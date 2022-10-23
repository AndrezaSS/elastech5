package exercicio2;

public class Exercicio2 {
    //Atributo
    public int hora;
    //Metodo
    public void verificaPeriodo (int hora){
    if ((hora>=0) && (hora<=5)){
            System.out.println("madrugada");
        } else if ((hora > 5)&& (hora< 12)){
            System.out.println("manhã");
        } else if ((hora >=12) &&(hora< 18)){
            System.out.println("tarde");
        } else {
            System.out.println("noite");
        }

    }

}
