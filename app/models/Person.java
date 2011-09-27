package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 21:48
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Person extends AbstractClassMasterModel {

    public String firstName;
    public String lastName;
    public String email;
    public String mobile;
    public String userName;
    public String password;

    public static Person findByUserName(String userName) {
        return find("from Person p where p.userName = '" + userName + "'").first();
    }

}
