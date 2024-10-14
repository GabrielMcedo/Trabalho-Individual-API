package br.org.serratec.Trabalho.Individual.exception;

public class ErroResposta {

    private String campo;
    private String mensagem;

    public ErroResposta(String campo, String mensagem) {
        this.campo = campo;
        this.mensagem = mensagem;
    }

    // Getters e Setters
    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
