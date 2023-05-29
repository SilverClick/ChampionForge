package main.java.org.example.data;

public class Players {

//Class with the attributes of the players

   private int player_id;
   private String player_name;
   private String player_password;
   private String player_description;

   private int tournament_points;
   private int region_id;


    public Players(int player_id, String player_name, String player_password, String player_description,int tournament_points,int region_id) {
        this.player_id = player_id;
        this.player_name = player_name;
        this.player_password = player_password;
        this.player_description = player_description;
        this.tournament_points=tournament_points;
        this.region_id = region_id;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getPlayer_password() {
        return player_password;
    }

    public void setPlayer_password(String player_password) {
        this.player_password = player_password;
    }

    public String getPlayer_description() {
        return player_description;
    }

    public void setPlayer_description(String player_description) {
        this.player_description = player_description;
    }

    public int getTournament_points() {
        return tournament_points;
    }

    public void setTournament_points(int tournament_points) {
        this.tournament_points = tournament_points;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public Players() {
    }

}
