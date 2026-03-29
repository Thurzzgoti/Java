import java.util.Scanner;

public class Classes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta1 = new Conta();
        Funcionario func = new Funcionario();
        int opc = 0;
        do{
            System.out.println("----SISTEMA BANCÁRIO----\n1- Cadastrar conta\n2- Ver dados cadastrados\n3-Fazer saque\n4- Fazer depósito\n5- Cadastrar funcionário\n6- Ver funcionário cadastrado\n7- Aplicar bonificação para o funcionário\n8- Sair");
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
                case 5:
                    sc.nextLine();
                    System.out.println("Digite o nome do funcionário");
                    String fn = sc.nextLine();
                    func.setNome(fn);
                    System.out.println("Digite o departamento do funcionário");
                    String dp = sc.nextLine();
                    func.setDepartamento(dp);
                    System.out.println("Digite o RG do funcionário");
                    String reg = sc.nextLine();
                    func.setRg(reg);
                    System.out.println("Digite o salário do funcionário");
                    double salar = sc.nextDouble();
                    func.setSalario(salar);
                    System.out.println("Digite a data de contratação do funcionário");
                    sc.nextLine();
                    String dat = sc.nextLine();
                    func.setCont(dat);
                    System.out.println("O funcionário ainda está ativo?");
                    String at = sc.nextLine();
                    func.setAtivo(at);
                    break;
                case 6:
                    System.out.println("----DADOS DO FUNCIONÁRIO----:\nNome: "+ func.getNome() + "\nDepartamento: "+ func.getDepartamento() + "\nRG: "+ func.getRg() + "\nSalário: " + func.getSalario() + "\nData de Contratação: "+ func.getCont() + "\nFuncionário ativo: " + func.getAtivo());       
                    break;
                case 7:
                    System.out.println("Quanto será a bonificação do funcinário?");
                    double boni = sc.nextDouble();
                    func.bonifica(boni);
                    System.out.println("Bonificação aplicada!\nSalário atual: " + func.getSalario());
                    break;
            }
        } while(opc != 8);
        sc.close();
        
    }
}
