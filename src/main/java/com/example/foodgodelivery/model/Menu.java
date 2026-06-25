package com.example.foodgodelivery.model;


public class Menu {


    private String idMenu;
    private String idRestoran;
    private String idKatMenu;
    private String namaMenu;
    private int harga;
    private String deskripsi;
    private int stok;



    public Menu(
            String idMenu,
            String idRestoran,
            String idKatMenu,
            String namaMenu,
            int harga,
            String deskripsi,
            int stok
    ){

        this.idMenu=idMenu;
        this.idRestoran=idRestoran;
        this.idKatMenu=idKatMenu;
        this.namaMenu=namaMenu;
        this.harga=harga;
        this.deskripsi=deskripsi;
        this.stok=stok;

    }



    public String getIdMenu(){
        return idMenu;
    }


    public String getNamaMenu(){
        return namaMenu;
    }


    public int getHarga(){
        return harga;
    }


    public int getStok(){
        return stok;
    }


}