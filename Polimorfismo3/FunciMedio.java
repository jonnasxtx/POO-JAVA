public class FunciMedio extends FunciBasico{
    private String escolaM;
    public double bonusMédio = 1.5;
    

    public String getEscolaM() {
        return escolaM;
    }

    public void setEscolaM(String escolaM) {
        this.escolaM = escolaM;
    }

    public FunciMedio(String nome, int codigo, float renda, String escolaB, String escolaM) {
        super(nome, codigo, renda, escolaB);
        this.escolaM = escolaM;
    }
    @Override
    public void rendaTotal() {
        this.setRenda(super.getRenda() * bonusbasico * bonusMédio);
    }
    @Override
    public void imprimir(){
        System.out.println("Nome: " + getNome() + ", código: " + getCodigo() 
        + ", Escola Ensino Basico: " + getEscolaB() + ", Escola Ensino Médio: "  + escolaM
        +"\nSalario com Bônus: R$" + getRenda());
        System.out.println();
    }
}
