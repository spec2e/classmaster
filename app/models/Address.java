package models;

import javax.persistence.Entity;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 14-09-11
 * Time: 22:03
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Address extends AbstractClassMasterModel {

    public String line1;
    public String line2;
    public String line3;
    public String line4;
    public String line5;

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", line3='" + line3 + '\'' +
                ", line4='" + line4 + '\'' +
                ", line5='" + line5 + '\'' +
                '}';
    }
}
