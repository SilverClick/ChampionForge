package org.example.mvc;




import conect.Conection;
import org.example.data.*;
import org.example.sql.Deletes;
import org.example.sql.Inserts;
import org.example.sql.Query;
import org.example.sql.Updates;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.Date;
import java.util.Observable;

public class Model extends Observable {
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

    //Method to create a game.
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

    //Method to create an inscription.
    public Inscription createInscription(int inscription_id,String inscription_date,int tournament_id,int team_id, int tournament_position ){
        Inscription aux = new Inscription(inscription_id,inscription_date,tournament_id,team_id,tournament_position);
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

    //Method to create a match.
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

    //Method to create a player.
    public Players createPlayer( int player_id, String player_name, String player_password, String player_description, int tournament_points, int region_id){
        Players aux = new Players(player_id, player_name,player_password, player_description,
                tournament_points, region_id);
        return aux;
    }



    /**
     * Create Region
     * @param region_id
     * @param region_name
     * @return aux
     */

    //Method to create a region.
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

    //Method to create a roster.
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

    //Method to create a team.
    public Teams createTeam(int team_id, String team_name, String team_creation_date , String team_description, int teams_points_req,
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
     * @param looser_bracket
     * @param tournament_date
     * @param started
     * @param game_id
     * @param region_id
     * @return aux
     */

    //Method to create a tournament.

    public Tournaments createTournament(int tournament_id, String tournament_name, String tournament_description,
                                        int tournament_size, boolean group_stage, int group_stage_size, boolean looser_bracket,
                                        String tournament_date,boolean started,int game_id, int region_id){
        Tournaments aux = new Tournaments(tournament_id, tournament_name, tournament_description,
                tournament_size,  group_stage,  group_stage_size,  looser_bracket,
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

    //Method to create and insert a player.
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

    //Method to create and insert a tournament.
    public void createAndInsertTournament(int tournament_id, String tournament_name, String tournament_description, int tournament_size, boolean group_stage, int group_stage_size, boolean looser_bracket, String tournament_date, boolean started, int game_id, int region_id) {
        Tournaments tournament = createTournament(tournament_id, tournament_name, tournament_description,
                tournament_size, group_stage, group_stage_size, looser_bracket,
                tournament_date, started, game_id, region_id);
        myInserts.createTournament(tournament);

    }

    /**
     * Create And Insert Region
     *
     * @param region_id
     * @param region_name
     */

    //Method to create and insert a region.
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

    //  //Method to create and insert a game.
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

    //Method to create and insert an inscription.
    public void createAndInsertInscription(int inscription_id, String inscription_date, Tournaments tournament,Teams team, int tournament_position){
        int tournament_id=tournament.getTournament_id();
        int team_id=team.getTeam_id();
        Inscription inscription=createInscription(inscription_id, inscription_date, tournament_id,team_id,tournament_position);
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

    //Method to create and insert a match.
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

    //Method to create and insert a roster .
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

    //Method to create and insert a team.
    public void createAndInsertTeam(int team_id, String team_name, String team_creation_date, String team_description, int teams_points_req, int game_id, int region_id) {
        Teams team = createTeam(team_id, team_name, team_creation_date, team_description, teams_points_req, game_id, region_id);
        myInserts.createTeam(team);
    }
    /**
     * Query Games
     * @param game_id
     * @return game
     */

    //Method to  query a game.
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

    //Method to query a inscription.
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

    //Method to query a match.
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

    //Method to query a roster.
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
     * Query Player
     * @param player_id
     * @return player
     */

    //Method to query a player.
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

    //Method to query a region.
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

    //Method to query a team.
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

    //Method to query a tournament.
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

    //Method to delete a game.
    public void deleteGame(Games game) {
        myDeletes.deleteGame(game);
    }

    /**
     * Delete Players
     * @param player
     */

    //Method to delete a player.
    public void deletePlayer(Players player) {
        myDeletes.deletePlayer(player);
    }

    /**
     * Delete Inscription
     * @param inscription
     */

    //Method to delete an inscription.
    public void deleteInscription(Inscription inscription) {
        myDeletes.deleteInscription(inscription);
    }

    /**
     * Delete Match
     * @param match
     */

    //Method to delete a match.
    public void deleteMatch(Match match) {
        myDeletes.deleteMatch(match);
    }

    /**
     * Delete Roster
     * @param roster
     */

    //Method to delete a roster.
    public void deleteRoster(Roster roster) {
        myDeletes.deleteRoster(roster);
    }

    /**
     * Delete Regions
     * @param region
     */

    //Method to delete a region.
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

    //Method to delete a tournament.
    public void deleteTournaments(Tournaments tournament) {
        myDeletes.deleteTournament(tournament);
    }

    /**
     * Update Game
     * @param game
     */

    //Method to update a game.
    public void updateGame(Games game){
        myUpdates.updateGame(game);
    }

    /**
     * Update Inscription
     * @param inscription
     */

    //Method to update a inscription.
    public void updateInscription(Inscription inscription){ myUpdates.updateInscription(inscription);}

    /**
     * Update Match
     * @param match
     */

    //Method to update a match.
    public void updateMatch(Match match){

        myUpdates.updateMatch(match);
        setChanged();
        // notifica el cambio al observer
        notifyObservers();
    }

    /**
     * Update Players
     * @param player
     */

    //Method to update a player.
    public void updatePlayer(Players player){
        myUpdates.updatePlayer(player);
    }

    /**
     * Update Regions
     * @param region
     */

    //Method to update a region.
    public void updateRegions(Regions region){
        myUpdates.updateRegion(region);
    }

    /**
     * Update Roster
     * @param roster
     */

    //Method to update a roster.
    public void updateRoster(Roster roster){myUpdates.updateRoster(roster);}

    /**
     * Update Teams
     * @param team
     */

    //Method to update a team.
    public void updateTeam(Teams team){
        myUpdates.updateTeam(team);
    }

    /**
     * Update Tournament
     * @param tournament
     */

    //Method to update a tournament.
    public void updateTournament(Tournaments tournament){
        myUpdates.updateTournament(tournament);
    }

    /**
     * Database login
     * @param user
     * @param password
     * @return
     */
    public boolean dbLogin(String user, String password){
        boolean found= false;
        boolean logged = false;
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select * from players");
            ResultSet rs = st.getResultSet();
            String dbPassword= "";
            while (rs.next() && !found) {
                if (rs.getString("player_name").equals(user)){
                    found=true;
                    dbPassword=rs.getString("player_password");
                }
            }
            if (found==true&&dbPassword.equals(password)){
                logged=true;
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return logged;
    }


    public ArrayList<Regions> getRegions(){
        return myQuery.getRegions();
    }
    public ArrayList<Games> getGames(){
        return myQuery.getGames();
    }
    public ArrayList<Teams> getTeams(){
        return myQuery.getTeams();
    }
    public ArrayList<Tournaments> getTournaments(){
        return myQuery.getTournaments();
    }

    public int getRegionId(String name) {
        int id = 0;
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select region_id from regions where region_name='" + name + "'");
            ResultSet rs = st.getResultSet();
            rs.next();
            System.out.println(rs.getInt(1));
            id = rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int getPlayerId(String name) {
        int id = 0;
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select player_id from players where player_name='" + name + "'");
            ResultSet rs = st.getResultSet();
            rs.next();
            System.out.println(rs.getInt(1));
            id = rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int getGameId(String name) {
        int id = 0;
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select game_id from games where game_name='" + name + "'");
            ResultSet rs = st.getResultSet();
            rs.next();
            System.out.println(rs.getInt(1));
            id = rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }
    public int getTeamId(String name) {
        int id = 0;
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select team_id from teams where team_name='" + name + "'");
            ResultSet rs = st.getResultSet();
            rs.next();
            System.out.println(rs.getInt(1));
            id = rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int getTournamentId(String name) {
        int id = 0;
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select tournament_id from tournaments where tournament_name='" + name + "'");
            ResultSet rs = st.getResultSet();
            rs.next();
            System.out.println(rs.getInt(1));
            id = rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public ArrayList<Players> getPlayers(){
        return myQuery.getPlayers();
    }

    public ArrayList<Inscription> getInscriptions(){
        return myQuery.getInscription();
    }

    public ArrayList<Teams> getTeamsFromPlayer(Players player){
        ArrayList<Teams> teams = new ArrayList<Teams>();
        for (Roster roster : myQuery.getRoster()){
            if (roster.getPlayer_id()==player.getPlayer_id()){
                teams.add(queryTeams(roster.getTeam_id()));
            }
        }
        return teams;
    }
    public ArrayList<Players> getPlayersFromTeams(Teams team){
        ArrayList<Players> players = new ArrayList<Players>();
        for (Roster roster : myQuery.getRoster()){
            if (roster.getTeam_id()==team.getTeam_id()){
                players.add(queryPlayer(roster.getPlayer_id()));
            }
        }
        return players;
    }

    public ArrayList<Tournaments> getTournamentsFromPlayer(Players player){
        ArrayList<Tournaments> tournaments = new ArrayList<Tournaments>();
        for (Inscription inscription : myQuery.getInscription()){
            for (Teams team : getTeamsFromPlayer(player)){
                if (team.getTeam_id()==inscription.getTeam_id()){
                    tournaments.add(queryTournament(inscription.getTournament_id()));
                }
            }
        }
        return tournaments;
    }

}
