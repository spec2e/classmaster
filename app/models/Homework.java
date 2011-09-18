package models;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 21:51
 * To change this template use File | Settings | File Templates.
 */
public class Homework extends AbstractClassMasterModel {

    public Student student;
    public Subject subject;
    public Document document;
    public Date deliveredOn;
    public int grade;
    public boolean isDeliveryExceeded;
    public boolean isRated;
    public Thread feedback;
}
