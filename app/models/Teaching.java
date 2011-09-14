package models;

import play.db.jpa.Model;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:12
 * To change this template use File | Settings | File Templates.
 */
public class Teaching extends Model {

    public Course course;
    public Date startTime;
    public Date endTime;
    public boolean isBreak;
    public Message message;

}
