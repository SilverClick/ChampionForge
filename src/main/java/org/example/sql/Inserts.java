package org.example.sql;

import conect.Conection;
import org.example.data.*;

import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class Inserts {
    //Class with the insert methods of the database.
    Conection c = null;
    public Inserts(Conection c){
        this.c =c;
    }

    /**
     * Insert Player
     * @param player
     */

    //Method to connect to the database and insert a player.
    public void createPlayer(Players player){
        try
        {
            Connection conect = null;
            conect = c.getConnection();
            String sql = "insert into players (player_name,player_password,player_description,tournament_points,region_id) values (?,?,?,?,?)";
            PreparedStatement pst = conect.prepareStatement(sql);
            pst.setString(1, player.getPlayer_name());
            pst.setString(2,player.getPlayer_password());
            pst.setString(3,player.getPlayer_description());
            pst.setInt(4,player.getTournament_points());
            pst.setInt(5,player.getRegion_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            }
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Insert Tournament
     * @param tournament
     */

    //Method to connect to the database and insert a player.
    public void createTournament(Tournaments tournament){
        try
        {
            Connection conect = null;
            conect = c.getConnection();
            String sql = "insert into tournaments (tournament_name,tournament_description,tournament_size,group_stage,group_stage_size,tournament_points_req,looser_bracket,tournament_date,started,game_id,region_id) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conect.prepareStatement(sql);
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
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            }
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Insert Team
     * @param team
     */

    //Method to connect to the database and insert a player.
    public void createTeam(Teams team){
        try
        {
            Connection conect = null;
            conect = c.getConnection();
            String sql = "insert into teams (team_name,team_creation_date,team_description,team_points_req,game_id,region_id) values (?,?,?,?,?,?)";
            PreparedStatement pst = conect.prepareStatement(sql);
            pst.setString(1, team.getTeam_name());
            pst.setDate(2, team.getTeam_creation_date());
            pst.setString(3, team.getTeam_description());
            pst.setInt(4, team.getTeam_point_req());
            pst.setInt(5, team.getGame_id());
            pst.setInt(6, team.getRegion_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            }
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Insert Game
     * @param game
     */

    //Method to connect to the database and insert a game.
    public void createGame(Games game){
        try
        {
            Connection conect = null;
            conect = c.getConnection();
            String sql = "insert into games (game_name,game_description,team_size,team_max_size) values (?,?,?,?)";
            PreparedStatement pst = conect.prepareStatement(sql);
            pst.setString(1, game.getGame_name());
            pst.setString(2,game.getGame_description());
            pst.setInt(3,game.getTeam_size());
            pst.setInt(4,game.getTeam_max_size());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            }
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Insert Regions
     * @param region
     */

    //Method to connect to the database and insert a region.
    public void createRegion(Regions region){
        try
        {
            Connection conect = null;
            conect = c.getConnection();
            String sql = "insert into regions (region_name) values (?)";
            PreparedStatement pst = conect.prepareStatement(sql);
            pst.setString(1, region.getRegion_name());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            }
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Insert Roster
     * @param roster
     */

    //Method to connect to the database and insert a roster.
    public void createRoster(Roster roster){
        try
        {
            Connection conect = null;
            conect = c.getConnection();
            String sql = "insert into roster (join_date,left_date,team_id,player_id) values (?,?,?,?)";
            PreparedStatement pst = conect.prepareStatement(sql);
            pst.setString(1,roster.getJoin_date());
            pst.setString(2,roster.getLeft_date());
            pst.setInt(3,roster.getTeam_id());
            pst.setInt(4,roster.getPlayer_id());
            int n = pst.executeUpdate();
            if (n > 0)
            {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            }
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Insert Inscription
     * @param inscription
     */

    //Method to connect to the database and insert an inscription.
    public void createInscription(Inscription inscription) {
        try {
            Connection conect = null;
            conect = c.getConnection();
            String sql = "insert into inscription (String inscription_date, int tournament_id, int team_id) values (?,?,?)";
            PreparedStatement pst = conect.prepareStatement(sql);
            pst.setString(1, inscription.getInscription_date());
            pst.setInt(2, inscription.getTournament_id());
            pst.setInt(3, inscription.getTeam_id());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            }
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Create Match
     * @param match
     */

    //Method to connect to the database and insert a match.
    public void createMatch(Match match) {
        try {
            Connection conect = null;
            conect = c.getConnection();
            String sql = "insert into match (int team1_id, int team2_id, String result,int winner) values (?,?,?,?)";
            PreparedStatement pst = conect.prepareStatement(sql);
            pst.setInt(1, match.getTeam1_id());
            pst.setInt(2, match.getTeam2_id());
            pst.setString(3, match.getResult());
            pst.setInt(4, match.getWinner());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            }
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }

}
