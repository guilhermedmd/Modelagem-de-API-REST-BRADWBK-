package br.com.guilherme.ifgram.model;

import java.util.Map;


public class Post {
    private String id; 
    private String titulo, conteudo;
    private Usuario usuario;
    private Map<String, String> comentarios;

    public Post(String id, String titulo, String conteudo, Usuario usuario, Map<String, String> comentarios) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.usuario = usuario;
        this.comentarios = comentarios;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Map<String, String> getComentarios() {
        return comentarios;
    }
    public void setComentarios(Map<String, String> comentarios) {
        this.comentarios = comentarios;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    
    




}
