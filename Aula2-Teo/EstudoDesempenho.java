// metodos estáticos não precisam de objetos instanciados, eles chamam direto da classe
// tudo que é alocado dinamicamente, é desalocado dinamicamente

import java.util.Random;
import java.util.Scanner;

public class EstudoDesempenho{
    static void preencheVetor (int[] v) {
        Random random = new Random();
        for (int i=0; i<v.length; i++) {
            // v.length*10 foi colocado pra espalhar mais os valores.
            // nextInt() se não colocar algum parametro, da uns numeros bens estranhos
            v[i] = random.nextInt(v.length*10);
        }
    }
    static void exibeVetor (int[] v) {
        System.out.println();
        for (int i=0; i<v.length; i++) {
            System.out.println(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] v;
        Scanner scanner = new Scanner(System.in);
        int tamanho = 0;

        // o do/while faz o teste ao final. Para evitar isso, podemos pedir para o usuario ja digitar antes de inicializar.
        // dessa forma, podemos usar só o while
        System.out.print("digite o tamanho do vetor, 0 encerra: ");
        //next int = leitura de inteiros. O metodo scanner classifica as proprias hints conforme eu for usando
        tamanho = scanner.nextInt();
    
        while (tamanho > 0) {
            v = new int[tamanho];
            preencheVetor(v);
            exibeVetor(v);
            System.out.print("digite o novo tamanho, 0 encerra: ");
            tamanho = scanner.nextInt(); 
        }
        scanner.close();
    }
}