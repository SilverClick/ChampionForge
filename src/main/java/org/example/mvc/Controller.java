package org.example.mvc;

import org.example.conection.Conection;
import org.example.data.*;
import org.example.sql.Query;
import org.example.sql.inserts;

public class Controller {
    static Model myModel = new Model();
    static View myView = new View();
    static Conection C=     Conection.getInstance();
    static Query myQuery = new Query(C);
    static inserts myInserts=new inserts(C);

    public static void main(String[] args) {


}

    /**
     * Create And Insert Player
     * @param player_id
     * @param player_name
     * @param player_password
     * @param player_description
     * @param tournament_points
     * @param region_id
     */
    public void createAndInsertPlayer(int player_id, String player_name, String player_password, String player_description, int tournament_points, int region_id) {
        Players player =myModel.createPlayer(player_id, player_name,player_password, player_description, tournament_points, region_id);
        myInserts.createPlayer(player);
    }

    /**
     * Create And Insert Tournament
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
    public void createAndInsertTournament(int tournament_id, String tournament_name, String tournament_description, int tournament_size, boolean group_stage, int group_stage_size, int tournament_points_req, boolean looser_bracket, String tournament_date,boolean started,int game_id, int region_id) {
        Tournaments tournament = myModel.createTournament(tournament_id, tournament_name, tournament_description,
                tournament_size, group_stage, group_stage_size, tournament_points_req, looser_bracket,
                tournament_date, started, game_id, region_id);
        myInserts.createTournament(tournament);

    }

    /**
     * Create And Insert Region
     * @param region_id
     * @param region_name
     */
    public void createAndInsertRegion(int region_id, String region_name){
        Regions region = myModel.createRegion( region_id, region_name);
      myInserts.createRegion(region);
    }

    /**
     * Create And Insert Game
     * @param game_id
     * @param game_name
     * @param game_description
     * @param team_size
     * @param team_max_size
     */
    public void createAndInsertGame(int game_id, String game_name,  String game_description, int team_size,  int team_max_size) {
        Games game =myModel.createGame( game_id,  game_name,   game_description, team_size, team_max_size);
        myInserts.createGame(game);
    }

    /**
     * Create And Insert Team
     * @param team_id
     * @param team_name
     * @param team_creation_date
     * @param team_description
     * @param teams_points_req
     * @param game_id
     * @param region_id
     */
    public void createAndInsertTeam(int team_id, String team_name, String team_creation_date , String team_description, int teams_points_req, int game_id, int region_id){
        Teams team = myModel.createTeam( team_id,team_name, team_creation_date ,team_description,teams_points_req, game_id,  region_id);
       myInserts.createTeam(team);
    }


}
