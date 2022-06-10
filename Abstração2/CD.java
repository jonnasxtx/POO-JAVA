public class CD extends Produtos {
    private int faixas;

    public String toString(){
        return super.toString() + ", Faixas: " + this.faixas;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }
}
