package models;

import javax.persistence.Entity;
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

    public List<Course> courses;
    public List<Homework> deliveredHomework;
    public List<Homework> homework;



}
