package festanoceu.entrada;

import java.util.Scanner;

/*
*Objetivo: Usar a classe Scanner para ler dados do usuário.
*Exemplo de atividade:
*Crie um programa que pergunte “Quando é a festa no céu?” e armazene a resposta do usuário em uma variável do tipo String. Depois, imprima uma mensagem confirmando a data informada.
*/

public class Partyday {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        System.out.println("Quando é a festa no céu?");

        String dataFesta = question.nextLine();
        System.out.println("você disse que  a festa é em: " + dataFesta);
        question.close();
    }
}
