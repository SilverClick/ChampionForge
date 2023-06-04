package org.example.sql;

import org.example.conection.Conection;
import org.example.data.*;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Query {
    //Class with the query methods of the database.
   Conection c=null;

   /**
    * @param c
     * Database connection.
*/
    public Query(Conection c) {
        this.c = c;
    }

    /**
     * Query Games
     * @return games
     */

    //Method that connect to the database and query the games.
    public ArrayList<Games> getGames() {
        ArrayList<Games> games = new ArrayList<Games>();
        Games game;
        try {
            Statement sentence = c.getConnection().createStatement();
            String sql = "select * from games;";
            sentence.execute(sql);
            ResultSet rs = sentence.executeQuery(sql);
            while (rs.next()) {
                game = new Games();
                game.setGame_id(rs.getInt("game_id"));
                game.setGame_name(rs.getString("game_name"));
                game.setGame_description(rs.getString("game_description"));
                game.setTeam_size(rs.getInt("team_size"));
                game.setTeam_max_size(rs.getInt("team_max_size"));
                games.add(game);


            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
        }
        return games;
    }

    /**
     *Query Inscriptions
     * @return inscriptions
     */

    //Method that connect to the database and query the inscriptions.
    public ArrayList<Inscription> getInscription() {
        ArrayList<Inscription> inscriptions = new ArrayList<Inscription>();
        Inscription inscription;
        try {
            Statement sentence = c.getConnection().createStatement();
            String sql = "select * from inscription;";
            sentence.execute(sql);
            ResultSet rs = sentence.executeQuery(sql);
            while (rs.next()) {
                inscription = new Inscription();
                inscription.setInscription_id(rs.getInt("inscription_id"));
                inscription.setInscription_date(rs.getString("inscription_date"));
                inscription.setTournament_id(rs.getInt("tournament_id"));
                inscription.setTeam_id(rs.getInt("team_id"));
                inscriptions.add(inscription);


            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
        }
        return inscriptions;
    }
    /**
     *Query Matches
     * @return matches
     */

    //Method that connect to the database and query the matches.
    public ArrayList<Match> getMatch() {
        ArrayList<Match> matches = new ArrayList<Match>();
        Match match;
        try {
            Statement sentence = c.getConnection().createStatement();
            String sql = "select * from match;";
            sentence.execute(sql);
            ResultSet rs = sentence.executeQuery(sql);
            while (rs.next()) {
                match = new Match();
                match.setMatch_id(rs.getInt("match_id"));
                match.setTeam1_id(rs.getInt("team1_id"));
                match.setTeam2_id(rs.getInt("team2_id"));
                match.setResult(rs.getString("result"));
                match.setWinner(rs.getInt("winner"));
                matches.add(match);


            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
        }
        return matches;
    }

    /**
     * Query Players
     * @return players
     */

    //Method that connect to the database and query the players.
        public ArrayList<Players> getPlayers() {
            ArrayList<Players> players = new ArrayList<Players>();
            Players player;
            try {
                Statement sentence = c.getConnection().createStatement();
                String sql = "select * from players;";
                sentence.execute(sql);
                ResultSet rs = sentence.executeQuery(sql);
                while (rs.next()) {
                    player= new Players();
                    player.setPlayer_id(rs.getInt("player_id"));
                    player.setPlayer_name(rs.getString("player_name"));
                    player.setPlayer_password(rs.getString("player_password"));
                    player.setPlayer_description(rs.getString("player_description"));
                    player.setTournament_points(rs.getInt("tournament_points"));
                    player.setRegion_id(rs.getInt("region_id"));
                    players.add(player);


                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
            }
            return players;
        }
    /**
     * Query Regions
     * @return regions
     */

    //Method that connect to the database and query the regions.
    public ArrayList<Regions> getRegions() {
        ArrayList<Regions> regions = new ArrayList<Regions>();
        Regions region;
        try {
            Statement sentence = c.getConnection().createStatement();
            String sql = "select * from regions;";
            sentence.execute(sql);
            ResultSet rs = sentence.executeQuery(sql);
            while (rs.next()) {
                region= new Regions();
                region.setRegion_id(rs.getInt("region_id"));
                region.setRegion_name(rs.getString("region_name"));
                regions.add(region);


            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
        }
        return regions;
    }
    /**
     *Query Rosters
     * @return rosters
     */

    //Method that connect to the database and query the rosters.
    public ArrayList<Roster> getRoster() {
        ArrayList<Roster> rosters = new ArrayList<Roster>();
        Roster roster;
        try {
            Statement sentence = c.getConnection().createStatement();
            String sql = "select * from roster;";
            sentence.execute(sql);
            ResultSet rs = sentence.executeQuery(sql);
            while (rs.next()) {
                roster= new Roster();
                roster.setRoster_id(rs.getInt("roster_id"));
                roster.setJoin_date(rs.getString("join_date"));
                roster.setLeft_date(rs.getString("left_date"));
                roster.setTeam_id(rs.getInt("team_id"));
                roster.setPlayer_id(rs.getInt("player_id"));
                rosters.add(roster);


            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
        }
        return rosters;
    }
    /**
     * Query Teams
     * @return teams
     */

    //Method that connect to the database and query the teams.
    public ArrayList<Teams> getTeams() {
        ArrayList<Teams> teams = new ArrayList<Teams>();
        Teams team;
        try {
            Statement sentence = c.getConnection().createStatement();
            String sql = "select * from teams;";
            sentence.execute(sql);
            ResultSet rs = sentence.executeQuery(sql);
            while (rs.next()) {
                team= new Teams();
                team.setTeam_id(rs.getInt("team_id"));
                team.setTeam_name(rs.getString("team_name"));
                team.setTeam_creation_date(rs.getDate("team_creation_date"));
               team.setTeam_description(rs.getString("team_description"));
               team.setTeam_point_req(rs.getInt("team_point_req"));
                team.setGame_id(rs.getInt("game_id"));
                team.setRegion_id(rs.getInt("region_id"));
                teams.add(team);


            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
        }
        return teams;
    }

    /**
     * Query Tournaments
     * @return
     */

    //Method that connect to the database and query the tournaments.
    public ArrayList<Tournaments> getTournaments() {
        ArrayList<Tournaments> tournaments = new ArrayList<Tournaments>();
        Tournaments tournament;
        try {
            Statement sentence = c.getConnection().createStatement();
            String sql = "select * from tournaments;";
            sentence.execute(sql);
            ResultSet rs = sentence.executeQuery(sql);
            while (rs.next()) {
                tournament = new Tournaments();
                tournament.setTournament_id(rs.getInt("tournament_id"));
                tournament.setTournament_name(rs.getString("tournament_name"));
                tournament.setTournament_description(rs.getString("tournament_description"));
                tournament.setTournament_size(rs.getInt("tournament_size"));
                tournament.setGroup_stage(rs.getBoolean("group_stage"));
                tournament.setGroup_stage_size(rs.getInt("group_stage_size"));
                tournament.setTournament_points_req(rs.getInt("tournament_points_req"));
                tournament.setLooser_bracket(rs.getBoolean("looser_bracket"));
                tournament.setTournament_date(rs.getString("tournament_date"));
                tournament.setStarted(rs.getBoolean("starte1d"));
                tournament.setGame_id(rs.getInt("game_id"));
                tournament.setRegion_id(rs.getInt("region_id"));
                tournaments.add(tournament);
            }
            } catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
            }
            return tournaments;
        }


     }



