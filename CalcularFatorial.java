package recursividade_fatorial;

import java.util.Scanner;

public class CalcularFatorial {
    public static void main(String[] args) {
        int value;
        int fatorial;
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Indique o número para calcular o fatorial: ");
            value = scan.nextInt();
        }

        fatorial = calcularFatorial(value);
        System.out.println("Resultado: " + fatorial);
    }

    public static int calcularFatorial(int value) {
        int result = 1;

        System.out.println(value);

        if(value > 0) {
            result = value * calcularFatorial(value - 1);
        }
        return result;

        // forma alternativa de calcular em menor quantidade de linhas:
        // if(value == 0) {
        //     return 1;
        // }
        // System.out.println(value);
        // return value * calcularFatorial(value - 1);

    }
}
