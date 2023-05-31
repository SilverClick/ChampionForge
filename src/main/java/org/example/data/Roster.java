package org.example.data;

public class Roster {
    private int roster_id;
    private String join_date;
    private String left_date;
    private int team_id;
    private int player_id;

    public Roster() {
    }

    public Roster(int roster_id, String join_date, String left_date, int team_id, int player_id) {
        this.roster_id = roster_id;
        this.join_date = join_date;
        this.left_date = left_date;
        this.team_id = team_id;
        this.player_id = player_id;

    }

    public int getRoster_id() {
        return roster_id;
    }

    public void setRoster_id(int roster_id) {
        this.roster_id = roster_id;
    }

    public String getJoin_date() {
        return join_date;
    }

    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }

    public String getLeft_date() {
        return left_date;
    }

    public void setLeft_date(String left_date) {
        this.left_date = left_date;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }
}
