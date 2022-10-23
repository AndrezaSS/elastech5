package Exercicio5;

public class Carro {
    private int numPortas, ano;
    private double preco, kilometragem;
    private String marca, cor;

    public Carro (){

    }
   public  Carro (String marca, String cor){

   }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;

    }
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setAno(2);
        c1.setCor("verde");
        c1.setMarca("ford");
        c1.setKilometragem(4.4);
        c1.setNumPortas(4);
        c1.setPreco(40.000);
        System.out.println(c1.marca);

    }

}



