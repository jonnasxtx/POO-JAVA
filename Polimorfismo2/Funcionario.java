public class Funcionario extends Pessoa {
    public float salario;

 
    public void calculaImposto(){
        this.salario -= salario*(0.03);
    }
    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + this.getNome() + ", Data de Nascimento: " + this.getNascimento().imprimirData() + ", Salario: " + this.salario);

    }
    @Override
    public String dados(){
        return "Cadastro Funcionario! " + "Nome: " + this.getNome() + ", Data de nascimento: " + this.getNascimento().imprimirData() + 
        ", Salario:" + this.salario;
    }
    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

}
