package com.customerdash.customerdashbackend.service.implementation;

import com.customerdash.customerdashbackend.domain.User;
import com.customerdash.customerdashbackend.repository.UserRepository;
import com.customerdash.customerdashbackend.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Page<User> getUsers(String name, int page, int size) {
        log.info("Fetching user for page {} of size {}", page, size);
        return userRepository.findByNameContaining(
                name, PageRequest.of(page, size)
        );
    }
}
