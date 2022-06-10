public class Assistente extends Funcionario{
    public void getMatricula(int matricula){
        this.matricula = matricula;  
    }
    public void exibeDados(){
        System.out.println("Nome: " + Nome  + " Cpf: " + rg + " Salário: " + Salario + " Matricula: " + this.matricula);
    }
}