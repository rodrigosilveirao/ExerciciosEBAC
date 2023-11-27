public class Main {
    public static void main(String[] args) {

        System.out.println("Livro");
        Livro Livro = new Livro();
        Livro.setTitulo("condifada");
        Livro.setAutor("eu");
        Livro.setNumeroDePaginas(16);
        Livro.exibirInfo();
    }
}