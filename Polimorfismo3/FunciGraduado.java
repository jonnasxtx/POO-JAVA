public class FunciGraduado extends FunciMedio {
    private String Universidade;
    public double bonusGraduado = 2;

   

    public String getUniversidade() {
        return Universidade;
    }

    public void setUniversidade(String universidade) {
        Universidade = universidade;
    }

    public FunciGraduado(String nome, int codigo, float renda, String escolaB, String escolaM, String universidade) {
        super(nome, codigo, renda, escolaB, escolaM);
        Universidade = universidade;
    }
    @Override
    public void rendaTotal() {
        this.setRenda(super.getRenda() * bonusbasico * bonusMédio * bonusGraduado);
    }
    @Override
    public void imprimir(){
        System.out.println("Nome: " + getNome() + ", código: " + getCodigo() 
        + ", Escola Ensino Basico: " + getEscolaB() + ", Escola Ensino Médio: "  + getEscolaM()
        + ", Universadidae: " + getUniversidade()
        +"\nSalario com Bônus: R$" + getRenda());
    }
}
