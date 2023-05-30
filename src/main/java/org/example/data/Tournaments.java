package org.example.data;

public class Tournaments {

    //Class with the attributes of the teams
    private int tournament_id;
    private String tournament_name;
    private String tournament_description;
    private int tournament_size;
    private boolean group_stage;
    private int group_stage_size;
    private int tournament_points_req;
    private boolean looser_bracket;
    private String tournament_date;
    private boolean started;
    private int game_id;
    private int region_id;

    public Tournaments() {
    }

    public Tournaments(int tournament_id, String tournament_name, String tournament_description, int tournament_size, boolean group_stage, int group_stage_size, int tournament_points_req, boolean looser_bracket, String tournament_date,boolean started, int game_id, int region_id) {
        this.tournament_id = tournament_id;
        this.started=started;
        this.tournament_name = tournament_name;
        this.tournament_description = tournament_description;
        this.tournament_size = tournament_size;
        this.group_stage = group_stage;
        this.group_stage_size = group_stage_size;
        this.tournament_points_req = tournament_points_req;
        this.looser_bracket = looser_bracket;
        this.tournament_date = tournament_date;
        this.started = started;
        this.game_id = game_id;
        this.region_id = region_id;
    }

    public int getTournament_id() {
        return tournament_id;
    }

    public void setTournament_id(int tournament_id) {
        this.tournament_id = tournament_id;
    }

    public String getTournament_name() {
        return tournament_name;
    }

    public void setTournament_name(String tournament_name) {
        this.tournament_name = tournament_name;
    }

    public String getTournament_description() {
        return tournament_description;
    }

    public void setTournament_description(String tournament_description) {
        this.tournament_description = tournament_description;
    }

    public int getTournament_size() {
        return tournament_size;
    }

    public void setTournament_size(int tournament_size) {
        this.tournament_size = tournament_size;
    }

    public boolean isGroup_stage() {
        return group_stage;
    }

    public void setGroup_stage(boolean group_stage) {
        this.group_stage = group_stage;
    }

    public int getGroup_stage_size() {
        return group_stage_size;
    }

    public void setGroup_stage_size(int group_stage_size) {
        this.group_stage_size = group_stage_size;
    }

    public int getTournament_points_req() {
        return tournament_points_req;
    }

    public void setTournament_points_req(int tournament_points_req) {
        this.tournament_points_req = tournament_points_req;
    }

    public boolean isLooser_bracket() {
        return looser_bracket;
    }

    public void setLooser_bracket(boolean looser_bracket) {
        this.looser_bracket = looser_bracket;
    }

    public String getTournament_date() {
        return tournament_date;
    }

    public void setTournament_date(String tournament_date) {
        this.tournament_date = tournament_date;
    }



    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
}
