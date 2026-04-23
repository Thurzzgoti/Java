public class Ave extends Animal{
    private int arvore;

    public Ave (){}
    public Ave(String nome, int localizacao, double velocidade, int arvore){ 
        super(nome, localizacao, velocidade);
        this.arvore = arvore;
    }

    public int getArvore(){return this.arvore;}
    public void setArvore(int arvore){this.arvore = arvore;}

    public void mover(){
        System.out.println("Ave "+ super.getNome() + " movendo ~ ~ ~ ~>");
        setLocalizacao(getLocalizacao() + 5);
    }

}