package com.customerdash.customerdashbackend.service;

import com.customerdash.customerdashbackend.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}
