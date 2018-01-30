package OCJP.chapter10;

import java.sql.*;

public class ResultSetExample {

    public static void main(String[] args) throws SQLException {



        String url = "jdbc:mysql://localhost:6603/zoo";
        try (Connection conn = DriverManager.getConnection(url, "root", "mypassword");
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("SELECT s.name,a.name,a.date_born from animal a,species s where a.species_id=s.id;");

            while(rs.next()){
                System.out.println("Animal name: " + rs.getString("a.name"));
                System.out.println("Species:" + rs.getString("s.name"));
                System.out.println("Date of birth: " + rs.getDate("date_born").toLocalDate());
                System.out.println();
            }
        }
    }
}
