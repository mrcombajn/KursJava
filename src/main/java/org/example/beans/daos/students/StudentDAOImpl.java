package org.example.beans.daos.students;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.example.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private final EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student readStudent(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> getAllStudents() {
        return entityManager.createQuery("FROM Student", Student.class).getResultList();
    }

    @Override
    public List<Student> findStudentByLastName(String lastName) {
        return entityManager
                .createQuery("FROM Student WHERE last_name=:lastName", Student.class)
                .setParameter("lastName", lastName)
                .getResultList();
    }


    // important - set @Transactional because we're updating table record
    @Override
    @Transactional
    public boolean updateStudentFirstNameById(Integer id, String newName) {
        Student student = entityManager.find(Student.class, id);

        if (student == null)
            return false;

        student.setFirstName(newName);
        entityManager.merge(student);
        return true;
    }

    @Override
    @Transactional
    public void deleteStudent(Integer id) throws NullPointerException{
        Student student = readStudent(id);
        if (student == null)
            throw new NullPointerException("Student is null");

        entityManager.remove(student);
    }

    @Override
    @Transactional
    public int deleteAllStudents() {
        return entityManager.createQuery("DELETE FROM Student").executeUpdate();
    }


}
