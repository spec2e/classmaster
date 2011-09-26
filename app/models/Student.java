package models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 21:46
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Student extends Person {

    @ManyToMany(mappedBy = "students", cascade = CascadeType.ALL)
    public List<Course> courses;
    @OneToMany
    public List<Homework> deliveredHomework;
    @OneToMany
    public List<Homework> homework;
    @ManyToOne
    public Address address;

    @Override
    public String toString() {
        return super.toString() + "\nStudent{" +
                "courses=" + courses +
                ", deliveredHomework=" + deliveredHomework +
                ", homework=" + homework +
                '}';
    }
}
