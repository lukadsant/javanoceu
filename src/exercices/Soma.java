package exercices;

public class Soma {

    private int numeroA;
    private int numeroB;
    private int numeroC;

    public Soma(int numeroA, int numeroB, int numeroC) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
        this.numeroC = numeroC;
    }

    public int getSoma() {
        return numeroA+numeroB;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public boolean getMenor() {
        return getSoma()<getNumeroC();
    }

    public String getResultado(){
        return "soma: "+getSoma()+"\nCheck é menor que "+getNumeroC()+"? "+getMenor();
    }

    public static void main(String[] args) {
        Soma obj = new Soma(1,2,3);
        System.out.println(obj.getResultado());
    }
}
