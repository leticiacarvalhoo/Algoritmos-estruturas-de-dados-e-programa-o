package Exercicio3;

public class AssistenteFinanceiro extends AssistenteVirtual {
    @Override
    public String responderPergunta(String pergunta) {
        pergunta = pergunta.toLowerCase(); 

        if (pergunta.contains("saldo")) {
            return "Seu saldo atual é de R$ 2.500,00.";
        } else if (pergunta.contains("investir")) {
            return "Você pode investir em CDBs, Tesouro Direto ou ações.";
        } else if (pergunta.contains("taxa de juros")) {
            return "A taxa Selic atual está em 10,75% ao ano.";
        } else {
            return super.responderPergunta(pergunta); 
        }
    }
}

