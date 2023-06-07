package org.example.mvc;

import com.sun.tools.javac.Main;
import org.example.data.Players;
import org.example.data.Teams;
import org.example.data.Tournaments;
import org.example.ui.*;

import javax.swing.*;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
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
        TournamentCreationUI tournamentUI = new TournamentCreationUI(frame);
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

    public void closeUIs(MainFrame frame) {
        for (JInternalFrame allFrame : frame.jDesktopPane1.getAllFrames()) {
            allFrame.dispose();
        }
    }

    public void logged(MainFrame frame, boolean logged) {
        if (logged) {
            frame.players.setEnabled(true);
            frame.tournament.setEnabled(true);
            frame.teams.setEnabled(true);
        }else {
            frame.players.setEnabled(false);
            frame.tournament.setEnabled(false);
            frame.teams.setEnabled(false);
        }

    }

    public void playerProfile(MainFrame frame, Players player){
        PlayerProfile playerProfile = new PlayerProfile(player);
        frame.jDesktopPane1.add(playerProfile);
        playerProfile.toFront();
        playerProfile.setLocation(frame.jDesktopPane1.getWidth() / 2 - playerProfile.getWidth() / 2, frame.jDesktopPane1.getHeight() / 2 - playerProfile.getHeight() / 2);
        try {
            playerProfile.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        playerProfile.setVisible(true);
    }

    public void playerView(MainFrame frame, ArrayList<Players> players){
        PlayerViewUI playerView = new PlayerViewUI(frame,players);
        frame.jDesktopPane1.add(playerView);
        playerView.toFront();
        playerView.setLocation(frame.jDesktopPane1.getWidth() / 2 - playerView.getWidth() / 2, frame.jDesktopPane1.getHeight() / 2 - playerView.getHeight() / 2);
        try {
            playerView.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        playerView.setVisible(true);
    }

    public void teamCreation(MainFrame frame){
        TeamCreationUI teamCreationUI = new TeamCreationUI(frame);
        frame.jDesktopPane1.add(teamCreationUI);
        teamCreationUI.toFront();
        teamCreationUI.setLocation(frame.jDesktopPane1.getWidth() / 2 - teamCreationUI.getWidth() / 2, frame.jDesktopPane1.getHeight() / 2 - teamCreationUI.getHeight() / 2);
        try {
            teamCreationUI.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        teamCreationUI.setVisible(true);
    }

    public void teamProfile(MainFrame frame, Teams team,ArrayList<Players> players){
        TeamProfile teamProfile = new TeamProfile(frame,team,players);
        frame.jDesktopPane1.add(teamProfile);
        teamProfile.toFront();
        teamProfile.setLocation(frame.jDesktopPane1.getWidth() / 2 - teamProfile.getWidth() / 2, frame.jDesktopPane1.getHeight() / 2 - teamProfile.getHeight() / 2);
        try {
            teamProfile.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        teamProfile.setVisible(true);
    }

    public void teamView(MainFrame frame, ArrayList<Teams> team, boolean select,Tournaments tournaments){
        TeamViewUI teamViewUI = new TeamViewUI(frame,team, select,tournaments);
        frame.jDesktopPane1.add(teamViewUI);
        teamViewUI.toFront();
        teamViewUI.setLocation(frame.jDesktopPane1.getWidth() / 2 - teamViewUI.getWidth() / 2, frame.jDesktopPane1.getHeight() / 2 - teamViewUI.getHeight() / 2);
        try {
            teamViewUI.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        teamViewUI.setVisible(true);
    }
    public void tournamentView(MainFrame frame, ArrayList<Tournaments> tournaments){
        TournamentViewUI tournamentViewUI = new TournamentViewUI(frame,tournaments);
        frame.jDesktopPane1.add(tournamentViewUI);
        tournamentViewUI.toFront();
        tournamentViewUI.setLocation(frame.jDesktopPane1.getWidth() / 2 - tournamentViewUI.getWidth() / 2, frame.jDesktopPane1.getHeight() / 2 - tournamentViewUI.getHeight() / 2);
        try {
            tournamentViewUI.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        tournamentViewUI.setVisible(true);
    }

    public void tournamentCreation(MainFrame frame){
        TournamentCreationUI tournamentCreationUI = new TournamentCreationUI(frame);
        frame.jDesktopPane1.add(tournamentCreationUI);
        tournamentCreationUI.toFront();
        tournamentCreationUI.setLocation(frame.jDesktopPane1.getWidth() / 2 - tournamentCreationUI.getWidth() / 2, frame.jDesktopPane1.getHeight() / 2 - tournamentCreationUI.getHeight() / 2);
        try {
            tournamentCreationUI.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        tournamentCreationUI.setVisible(true);
    }

    public void tournamentProfile(MainFrame frame, Tournaments tournament){
        TournamentProfile tournamentProfile = new TournamentProfile(frame,tournament);
        frame.jDesktopPane1.add(tournamentProfile);
        tournamentProfile.toFront();
        tournamentProfile.setLocation(frame.jDesktopPane1.getWidth() / 2 - tournamentProfile.getWidth() / 2, frame.jDesktopPane1.getHeight() / 2 - tournamentProfile.getHeight() / 2);
        try {
            tournamentProfile.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        tournamentProfile.setVisible(true);
    }

}
