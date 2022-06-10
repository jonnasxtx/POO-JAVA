import javax.swing.JOptionPane;

public class vender {
    static String tipoImovel;
    public static void main(String[] args) {
        Imovel imovel = new Imovel();
        String endereço;
        float preço;
        endereço = JOptionPane.showInputDialog("Digite o endereço do Imovel: ");            
        preço = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço: "));
        imovel.setEndereço(endereço);
        imovel.setPreço(preço);
        Object[] opcoes = {"Imovel novo","Imovel Antigo",};
        Object tipoImovel = JOptionPane.showInputDialog(null, "Escolha um tipo de Imovel" , "Seleção de imoveis",
        JOptionPane.PLAIN_MESSAGE , null ,opcoes,"");

            if("Imovel novo".equals(tipoImovel)){
                Novo imovelnovo = new Novo();
                System.out.println("------------Preço Imovel Novo--------------");
                preço = imovel.getPreço();
                endereço = imovel.getEndereço();
                imovelnovo.setPreço(preço);
                imovelnovo.setEndereço(endereço);
                imovelnovo.valorAdicional();
                imovelnovo.imprimir();         
            }
            if("Imovel Antigo".equals(tipoImovel)){
                Velho imovelvelho = new Velho();
                System.out.println("------------Preço Imovel Antigo--------------");
                preço = imovel.getPreço();
                endereço = imovel.getEndereço();
                imovelvelho.setPreço(preço);
                imovelvelho.setEndereço(endereço);
                imovelvelho.valorDesconto();  
                imovelvelho.imprimir();
            }
    }
}
