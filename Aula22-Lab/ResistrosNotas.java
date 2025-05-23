//diferente da versão 0, vamos abstrair e deixar o mais bonito possível

import java.util.List;

public class ResistrosNotas {
    private NossoHash<String, Double> boletim;

    @SuppressWarnings("unchecked")
    public RegistroNotas() {
        boletim = new NossoHash<>();
    }

    public void cadastraNotas(String aluno, Double nota) {
        boletim.put(aluno, nota);
    }

    public void mostraBoletim() {
        boletim.imprime();
    }

    public List<Double> getListaNotas(String aluno) {
        return boletim.getListaValores(aluno);
    }

    public String stringListaNotas(String aluno) {
        List<Double> lista = boletim.getListaValores(aluno);
        if (lista == null || lista.isEmpty())
            return aluno + " nao fez as provas\n";
        String s = "";
        for (Double nota : lista)
            s += nota + " ";
    }

    public double mediaAluno(String aluno) {
        List<Double> lista = getListaNotas(aluno);
        if (lista == null || lista.isEmpty())
            return 0.0;
        double soma = 0.0;
        for (Double nota : lista) {
            soma += nota;
        }
        return soma / lista.size();
    }

    public static void main(String[] args) {
        RegistroNotas registronotas = new ResistrosNotas();

        registronotas.cadastraNotas("Ana", 2.5);
        registronotas.cadastraNotas("Bia", 4.7);
        registronotas.cadastraNotas("Caio", 3.9);
        registronotas.cadastraNotas("Bia", 9.7);
        registronotas.cadastraNotas("Nalin", 10.0);
        registronotas.cadastraNotas("Carlos", 5.7);
        registronotas.mostraBoletim();

        System.out.println("Notas da Bia: " + registronotas.stringListaNotas("Bia"));
        
    }
}
