package com.beyonder.userservice.service;

import com.beyonder.userservice.model.User;
import com.beyonder.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
   private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findFirstById(Long id) {
        return userRepository.findFirstById(id);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }
}
