package com.vgames.backend.persistence.entities;

import jakarta.persistence.*;
import lombok.Builder;
import org.springframework.stereotype.Controller;

@Entity
@Builder
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
}
