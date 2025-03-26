public class TesteLista {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        System.out.println("lista criada:\n" + lista);

        try {
            System.out.println(lista.removeInicio() + "foi removido!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        lista.insereInicio(5);
        lista.insereInicio(8);
        lista.insereInicio(15);
        System.out.println("lista depois das inserções:\n" + lista);
    }
}
