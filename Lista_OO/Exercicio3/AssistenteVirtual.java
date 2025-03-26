// Crie uma classe AssistenteVirtual, representando um chatbot de IA que responde perguntas básicas de usuários.
// Depois, crie uma subclasse AssistenteFinanceiro, um chatbot especializado em
// consultas financeiras, que sobrescreve o método responderPergunta() para lidar
// com perguntas específicas sobre contas bancárias e investimentos.
// Regras da Sobrescrita
//      • O método responderPergunta(String pergunta) da classe AssistenteVirtual responde perguntas genéricas.
//      • O método responderPergunta(String pergunta) da classe AssistenteFinanceiro fornece respostas mais detalhadas 
//      sobre saldos e investimentos.


package Exercicio3;

public class AssistenteVirtual {
    public String responderPergunta(String pergunta) {
        pergunta = pergunta.toLowerCase(); 

        if (pergunta.contains("clima")) {
            return "O clima está ameno!";
        } else if (pergunta.contains("melhor time")) {
            return "O Corinthians é o melhor time do mundo!";
        } else if (pergunta.contains("mais fedido")) {
            return "O Lufi é o mais fedido do mundo (eca)!";
        } else {
            return "Desculpe, não entendi a pergunta.";
        }
    }
}
