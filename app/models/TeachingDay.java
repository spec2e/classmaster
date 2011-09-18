package models;

import javax.persistence.Entity;
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
    public List<Teaching> teachings;
    public Message message;
    public boolean isCancelled;
    public boolean isAlternative;
    public List<Teaching> alternativeTeachings;


}
