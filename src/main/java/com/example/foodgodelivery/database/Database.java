package com.example.foodgodelivery.database;


import java.sql.Connection;
import java.sql.DriverManager;


public class Database {


    private static Connection connection;


    public static Connection getConnection(){


        try{


            if(connection == null){


                connection =
                        DriverManager.getConnection(

                                "jdbc:mysql://localhost:3306/foodgo",

                                "root",

                                ""

                        );


                System.out.println(
                        "Database Connected"
                );


            }


        }catch(Exception e){

            e.printStackTrace();

        }


        return connection;

    }


}