package com.dennis.api.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BoardRepository {
    private static BoardRepository instance;

    static {
        try {
            instance = new BoardRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static BoardRepository getInstance(){return instance;}

    public Connection connection;
    public BoardRepository() throws SQLException{
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/dennisdb",
                "root",
                "rootroot");
    }
    public String test(){return "BoardRepository 연결";}
}
