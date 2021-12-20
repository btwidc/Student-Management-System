package by.kravchenko.student_management_system.model;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    private Long OOP;
    private Long CPA;
    private Long OS;

    public Long getId() {
        return id;
    }

    public Student() {

    }

    public Student(String firstName, String lastName, String email, Long OOP, Long CPA, Long OS) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.OOP = OOP;
        this.CPA = CPA;
        this.OS = OS;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getOOP() {
        return OOP;
    }

    public void setOOP(Long OOP) {
        this.OOP = OOP;
    }

    public Long getCPA() {
        return CPA;
    }

    public void setCPA(Long CPA) {
        this.CPA = CPA;
    }

    public Long getOS() {
        return OS;
    }

    public void setOS(Long OS) {
        this.OS = OS;
    }

}
