public class ExercRecursao {
    
    static long fatorialIterativo(int n){
        long f=1;

        while (n>1){
            f = f*n--;
        }
        // for (int i=2; i <= n; i++){
        //     f = f *i;
        // }
        return f;
    }

    static long fatorialRecursivo(int n){
        if (n <= 1) {
            return 1;
        }
        return n * fatorialRecursivo(n-1);
    }

    static int fibonacciRec(int n){
        if (n<=2){
            return 1;
        }
        return fibonacciRec(n-1) + fibonacciRec(n-2);
    }

    static int potenciaRec (int k, int n){
        if (n == 0) return 1;
        //if (n==1) return k
        return k * potenciaRec(k, n-1);
    }

    static int multipRec(int n1, int n2){
        if (n1 == 0 || n2 == 0) return 0;
        if (n1 == 1) return n2;
        return n2 + multipRec(n1-1, n2);
    }


    static void exibe1aNv1(int i, int n){
        // em memoria, esse é bem mais eficientge (recursão de cauda)
        System.out.println(i + " ");
        if (i < n) exibe1aNv1(i+1, n);
    }
    static void exibe1aNv2(int i, int n){
        //quando temos a recursiva antes, ele vai empilhando ate chegar em um resultado
        if (i < n) exibe1aNv2(i+1, n);
        System.out.println(i + " ");
    }
    static void exibe1aNv3(int n){
        //recursão de cauda dnv
        System.out.println(n + " ");
        if (n > 0) exibe1aNv3(n-1);
    }
    static void exibe1aNv4(int n){
        if (n > 0) exibe1aNv4(n-1);
        System.out.println(n + " ");
    }


    public static void main(String[] args) {
        for (int i = 0; i <=20; i++){
            System.out.println("Fatorial de " + i + " = " + fatorialIterativo(i));
        }
        for (int i = 0; i <=20; i++){
            System.out.println("Fatorial de " + i + " = " + fatorialRecursivo(i));
        }
        for (int i = 0; i <=20; i++){
            System.out.println("Fibonacci em " + i + " = " + fibonacciRec(i));
        }
        System.out.println();
        System.out.println("3 elevado a 4 = " + potenciaRec(3, 4));

        System.out.println();
        System.out.println("O valolr de 7 vezes 3 = " + multipRec(3, 7));

        System.out.println("\nExibe 1 a N v1");
        exibe1aNv1(0, 4);
        System.out.println("\nExibe 1 a N v2");
        exibe1aNv2(0, 4);
        System.out.println("\nExibe 1 a N v3");
        exibe1aNv3(4);
        System.out.println("\nExibe 1 a N v4");
        exibe1aNv4(4);
    }
}
