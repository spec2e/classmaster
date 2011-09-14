package models;

import play.db.jpa.Model;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 21:51
 * To change this template use File | Settings | File Templates.
 */
public class Homework extends Model {

    public Document document;
    public Date deliveredOn;
    public Date dueDate;
    public int grade;
    public boolean isDeliveryExceeded;
    public boolean isRated;
    public boolean isDraft;


}
