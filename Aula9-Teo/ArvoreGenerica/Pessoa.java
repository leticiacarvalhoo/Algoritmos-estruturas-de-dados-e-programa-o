//em java não conseguimos resolver isso com herança
//em c++ existe heranca multipla por exemplo
//ao inves de exterder interfaces, você implementa interfaces
//deadly dimond of death

public class Pessoa implements Comparable<Pessoa> {
    private int id;
    private String nome;
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Não é necessario usa-lo, mas é uma boa pratica. Porque avisamos ao compilador que a assinatura do metodo não pode ser alterara
    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + "]";
    }
    @Override
    public int compareTo(Pessoa outraPessoa){
        //Classes empacotadoras: fornecem metodos a tipos primitivos. Ex: Integer -> int; Double -> double
        //ent fazer dessa forma é feio:
        // if (this.id <outraPessoa.id) return -1;
        // if (this.id > outraPessoa.id) return 1;
        // return 0;

        //podemos fazer dessa forma:
        return Integer.compare(this.id, outraPessoa.id);
    }
}
