package org.example;


import org.example.beans.daos.StudentDAO;
import org.example.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"org.example", "pl.additionalBeansToScan"})
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    public CommandLineRunner commandLineRunner (StudentDAO studentDAO) {
        return runner -> createStudent(studentDAO);
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating new object ...");
        Student tempStudent = new Student("Patryk", "Lukaszewski", "25");
        Student tempStudent2 = new Student("Maciej", "Kowalski", "29");
        Student tempStudent3 = new Student("Iwona", "Zablotna", "33");
        Student tempStudent4 = new Student("Krzysztof", "Krawczyk", "30");

        System.out.println("saving the student...");
        studentDAO.save(tempStudent);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);
        studentDAO.save(tempStudent4);

        System.out.println("saved Student" + tempStudent.getId());
        System.out.println("saved Student" + tempStudent2.getId());
        System.out.println("saved Student" + tempStudent3.getId());
        System.out.println("saved Student"+ tempStudent4.getId());
    }
}