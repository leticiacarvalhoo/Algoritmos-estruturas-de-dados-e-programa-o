package parte1;
// Crie uma classe CarteiraCripto que representa uma carteira de criptomoedas e possui os seguintes atributos privados:
//      • enderecoCarteira (String): identificador único da carteira.
//      • dono (String): nome do proprietário da carteira.
//      • saldoBitcoin (double): quantidade de Bitcoins na carteira.
// Implemente:
//      • Um construtor que inicializa enderecoCarteira, dono e saldoBitcoin.
//      • Métodos para adicionar e sacar Bitcoins, garantindo que o saldo nunca fique negativo.
//      • Métodos getSaldoBitcoin(), getEnderecoCarteira() e getDono().
// Teste a classe em um método principal (main), que pode ser criado na própria classe, criando uma carteira e manipulando os valores.

public class CarteiraCripto{
    private String enderecoCarteira;
    private String dono;
    private double saldoBitcoin;


    //construtor
    public CarteiraCripto(String enderecoCarteira, String dono, double saldoBitcoin){
        this.enderecoCarteira = enderecoCarteira;
        this.dono = dono;
        this.saldoBitcoin = saldoBitcoin;
    }
    
    public String getEnderecoCarteira() {
        return enderecoCarteira;
    }
    public String getDono() {
        return dono;
    }
    public double getSaldoBitcoin() {
        return saldoBitcoin;
    }

    //adicionar bitcoin
    void adicionarBitcoin(double a){
        saldoBitcoin += a;
    }

    //fazer saque
    void sacarBitcoin(double s){
            saldoBitcoin -= s;
    }

    //apresentar informaçoes
    void apresentarInfos() {
        System.out.println("Endereço da Carteira: " + enderecoCarteira);
        System.out.println("Dono da Carteira: " + dono);
        System.out.println("Saldo em Bitcoin: " + saldoBitcoin);
    }
}