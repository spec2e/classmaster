package models;

import javax.persistence.Entity;
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

    public Schedule schedule;
    public List<Student> students;
    public List<Teacher> teachers;
    public CollegeClassDashBoard classBoard;

}
