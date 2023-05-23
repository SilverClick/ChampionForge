package org.example.data;

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
}
