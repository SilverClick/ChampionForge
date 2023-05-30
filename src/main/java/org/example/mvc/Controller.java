package org.example.mvc;

import org.example.conection.Conection;
import org.example.sql.Query;
import org.example.ui.MainFrame;

import javax.swing.*;

public class Controller {
    static Model myModel = new Model();
    static Conection C = Conection.getInstance();
    static Query miquery = new Query(C);
    static View myView = new View();

    public static void main(String[] args) {
            MainFrame.launch();
    }

    public static void desconection(){
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit")==0)
            Conection.getInstance().Desconexion();
    }
    public static void logIn(MainFrame frame){
        myView.logIn(frame);
    }
    public static void signIn(MainFrame frame,String username, String password){
        myView.signIn(frame,username,password);
    }
}
