package br.com.brlima.springmongo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.brlima.springmongo.domain.User;
import br.com.brlima.springmongo.services.UserService;

@Configuration
public class Instantiator implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        userService.deleteAll();

        userService.insert(//
                new User(null, "Maria Brown", "maria@gmail.com"), //
                new User(null, "Alex Green", "alex@gmail.com"), //
                new User(null, "Bob Grey", "bob@gmail.com"));
    }
}