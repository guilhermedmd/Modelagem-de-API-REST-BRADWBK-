package br.com.guilherme.ifgram.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilherme.ifgram.Service.PostService;
import br.com.guilherme.ifgram.model.Post;

import java.util.Collection;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/post")
public class PostController {
    
    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/create")
    public ResponseEntity<Post> criarPost(@RequestBody Post novoPost) {
        postService.criarPost(novoPost);
        return ResponseEntity.ok(novoPost);
    }

    @GetMapping("/all")
    public Collection<Post> buscarPosts() {
        return postService.listarPosts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> buscarPostPorId(@PathVariable String id) {
        Post post = postService.buscarPost(id);
        return ResponseEntity.ok(post);
    }
    
    @PutMapping("edit/{id}")
    public void editarPost(@PathVariable String id, @RequestBody Post post) {
        postService.editarPost(id, post);
    }

    @DeleteMapping("/delete/{id}")
    public void deletarPost (@PathVariable String id){
        postService.deletarPost(id);
    }
    
    
}
