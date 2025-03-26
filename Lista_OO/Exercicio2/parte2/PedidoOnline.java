// Agora, crie uma classe PedidoOnline que representa um pedido de um e-commerce, que contém os seguintes atributos: String produto, double precoUnitario, int
// quantidade.
// Implemente dois construtores sobrecarregados:
//      1. PedidoOnline(String produto, double precoUnitario) → Cria um pedido com quantidade 1.
//      2. PedidoOnline(String produto, double precoUnitario, int quantidade) → Cria um pedido permitindo definir a quantidade.
//      3. Sobrescrita de Métodos – Assistentes Virtuais e Sistemas de Pagamento

package Exercicio2.parte2;

public class PedidoOnline {
    private String produto;
    private double precoUnitario;
    private int quantidade;

    public PedidoOnline(String produto, double precoUnitario) {
        this.produto = produto;
        this.precoUnitario = precoUnitario;
        this.quantidade = 1;
    }

    public PedidoOnline(String produto, double precoUnitario, int quantidade){
        this.produto = produto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }
    
    public String getProduto(){
        return produto;
    }
    public double getPrecoUnitario(){
        return precoUnitario;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public double calcularTotal() {
        return precoUnitario * quantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + produto);
        System.out.println("Preço Unitário: " + precoUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: " + calcularTotal());
    }

    public static void main(String[] args) {
        PedidoOnline pedido1 = new PedidoOnline("Blusa", 29.90);
        PedidoOnline pedido2 = new PedidoOnline("Calça", 80.90, 2);

        System.out.println("Pedido 1:");
        pedido1.exibirInformacoes();
        System.out.println();

        System.out.println("Pedido 2:");
        pedido2.exibirInformacoes();
    }
}
