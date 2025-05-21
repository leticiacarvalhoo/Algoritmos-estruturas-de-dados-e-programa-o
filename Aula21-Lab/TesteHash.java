public class TesteHash {
    public static void main(String[] args) {
        NossoHash<String, String> mapa = new NossoHash();
        mapa.put ("12345", "aaaa");
        mapa.put ("6789", "lelets");
        mapa.put ("4357", "lysandra");
        mapa.put ("9876", "mateusete");
        mapa.put ("555555", "oi");
        mapa.put ("7777", "hi");
        mapa.put ("9999", "hello");

        mapa.imprime();
        String retorno = mapa.get("6789");
        if(V != null){
            System.out.println(retorno + " e o valor associado a sua chave");
        }
        else{
            System.out.println("chave não encontrada");
        }
    }
}