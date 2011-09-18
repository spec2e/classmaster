package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 21:48
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person extends Model {
    public String firstName;
    public String lastName;
    public String email;
    public String mobile;
    public String userName;
    public String password;
    public boolean active;
    public boolean deleted;
}
