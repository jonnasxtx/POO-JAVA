public class CamaroteInferior extends Vip {
    private String localização;

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }

    public void imprimirLocal(){
        System.out.println("Localização do Camarote: " + localização);
    }
}
