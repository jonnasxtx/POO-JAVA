
public abstract class Pessoa {
    public String nome;
    public Data nascimento;
    
    public Pessoa(String nome, Data nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

    public abstract void imprimeDados();

    public String dados(){
        return "Nome: " + this.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }



}
