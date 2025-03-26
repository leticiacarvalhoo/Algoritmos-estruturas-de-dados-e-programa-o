package parte2;
// 1.2 Protegendo os Dados
// Agora, altere a classe CarteiraCripto para garantir que:
//      • O enderecoCarteira não possa ser alterado após a criação.
//      • O dono possa ser atualizado, mas não pode ser uma string vazia.


import java.util.Scanner;

public class Protegendo{
    private final String enderecoCarteira;
    private String dono;
    private double saldoBitcoin;


    //construtor
    public Protegendo(String enderecoCarteira, String dono, double saldoBitcoin){
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
        System.out.println("Novo saldo em Bitcoin: " + saldoBitcoin);
    }

    //precisa abrir um scanner novo toda vez?
    //fazer saque
    void sacarBitcoin(double s){
        if (s > saldoBitcoin){
            System.out.println("Operação inválida. Seu saldo é de: " + saldoBitcoin);
        }
        else{
            saldoBitcoin -= s;
            System.out.println("Novo saldo em Bitcoin: " + saldoBitcoin);
        }
    }

    //mudando de dono
    void mudarDono(String n){
        if (n.length() == 0){
            System.out.println("Nome do novo dono é inválido");
        }
        else{
            dono = n;
            System.out.println("Novo dono: " + dono);
        }
    }

    //apresentar informaçoes
    void apresentarInfos() {
        System.out.println("Endereço da Carteira: " + enderecoCarteira);
        System.out.println("Dono da Carteira: " + dono);
        System.out.println("Saldo em Bitcoin: " + saldoBitcoin);
    }

}