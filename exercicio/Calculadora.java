package Construtores.exercicio;

public class Calculadora {
    private int numero1;
    private int numero2;

    public void setNumero1(int numero1){this.numero1 = numero1;}
    public int getNumero1(){return this.numero1;}

    public void setNumero2(int numero2){this.numero2 = numero2;}
    public int getNumero2(){return this.numero2;}

    int soma(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        return this.numero1 + this.numero2;

    }

    int subtracao(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        return this.numero1 - this.numero2;

    }

    int mult(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        return this.numero1 * this.numero2;

    }

    int div(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        return this.numero1 / this.numero2;

    }

    public Calculadora(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
}
