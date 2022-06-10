public class teste {
    public static void main(String[] args) {
        Animais gato = new Gato();
        Animais cachorro = new cachorro();

        gato.comunicar();
        gato.movimentar();

        cachorro.comunicar();
        cachorro.movimentar();

        System.out.println("Gato é do tipo animal? " + (gato instanceof Animais));
        System.out.println("Cachorro é do tipo Animal? " + (cachorro instanceof Animais));
    }
}
