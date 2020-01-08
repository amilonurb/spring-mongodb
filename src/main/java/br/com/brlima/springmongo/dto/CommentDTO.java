package br.com.brlima.springmongo.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CommentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String text;

    private LocalDate date;

    private AuthorDTO author;
}