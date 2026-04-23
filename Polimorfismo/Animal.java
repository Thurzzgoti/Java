public class Animal {
    private String nome;
    private int localizacao;
    private double velocidade;

    public Animal(String nome, int localizacao, double velocidade){

    }

    public Animal(){}
    
    // Get e Set
    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}
    public int getLocalizacao() {return localizacao;}
    public void setLocalizacao(int localizacao) {this.localizacao = localizacao;}
    public double getVelocidade() {return velocidade;}
    public void setVelocidade(double velocidade) {this.velocidade = velocidade;}


    public void mover(){
        System.out.println("Animal se moveu ----->");
        this.localizacao++;
    }

    public String toString(){
        return "Animal - Nome: "+this.nome 
                + "\t Localização: "+ this.localizacao;
    }
    

}