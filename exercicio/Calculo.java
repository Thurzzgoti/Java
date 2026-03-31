package Construtores.exercicio;
import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = sc.nextInt();

        Calculadora calc = new Calculadora(n1, n2);
        int resp;
        do{
            System.out.println("Qual operação você quer fazer:\n1 - Adição\n2- Subtração\n 3- Multiplicação\n4- Subtração");
            resp = sc.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("O resultado da soma foi :" + calc.soma(n1, n2));
                    break;
                case 2:
                    System.out.println("O resultado da subtração foi :" + calc.subtracao(n1, n2));
                    break;
                case 3:
                    System.out.println("O resultado da multiplicação foi :" + calc.mult(n1, n2));
                    break;
                case 4:
                    System.out.println("O resultado da divisão foi :" + calc.div(n1, n2));
                    break;            
            }
        } while (resp!=5);
    }
    
}
