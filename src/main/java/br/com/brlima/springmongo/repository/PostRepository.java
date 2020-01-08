package br.com.brlima.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.brlima.springmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
