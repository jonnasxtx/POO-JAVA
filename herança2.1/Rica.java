public class Rica extends Pessoa {
    private double dinheiro;

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    public void fazCompras(){
        System.out.println("comprando" + " Dinheiro:" + dinheiro);
    }
}
