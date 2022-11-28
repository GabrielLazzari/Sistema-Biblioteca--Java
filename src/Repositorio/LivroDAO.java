
package Repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class LivroDAO {
    private Connection getConnection() {
        Connection connection = null;
        try {
                String url = "jdbc:sqlite:bancoDados.db";
                connection = DriverManager.getConnection(url);
        }catch (SQLException e) {
                e.printStackTrace();
        }catch (Exception e)  {
                e.printStackTrace();
        }
        return connection;
    }
}
