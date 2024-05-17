package org.example.singleton;

import static org.example.singleton.Connection.INSTANCE;
import static org.example.singleton.Connection.INSTANCE2;

public class SingletonService {
    public static void main(String[] args) {
        Connection connection = INSTANCE;
        Connection con = INSTANCE;
        Connection con2 = INSTANCE2;
        connection.addQuery("query2");
        System.out.println(connection.displayQuery());
        System.out.println(con.displayQuery());
        System.out.println(con2.displayQuery());
        System.out.println(connection.hashCode()==con.hashCode());
        System.out.println(connection.hashCode()==con2.hashCode());
        //System.out.println(con);
    }
}
