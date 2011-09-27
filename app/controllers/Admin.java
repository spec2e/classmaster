package controllers;

import models.Person;
import play.mvc.Before;
import play.mvc.Controller;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 27-09-11
 * Time: 21:15
 * To change this template use File | Settings | File Templates.
 */
public class Admin extends Controller {

    @Before
    static void setConnectedUser() {
        if (Security.isConnected()) {
            Person user = Person.findByUserName(Security.connected());
            renderArgs.put("user", user.firstName);
        }
    }

    public static void index() {
        render();
    }

}
