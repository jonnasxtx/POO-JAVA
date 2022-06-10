public class Novo extends Imovel {
    float valorAdicional(){
        this.setPreço(this.getPreço() * (float) (1.10));
        return this.getPreço();
    }
}
