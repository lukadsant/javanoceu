package festanoceu.entrada;
/*
Objetivo: Utilizar loops (while ou for) para simular um processo.
Exemplo de atividade:

Faça um programa que simule o trajeto do jabuti até a festa.
Por exemplo, inicie com uma variável distancia (em metros) e a cada iteração reduza esse valor até chegar a 0, exibindo mensagens sobre o percurso.

 */

public class HowManySteps {
    public static void main(String[] args) {
        int distancia = 10;
        while (distancia > 0){
            System.out.println("o jabuti ainda está a "+ distancia + " metros da festa...");
            distancia--;
        }
        System.out.println("chegou na festa no céu!");
    }
}
