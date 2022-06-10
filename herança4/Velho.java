public class Velho extends Imovel {
    float valorDesconto(){
        this.setPreço(this.getPreço() * (float) (0.90));
        return this.getPreço();
    }
}
