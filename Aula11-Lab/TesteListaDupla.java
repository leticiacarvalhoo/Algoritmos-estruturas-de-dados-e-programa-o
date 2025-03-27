public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDupla listaDupla = new ListaDupla();
        System.out.println("'Lista instanciada\n: " + listaDupla);

        try {
            listaDupla.removeInicio();
        } catch (RuntimeException rt) {
            System.out.println(rt.getMessage());
        }

        listaDupla.insereInicio(10);
        listaDupla.insereInicio(20);
        listaDupla.insereInicio(30);
        System.out.println("Lista após as inserções de início\n: " + listaDupla);

        listaDupla.insereFim(15);
        listaDupla.insereFim(25);
        listaDupla.insereFim(35);
        System.out.println("Lista após as inserções de fim\n: " + listaDupla);

        System.out.println("Removendo do início: " + listaDupla.removeInicio());
        System.out.println(listaDupla.removeFim() + " removido do fim\n: ");
        System.out.println("Lista após as remoções de início e fim\n: " + listaDupla);
    }
}
