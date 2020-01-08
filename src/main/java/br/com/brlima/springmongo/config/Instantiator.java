package br.com.brlima.springmongo.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.brlima.springmongo.domain.Post;
import br.com.brlima.springmongo.domain.User;
import br.com.brlima.springmongo.dto.AuthorDTO;
import br.com.brlima.springmongo.services.PostService;
import br.com.brlima.springmongo.services.UserService;

@Configuration
public class Instantiator implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @Override
    public void run(String... args) throws Exception {
        userService.deleteAll();
        postService.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");
        userService.insert(maria, alex, bob);

        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        postService.insert(//
                new Post(null, LocalDate.parse("21/03/2018", formatter), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", new AuthorDTO(maria)), //
                new Post(null, LocalDate.parse("23/03/2018", formatter), "Bom dia", "Acordei feliz hoje!", new AuthorDTO(maria)));
    }
}