package festanoceu.entrada;
/*
Objetivo: Introduzir classes, objetos, atributos e construtores.
Exemplo de atividade:

Crie uma classe Animal com os atributos nome (String) e podeVoar (boolean). Instancie dois objetos:
um para o jabuti (que não pode voar) e outro para a garça (que pode voar).
*/
public class WhoCanFly {
    public static class Animal{
        String nome;
        boolean podeVoar;

        public Animal(String nome, boolean podeVoar) {
            this.nome = nome;
            this.podeVoar = podeVoar;
        }

        public void apresentar(){
            System.out.println("Oi, meu sou " + nome +". " + (podeVoar ? "eu posso voar!" : "eu não posso voar...."));
        }
    }

    public static void main(String[] args) {
        Animal jabuti  = new WhoCanFly.Animal("jabuti",false);
        Animal garca = new Animal("Garça",true);
        jabuti.apresentar();
        garca.apresentar();

    }

}
