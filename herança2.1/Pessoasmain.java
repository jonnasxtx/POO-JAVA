public class Pessoasmain {
	public static void main(String[] args) {
       Rica rica = new Rica();
       rica.setNome("Thomas");
       rica.setIdade(32);
       rica.setDinheiro(50000);
       rica.pessoa();
       rica.fazCompras();

       Pobre pobre = new Pobre();
       pobre.setNome("Junior");
       pobre.setIdade(40);
       pobre.pessoa();
       pobre.trabalha();

       Miseravel miseravel = new Miseravel();
       miseravel.setNome("José");
       miseravel.setIdade(55);
       miseravel.pessoa();
       miseravel.mendiga();
        
    }
}
