package models;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 21:51
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Homework extends AbstractClassMasterModel {

    public Student student;
    public Course course;
    public Document document;
    public Date deliveredOn;
    public int grade;
    public boolean isDeliveryExceeded;
    public boolean isRated;
    public Thread feedback;

    @Override
    public String toString() {
        return "Homework{" +
                "student=" + student +
                ", course=" + course +
                ", document=" + document +
                ", deliveredOn=" + deliveredOn +
                ", grade=" + grade +
                ", isDeliveryExceeded=" + isDeliveryExceeded +
                ", isRated=" + isRated +
                ", feedback=" + feedback +
                '}';
    }
}
