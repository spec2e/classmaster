package controllers;

import models.Person;
import play.mvc.Controller;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 27-09-11
 * Time: 20:54
 * To change this template use File | Settings | File Templates.
 */
public class Security extends Secure.Security {

    public static boolean authenticate(String username, String password) {

        Person person = Person.findByUserName(username);

        if(person != null && person.password.equals(password)) {
            return true;
        }

        return false;
    }
}
