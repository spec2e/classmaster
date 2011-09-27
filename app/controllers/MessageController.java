package controllers;

import models.Message;
import play.mvc.With;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 18-09-11
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */
@With(Secure.class)
@CRUD.For(Message.class)
public class MessageController extends CRUD {
}
