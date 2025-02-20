package javadojo.maratona;

public class A2TiposPrimitivos {
    public static void main(String[] args) {
        int[] age = new int[3];
        int[] age2={12,14,15,16};
        int[] age3 = new int[]{10,21,13};
        System.out.println(age[0]+age[1]);
        for (int i = 0; i<age2.length; i++){
            System.out.println(age2[i]);

        }
        for (int num:age2){
            System.out.println(num);
        }
    }
}
