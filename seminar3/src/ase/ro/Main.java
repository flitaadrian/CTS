package ase.ro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
    public static void Main(String[] args) {
        try {

          new Table().run();




        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
