package org.example.conection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conection {

    private static Conection con = new Conection();
    Connection ccn = null;
    Statement st = null;

    /**
     * Database conection.
     */
    private Conection(){
        try
        {
            String rutafile = "db/db.accdb";
            String Url = "jdbc:ucanaccess://" + rutafile;
            ccn = DriverManager.getConnection(Url);
            st = ccn.createStatement();
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "CONEXION ERRONEA " + e);
        }
    }

    /**
     * @return Conection instance.
     */
    public static Conection getInstance(){
        return con;
    }

    /**
     * @return connection status.
     */
    public Connection getConnection(){
        return ccn;
    }


    /**
     * Database desconection and program exit.
     */
    public void Desconexion(){
        try
        {
            ccn.close();
            System.exit(0);
        } catch (SQLException ex)
        {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
