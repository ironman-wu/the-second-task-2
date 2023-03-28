package com.wu.lesson02;


import com.wu.lesson02.utils.jdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbctest {


    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = jdbcUtils.getConnection();
            st = conn.createStatement();

            String sql = "INSERT INTO school(id,`name`)" +
                    "VALUES(4,'黄五')";
                  int i=  st.executeUpdate(sql);
                  if(i>0){
                      System.out.println("插入成功");
                  }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            jdbcUtils.release(conn,st,rs);
        }

    }
}
