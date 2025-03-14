package exercices;

public class ImparOrPar {

    private int number;

    public ImparOrPar(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String CheckNumber(){
        String tipo = (number%2==0)?"par":"impar";
        String sinal = (number>=0)? "positivo":"negativo";
        return tipo+ " e " + sinal;
    }

    public static void main(String[] args) {
        ImparOrPar n = new ImparOrPar(-5);
        System.out.println(n.CheckNumber());
    }
}


