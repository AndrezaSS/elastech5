package exercicio1;

public class Exercicio1 {
    //Atributo
    public int salario;
    //Método
    public static String  informeValorDoImpostoStatic(int salario) {
        if (salario > 5000) {
            return "15";
        } else {
            return "5";
        }
    }
}
