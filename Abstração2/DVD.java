public class DVD extends Produtos {
    private String duração;

    public String getDuração() {
        return duração;
    }

    public void setDuração(String duração) {
        this.duração = duração;
    }
    public String toString(){
        return super.toString() + ", Duração: " + this.duração;
    }
}
