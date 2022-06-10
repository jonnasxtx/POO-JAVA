public class Livros extends Produtos{
    private String Autor;

    public String toString(){
        return super.toString() + ", Autor: " + this.Autor;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }
}