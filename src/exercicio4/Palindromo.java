package exercicio4;
import pilhas.PilhaInt;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        PilhaInt pilha = new PilhaInt();
        pilha.init();
        int digito;

        int n=0;
        int[] leitura = new int[pilha.N];
        System.out.println("Digite digito (0..9 )");
        digito=le.nextInt();
        while(digito>=0){
            leitura[n] = digito;
            n++;
            pilha.push(digito);
            System.out.println("Digite digito (0..9 )");
            digito=le.nextInt();
        }

    }
}
