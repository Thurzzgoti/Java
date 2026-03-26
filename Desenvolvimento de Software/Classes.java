import java.util.Scanner;

public class Classes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta1 = new Conta();
        int opc = 0;
        do{
            System.out.println("----SISTEMA BANCÁRIO----\n1- Cadastrar conta\n2- Ver dados cadastrados\n3-Fazer saque\n4- Fazer depósito\n5- Sair");
            System.out.println("Digite a opção desejada");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    sc.nextLine();
                    System.out.println("Digite o nome do cliente");
                    String n = sc.nextLine();
                    conta1.setNome(n);
                    System.out.println("Digite o número da conta");
                    int num = sc.nextInt();
                    conta1.setNumero(num);
                    System.out.println("Digite o saldo da conta");
                    double sal = sc.nextDouble();
                    conta1.setSaldo(sal);
                    System.out.println("Digite o limite da conta");
                    double lim = sc.nextDouble();
                    conta1.setLimite(lim);
                    break;
                case 2:
                    System.out.println("----DADOS DA CONTA----:\nNome: "+ conta1.getNome() + "\nNúmero: "+ conta1.getNumero() + "\nSaldo: "+ conta1.getSaldo() + "\nLimite: "+ conta1.getLimite()); 
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja sacar");
                    double valor = sc.nextDouble();
                    if(conta1.sacarVerifica(valor)){
                        System.out.println("Saque realizado com sucesso\nNovo saldo: " + conta1.getSaldo());
                    } else{
                        System.out.println("Saque não realizado");
                    }
                    break;
                case 4:
                    System.out.println("Digite o valor que deseja depositar");
                    double valor1 = sc.nextDouble(); 
                    conta1.Deposito(valor1);
                    System.out.println("Novo saldo: "+ conta1.getSaldo());
                    break;
            }
        } while(opc != 5);
        sc.close();
        
    }
}
