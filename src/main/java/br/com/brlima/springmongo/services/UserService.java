package br.com.brlima.springmongo.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brlima.springmongo.domain.User;
import br.com.brlima.springmongo.dto.UserDTO;
import br.com.brlima.springmongo.repository.UserRepository;
import br.com.brlima.springmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User find(String id) {
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("User não encontrado"));
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User insert(User user) {
        return repository.save(user);
    }

    public List<User> insert(User... users) {
        return repository.saveAll(Arrays.asList(users));
    }

    public void delete(String id) {
        User user = this.find(id);
        repository.delete(user);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public User fromDTO(UserDTO dto) {
        return new User(dto.getId(), dto.getName(), dto.getEmail());
    }
}
