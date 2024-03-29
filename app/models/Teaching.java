package models;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:12
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Teaching extends AbstractClassMasterModel {

    public Course course;
    public Date startTime;
    public Date endTime;
    public boolean isBreak;
    public Message message;

    @Override
    public String toString() {
        return "Teaching{" +
                "course=" + course +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", isBreak=" + isBreak +
                ", message=" + message +
                '}';
    }
}
