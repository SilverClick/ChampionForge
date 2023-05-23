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
    private int game_id;
    private int region_id;


    public Tournaments(int tournament_id, String tournament_name, String tournament_description, int tournament_size, boolean group_stage, int group_stage_size, int tournament_points_req, boolean looser_bracket, String tournament_date, int game_id, int region_id) {
        this.tournament_id = tournament_id;
        this.tournament_name = tournament_name;
        this.tournament_description = tournament_description;
        this.tournament_size = tournament_size;
        this.group_stage = group_stage;
        this.group_stage_size = group_stage_size;
        this.tournament_points_req = tournament_points_req;
        this.looser_bracket = looser_bracket;
        this.tournament_date = tournament_date;
        this.game_id = game_id;
        this.region_id = region_id;
    }
}
