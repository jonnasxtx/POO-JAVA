public class Loja {
    public static void main(String[] args) {
        CD cd = new CD();
        cd.setFaixas(15);
        cd.setNome("Metallica");
        cd.setPreço(20);
        System.out.println(cd.toString());

        Livros livro = new Livros();
        livro.setNome("Senhor dos Anéis IV");
        livro.setAutor("J. R. R. Tolkien");
        livro.setPreço(100);
        System.out.println(livro.toString());

        DVD dvd = new DVD();
        dvd.setNome("Zé neto & Cristiano");
        dvd.setPreço(50);
        dvd.setDuração("01:30:00 horas");
        System.out.println(dvd.toString());

        Livros livro2 = new Livros();
        livro2.setNome("Harry Potter e o Cálice de fogo");
        livro2.setAutor("J. K. Rowling");
        livro2.setPreço(150);
        System.out.println(livro2.toString());

        DVD dvd2 = new DVD();
        dvd2.setNome("Gustavo Lima ao vivo");
        dvd2.setPreço(60);
        dvd2.setDuração("01:45:00 horas");
        System.out.println(dvd2.toString());
    }
}
