package models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:23
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class CollegeClass extends AbstractClassMasterModel {

    @OneToOne
    public Schedule schedule;
    @OneToMany
    public List<Student> students;
    @OneToMany
    public List<Teacher> teachers;
    @OneToOne
    public CollegeClassDashBoard classBoard;

    @Override
    public String toString() {
        return "CollegeClass{" +
                "schedule=" + schedule +
                ", students=" + students +
                ", teachers=" + teachers +
                ", classBoard=" + classBoard +
                '}';
    }
}
