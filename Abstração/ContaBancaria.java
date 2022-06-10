public abstract class ContaBancaria {
    public int numeroConta;
    public double saldo;

    public ContaBancaria(){

    }
    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

 
