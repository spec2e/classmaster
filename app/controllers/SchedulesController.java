package controllers;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */

import models.Schedule;
import play.mvc.With;

@With(Secure.class)
@CRUD.For(Schedule.class)
public class SchedulesController extends CRUD{
}
