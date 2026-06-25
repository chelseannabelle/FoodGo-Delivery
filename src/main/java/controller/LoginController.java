package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class LoginController {


    @FXML
    private TextField txtUsername;


    @FXML
    private PasswordField txtPassword;



    @FXML
    public void login(){


        String username = txtUsername.getText();
        String password = txtPassword.getText();


        try{


            Stage stage =
                    (Stage) txtUsername
                            .getScene()
                            .getWindow();



            if(username.equals("admin")
                    && password.equals("admin123")){


                openPage(
                        stage,
                        "/view/admin.fxml"
                );


            }


            else if(username.equals("customer")
                    && password.equals("12345")){


                openPage(
                        stage,
                        "/view/customer.fxml"
                );


            }


            else if(username.equals("seller")
                    && password.equals("12345")){


                openPage(
                        stage,
                        "/view/seller.fxml"
                );


            }


            else if(username.equals("driver")
                    && password.equals("12345")){


                openPage(
                        stage,
                        "/view/driver.fxml"
                );


            }


            else{


                Alert alert =
                        new Alert(Alert.AlertType.ERROR);


                alert.setContentText(
                        "Username atau password salah"
                );


                alert.show();



            }


        }catch(Exception e){

            e.printStackTrace();

        }


    }




    private void openPage(
            Stage stage,
            String file
    ) throws Exception{


        FXMLLoader loader =
                new FXMLLoader(
                        getClass()
                                .getResource(file)
                );


        Scene scene =
                new Scene(
                        loader.load()
                );


        stage.setScene(scene);


        stage.show();


    }


}