package br.com.guilherme.ifgram.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.guilherme.ifgram.model.Post;

@Service
public class PostService {
    
    List<Post> db = new ArrayList<>();
    
    public Post criarPost(Post novoPost){
        db.add(novoPost);
        return novoPost;
    }

    public Collection<Post> listarPosts(){
        return db;
    }

    public Post buscarPost(String id){
        List<Post> postBuscado = db.stream().filter(p -> p.getId().equals(id)).toList();
        if(postBuscado.size() > 0){
            return postBuscado.getFirst();
        }
        System.out.println("Post não encontrado");
        return null;
        // throw new RuntimeException("Nenhum post encontrado com este id");
    }

    public void editarPost(String id, Post novoPost){
        db.stream().filter(p -> p.getId().equals(id)).forEach(p -> 
            {
                p.setTitulo(novoPost.getTitulo());
                p.setConteudo(novoPost.getConteudo());

            });
        
    }

    public void deletarPost(String id){
        List<Post> postBuscado = db.stream().filter(p -> p.getId().equals(id)).toList();
        if(postBuscado.size() > 0){
            db.remove(postBuscado.getFirst());
            System.out.println("Post removido com sucesso");
        }else{
            System.out.println("Post não encontrado");
        }
        
    }
}
