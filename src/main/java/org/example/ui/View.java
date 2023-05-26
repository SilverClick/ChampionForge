package org.example.ui;

import com.sun.tools.javac.Main;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class View {
    public void logIn(MainFrame frame){
        LogInFrame logInFrame = new LogInFrame();
        frame.jDesktopPane1.add(logInFrame);
        logInFrame.toFront();
        logInFrame.setLocation(frame.jDesktopPane1.getWidth() / 2 - logInFrame.getWidth() / 2, frame.jDesktopPane1.getHeight() / 2 - logInFrame.getHeight() / 2);
        try {
            logInFrame.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        logInFrame.setVisible(true);
    }



}
