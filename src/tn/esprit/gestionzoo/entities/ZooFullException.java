package tn.esprit.gestionzoo.entities;

import java.sql.SQLOutput;

public class ZooFullException extends Exception{
    public ZooFullException(String msg){
        System.out.println(msg);
    }

}
