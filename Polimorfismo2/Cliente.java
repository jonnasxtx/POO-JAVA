public class Cliente extends Pessoa {
    private int codigo;
    
    
    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + this.getNome() + ", Data de Nascimento: " + this.getNascimento().imprimirData() + ", Código: " + this.getCodigo());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }
    
}
