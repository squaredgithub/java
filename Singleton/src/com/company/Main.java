package com.company;

public class Main {

    public static void main(String[] args) {

        Database database = Database.getInstance("db_music");
        System.out.println(database.toString());


    }
}
