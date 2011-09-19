package models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 17-09-11
 * Time: 08:20
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Thread extends AbstractClassMasterModel {

    public Date startDate;
    public Date endDate;
    public boolean isClosed;

    @OneToMany
    public List<Message> messages;

    @Override
    public String toString() {
        return "Thread{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", isClosed=" + isClosed +
                ", messages=" + messages +
                '}';
    }
}
