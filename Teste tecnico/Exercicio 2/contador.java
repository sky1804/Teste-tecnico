import java.util.Scanner;

public class contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma string: ");
        String texto = sc.nextLine();

        int cont = 0;

        for (int i = 0; i < texto.length(); i++) {
            
            char c = texto.charAt(i);
            if (c == 'a' || c == 'A') {
                cont++;
            }
        }

        System.out.println("A letra 'a' aparece " + cont);

        sc.close();
    }
}
