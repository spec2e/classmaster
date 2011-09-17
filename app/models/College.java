package models;

import play.db.jpa.Model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:02
 * To change this template use File | Settings | File Templates.
 */
public class College extends AbstractClassMasterModel {

    public Address address;
    public String phone;

    public List<Course> courses;
}
