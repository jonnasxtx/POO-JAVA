public class Gerente extends Funcionario {
    public String area;
    @Override
    public void calculaImposto(){
        this.salario -= salario*(0.05);
    }
    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + this.getNome() + ", Data de Nascimento: " + this.getNascimento().imprimirData() + 
        ", Area: " + this.area + ", Salario: " + this.salario);

    }
    @Override
    public String dados(){
        return "Cadastro Gerente! " + "Nome: " + this.getNome() +", Area: " + this.area + ", Data de nascimento: " + this.getNascimento().imprimirData() + 
        ", Salario:" + this.salario;
    }

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }
}
