package by.kravchenko.student_management_system.service;

import by.kravchenko.student_management_system.model.User;
import by.kravchenko.student_management_system.web.dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto registrationDto);

}
