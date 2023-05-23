package org.example.data;

public class Teams {

    //Class with the attributes of the teams

    private int team_id;
    private String team_name;
    private String team_creation_date;
    private String team_description;
    private int game_id;
    private int region_id;


    public Teams(int team_id, String team_name, String team_creation_date, String team_description, int game_id, int region_id) {
        this.team_id = team_id;
        this.team_name = team_name;
        this.team_creation_date = team_creation_date;
        this.team_description = team_description;
        this.game_id = game_id;
        this.region_id = region_id;
    }
}
