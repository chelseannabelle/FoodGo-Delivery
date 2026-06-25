package controller;


import javafx.fxml.FXML;
import javafx.scene.control.*;



public class PesananController {



    @FXML
    private TextField txtIdPesanan;


    @FXML
    private TextField txtPelanggan;


    @FXML
    private TextField txtRestoran;


    @FXML
    private TextField txtDriver;


    @FXML
    private TextField txtTotal;


    @FXML
    private ComboBox<String> cmbStatus;



    @FXML
    public void addPesanan(){

        System.out.println(
                "Tambah Pesanan"
        );


    }



    @FXML
    public void searchPesanan(){

        System.out.println(
                "Cari Pesanan"
        );


    }



    @FXML
    public void editPesanan(){

        System.out.println(
                "Edit Pesanan"
        );


    }



    @FXML
    public void deletePesanan(){

        System.out.println(
                "Hapus Pesanan"
        );


    }


}