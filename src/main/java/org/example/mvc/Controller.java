package org.example.mvc;

import org.example.conection.Conection;
import org.example.sql.Query;

public class Controller {
    static Model miModelo = new Model();
    static View miVista = new View();
    static Conection C=     Conection.getInstance();
    static Query miquery = new Query(C);

    public static void main(String[] args) {
       for(int i=0; i<miquery.getGames().size(); i++) {
           System.out.println(miquery.getGames().get(i).getGame_name());
       }


}
}
