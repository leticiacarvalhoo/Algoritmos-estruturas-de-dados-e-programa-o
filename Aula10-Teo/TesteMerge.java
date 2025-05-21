public class TesteMerge{
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor();
        v.preencheVetor();
        System.out.println(v);
        v,mergeSort(0, v.getTamanho() - 1);
        System.out.println(v);
    }
}