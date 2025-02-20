package festanoceu.entrada;

public class UberPet {
    public static void darCarona(WhoCanFly.Animal passageiro, WhoCanFly.Animal motorista){
        if (motorista.podeVoar){
            System.out.println(motorista.nome + " está dando carona para "+ passageiro.nome + "até a festa no céu!");
        } else{
            System.out.println("ops, "+ motorista.nome + " não pode voar e não pode dar carona");
        }
    }

    public static void main(String[] args) {
        WhoCanFly.Animal jabuti = new WhoCanFly.Animal("jabuti",false);
        WhoCanFly.Animal garca = new WhoCanFly.Animal("garça",true);
        darCarona(jabuti,jabuti);
        darCarona(jabuti,garca);

    }
}
