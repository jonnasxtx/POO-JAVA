public class Funcionarios {
    private String nome;
    private int codigo;
    public double bonus = 1;
    private double renda = 1000;

    public Funcionarios(String nome, int codigo, float renda) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void setRenda(double renda) {
		this.renda = renda;
	}

	public double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void rendaTotal(){
        this.setRenda(this.getRenda() * bonus);
    }
    public void imprimir(){
        System.out.println();
        System.out.println("Nome: " + nome + ", código: " + codigo + "\nSalario: R$" + renda);
        System.out.println();
    }
}
