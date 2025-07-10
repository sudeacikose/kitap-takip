package com.kitap.kitaptakipsistemi.service;
import com.kitap.kitaptakipsistemi.entity.User;
import com.kitap.kitaptakipsistemi.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }
    public User save(User user) {
        return userRepository.save(user);
    }
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
