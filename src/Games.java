public class Games {

    //Class with the attributes of the games
    private int game_id;
    private String game_name;
    private String game_description;
    private int team_size;
    private int team_max_size;

    public Games(int game_id, String game_name, String game_description, int team_size, int team_max_size) {
        this.game_id = game_id;
        this.game_name = game_name;
        this.game_description = game_description;
        this.team_size = team_size;
        this.team_max_size = team_max_size;
    }
}
