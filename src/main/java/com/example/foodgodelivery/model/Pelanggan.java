package com.example.foodgodelivery.model;


public class Pelanggan {


    private String idPelanggan;
    private String nama;
    private String email;
    private String nomorTelepon;
    private String alamat;



    public Pelanggan(
            String idPelanggan,
            String nama,
            String email,
            String nomorTelepon,
            String alamat
    ){

        this.idPelanggan=idPelanggan;
        this.nama=nama;
        this.email=email;
        this.nomorTelepon=nomorTelepon;
        this.alamat=alamat;

    }



    public String getIdPelanggan(){
        return idPelanggan;
    }

    public String getNama(){
        return nama;
    }

    public String getEmail(){
        return email;
    }

    public String getNomorTelepon(){
        return nomorTelepon;
    }

    public String getAlamat(){
        return alamat;
    }


}