public class FunciBasico extends Funcionarios {
    private String escolaB;
    public double bonusbasico = 1.1;

    public String getEscolaB() {
        return escolaB;
    }

    public void setEscolaB(String escolaB) {
        this.escolaB = escolaB;
    }

    public FunciBasico(String nome, int codigo, float renda, String escolaB) {
        super(nome, codigo, renda);
        this.escolaB = escolaB;
    }

    @Override
    public void rendaTotal() {
        this.setRenda(this.getRenda() * bonusbasico);
    }
    @Override
    public void imprimir(){
        System.out.println("Nome: " + getNome() + ", código: " + getCodigo() + ", Escola Ensino Basico: " + escolaB +"\nSalario com Bônus: R$" + getRenda());
        System.out.println();
    }
}
