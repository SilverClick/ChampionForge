package main.java.org.example.sql;

import org.example.conection.Conection;
import org.example.data.*;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class deletes {
    Conection c = null;
    public deletes(Conection c){
        this.c =c;
    }

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
