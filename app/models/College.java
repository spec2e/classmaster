package models;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:02
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class College extends AbstractClassMasterModel {

    public String name;
    public Address address;
    public String phone;

    public List<Course> courses;
    public List<CollegeClass> classes;

}
