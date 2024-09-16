package com.videohub.interfaces;

import com.videohub.dtos.UserDto;
import com.videohub.dtos.UserResponseDto;
import com.videohub.exceptions.UserAlreadyRegisterException;
import com.videohub.models.Role;
import com.videohub.models.User;
import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserDAO {
    User getById(Long id);
    User getRefById(Long id);
    User findByLogin(String login);
    User createUser(UserDto userForm);
    UserResponseDto editUser(Long id, UserDto userForm);
    User save(User user);
    UserResponseDto changePassword(Long id, String password);
    UserDetailsService userDetailsService();
}
