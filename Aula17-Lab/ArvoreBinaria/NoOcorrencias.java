public class NoOcorrencias extends No {
    private int ocorrencias;
    public NoOcorrencias (int info){
        super(info);
        this.ocorrencias = 1;
    }
    public int getOcorrencias() {
        return ocorrencias;
    }
    public void setOcorrencias(int ocorrencias) {
        this.ocorrencias = ocorrencias;
    }
}
