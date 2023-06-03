package org.example.mvc;

import org.example.conection.Conection;
import org.example.data.*;
import org.example.sql.Deletes;
import org.example.sql.Inserts;
import org.example.sql.Query;
import org.example.sql.Updates;

import java.util.ArrayList;

import java.sql.Date;

public class Model {
    static Conection C = Conection.getInstance();
    static Query myQuery = new Query(C);
    static Deletes myDeletes = new Deletes(C);
    static Updates myUpdates = new Updates(C);
    static Inserts myInserts = new Inserts(C);

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
     * Create Inscription
     * @param inscription_id
     * @param inscription_date
     * @param tournament_id
     * @param team_id
     * @return aux
     */
    public Inscription createInscription(int inscription_id,String inscription_date,int tournament_id,int team_id ){
        Inscription aux = new Inscription(inscription_id,inscription_date,tournament_id,team_id);
        return aux;
    }

    /**
     * Create Match
     * @param match_id
     * @param team1_id
     * @param team2_id
     * @param result
     * @param winner
     * @return aux
     */
    public Match createMatch(int match_id,int team1_id, int team2_id, String result, int winner){
        Match aux = new Match( match_id, team1_id, team2_id, result, winner);
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
     * Create Roster
     * @param roster_id
     * @param join_date
     * @param left_date
     * @param team_id
     * @param player_id
     * @return aux
     */
    public Roster createRoster(int roster_id,  String join_date,String left_date,int team_id,int player_id){
        Roster aux = new Roster(  roster_id,  join_date, left_date,team_id  ,player_id);
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
    public Teams createTeam(int team_id, String team_name, Date team_creation_date , String team_description, int teams_points_req,
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
        Players player = createPlayer(player_id, player_name, player_password, player_description, tournament_points, region_id);
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
        Tournaments tournament = createTournament(tournament_id, tournament_name, tournament_description,
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
        Regions region =createRegion(region_id, region_name);
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
        Games game = createGame(game_id, game_name, game_description, team_size, team_max_size);
        myInserts.createGame(game);
    }

    /**
     * Create And Insert Inscription
     * @param inscription_id
     * @param inscription_date
     * @param tournament
     * @param team
     */
    public void createAndInsertInscription(int inscription_id, String inscription_date, Tournaments tournament,Teams team){
        int tournament_id=tournament.getTournament_id();
        int team_id=team.getTeam_id();
        Inscription inscription=createInscription(inscription_id, inscription_date, tournament_id,team_id );
        myInserts.createInscription(inscription);
    }

    /**
     * Create And Insert Match
     * @param match_id
     * @param team1
     * @param team2
     * @param result
     * @param winner
     */
    public void createAndInsertMatch(int match_id,Teams team1,Teams team2, String result, int winner){
        int team1_id=team1.getTeam_id();
        int team2_id=team2.getTeam_id();
        Match match=createMatch(match_id, team1_id,team2_id,result,winner);
        myInserts.createMatch(match);
    }

    /**
     * Create And Insert Roster
     * @param roster_id
     * @param join_date
     * @param left_date
     */
    public void createAndInsertRoster(int roster_id, String join_date, String left_date, Teams team,Players player){
        int player_id=player.getPlayer_id();
        int team_id=team.getTeam_id();
        Roster roster=createRoster(roster_id, join_date, left_date,team_id,player_id );
        myInserts.createRoster(roster);
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
        Teams team = createTeam(team_id, team_name, team_creation_date, team_description, teams_points_req, game_id, region_id);
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
     * Query Inscription
     * @param inscription_id
     * @return inscription
     */
    public  Inscription queryInscription(int inscription_id) {
        ArrayList<Inscription> inscriptions = myQuery.getInscription();
        for ( Inscription inscription : inscriptions) {
            if (inscription_id == inscription.getInscription_id()) {
                return inscription;
            }
        }
        return null;
    }
    /**
     * Query Match
     * @param match_id
     * @return match
     */
    public  Match queryMatch(int match_id) {
        ArrayList<Match> matches = myQuery.getMatch();
        for ( Match match : matches) {
            if (match_id == match.getMatch_id()) {
                return match;
            }
        }
        return null;
    }
    /**
     * Query Roster
     * @param roster_id
     * @return roster
     */
    public Roster queryRoster(int roster_id) {
        ArrayList<Roster> rosters = myQuery.getRoster();
        for ( Roster roster : rosters) {
            if (roster_id == roster.getRoster_id()) {
                return roster;
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
     * Delete Inscription
     * @param inscription
     */
    public void deleteInscription(Inscription inscription) {
        myDeletes.deleteInscription(inscription);
    }

    /**
     * Delete Match
     * @param match
     */
    public void deleteMatch(Match match) {
        myDeletes.deleteMatch(match);
    }

    /**
     * Delete Roster
     * @param roster
     */
    public void deleteRoster(Roster roster) {
        myDeletes.deleteRoster(roster);
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
     * Update Inscription
     * @param inscription
     */

    public void updateInscription(Inscription inscription){ myUpdates.updateInscription(inscription);}

    /**
     * Update Match
     * @param match
     */
    public void updateMatch(Match match){myUpdates.updateMatch(match);}

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
     * Update Roster
     * @param roster
     */

    public void updateRoster(Roster roster){myUpdates.updateRoster(roster);}

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
