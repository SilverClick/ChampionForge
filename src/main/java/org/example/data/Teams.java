package org.example.data;

import java.sql.Date;

public class Teams {

    //Class with the attributes of the teams

    private int team_id;
    private String team_name;
    private Date team_creation_date;
    private String team_description;
    private int team_point_req;
    private int game_id;
    private int region_id;

    public Teams() {
    }

    public Teams(int team_id, String team_name, Date team_creation_date, String team_description,int team_point_req, int game_id, int region_id) {
        this.team_id = team_id;
        this.team_name = team_name;
        this.team_creation_date = team_creation_date;
        this.team_description = team_description;
        this.team_point_req=team_point_req;
        this.game_id = game_id;
        this.region_id = region_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public Date getTeam_creation_date() {
        return team_creation_date;
    }

    public void setTeam_creation_date(Date team_creation_date) {
        this.team_creation_date = team_creation_date;
    }

    public String getTeam_description() {
        return team_description;
    }

    public void setTeam_description(String team_description) {
        this.team_description = team_description;
    }

    public int getTeam_point_req() {
        return team_point_req;
    }

    public void setTeam_point_req(int team_point_req) {
        this.team_point_req = team_point_req;
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
}
