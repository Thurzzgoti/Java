package Construtores.exercicio1;

public class DVDs extends Produto {
    private int duracao;

    public DVDs(String nome, double preco, double cod){
        super(nome, preco, cod);
    }

    public DVDs(){}

    public int getDuracao(){return duracao;}
    public void setDuracao(int duracao){this.duracao = duracao;}

    public String toString(){
        return super.toString() + "\nDuração: " + duracao;
    }
}