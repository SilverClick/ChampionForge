package org.example.mvc;

import com.sun.tools.javac.Main;
import org.example.ui.LogInFrame;
import org.example.ui.MainFrame;
import org.example.ui.PlayerCreationUI;
import org.example.ui.TournamentCreationUI;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class View {
    public void logIn(MainFrame frame){
        LogInFrame logInFrame = new LogInFrame(frame);
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

    public void signIn(MainFrame frame, String username, String password){
        PlayerCreationUI playerCreationUI = new PlayerCreationUI(frame);
        frame.jDesktopPane1.add(playerCreationUI);
        playerCreationUI.toFront();
        playerCreationUI.setLocation(frame.jDesktopPane1.getWidth() / 2 - playerCreationUI.getWidth() / 2, frame.jDesktopPane1.getHeight() / 2 - playerCreationUI.getHeight() / 2);
        try {
            playerCreationUI.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        playerCreationUI.pwdField.setText(password);
        playerCreationUI.userField.setText(username);
        playerCreationUI.setVisible(true);
    }

    public void createTournamentUI(MainFrame frame){
        TournamentCreationUI tournamentUI = new TournamentCreationUI();
        frame.jDesktopPane1.add(tournamentUI);
        tournamentUI.toFront();
        tournamentUI.setLocation(frame.jDesktopPane1.getWidth() / 2 - tournamentUI.getWidth() / 2, frame.jDesktopPane1.getHeight() / 2 - tournamentUI.getHeight() / 2);
        try {
            tournamentUI.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        tournamentUI.setVisible(true);
    }


}
