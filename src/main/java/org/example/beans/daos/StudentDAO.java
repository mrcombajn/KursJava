package org.example.beans.daos;

import org.example.entity.Student;
import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student readStudent(Integer id);

    List<Student> getAllStudents();

    List<Student> findStudentByLastName(String lastName);
}
