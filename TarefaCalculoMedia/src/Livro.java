/**
 * Livro do mundo real.
 */

public class Livro {

    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void exibirInfo (){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(numeroDePaginas);
    }
}
