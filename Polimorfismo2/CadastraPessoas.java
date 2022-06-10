
import java.util.ArrayList;

public class CadastraPessoas {
    public int qtdAtual = 0;
    ArrayList<Pessoa> cadastro = new ArrayList<>();

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
    
    public void cadastrar(Pessoa pessoa){
        this.cadastro.add(pessoa);
    }
    public void imprimirCadastro(){

        for (int i = 0; 
        i<this.cadastro.size(); 
        i++){
            System.out.println(this.cadastro.get(i).dados());

        }
    }
}