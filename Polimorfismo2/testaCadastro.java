public class testaCadastro {
    public static void main(String[] args) {
        CadastraPessoas cadastraPessoas = new CadastraPessoas();
       
        Funcionario funcionario = new Funcionario("João Pedro", new Data(25, 12, 1990), 1500);
        funcionario.calculaImposto();
        funcionario.imprimeDados();
        cadastraPessoas.cadastrar(funcionario);
        
        Gerente gerente = new Gerente("Thompson James", new Data(11, 05, 1985), 5000, "Gerente de Produção");
        gerente.calculaImposto();
        gerente.imprimeDados();
        cadastraPessoas.cadastrar(gerente);
        
        Cliente cliente = new Cliente("Maria Eduarda", new Data(18,02,1995), 1);
        cadastraPessoas.cadastrar(cliente);
        cliente.imprimeDados();
        cadastraPessoas.imprimirCadastro();
    }
}
