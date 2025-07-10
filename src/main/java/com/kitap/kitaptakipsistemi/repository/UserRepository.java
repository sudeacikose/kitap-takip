package com.kitap.kitaptakipsistemi.repository;
//veri tabanındaki kullanıcılar üzerinde işlem yapmak için kullanılır
//JpaRepository sayesinde hazır metotları kullanabiliyoruz
import com.kitap.kitaptakipsistemi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface UserRepository extends JpaRepository<User,Long>{

    Optional<User> findByUsername(String username);
}
