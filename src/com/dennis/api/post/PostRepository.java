package com.dennis.api.post;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostRepository {

    private final static PostRepository instance;

    static {
        try {
            instance = new PostRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection connection;

    public static PostRepository getInstance() {
        return instance;
    }

    public PostRepository() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/dennisdb",
                "root",
                "rootroot");
    }

    public String test() {
        return "PostsRepositoy connected";
    }

    public List findAll() throws SQLException {
        List<Post> ls = new ArrayList<>();
        String sql = "select * from com.dennis.api.board";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            do {
                ls.add(Post.builder()
                        .id(rs.getLong("id"))
                        .title(rs.getString("title"))
                        .content(rs.getString("content"))
                        .writer(rs.getString("writer"))
                        .registerDate(rs.getString("register_date"))
                        .build());
                rs.getInt("");
            } while (rs.next());
        } else {
            System.out.println("No Data.");
        }
        rs.close();
        pstmt.close();
        connection.close();

        return ls;


    }
}
