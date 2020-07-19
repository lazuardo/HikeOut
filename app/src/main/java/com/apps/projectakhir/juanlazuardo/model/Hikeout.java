package com.apps.projectakhir.juanlazuardo.model;

import com.google.gson.annotations.SerializedName;

public class Hikeout {
    //Carrier
    @SerializedName("carrier_id")
    private String carrier_id;
    @SerializedName("carrier_nama")
    private String carrier_nama;
    @SerializedName("carrier_harga")
    private String carrier_harga;

    //Tenda
    @SerializedName("tenda_id")
    private String tenda_id;
    @SerializedName("tenda_nama")
    private String tenda_nama;
    @SerializedName("tenda_harga")
    private String tenda_harga;

    //Accessoris
    @SerializedName("aks_id")
    private String aks_id;
    @SerializedName("aks_nama")
    private String aks_nama;
    @SerializedName("aks_harga")
    private String aks_harga;


    //method Carrier
    public String getCarrier_id() {
        return carrier_id;
    }
    public String getCarrier_nama() {
        return carrier_nama;
    }
    public String getCarrier_harga() {
        return carrier_harga;
    }

    //method tenda
    public String getTenda_id() {
        return tenda_id;
    }
    public String getTenda_nama() {
        return tenda_nama;
    }
    public String getTenda_harga() {
        return tenda_harga;
    }

    //method Carrier
    public String getAks_id() {
        return aks_id;
    }
    public String getAks_nama() {
        return aks_nama;
    }
    public String getAks_harga() {
        return aks_harga;
    }

}

