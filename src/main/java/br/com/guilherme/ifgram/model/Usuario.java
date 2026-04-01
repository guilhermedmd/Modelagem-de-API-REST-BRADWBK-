package br.com.guilherme.ifgram.model;

public class Usuario {
    private String nome, curso, biografia;

     public Usuario(String nome, String curso, String biografia) {
        this.nome = nome;
        this.curso = curso;
        this.biografia = biografia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    
}
