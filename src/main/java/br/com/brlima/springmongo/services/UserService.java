package br.com.brlima.springmongo.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brlima.springmongo.domain.User;
import br.com.brlima.springmongo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User insert(User user) {
        return repository.save(user);
    }

    public List<User> insert(User... users) {
        return repository.saveAll(Arrays.asList(users));
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
