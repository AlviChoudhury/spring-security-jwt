package com.alvi.spring_securiy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Users {

    @Id
    private int id;
    private String username;
    private String password;
}
