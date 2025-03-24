package exercicio3;

import pilhas.PilhaInt;
import java.util.Scanner;

//CONVERSOR DE NÚMERO DECIMAL EM BINARIO

public class Debin {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        PilhaInt pilha = new PilhaInt();
        int decimal, resto;


        System.out.println("Valor inteiro positivo em decimal: ");
        decimal =  le.nextInt();

        while(decimal != 0){
            resto = decimal % 2;
            pilha.push(resto);
            decimal = decimal /2;
        }
        System.out.print("Valor em binario: ");
        pilha.esvazie();

        le.close();
    }
}
