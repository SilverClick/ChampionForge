package org.example.mvc;

import org.example.conection.Conection;
import org.example.data.*;
import org.example.sql.Deletes;
import org.example.sql.Query;
import org.example.sql.Inserts;
import org.example.sql.Updates;

import java.util.ArrayList;

public class Controller {
    static Model myModel = new Model();
    static View myView = new View();
    static Conection C = Conection.getInstance();
    static Query myQuery = new Query(C);
    static Deletes myDeletes = new Deletes(C);
    static Updates myUpdates = new Updates(C);
    static Inserts myInserts = new Inserts(C);

    public static void main(String[] args) {
    Controller c = new Controller();
    c.createAndInsertRegion(1,"EUW");
    c.createAndInsertPlayer(1,"Elyoya","yoya","Mejor jungla Español",200,1);
   // c.createAndInsertGame(1,"LEAGUE OF LEGENDS","No lo juegues, no es bueno pa la salud",5,7);
    c.createAndInsertTeam(1,"MAD LIONS","07/08/2017","Son todos buenos menos Carzzy",100,1,1);
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
        Players player = myModel.createPlayer(player_id, player_name, player_password, player_description, tournament_points, region_id);
        myInserts.createPlayer(player);
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
        Tournaments tournament = myModel.createTournament(tournament_id, tournament_name, tournament_description,
                tournament_size, group_stage, group_stage_size, tournament_points_req, looser_bracket,
                tournament_date, started, game_id, region_id);
        myInserts.createTournament(tournament);

    }

    /**
     * Create And Insert Region
     *
     * @param region_id
     * @param region_name
     */
    public void createAndInsertRegion(int region_id, String region_name) {
        Regions region = myModel.createRegion(region_id, region_name);
        myInserts.createRegion(region);
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
        Games game = myModel.createGame(game_id, game_name, game_description, team_size, team_max_size);
        myInserts.createGame(game);
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
        Teams team = myModel.createTeam(team_id, team_name, team_creation_date, team_description, teams_points_req, game_id, region_id);
        myInserts.createTeam(team);
    }
    /**
     * Query Games
     * @param game_id
     * @return game
     */
    public  Games queryGames(int game_id) {
        ArrayList<Games> games = myQuery.getGames();
        for ( Games game : games) {
            if (game_id == game.getGame_id()) {
                return game;
            }
        }
        return null;
    }

    /**
     * Query Players
     * @param player_id
     * @return player
     */
    public Players queryPlayer(int player_id) {
        ArrayList<Players> players = myQuery.getPlayers();
        for (Players player : players) {
            if (player_id == player.getPlayer_id()) {
                return player;
            }
        }
        return null;
    }
    /**
     * Query Regions
     * @param region_id
     * @return region
     */
    public Regions queryRegion(int region_id) {
        ArrayList<Regions> regions = myQuery.getRegions();
        for ( Regions region : regions) {
            if (region_id == region.getRegion_id()) {
                return region;
            }
        }
        return null;
    }
    /**
     * Query Teams
     * @param team_id
     * @return team
     */
    public  Teams queryTeams(int team_id) {
        ArrayList<Teams> teams = myQuery.getTeams();
        for ( Teams team : teams) {
            if (team_id == team.getTeam_id()) {
                return team;
            }
        }
        return null;
    }
    /**
     * Query Tournament
     * @param tournament_id
     * @return tournament
     */
    public Tournaments queryTournament(int tournament_id) {
        ArrayList<Tournaments> tournaments = myQuery.getTournaments();
        for (Tournaments tournament : tournaments) {
            if (tournament_id == tournament.getTournament_id()) {
                return tournament;
            }
        }
        return null;
    }

    /**
     * Delete Games
     * @param game
     */
    public void deleteGame(Games game) {
        myDeletes.deleteGame(game);
    }

    /**
     * Delete Players
     * @param player
     */
    public void deletePlayer(Players player) {
        myDeletes.deletePlayer(player);
    }

    /**
     * Delete Regions
     * @param region
     */
    public void deleteRegion(Regions region) {
        myDeletes.deleteRegion(region);
    }

    /**
     * Delete Teams
     * @param team
     */
    public void deleteTeam(Teams team) {
        myDeletes.deleteTeam(team);
    }

    /**
     * Delete Tournaments
     * @param tournament
     */
    public void deleteTournaments(Tournaments tournament) {
        myDeletes.deleteTournament(tournament);
    }

    /**
     * Update Games
     * @param game
     */
    public void updateGames(Games game){
        myUpdates.updateGame(game);
    }

    /**
     * Update Players
     * @param player
     */
    public void updatePlayers(Players player){
        myUpdates.updatePlayer(player);
    }

    /**
     * Update Regions
     * @param region
     */
    public void updateRegions(Regions region){
        myUpdates.updateRegion(region);
    }

    /**
     * Update Teams
     * @param team
     */
    public void updateTeams(Teams team){
        myUpdates.updateTeam(team);
    }

    /**
     * Update Tournaments
     * @param tournament
     */
    public void updateTournaments(Tournaments tournament){
        myUpdates.updateTournament(tournament);
    }



}

