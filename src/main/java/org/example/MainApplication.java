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

    @Bean
    public CommandLineRunner commandLineRunner (StudentDAO studentDAO) {
        return runner -> createStudent(studentDAO);
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating new object ...");
        Student tempStudent = new Student("anna", "kowalska", "30");

        System.out.println("saving the student...");
        studentDAO.save(tempStudent);

        System.out.println("saved " + tempStudent.getId());
    }
}