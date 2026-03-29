public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String cont;
    private String ativo;
    private String rg;

    public void setNome(String nome){
        if (nome != null && nome.length() > 1) {
            this.nome = nome;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setDepartamento(String departamento){
        if (departamento != null && departamento.length() > 1) {
            this.departamento = departamento;
        }
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setSalario(double salario){
        if (salario > 0.00) {
            this.salario = salario;
        }
    }

    public double getSalario(){
        return this.salario;
    }

    public void setCont(String cont){
        if (cont != null && cont.length() > 1) {
            this.cont = cont;
        }
    }

    public String getCont(){
        return this.cont;
    }

    public void setAtivo(String ativo){
        if (ativo != null && ativo.length() > 1) {
            this.ativo = ativo;
        }
    }

    public String getAtivo(){
        return this.ativo;
    }

    public void setRg(String rg){
        if (rg != null && rg.length() > 1) {
            this.rg = rg;
        }
    }

    public String getRg(){
        return this.rg;
    }

    public void bonifica(double boni){
        if (boni > 0) {
            double boni2 = (this.salario * boni);
            this.salario += boni2;
        }
    }

    boolean trabalhando(String ativo){
        if (this.ativo != "sim"){
            System.out.println("Funcionário já foi demitido");
            return false;
        } else{
            System.out.println("Funcinário trabalhando");
            return true;
        }
    }
}
