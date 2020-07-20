package com.apps.projectakhir.juanlazuardo.model;

import com.google.gson.annotations.SerializedName;

public class Hikeout {
    //Carrier
    @SerializedName("carrier_id")
    private String carrier_id;
    @SerializedName("carrier_nama")
    private String carrier_nama;
    @SerializedName("carrier_ukuran")
    private String carrier_ukuran;
    @SerializedName("carrier_harga")
    private String carrier_harga;
    @SerializedName("carrier_desc")
    private String carrier_desc;
    @SerializedName("carrier_image")
    private String carrier_img;
    //Tenda
    @SerializedName("tenda_id")
    private String tenda_id;
    @SerializedName("tenda_nama")
    private String tenda_nama;
    @SerializedName("tenda_ukuran")
    private String tenda_ukuran;
    @SerializedName("tenda_harga")
    private String tenda_harga;
    @SerializedName("tenda_desc")
    private String tenda_desc;
    @SerializedName("tenda_image")
    private String tenda_img;
    //Accessoris
    @SerializedName("aks_id")
    private String aks_id;
    @SerializedName("aks_nama")
    private String aks_nama;
    @SerializedName("aks_harga")
    private String aks_harga;
    @SerializedName("aks_desc")
    private String aks_desc;
    @SerializedName("aks_image")
    private String aks_img;

    public Hikeout() {
    }


    //method Carrier
    public String getCarrier_img() {
        return carrier_img;
    }
    public String getCarrier_id() {
        return carrier_id;
    }
    public String getCarrier_nama() {
        return carrier_nama;
    }
    public String getCarrier_ukuran() {
        return carrier_ukuran;
    }
    public String getCarrier_harga() {
        return carrier_harga;
    }
    public String getCarrier_desc() {
        return carrier_desc;
    }

    //method tenda
    public String getTenda_img() {
        return tenda_img;
    }
    public String getTenda_id() {
        return tenda_id;
    }
    public String getTenda_nama() {
        return tenda_nama;
    }
    public String getTenda_ukuran() {
        return tenda_ukuran;
    }
    public String getTenda_harga() {
        return tenda_harga;
    }
    public String getTenda_desc() {
        return tenda_desc;
    }


    //method Aks
    public String getAks_img() {
        return aks_img;
    }
    public String getAks_id() {
        return aks_id;
    }
    public String getAks_nama() {
        return aks_nama;
    }
    public String getAks_harga() {
        return aks_harga;
    }
    public String getAks_desc() {
        return aks_desc;
    }


}

