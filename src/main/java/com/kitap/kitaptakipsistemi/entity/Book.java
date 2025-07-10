package com.kitap.kitaptakipsistemi.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import lombok.Setter;
@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    //Her kitap için benzersiz ID oluşması için kullanıldı
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    //Kitapların bir kullanıcıya ait olması için kullanıldı
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
