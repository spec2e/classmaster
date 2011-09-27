package controllers;

import play.mvc.With;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:33
 * To change this template use File | Settings | File Templates.
 */
@With(Secure.class)
@CRUD.For(models.Thread.class)
public class ThreadsController extends CRUD {
}
