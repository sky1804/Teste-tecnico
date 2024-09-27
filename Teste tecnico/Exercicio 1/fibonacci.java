
import java.util.Scanner;

public class fibonacci {

    public  boolean calculoFibonacci(int n){
        int a = 0, b = 1, c = 0;

        // Usando do-while para calcular a sequência até passar do valor 'n'
        do {
            c = a + b;  
            a = b;      
            b = c;      

            if (c == n) {
                return true;  
            }

        } while (c < n);  

        return false;
    }


    public static void main(String[] args) {
     
        fibonacci fib = new fibonacci();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se faz parte da sequência de Fibonacci: ");
        int n = sc.nextInt();  

        
        boolean resultado = fib.calculoFibonacci(n);

        // Exibe o resultado
        if (resultado) {
            System.out.println(n + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.println(n + " não faz parte da sequência de Fibonacci.");
        }
        sc.close();

    }
}
