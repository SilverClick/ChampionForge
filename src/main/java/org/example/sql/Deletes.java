package org.example.sql;

import org.example.conection.Conection;
import org.example.data.*;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletes {
    Conection c = null;
    public Deletes(Conection c){
        this.c =c;
    }

    /**
     * Delete Player
     * @param player
     */

    //Method that connect to the database and delete a player.
    public void deletePlayer(Players player){
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "delete from players where player_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,player.getPlayer_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE");
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DATOS NO ELIMINADOS CORRECTAMENTE" + ex.getMessage());
        }
    }

    /**
     * Delete Tournament
     * @param tournament
     */

    //Method that connect to the database and delete a tournament.
    public void deleteTournament(Tournaments tournament){
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "delete from tournaments where tournament_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,tournament.getTournament_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE");
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DATOS NO ELIMINADOS CORRECTAMENTE" + ex.getMessage());
        }
    }

    /**
     * Delete Team
     * @param team
     */

    //Method that connect to the database and delete a team.
    public void deleteTeam(Teams team){
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "delete from teams where team_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,team.getTeam_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE");
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DATOS NO ELIMINADOS CORRECTAMENTE" + ex.getMessage());
        }
    }

    /**
     * Delete Inscription
     * @param inscription
     */

    //Method that connect to the database and delete a inscription.
    public void deleteInscription(Inscription inscription){
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "delete from inscription where inscription_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,inscription.getInscription_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE");
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DATOS NO ELIMINADOS CORRECTAMENTE" + ex.getMessage());
        }
    }

    /**
     * Delete Match
     * @param match
     */

    //Method that connect to the database and delete a match.
    public void deleteMatch(Match match){
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "delete from match where match_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,match.getMatch_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE");
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DATOS NO ELIMINADOS CORRECTAMENTE" + ex.getMessage());
        }
    }

    /**
     * Delete Roster
     * @param roster
     */

    //Method that connect to the database and delete a roster.
    public void deleteRoster(Roster roster){
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "delete from roster where roster_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,roster.getRoster_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE");
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DATOS NO ELIMINADOS CORRECTAMENTE" + ex.getMessage());
        }
    }

    /**
     * Delete Game
     * @param game
     */

    //Method that connect to the database and delete a game.
    public void deleteGame(Games game){
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "delete from games where game_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,game.getGame_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE");
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DATOS NO ELIMINADOS CORRECTAMENTE" + ex.getMessage());
        }
    }

    /**
     * Delete Region
     * @param region
     */

    //Method that connect to the database and delete a region.
    public void deleteRegion(Regions region){
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "delete from regions where region_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,region.getRegion_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE");
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DATOS NO ELIMINADOS CORRECTAMENTE" + ex.getMessage());
        }
    }
}
