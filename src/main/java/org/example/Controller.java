package org.example;

import org.example.conection.Conection;
import org.example.ui.MainFrame;

import javax.swing.*;

public class Controller {
    public static void main(String[] args) {
        MainFrame.launch();
    }

    public static void desconection(){
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit")==0)
        Conection.getInstance().Desconexion();

    }


}