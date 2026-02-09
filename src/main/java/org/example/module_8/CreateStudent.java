package org.example.module_8;
import java.sql.*;
public class CreateStudent {
    static final String DB_URL="jdbc:mysql://localhost/";
    static final String DB_NAME="college_db";
    static final String USERNAME="root";
    static final String PASSWORD="Faba@12_04";

    public static void main(String[] args) throws SQLException{
        Connection conn=DriverManager.getConnection(DB_URL+DB_NAME,USERNAME,PASSWORD);

        Statement obj=conn.createStatement();
        String values="(5,'Joe','joe@gmail.com',35,'Customer services')";
        String sqlQuery="insert into students values "+values;
        int row=obj.executeUpdate(sqlQuery);
        if(row==1){
            System.out.println("Student record inserted");
        }
        conn.close();
    }
}
