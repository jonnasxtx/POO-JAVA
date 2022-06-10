public class Produtos {
    private String Nome; 
    private float preço;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }
    public String toString(){
		return "Nome: " + this.Nome +", Preco: R$" + this.preço;	
	}
}
