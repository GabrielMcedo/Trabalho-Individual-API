package br.org.serratec.Trabalho.Individual.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import java.time.LocalDate;

@Embeddable
public class Publicacao {

    @NotBlank(message = "O autor é obrigatório")
    private String autor;

    @Past(message = "A data de publicação deve ser no passado")
    private LocalDate dataPublicacao;

    @NotBlank(message = "A editora é obrigatória")
    private String editora;

    // Getters e Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}