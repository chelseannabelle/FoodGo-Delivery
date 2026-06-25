package controller;


import javafx.fxml.FXML;
import javafx.scene.control.*;



public class MenuController {



    @FXML
    private TextField txtId;


    @FXML
    private TextField txtNama;


    @FXML
    private TextField txtKategori;


    @FXML
    private TextField txtHarga;


    @FXML
    private TextField txtDeskripsi;


    @FXML
    private TextField txtStok;



    @FXML
    private TableView tableMenu;



    @FXML
    public void addMenu(){

        System.out.println(
                "Tambah Menu"
        );

    }



    @FXML
    public void searchMenu(){

        System.out.println(
                "Cari Menu"
        );

    }



    @FXML
    public void editMenu(){

        System.out.println(
                "Edit Menu"
        );

    }



    @FXML
    public void deleteMenu(){

        System.out.println(
                "Hapus Menu"
        );

    }



}