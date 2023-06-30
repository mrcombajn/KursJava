package org.example.beans.daos.students;

import org.example.entities.Student;
import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student readStudent(Integer id);

    List<Student> getAllStudents();

    List<Student> findStudentByLastName(String lastName);

    boolean updateStudentFirstNameById(Integer id, String newName);

    void deleteStudent(Integer id);

    int deleteAllStudents();
}
