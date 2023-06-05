package org.example.data;

public class Inscription {
    private int inscription_id;
    private String inscription_date;
    private int tournament_id;
    private int team_id;
    private int tournament_position;

    public Inscription() {
    }

    public Inscription(int inscription_id, String inscription_date, int tournament_id, int team_id, int tournament_position) {
        this.inscription_id = inscription_id;
        this.inscription_date = inscription_date;
        this.tournament_id = tournament_id;
        this.team_id = team_id;
        this.tournament_position = tournament_position;
    }

    public int getTournament_position() {
        return tournament_position;
    }

    public void setTournament_position(int tournament_position) {
        this.tournament_position = tournament_position;
    }

    public int getInscription_id() {
        return inscription_id;
    }

    public void setInscription_id(int inscription_id) {
        this.inscription_id = inscription_id;
    }

    public String getInscription_date() {
        return inscription_date;
    }

    public void setInscription_date(String inscription_date) {
        this.inscription_date = inscription_date;
    }

    public int getTournament_id() {
        return tournament_id;
    }

    public void setTournament_id(int tournament_id) {
        this.tournament_id = tournament_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }
}
