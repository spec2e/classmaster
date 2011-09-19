package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 17-09-11
 * Time: 08:37
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Assignment extends AbstractClassMasterModel {

    @ManyToOne
    public Teacher teacher;
    @ManyToOne
    public Course course;
    public Date publish;
    public Date delivery;
    public Date extendedDelivery;
    public boolean closedForDelivery;
    @ManyToOne
    public Message message;
    @OneToMany
    public List<Homework> deliveredHomework;
    @OneToMany
    public List<Thread> thread;
    public boolean isDraft;

    @Override
    public String toString() {
        return "Assignment{" +
                "teacher=" + teacher +
                ", course=" + course +
                ", publish=" + publish +
                ", delivery=" + delivery +
                ", extendedDelivery=" + extendedDelivery +
                ", closedForDelivery=" + closedForDelivery +
                ", message=" + message +
                ", deliveredHomework=" + deliveredHomework +
                ", thread=" + thread +
                ", isDraft=" + isDraft +
                '}';
    }
}
