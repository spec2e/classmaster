package models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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

    @ManyToMany
    public List<Course> courses;
    @OneToMany
    public List<Homework> deliveredHomework;
    @OneToMany
    public List<Homework> homework;



}
