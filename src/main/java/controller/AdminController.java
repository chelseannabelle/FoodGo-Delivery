package controller;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class AdminController {



    @FXML
    public void manageMenu(){


        try{


            Stage stage =
                    new Stage();


            stage.setScene(
                    new Scene(
                            FXMLLoader.load(
                                    getClass()
                                            .getResource("/view/menu.fxml")
                            )
                    )
            );


            stage.show();



        }catch(Exception e){

            e.printStackTrace();

        }


    }




    @FXML
    public void managePesanan(){


        try{


            Stage stage =
                    new Stage();


            stage.setScene(
                    new Scene(
                            FXMLLoader.load(
                                    getClass()
                                            .getResource("/view/pesanan.fxml")
                            )
                    )
            );


            stage.show();



        }catch(Exception e){

            e.printStackTrace();

        }



    }



    @FXML
    public void logout(){


        try{


            Stage stage =
                    new Stage();


            stage.setScene(
                    new Scene(
                            FXMLLoader.load(
                                    getClass()
                                            .getResource("/view/login.fxml")
                            )
                    )
            );


            stage.show();



        }catch(Exception e){

            e.printStackTrace();

        }


    }



}