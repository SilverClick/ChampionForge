package org.example.sql;

import org.example.conection.Conection;
import org.example.data.Games;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Query {
   Conection c=null;

    public Query(Conection c) {
        this.c = c;
    }
    public ArrayList<Games> getGames() {
        ArrayList<Games> games = new ArrayList<Games>();
        Games game;
        try {
            Statement sentence = c.getConnection().createStatement();
            String sql = "select * from games;";
            sentence.execute(sql);
            ResultSet rs = sentence.executeQuery(sql);
            while (rs.next()) {
                game= new Games();
                game.setGame_id(rs.getInt("game_id"));
                game.setGame_name(rs.getString("game_name"));
                game.setGame_description(rs.getString("game_description"));
                game.setTeam_size(rs.getInt("team_size"));
                game.setTeam_max_size(rs.getInt("team_max_size"));
                games.add(game);


            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
        }
        return games;
    }

}
