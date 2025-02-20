package festanoceu.entrada;
/*
Objetivo: Trabalhar com arrays para armazenar e iterar sobre elementos.
Exemplo de atividade:

Crie um array com os nomes dos animais que vão à festa no céu (apenas os que podem voar).
Em seguida, percorra o array com um loop for e imprima os nomes dos convidados.
 */
public class PartyList {
    public static void main(String[] args) {
        String [] convidados = {"garça","pássaro","beija-flor","borboleta"};

        System.out.println("convidados no céu:");
        for (int i=0;i<convidados.length; i++){
            System.out.println("- " + convidados[i]);
        }
    }
}
