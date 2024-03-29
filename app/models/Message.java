package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:17
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Message extends AbstractClassMasterModel {

    @ManyToOne
    public Person author;
    public String title;
    public String message;
    public Date showFrom;
    public Date showUntil;

    public boolean draft;

    @Override
    public String toString() {
        return "Message{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", showFrom=" + showFrom +
                ", showUntil=" + showUntil +
                ", draft=" + draft +
                '}';
    }
}
