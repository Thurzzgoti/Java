package Construtores.exercicio1;

public class Livros extends Produto {
    private String autor;

    public Livros(String nome, double preco, double cod){
        super(nome, preco, cod);
    }

    public Livros(){}

    public String getAutor(){return autor;}
    public void setAutor(String autor){this.autor = autor;}

    public String toString(){
        return super.toString() + "\nAutor " + autor;
    }
}
