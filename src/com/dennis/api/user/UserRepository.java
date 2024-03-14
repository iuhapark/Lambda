package com.dennis.api.user;

import com.dennis.api.enums.Messenger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static UserRepository instance;
    private PreparedStatement pstmt;

    static {
        try {
            instance = new UserRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection connection;
    public static UserRepository getInstance(){return instance;}
    public UserRepository() throws SQLException {
        connection = DriverManager.getConnection( // 다른 메소드에 있는 것을 연결할 때는 상단으로 빼준다.
                "jdbc:mysql://localhost:3306/dennisdb",
                "root",
                "rootroot");
    }
    public String test(){
        return "UserRepositoy connected.";
    }

    public List<User> findUsers() throws SQLException {
        String sql = "SELECT * FROM user";
        try (PreparedStatement pstmt = connection.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            List<User> users = new ArrayList<>();

            while (rs.next()) {
                System.out.printf("ID: %d\t Username: %s\t Password: %s\t" +
                                "name: %s\t phoneNumber: %s\t job: %s\t addressId: %s\n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9));
            }
            return users;
        }
    }

    public Messenger createTable() throws SQLException {
        String sql = "CREATE TABLE if not exists user(\n" +
                "  id INT NOT NULL AUTO_INCREMENT,\n" +
                "  username VARCHAR(20) NOT NULL,\n" +
                "  password VARCHAR(20) NOT NULL,\n" +
                "  name VARCHAR(20) NOT NULL,\n" +
                "  phoneNumber VARCHAR(20) NOT NULL,\n" +
                "  job VARCHAR(20) NOT NULL,\n" +
                "  height VARCHAR(20) NOT NULL,\n" +
                "  weight VARCHAR(20) NOT NULL,\n" +
                "  CONSTRAINT user_pk PRIMARY KEY(id)\n" +
                ");";
        pstmt = connection.prepareStatement(sql);
        return (pstmt.executeUpdate() == 0) ? Messenger.SUCCESS: Messenger.FAIL;
    }

    public String deleteTable() throws SQLException {
        String sql = "DROP TABLE com.dennis.api.user";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.executeUpdate();
            return "User table deleted successfully.";
        }
    }
}