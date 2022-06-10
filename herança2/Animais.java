public class Animais {
     public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setNome("Felix");
        gato.setRaca("Gato");
        gato.animal();
        gato.caminha();
        gato.mia();
        
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Jack");
        cachorro.setRaca("Cachorro");
        cachorro.animal();
        cachorro.caminha();
        cachorro.late();
    }
}
