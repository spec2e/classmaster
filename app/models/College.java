package models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    @OneToOne
    public Address address;
    public String phone;

    @OneToMany
    public List<Course> courses;
    @OneToMany
    public List<CollegeClass> classes;

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", courses=" + courses +
                ", classes=" + classes +
                '}';
    }
}
