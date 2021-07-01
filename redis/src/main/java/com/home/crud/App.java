package com.home.crud;

import com.home.models.Usuario;

import java.sql.*;

public class App {

    private final String url = "jdbc:postgresql://localhost/BD2";
    private final String user = "postgres";
    private final String password = "aoa123";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void setUser(Usuario user){

        String SQL = "INSERT INTO usuario(id,nome,email)VALUES(?,?,?)";


        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL
                     /*Statement.RETURN_GENERATED_KEYS*/)) {

            pstmt.setInt(1,user.getId());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getEmail());

            int affectedRows = pstmt.executeUpdate();
            // check the affected rows
            /*if (affectedRows > 0) {
                // get the ID back
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getInt(1);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }*/
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        //return id;
    }

    public void getUsers() {

        String SQL = "SELECT id,email,nome  FROM usuario";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            displayUser(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    private void displayUser(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(rs.getInt("id") + "\t"
                    + rs.getString("nome") + "\t"
                    + rs.getString("email"));

        }
    }

//    public int getUserCount() {
//        String SQL = "SELECT count(*) FROM usuario";
//        int count = 0;
//
//        try (Connection conn = connect();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(SQL)) {
//            rs.next();
//            count = rs.getInt(1);
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        return count;
//    }

//    public void getUserByEmail(Usuario user) {
//        String SQL = "SELECT nome FROM usuario WHERE email = ?";
//
//        try (Connection conn = connect();
//             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
//
//            pstmt.setString(1, user.getEmail());
//            ResultSet rs = pstmt.executeQuery();
//            displayUser(rs);
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }

    public int updateEmail(int id, String email) {
        String SQL = "UPDATE usuario SET email = ? WHERE id = ?";

        int affectedrows = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setString(1, email);
            pstmt.setInt(2, id);

            affectedrows = pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }


    public int deleteUser(int id) {
        String SQL = "DELETE FROM usuario WHERE id = ?";

        int affectedrows = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, id);

            affectedrows = pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }
}
