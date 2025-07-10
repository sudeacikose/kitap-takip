package com.kitap.kitaptakipsistemi.entity;
//User tablosu veritabanında kullanıcıları tutucak
//Her kullanıcının id,username,password bilgisi olucak
import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    id;
    @Column(nullable = true)
    private String username;
    @Column(nullable=false)
    private String password;


}
