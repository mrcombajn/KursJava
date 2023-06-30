package org.example.beans.daos;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.example.entity.Student;
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


}
