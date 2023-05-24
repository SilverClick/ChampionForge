package mvc;

import org.example.data.*;

public class Model {

    public Players createPlayer( int player_id, String player_name, String player_password, String player_description,
     int tournament_points, int region_id){
        Players aux = new Players(player_id, player_name,player_password, player_description,
        tournament_points, region_id);
        return aux;
    }

    public Tournaments createTournament(int tournament_id, String tournament_name, String tournament_description,
     int tournament_size, boolean group_stage, int group_stage_size, int tournament_points_req, boolean looser_bracket,
     String tournament_date,int game_id, int region_id){
       Tournaments aux = new Tournaments(tournament_id, tournament_name, tournament_description,
       tournament_size,  group_stage,  group_stage_size,  tournament_points_req,  looser_bracket,
        tournament_date, game_id,  region_id);
        return aux;
    }
    public Regions createRegion( int region_id,String region_name){
        Regions aux = new Regions( region_id, region_name);
        return aux;
    }

    public Games createGame(  int game_id, String game_name,  String game_description,
   int team_size,  int team_max_size){
        Games aux = new Games(  game_id,  game_name,   game_description,
       team_size, team_max_size);
        return aux;
    }
    public Teams createTeam( int team_id, String team_name, String team_creation_date ,String team_description,
     int game_id, int region_id){
        Teams aux = new Teams( team_id,team_name, team_creation_date ,team_description,
        game_id,  region_id);
        return aux;
    }
}
