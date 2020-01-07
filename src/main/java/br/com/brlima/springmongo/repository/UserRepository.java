package br.com.brlima.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.brlima.springmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
