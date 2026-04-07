package Construtores.exercicio1;

public class Produto{
    private String nome;
    private double preco;
    private double cod;

    public Produto(String nome, double preco, double cod){
        this.nome = nome;
        this.preco = preco;
        this.cod = cod;
    }

    public Produto(){}

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public double getPreço(){return preco;}
    public void setPreço(double preco){this.preco = preco;}

    public double getCod(){return cod;}
    public void setCod(double cod){this.cod = cod;}

    public String toString(){
        return "Nome: " + nome + "\nPreço: " + preco + "\nCódigo: " + cod;
    }

}
