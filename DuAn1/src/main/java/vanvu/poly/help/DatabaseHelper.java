/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanvu.poly.help;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author NGUYEN VAN VU
 */
public class DatabaseHelper {

    public static Connection openConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost;database=DuAn1;"
                + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
        String ussername = "sa";
        String password = "songlong";
        Connection con = (Connection) DriverManager.getConnection(connectionUrl, ussername, password);
        return con;
    }
}
