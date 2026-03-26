public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limite;

    //getter e setters
    public void setNome(String nome){
        if (nome != null && nome.length() > 1) {
            this.nome = nome;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNumero(int numero){
            this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setSaldo(double saldo){
            this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setLimite(double limite){
            this.limite = limite;
    }

    public double getLimite(){
        return this.limite;
    }

    void saque(double valor){
        if (saldo >= valor && valor >0) {
         this.saldo -= valor;
        } else{
            System.out.println("Saldo insulficiente");
        }
        System.out.println("Seu saldo atual é: " + this.saldo);
    }
    boolean sacarVerifica(double quantidade){
        if (quantidade > saldo) {
            return false;
        } else{
            this.saldo -= quantidade;
            return true;
        }
    }
    public String toString(){
        return "----DADOS DA CONTA----:\nNome: "+ this.nome + "\nNúmero: "+ this.numero + "\nSaldo: "+ this.saldo + "\nLimite: "+ this.limite;
    }
    public void Deposito(double valor1){
        if(valor1 < 0){
            System.out.println("O valor precisa ser maior que 0");
        } else{
            this.saldo += valor1;
        }
    }
    }
