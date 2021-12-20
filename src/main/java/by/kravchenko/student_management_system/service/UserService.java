package by.kravchenko.student_management_system.service;

import by.kravchenko.student_management_system.model.User;
import by.kravchenko.student_management_system.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();
    User save(UserRegistrationDto registrationDto);
}
