package by.kravchenko.student_management_system.controller;

import by.kravchenko.student_management_system.service.StudentService;
import by.kravchenko.student_management_system.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    private UserService usersService;

    public UsersController(UserService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", usersService.getAllUsers());
        return "users";
    }

}
