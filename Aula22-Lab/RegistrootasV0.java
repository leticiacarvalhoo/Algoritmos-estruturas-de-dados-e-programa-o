public class RegistrootasV0 {
    public static void main(String[] args) {
        NossoHash<String, Double> boletim = new NossoHash<>();
        //podemos colocar qualquer coisa como chave e qualquer uma como valor. 
        //chave é mais "salutar" que ela seja algo comparável e que conseguimos definir uma ordem oara ela.
        boletim.put("Ana", 2.5);
        boletim.put("Bia", 4.7);
        boletim.put("Caio", 3.9);
        boletim.put("Bia", 9.7);
        boletim.put("Nalin", 10.0);
        boletim.put("Carlos", 5.7);
        boletim.imprime();

        System.out.println("Notas da Bia: " + boletim.getListaValores("Bia"));
    }
}
