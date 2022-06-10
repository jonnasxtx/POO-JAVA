public class vendamain {
    public static void main(String[] args) {
        Normal normal = new Normal();
        System.out.println("-------------Ingresso Normal-------------");
        normal.setValoringresso((float)50);
        normal.valorNormal();
        normal.imprimeValor();

        CamaroteInferior camaroteinf = new CamaroteInferior();
        System.out.println("-------------Ingresso Camarote Inferior------------");
        camaroteinf.setValoringresso((float)50);
        camaroteinf.setLocalização("mezanino inferior");
        camaroteinf.imprimirLocal();
        camaroteinf.valorAdicional();
        camaroteinf.imprimeValor();

        CamaroteSuperior camarotesup = new CamaroteSuperior();
        System.out.println("---------------Ingresso camarote Superior-----------");
        camarotesup.setValoringresso((float)50);
        camarotesup.camaroteadc();
        camarotesup.imprimeValor();


    }
}
