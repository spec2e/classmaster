package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:12
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class TeachingDay extends AbstractClassMasterModel {

    public String day;

    @OneToMany
    public List<Teaching> teachings;

    public Message message;
    public boolean cancelled;
    public boolean alternative;

    @OneToMany
    public List<Teaching> alternativeTeachings;

    @Override
    public String toString() {
        return "TeachingDay{" +
                "day='" + day + '\'' +
                ", teachings=" + teachings +
                ", message=" + message +
                ", cancelled=" + cancelled +
                ", alternative=" + alternative +
                ", alternativeTeachings=" + alternativeTeachings +
                '}';
    }
}
