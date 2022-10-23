package exercicio3;

public class Curso {

    public void escreveNome() {

        int x = 0;

        while (x < 5) {
            System.out.println("ElasTech");

            x++;

        }
    }

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.escreveNome();
    }
}