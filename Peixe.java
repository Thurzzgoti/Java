public class Peixe extends Animal{
    private int agua;

    public Peixe (){}
    public Peixe(String nome, int localizacao, double velocidade, int agua){ 
        super(nome, localizacao, velocidade);
        this.agua = agua;
    }

    public int getAgua(){return this.agua;}
    public void setAgua(int agua){this.agua = agua;}

    public void mover(){
        System.out.println("Peixe "+ super.getNome() + " movendo ~ ~ ~ ~>");
        setLocalizacao(getLocalizacao() + 2);
    }

}