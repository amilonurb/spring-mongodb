package br.com.brlima.springmongo.dto;

import java.io.Serializable;

import br.com.brlima.springmongo.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    public AuthorDTO(User author) {
        this.id = author.getId();
        this.name = author.getName();
    }
}