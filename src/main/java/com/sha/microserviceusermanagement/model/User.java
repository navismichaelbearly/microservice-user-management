package com.sha.microserviceusermanagement.model;

import lombok.Data;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name="user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Enumerated(value = EnumType.STRING)
    @Column(name="role")
    private Role role;
}
