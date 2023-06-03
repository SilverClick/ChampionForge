package org.example.sql;

import org.example.conection.*;
import org.example.data.*;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Updates {

    Conection c = null;
    public Updates(Conection c){
        this.c =c;
    }

    /**
     * Update Player
     * @param player
     */
    public void updatePlayer(Players player){
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "update players set player_name=?,player_password=?,player_description=?,tournament_points=?,region_id=? where player_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, player.getPlayer_name());
            pst.setString(2,player.getPlayer_password());
            pst.setString(3,player.getPlayer_description());
            pst.setInt(4,player.getTournament_points());
            pst.setInt(5,player.getRegion_id());
            pst.setInt(6,player.getPlayer_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");

            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Update Tournament
     * @param tournament
     */
    public void updateTournament(Tournaments tournament) {
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "update tournaments set tournament_name=?,tournament_description=?,tournament_size=?,group_stage=?,group_stage_size=?,tournamnt_points_req=?,looser_bracket=?,tournament_date=?,started=?,game_id=?,region_id=? where tournament_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tournament.getTournament_name());
            pst.setString(2,tournament.getTournament_description());
            pst.setInt(3,tournament.getTournament_size());
            pst.setBoolean(4,tournament.isGroup_stage());
            pst.setInt(5,tournament.getGroup_stage_size());
            pst.setInt(6, tournament.getTournament_points_req());
            pst.setBoolean(7,tournament.isLooser_bracket());
            pst.setString(8, tournament.getTournament_date());
            pst.setBoolean(9,tournament.isStarted());
            pst.setInt(10,tournament.getGame_id());
            pst.setInt(11,tournament.getRegion_id());
            pst.setInt(12,tournament.getTournament_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");

            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Update Team
     * @param team
     */
    public void updateTeam(Teams team){
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "update teams set team_name=?,team_creation_date=?,team_description=?,team_points_req=?,game_id=?,region_id=? where team_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, team.getTeam_name());
            pst.setDate(2, team.getTeam_creation_date());
            pst.setString(3, team.getTeam_description());
            pst.setInt(4, team.getTeam_point_req());
            pst.setInt(5, team.getGame_id());
            pst.setInt(6, team.getRegion_id());
            pst.setInt(7, team.getTeam_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");

            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Update Game
     * @param game
     */
    public void updateGame(Games game){
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "update games set game_name=?,game_description=?,team_size=?,team_max_size=? where game_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, game.getGame_name());
            pst.setString(2,game.getGame_description());
            pst.setInt(3,game.getTeam_size());
            pst.setInt(4,game.getTeam_max_size());
            pst.setInt(5,game.getGame_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");

            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Update Region
     * @param region
     */
    public void updateRegion(Regions region){
        try
        {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "update regions set region_name=? where region_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, region.getRegion_name());
            pst.setInt(2,region.getRegion_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");

            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Update Roster
     * @param roster
     */
    public void updateRoster(Roster roster) {
        try {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "update roster set join_date=?,left_date=?,team_id=?,player_id=? where roster_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, roster.getJoin_date());
            pst.setString(2, roster.getLeft_date());
            pst.setInt(3, roster.getTeam_id());
            pst.setInt(4, roster.getPlayer_id());
            pst.setInt(5, roster.getRoster_id());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");

            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Update Inscription
     * @param inscription
     */
        public void updateInscription(Inscription inscription) {
            try {
                Connection con = null;
                con = c.getConnection();
                Statement st = con.createStatement();
                String sql = "update inscription set inscription_date=?,tournament_id=?,team_id=? where inscription_id=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, inscription.getInscription_date());
                pst.setInt(2, inscription.getTournament_id());
                pst.setInt(3, inscription.getTeam_id());
                pst.setInt(4, inscription.getInscription_id());
                int n = pst.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");

                }
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }

    /**
     * Update Match
     * @param match
     */
    public void updateMatch(Match match) {
        try {
            Connection con = null;
            con = c.getConnection();
            Statement st = con.createStatement();
            String sql = "update match set team1_id=?,team2_id=?,result=?,winner=? where match_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, match.getTeam1_id());
            pst.setInt(2,  match.getTeam2_id());
            pst.setString(3,match.getResult());
            pst.setInt(4,match.getWinner());
            pst.setInt(5,match.getMatch_id());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");

            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "LOS DATOS NO HAN SIDO GUARDADOS CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


}
