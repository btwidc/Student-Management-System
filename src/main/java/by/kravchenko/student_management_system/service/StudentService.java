package by.kravchenko.student_management_system.service;

import by.kravchenko.student_management_system.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
}
