package br.festanoceu;

// Exception customizada para quando um animal que não pode voar tenta dar carona
public class NaoPodeVoarException extends Exception {

    public NaoPodeVoarException(String message) {
        super(message);
    }

}
