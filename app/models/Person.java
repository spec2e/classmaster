package models;

import javax.persistence.Entity;

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
}
