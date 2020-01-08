package br.com.brlima.springmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.brlima.springmongo.domain.Post;
import br.com.brlima.springmongo.services.PostService;
import br.com.brlima.springmongo.util.URLUtils;

@RestController
@RequestMapping("/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping("/{id}")
    public ResponseEntity<Post> find(@PathVariable String id) {
        Post post = service.find(id);
        return ResponseEntity.ok().body(post);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
        List<Post> posts = service.findByTitle(URLUtils.decodeParam(text));
        return ResponseEntity.ok().body(posts);
    }
}