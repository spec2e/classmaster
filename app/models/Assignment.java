package models;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 17-09-11
 * Time: 08:37
 * To change this template use File | Settings | File Templates.
 */
public class Assignment extends AbstractClassMasterModel {

    public Teacher teacher;
    public Subject subject;
    public Date publish;
    public Date delivery;
    public Date extendedDelivery;
    public boolean closedForDelivery;
    public Message message;
    public List<Homework> deliveredHomework;
    public List<Thread> thread;
    public boolean isDraft;

}
