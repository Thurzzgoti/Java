package Construtores.exercicio1;

public class CDs extends Produto {
    private int faixas;

    public CDs(String nome, double preco, double cod){
        super(nome, preco, cod);
    }

    public CDs(){}

    public int getFaixas(){return faixas;}
    public void setFaixas(int faixas){this.faixas = faixas;}

    public String toString(){
        return super.toString() + "\nFaixas: " + faixas;
    }
}
