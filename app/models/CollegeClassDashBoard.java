package models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:20
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class CollegeClassDashBoard extends AbstractClassMasterModel {

    public CollegeClass collegeClass;
    @OneToMany
    public List<Thread> threads;

    @Override
    public String toString() {
        return "CollegeClassDashBoard{" +
                "collegeClass=" + collegeClass +
                ", threads=" + threads +
                '}';
    }
}
