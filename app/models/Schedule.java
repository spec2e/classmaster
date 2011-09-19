package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:10
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Schedule extends AbstractClassMasterModel {

    @OneToMany
    public List<TeachingDay> teachingDays;

    @Override
    public String toString() {
        return "Schedule{" +
                "teachingDays=" + teachingDays +
                '}';
    }
}
