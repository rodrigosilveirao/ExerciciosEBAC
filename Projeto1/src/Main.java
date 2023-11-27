public class Main {

    public static void main(String[] args) {

        System.out.println("Ola cliente!");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 2");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        cliente.imprimirEndereco();
    }
}