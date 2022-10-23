package Exercicio5;

public class Predio {


        private int numAptos;

        private String endereco, cidade, estado;

        public Predio (){

        }

        public int getNumAptos() {
            return numAptos;
        }

        public void setNumAptos(int numAptos) {
            this.numAptos = numAptos;
        }


        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;

        }
        public static void main(String[] args) {
            Exercicio5.Carro c1 = new Exercicio5.Carro();
            c1.setEstado("Bahia");
            c1.setCidade("verde");

            System.out.println(c1.marca);

        }

    }

