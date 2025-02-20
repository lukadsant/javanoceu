
package festanoceu.entrada;
/*
Objetivo: Usar estruturas condicionais (if/else).
Exemplo de atividade:

Crie um método que receba um objeto Animal e verifique se ele pode ir à festa no céu (que só é para quem pode voar).
Se não puder voar, exiba a mensagem “Você precisa de uma carona!”.
Exemplo de código:
*/
public class CheckPresenca {

    public static void verificarPresenca(WhoCanFly.Animal animal){
        if (animal.podeVoar){
            System.out.println(animal.nome + " vai direto para a festa no céu!");
        }
        else{
            System.out.println(animal.nome + " Não pode voar, mas pode pedir uma carona!");
        }
    }

    public static void main(String[] args) {
        WhoCanFly.Animal jabuti = new WhoCanFly.Animal("jabuti",false);
        WhoCanFly.Animal garca = new WhoCanFly.Animal("garca", true);
        verificarPresenca(jabuti);
        verificarPresenca(garca);
    }
}
