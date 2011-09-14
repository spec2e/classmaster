package models;

import play.db.jpa.Model;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:17
 * To change this template use File | Settings | File Templates.
 */
public class Message extends Model {

    public String title;
    public String message;
    public Date showFrom;
    public Date showUntil;

    public boolean isDraft;
}
