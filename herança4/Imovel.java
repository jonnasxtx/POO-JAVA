public class Imovel {
    private String endereço;
    private float preço;

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }
    public void imprimir(){
        System.out.print("Endereço: " + endereço + " Preço: " + preço );
    }
}
