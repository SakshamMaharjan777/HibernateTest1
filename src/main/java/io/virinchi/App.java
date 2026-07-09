package io.virinchi;

import io.virinchi.model.AddressClass;
import io.virinchi.model.PhoneClass;
import io.virinchi.model.UserClass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{

    //JPA- Java persistence API
    //JPA enables a java project to map
    //class objects to database tables
    //model class attributes = table columns
    //model class name= table name
    //hibernate framework utilizes the JPA API

    public static void main( String[] args )
    {


        //session create garera database ma hibernate ko through table ni banaunu paryo data ni pathaunu paryo
        //session banauxa session factory le

        SessionFactory sf= new Configuration().configure().buildSessionFactory();
        //session factory bata configurational settings taneko
        Session session=sf.openSession();
        //ek session ma multiple hibernate transaction huna sakxa tyo open gareko

        UserClass uc = new UserClass();
        //model ko class jun aba table bancha tesko column ko data rakheko
        uc.setName("john");
        UserClass uc2= new UserClass();
        uc2.setName("Jane");

        PhoneClass ph = new PhoneClass();
        ph.setPhoneNo("1234567890");
        ph.setUserClass(uc);

        AddressClass ad = new AddressClass();
        ad.setAddressName("Kathmandu");
        ad.setUserClass(Arrays.asList(uc,uc2));

        uc.setAddressClass(ad);
        uc2.setAddressClass(ad);


        session.persist(ph);

        session.persist(uc);

        session.persist(ad);

        session.persist(uc2);
        //session.persist bhneko yo session ma hamro moddel ko class ko table bannu paryo
        //or baneko table ma data basnu paryo
        //persist le data rakhna help garxa(save bhneko jasto ho)
        session.beginTransaction().commit();
        //commit le kaam suru garcha
        session.close();

    }
}
