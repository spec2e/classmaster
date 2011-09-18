package models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:05
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Course extends AbstractClassMasterModel {

    @ManyToMany(mappedBy = "courses")
    public List<Teacher> teachers;
    @ManyToMany(mappedBy = "courses")
    public List<Student> students;
    @OneToOne
    public Message description;

    @Override
    public String toString() {
        return "Course{" +
                "teachers=" + teachers +
                ", students=" + students +
                ", description=" + description +
                '}';
    }
}
