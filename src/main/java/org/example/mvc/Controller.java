package org.example.mvc;

import conect.Conection;
import org.example.data.*;
import org.example.sql.Query;
import org.example.sql.Inserts;
import org.example.ui.MainFrame;

import javax.swing.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;

public class Controller {
    static Model myModel = new Model();
    static View myView = new View();
    static Conection C = Conection.getInstance();


    public static void main(String[] args) {
        OUpdate myObserver = new OUpdate();
        myModel.addObserver(myObserver);
    Controller c = new Controller();
        /*
        c.createAndInsertRegion(1,"EUW");
        c.createAndInsertPlayer(1,"Elyoya","yoya","Mejor jungla Español",200,1);
        //c.createAndInsertGame(1,"LEAGUE OF LEGENDS","No lo juegues, no es bueno pa la salud",5,7);
        c.createAndInsertTeam(1,"MAD LIONS",Date.valueOf(LocalDate.ofYearDay(2022,2)),"Son todos buenos menos Carzzy",100,1,1);
        */
        MainFrame.launch();
    }

    /**
     * Create And Insert Player
     *
     * @param player_id
     * @param player_name
     * @param player_password
     * @param player_description
     * @param tournament_points
     * @param region_id
     */
    public void createAndInsertPlayer(int player_id, String player_name, String player_password, String player_description, int tournament_points, int region_id) {
      myModel.createAndInsertPlayer(player_id, player_name, player_password, player_description, tournament_points, region_id);

    }

    /**
     * Create And Insert Tournament
     *
     * @param tournament_id
     * @param tournament_name
     * @param tournament_description
     * @param tournament_size
     * @param group_stage
     * @param group_stage_size
     * @param tournament_points_req
     * @param looser_bracket
     * @param tournament_date
     * @param started
     * @param game_id
     * @param region_id
     */

    public void createAndInsertTournament(int tournament_id, String tournament_name, String tournament_description, int tournament_size, boolean group_stage, int group_stage_size, int tournament_points_req, boolean looser_bracket, String tournament_date, boolean started, int game_id, int region_id) {
      myModel.createAndInsertTournament(tournament_id, tournament_name, tournament_description,
              tournament_size, group_stage, group_stage_size, tournament_points_req, looser_bracket,
              tournament_date, started, game_id, region_id);

    }

    /**
     * Create And Insert Region
     *
     * @param region_id
     * @param region_name
     */
    public void createAndInsertRegion(int region_id, String region_name) {
        myModel.createAndInsertRegion(region_id, region_name);
    }

    /**
     * Create And Insert Game
     *
     * @param game_id
     * @param game_name
     * @param game_description
     * @param team_size
     * @param team_max_size
     */
    public void createAndInsertGame(int game_id, String game_name, String game_description, int team_size, int team_max_size) {
       myModel.createAndInsertGame(game_id, game_name, game_description, team_size, team_max_size);
    }

    /**
     * Create And Insert Team
     *
     * @param team_id
     * @param team_name
     * @param team_creation_date
     * @param team_description
     * @param teams_points_req
     * @param game_id
     * @param region_id
     */
    public void createAndInsertTeam(int team_id, String team_name, String team_creation_date, String team_description, int teams_points_req, int game_id, int region_id) {
      myModel.createAndInsertTeam(team_id, team_name, team_creation_date, team_description, teams_points_req, game_id, region_id);
    }
    /**
     * Query Games
     * @param game_id
     * @return game
     */
    public  Games queryGames(int game_id) {
      Games game= myModel.queryGames(game_id);
      return game;
    }

    /**
     * Query Players
     * @param player_id
     * @return player
     */
    public Players queryPlayer(int player_id) {
        Players player= myModel.queryPlayer(player_id);
        return player;
    }
    /**
     * Query Region
     * @param region_id
     * @return region
     */
    public Regions queryRegion(int region_id) {
        Regions region= myModel.queryRegion(region_id);
        return region;
    }
    /**
     * Query Teams
     * @param team_id
     * @return team
     */
    public  Teams queryTeams(int team_id) {
        Teams team= myModel.queryTeams(team_id);
        return team;
    }
    /**
     * Query Tournament
     * @param tournament_id
     * @return tournament
     */
    public Tournaments queryTournament(int tournament_id) {
        Tournaments tournament= myModel.queryTournament(tournament_id);
        return tournament;
    }

    /**
     * LogIn UI launching
     * @param frame
     */
    public static void logIn(MainFrame frame){
        myView.closeUIs(frame);
        myView.logIn(frame);
    }

    /**
     * SignIn UI launching
     * @param frame
     * @param username
     * @param password
     */
    public static void signIn(MainFrame frame,String username,String password){
        myView.closeUIs(frame);
        myView.signIn(frame,username,password);
    }

    /**
     * Desconection and exit
     */
    public static void desconection(){
        if (JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?")==0)
        Conection.getInstance().Desconexion();
    }

    /**
     * Tournament creation UI
     * @param frame
     */
    public static void createTournament(MainFrame frame){
        myView.closeUIs(frame);
        myView.createTournamentUI(frame);
    }

}

