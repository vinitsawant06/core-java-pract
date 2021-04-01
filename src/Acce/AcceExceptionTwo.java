package Acce;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class AcceExceptionTwo{
    public static void main(String[] args) {
        try {

            System.out.println("Stmt1");
            System.out.println("stmt2");
//            int a = 10/0;
            System.out.println("Stmt 4");
            throw new SQLException("SQL Exception");
        } catch ( SQLException sqlException) {
            System.out.println("stmt5");
            System.out.println(sqlException.getMessage());
        }
        System.out.println("Stmt6");
    }
}
