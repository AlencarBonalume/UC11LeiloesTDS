
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class conectaDAO {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public Connection connectDB() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:1433/uc11", "root","#Al3nc4r");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO " + erro.getMessage());
        } catch (ClassNotFoundException  erro) {
            JOptionPane.showMessageDialog(null, "Erro  " + erro.getMessage());
       
    }
     return conn;
    }

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:1433/uc11", "root","#Al3nc4r");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }

    }
}
