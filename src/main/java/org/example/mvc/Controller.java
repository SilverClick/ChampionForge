package org.example.mvc;

import org.example.conection.Conection;
import org.example.data.*;
import org.example.sql.Deletes;
import org.example.sql.Query;
import org.example.sql.Inserts;
import org.example.sql.Updates;

import java.util.ArrayList;

public class Controller {
    static Model myModel = new Model();
    static View myView = new View();


    public static void main(String[] args) {
    Controller c = new Controller();
    myModel.createAndInsertRegion(1,"EUW");
    myModel.createAndInsertPlayer(1,"Elyoya","yoya","Mejor jungla Español",200,1);
   // c.createAndInsertGame(1,"LEAGUE OF LEGENDS","No lo juegues, no es bueno pa la salud",5,7);
    myModel.createAndInsertTeam(1,"MAD LIONS","07/08/2017","Son todos buenos menos Carzzy",100,1,1);
    }




}

