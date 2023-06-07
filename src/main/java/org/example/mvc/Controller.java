package org.example.mvc;


import conect.Conection;
import org.example.data.*;

import org.example.files.ActiveSession;
import org.example.ui.MainFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Controller {
    static Model myModel = new Model();
    static View myView = new View();
    static Conection C = Conection.getInstance();


    public static void main(String[] args) {
        OUpdate myObserver = new OUpdate();
        myModel.addObserver(myObserver);
    Controller c = new Controller();
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
    public static void createAndInsertPlayer(int player_id, String player_name, String player_password, String player_description, int tournament_points, int region_id) {
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
     * @param looser_bracket
     * @param tournament_date
     * @param started
     * @param game_id
     * @param region_id
     */

    public static void createAndInsertTournament(int tournament_id, String tournament_name, String tournament_description, int tournament_size, boolean group_stage, int group_stage_size,  boolean looser_bracket, String tournament_date, boolean started, int game_id, int region_id) {
      myModel.createAndInsertTournament(tournament_id, tournament_name, tournament_description,
              tournament_size, group_stage, group_stage_size, looser_bracket,
              tournament_date, started, game_id, region_id);

    }

    /**
     * Create And Insert Region
     *
     * @param region_id
     * @param region_name
     */
    public static void createAndInsertRegion(int region_id, String region_name) {
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
    public static void createAndInsertGame(int game_id, String game_name, String game_description, int team_size, int team_max_size) {
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
    public static void createAndInsertTeam(int team_id, String team_name, String team_creation_date, String team_description, int teams_points_req, int game_id, int region_id) {
      myModel.createAndInsertTeam(team_id, team_name, team_creation_date, team_description, teams_points_req, game_id, region_id);
    }
    /**
     * Query Games
     * @param game_id
     * @return game
     */
    public static Games queryGames(int game_id) {
      Games game= myModel.queryGames(game_id);
      return game;
    }

    /**
     * Query Players
     * @param player_id
     * @return player
     */
    public static Players queryPlayer(int player_id) {
        Players player= myModel.queryPlayer(player_id);
        return player;
    }
    /**
     * Query Region
     * @param region_id
     * @return region
     */
    public static Regions queryRegion(int region_id) {
        Regions region= myModel.queryRegion(region_id);
        return region;
    }
    /**
     * Query Teams
     * @param team_id
     * @return team
     */
    public static Teams queryTeams(int team_id) {
        Teams team= myModel.queryTeams(team_id);
        return team;
    }
    /**
     * Query Tournament
     * @param tournament_id
     * @return tournament
     */
    public static Tournaments queryTournament(int tournament_id) {
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

    public static boolean dbLogin(String username,String password){
        return myModel.dbLogin(username,password);
    }

    public static void logged(MainFrame frame,String username){
        myView.logged(frame,true);
        ActiveSession.guardarArchivo(String.valueOf(myModel.getPlayerId(username)));
    }

    public static void logout(MainFrame frame){
        myView.logged(frame,false);
        ActiveSession.guardarArchivo("");
    }

    public static JComboBox regionCbox(JComboBox cbox){
        for (Regions region : myModel.getRegions()) {
            cbox.addItem(region.getRegion_name());
        }
        return cbox;
    }

    public static JComboBox gameCbox(JComboBox cbox){
        for (Games game : myModel.getGames()) {
            cbox.addItem(game.getGame_name());
        }
        return cbox;
    }

    public static int getRegionId(String name){
        return myModel.getRegionId(name);
    }

    public static int getPlayerId(String name){
        return myModel.getPlayerId(name);
    }
    public static int getGameId(String name){
        return myModel.getGameId(name);
    }
    public static int getTeamId(String name){
        return myModel.getTeamId(name);
    }
    public static int getTournamentId(String name){
        return myModel.getTournamentId(name);
    }

    public static void playerProfile(MainFrame frame, Players player){
        myView.playerProfile(frame,player);
    }

    public static void teamProfile(MainFrame frame, Teams team,ArrayList<Players> players){
        myView.teamProfile(frame,team,players);
    }

    public static void emptyTable(JTable table, String[] titles){
        DefaultTableModel Modelo = (DefaultTableModel) table.getModel();
        Modelo = new DefaultTableModel(null,titles);
        table.setModel(Modelo);
    }

    public static JTable seeDataPlayers(JTable table, String[] titles, ArrayList<Players> players){
            DefaultTableModel miModelo = (DefaultTableModel) table.getModel();
            String dts[] = new String[titles.length];
            for(Players player: players){
                dts[0]= player.getPlayer_name();
                dts[1]= player.getPlayer_description();
                dts[2]= String.valueOf(player.getTournament_points());
                miModelo.addRow(dts);
            }
            table.setModel(miModelo);
        return table;
    }

    public static JTable seeDataTeams(JTable table, String[] titles, ArrayList<Teams> teams){
            DefaultTableModel miModelo = (DefaultTableModel) table.getModel();
            String dts[] = new String[titles.length];
            for(Teams team: teams){
                dts[0]= team.getTeam_name();
                dts[1]= team.getTeam_description();
                dts[2]= String.valueOf(team.getTeam_point_req());
                dts[3]= queryGames(team.getGame_id()).getGame_name();
                miModelo.addRow(dts);
            }
            table.setModel(miModelo);
        return table;
    }

    public static JTable seeDataTournaments(JTable table, String[] titles, ArrayList<Tournaments> tournaments){
        DefaultTableModel miModelo = (DefaultTableModel) table.getModel();
        String dts[] = new String[titles.length];
        for(Tournaments tournament: tournaments){
            dts[0]= tournament.getTournament_name();
            dts[1]= tournament.getTournament_description();
            dts[2]= String.valueOf(tournament.getTournament_size());
            dts[3]= String.valueOf(tournament.isGroup_stage());
            dts[4]= String.valueOf(tournament.getGroup_stage_size());
            dts[5]= String.valueOf(tournament.isLooser_bracket());
            dts[6]= queryGames(tournament.getGame_id()).getGame_name();

            miModelo.addRow(dts);
        }
        table.setModel(miModelo);
        return table;
    }

    public static JTable searchPlayersName(JTable table, String[] titles,String name,int tp, ArrayList<Players> players){
            DefaultTableModel miModelo = (DefaultTableModel) table.getModel();
            String dts[] = new String[titles.length];
            for (Players player : players){
                if (player.getPlayer_name().equals(name)&&player.getTournament_points()>=tp) {
                    dts[0] = player.getPlayer_name();
                    dts[1] = player.getPlayer_description();
                    dts[2] = String.valueOf(player.getTournament_points());
                    miModelo.addRow(dts);
                }
            }
            table.setModel(miModelo);
        return table;
    }
    public static JTable searchPlayersTp(JTable table, String[] titles,int tp, ArrayList<Players> players){
            DefaultTableModel miModelo = (DefaultTableModel) table.getModel();
            String dts[] = new String[titles.length];
            for (Players player: players){
                if (player.getTournament_points()>=tp) {
                    dts[0] = player.getPlayer_name();
                    dts[1] = player.getPlayer_description();
                    dts[2] = String.valueOf(player.getTournament_points());
                    miModelo.addRow(dts);
                }
            }
            table.setModel(miModelo);
        return table;
    }

    public static JTable searchTeamsName(JTable table, String[] titles,String name,int tp,int game_id, ArrayList<Teams> teams){
            DefaultTableModel miModelo = (DefaultTableModel) table.getModel();
            String dts[] = new String[titles.length];
            for(Teams team : teams){
                if (team.getTeam_name().equals(name)&&team.getTeam_point_req()>=tp&&team.getGame_id()==game_id) {
                    dts[0] = team.getTeam_name();
                    dts[1] = team.getTeam_description();
                    dts[2] = String.valueOf(team.getTeam_point_req());
                    dts[3] = queryGames(team.getGame_id()).getGame_name();
                    miModelo.addRow(dts);
                }
            }
            table.setModel(miModelo);
        return table;
    }
    public static JTable searchTeamsTp(JTable table, String[] titles,int tp, int game_id, ArrayList<Teams> teams){
            DefaultTableModel miModelo = (DefaultTableModel) table.getModel();
            String dts[] = new String[titles.length];
            for(Teams team : teams){
                if (team.getTeam_point_req()>=tp&&team.getGame_id()==game_id) {
                    dts[0] = team.getTeam_name();
                    dts[1] = team.getTeam_description();
                    dts[2] = String.valueOf(team.getTeam_point_req());
                    dts[3] = queryGames(team.getGame_id()).getGame_name();
                    miModelo.addRow(dts);
                }
            }
            table.setModel(miModelo);
        return table;
    }

    public static JTable searchTournamentsGame(JTable table, String[] titles, int game_id, ArrayList<Tournaments> tournaments){
        DefaultTableModel miModelo = (DefaultTableModel) table.getModel();
        String dts[] = new String[titles.length];
        for(Tournaments tournament : tournaments){
            if (tournament.getGame_id()==game_id) {
                dts[0]= tournament.getTournament_name();
                dts[1]= tournament.getTournament_description();
                dts[2]= String.valueOf(tournament.getTournament_size());
                dts[3]= String.valueOf(tournament.isGroup_stage());
                dts[4]= String.valueOf(tournament.getGroup_stage_size());
                dts[5]= String.valueOf(tournament.isLooser_bracket());
                dts[6]= queryGames(tournament.getGame_id()).getGame_name();
                miModelo.addRow(dts);
            }
        }
        table.setModel(miModelo);
        return table;
    }

    public static JTable searchTournamentsName(JTable table, String[] titles, int game_id,String name, ArrayList<Tournaments> tournaments){
        DefaultTableModel miModelo = (DefaultTableModel) table.getModel();
        String dts[] = new String[titles.length];
        for(Tournaments tournament : tournaments){
            if (tournament.getGame_id()==game_id&&tournament.getTournament_name().equals(name)) {
                dts[0]= tournament.getTournament_name();
                dts[1]= tournament.getTournament_description();
                dts[2]= String.valueOf(tournament.getTournament_size());
                dts[3]= String.valueOf(tournament.isGroup_stage());
                dts[4]= String.valueOf(tournament.getGroup_stage_size());
                dts[5]= String.valueOf(tournament.isLooser_bracket());
                dts[6]= queryGames(tournament.getGame_id()).getGame_name();
                miModelo.addRow(dts);
            }
        }
        table.setModel(miModelo);
        return table;
    }

    public static void playerView(MainFrame frame){
        myView.playerView(frame,myModel.getPlayers());
    }

    public static void teamView(MainFrame frame,ArrayList<Teams> teams, boolean select,Tournaments tournament){
        myView.teamView(frame,teams,select,tournament);
    }

    public static void teamCreation(MainFrame frame){
        myView.teamCreation(frame);
    }

    public static void joinTeam(Teams team){
        boolean joined=false;
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String formattedDate = currentDate.format(formatter);
        ArrayList<Teams> teams = myModel.getTeamsFromPlayer(myModel.queryPlayer(Integer.parseInt(ActiveSession.leerArchivo())));
        for(Teams teamJoined : teams){
            if (team.getTeam_id()==teamJoined.getTeam_id()){
                JOptionPane.showMessageDialog(null,"YOU HAVE ALREADY JOINED THIS TEAM");
                joined=true;
            }
        }
        if (!joined)
        myModel.createAndInsertRoster(0,formattedDate,"",team,queryPlayer(Integer.parseInt(ActiveSession.leerArchivo())));
    }

    public static ArrayList<Teams> getTeamsFromPlayer(Players player){
        return myModel.getTeamsFromPlayer(player);
    }
    public static ArrayList<Players> getPlayersFromTeams(Teams team){
        return myModel.getPlayersFromTeams(team);
    }
    public static ArrayList<Tournaments> getTournamentsFromPlayer(Players player){
        return myModel.getTournamentsFromPlayer(player);
    }
    public static ArrayList<Teams> getTeams(){
        return myModel.getTeams();
    }
    public static void tournamentView(MainFrame frame, ArrayList<Tournaments> tournaments){
        myView.tournamentView(frame,tournaments);
    }
    public static ArrayList<Tournaments> getTournaments(){
       return myModel.getTournaments();
    }
    public static void tournamentCreation(MainFrame frame){
        myView.tournamentCreation(frame);
    }

    public static ArrayList<JLabel> emptyLabels(ArrayList<JLabel> labels){
        for (JLabel label: labels){
            label.setText("");
        }
        return labels;
    }

    public static ArrayList<JLabel> createBracket(ArrayList<JLabel> labels, Tournaments tournament){
        for (Inscription inscription : myModel.getInscriptions()){
            if (tournament.getTournament_id()==inscription.getTournament_id()){
                labels.get(inscription.getTournament_position()-1).setText(queryTeams(inscription.getTeam_id()).getTeam_name());
                }
            }
        return labels;
    }

    public static ArrayList<Teams> addTeams(int nTeams,ArrayList<Teams> teams){
        for (int i = 1; i <= nTeams; i++) {
            Teams team = new Teams();
            teams.add(team);
        }
        return teams;
    }

    public static void tournamentProfile(MainFrame frame, Tournaments tournament){
        myView.tournamentProfile(frame,tournament);
    }

    public static void joinTournament(Tournaments tournament, Teams team){
        boolean joined=false;
        int position = 1;
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String formattedDate = currentDate.format(formatter);
        for(Inscription inscription: myModel.getInscriptions()){
            if (team.getTeam_id()==inscription.getTeam_id()&&tournament.getTournament_id()==inscription.getTournament_id()){
                JOptionPane.showMessageDialog(null,"YOU HAVE ALREADY JOINED THIS TOURNAMENT");
                joined=true;
            }
            if (inscription.getTournament_id()==tournament.getTournament_id()){
                position++;
            }
        }
        if (!joined)
            myModel.createAndInsertInscription(0,formattedDate,tournament,team,position);
    }

}

