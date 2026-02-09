package org.example.module_8;

import java.sql.*;

public class ReadStudent {
    static final String DB_URL="jdbc:mysql://localhost/";
    static final String DB_NAME="college_db";
    static final String USERNAME="root";
    static final String PASSWORD="Faba@12_04";
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn= DriverManager.getConnection(DB_URL+DB_NAME,USERNAME,PASSWORD);
        Statement obj=conn.createStatement();
        String sqlQuery="select *from students";
        ResultSet data=obj.executeQuery(sqlQuery);
        while(data.next()){
            System.out.println(data.getInt("student_id")+" - "+data.getString("name")+" - "+data.getString("email")+" - "+data.getString("age")+" - "+data.getString("department"));

        }
        conn.close();

    }
}
