package com.shinki.athena.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User extends PanacheEntity {
    @Column(nullable = false)
    public String name;
    @Column(nullable = false, unique = true)
    public String email;
    @Column(nullable = false)
    public String password; // TODO: use Bcrypt

    @CreationTimestamp
    public LocalDateTime createdAt;

    public static User findByEmail(String email) {
        return find("email", email).firstResult();
    }


}
