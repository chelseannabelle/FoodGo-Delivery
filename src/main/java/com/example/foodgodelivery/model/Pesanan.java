package com.example.foodgodelivery.model;


import java.time.LocalDate;



public class Pesanan {


    private String idPesanan;

    private String idPelanggan;

    private String idRestoran;

    private String idDriver;

    private LocalDate tanggal;

    private int total;

    private String status;

    private String pembayaran;



    public Pesanan(
            String idPesanan,
            String idPelanggan,
            String idRestoran,
            String idDriver,
            LocalDate tanggal,
            int total,
            String status,
            String pembayaran
    ){


        this.idPesanan=idPesanan;
        this.idPelanggan=idPelanggan;
        this.idRestoran=idRestoran;
        this.idDriver=idDriver;
        this.tanggal=tanggal;
        this.total=total;
        this.status=status;
        this.pembayaran=pembayaran;


    }



    public String getIdPesanan(){
        return idPesanan;
    }


    public int getTotal(){
        return total;
    }


    public String getStatus(){
        return status;
    }


}