package org.example.data;

public class Games {

    //Class with the attributes of the games
    private int game_id;
    private String game_name;
    private String game_description;
    private int team_size;
    private int team_max_size;

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public String getGame_description() {
        return game_description;
    }

    public void setGame_description(String game_description) {
        this.game_description = game_description;
    }

    public int getTeam_size() {
        return team_size;
    }

    public void setTeam_size(int team_size) {
        this.team_size = team_size;
    }

    public int getTeam_max_size() {
        return team_max_size;
    }

    public void setTeam_max_size(int team_max_size) {
        this.team_max_size = team_max_size;
    }

    public Games() {
    }

    public Games(int game_id, String game_name, String game_description, int team_size, int team_max_size) {
        this.game_id = game_id;
        this.game_name = game_name;
        this.game_description = game_description;
        this.team_size = team_size;
        this.team_max_size = team_max_size;


    }
}
