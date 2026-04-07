package Construtores.exercicio1;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
    CDs CD1 = new CDs("Top 50 anos 90", 30.00, 10001);
    CD1.setFaixas(50);
    System.out.println(CD1.toString());
    }
}
