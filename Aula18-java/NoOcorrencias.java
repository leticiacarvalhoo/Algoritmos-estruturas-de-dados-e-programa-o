public class NoOcorrencias extends No {
    private int ocorrencias;
    public NoOcorrencias (int info){
        super(info);
        this.ocorrencias = 1;
    }
    public int getOcorrencias() {
        return ocorrencias;
    }
    public void incrementaOcorrencias(){
        ocorrencias++;
    }
    public void decrementarOcorrencias(){
        ocorrencias--;
    }

    @Override
    public String toString(){
        return super.toString() + " ocorre " + ocorrencias + " vezes\n";
    }
}
