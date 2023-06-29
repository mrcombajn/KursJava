package org.example.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student")
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column (name = "first_name")
    private String firstName;

    @Column (name = "last_name")
    private String last_name;

    @Column (name = "email")
    private String email;

    public Student (String firstName, String last_name, String email) {
        this.firstName = firstName;
        this.last_name = last_name;
        this.email = email;
    }
}
