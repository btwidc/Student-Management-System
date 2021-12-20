package by.kravchenko.student_management_system.service;

import by.kravchenko.student_management_system.model.Student;
import by.kravchenko.student_management_system.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public  Student saveStudent(Student student){
        return studentRepository.save(student);
    }

}
