package org.example.mvc;

import org.example.data.*;

public class Model {

    /**
     * Create Games
     * @param game_id
     * @param game_name
     * @param game_description
     * @param team_size
     * @param team_max_size
     * @return aux
     */
    public Games createGame(  int game_id, String game_name,  String game_description,
                              int team_size,  int team_max_size){
        Games aux = new Games(  game_id,  game_name,   game_description,
                team_size, team_max_size);
        return aux;
    }
    /**
     * Create Player
     * @param player_id
     * @param player_name
     * @param player_password
     * @param player_description
     * @param tournament_points
     * @param region_id
     * @return aux
     */

    public Players createPlayer( int player_id, String player_name, String player_password, String player_description, int tournament_points, int region_id){
        Players aux = new Players(player_id, player_name,player_password, player_description,
                tournament_points, region_id);
        return aux;
    }



    /**
     * Create Regions
     * @param region_id
     * @param region_name
     * @return aux
     */
    public Regions createRegion( int region_id,String region_name){
        Regions aux = new Regions( region_id, region_name);
        return aux;
    }



    /**
     * Create Teams
     * @param team_id
     * @param team_name
     * @param team_creation_date
     * @param team_description
     * @param teams_points_req
     * @param game_id
     * @param region_id
     * @return aux
     */
    public Teams createTeam( int team_id, String team_name, String team_creation_date ,String team_description,int teams_points_req,
     int game_id, int region_id){
        Teams aux = new Teams( team_id,team_name, team_creation_date ,team_description,teams_points_req,
        game_id,  region_id);
        return aux;
    }
    /**
     * Create Tournaments
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
     * @return aux
     */

    public Tournaments createTournament(int tournament_id, String tournament_name, String tournament_description,
                                        int tournament_size, boolean group_stage, int group_stage_size, int tournament_points_req, boolean looser_bracket,
                                        String tournament_date,boolean started,int game_id, int region_id){
        Tournaments aux = new Tournaments(tournament_id, tournament_name, tournament_description,
                tournament_size,  group_stage,  group_stage_size,  tournament_points_req,  looser_bracket,
                tournament_date, started,game_id,  region_id);
        return aux;
    }
}
