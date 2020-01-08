package br.com.brlima.springmongo.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brlima.springmongo.domain.Post;
import br.com.brlima.springmongo.repository.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post insert(Post user) {
        return repository.save(user);
    }

    public List<Post> insert(Post... posts) {
        return repository.saveAll(Arrays.asList(posts));
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
