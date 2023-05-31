package org.example.data;

public class Match {
    private int match_id;
    private int team1_id;
    private int team2_id;
    private String result;
    private int winner;

    public Match() {
    }

    public Match(int match_id,int team1_id, int team2_id, String result, int winner) {
        this.team1_id = team1_id;
        this.team2_id = team2_id;
        this.result = result;
        this.winner = winner;
    }

    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public int getTeam1_id() {
        return team1_id;
    }

    public void setTeam1_id(int team1_id) {
        this.team1_id = team1_id;
    }

    public int getTeam2_id() {
        return team2_id;
    }

    public void setTeam2_id(int team2_id) {
        this.team2_id = team2_id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }
}
