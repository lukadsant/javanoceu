package javadojo.maratona.core.classes.test;

import javadojo.maratona.core.classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
                estudante.nome = "cafezaldo";
                estudante.idade = 21;
                estudante.sexo='M';
                System.out.println(estudante);
                System.out.println(estudante.nome);
                estudante.Seek(); 
    }
}
