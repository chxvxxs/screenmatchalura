package br.com.alura.screenmatch.exceptions;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoException(String s) {
        this.mensagem = s;
    }
    @Override
    public String getMessage() {
        return mensagem;
    }
}
