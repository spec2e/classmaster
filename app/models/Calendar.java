package models;

import play.db.jpa.Model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:24
 * To change this template use File | Settings | File Templates.
 */
public class Calendar extends Model {

    public List<TeachingDay> teachingDays;

}
