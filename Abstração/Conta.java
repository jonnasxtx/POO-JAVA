public class Conta extends ContaBancaria {

    public Conta() {
    }

    public Conta(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }
    @Override
    public void depositar(double valor) {
        this.saldo += valor;

    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    public  void imprimir(){
        System.out.println("Conta: " + numeroConta + ", Saldo: " + saldo);
    }

    public static void main(String[] args) {
        Conta conta = new Conta(121312,300);
        conta.depositar(500);
        conta.imprimir();

        Conta conta2 = new Conta(541213,1000);
        conta2.sacar(250);
        conta2.imprimir();
    }
}
