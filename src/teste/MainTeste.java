package teste;

import pilhas.PilhaInt;

public class MainTeste {

    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();
        pilha.init();
        pilha.push(10);
        pilha.push(12);
        pilha.push(22);
        pilha.push(33);
        pilha.push(44);
        pilha.push(55);
        pilha.push(66);

        if(pilha.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Valor da dados que está no topo da pilha: "+pilha.top());


        System.out.println("Apresentacao de todos os valores que foram empilhados: ");
        pilha.esvazie();

    }




}
