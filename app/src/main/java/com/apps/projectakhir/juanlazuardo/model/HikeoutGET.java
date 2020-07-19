package com.apps.projectakhir.juanlazuardo.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class HikeoutGET {

    //Carrier
    @SerializedName("carrier")
    List<Hikeout> dataCarrier;

    public List<Hikeout> getdataCarrier() {
        return dataCarrier;
    }
    public void setdataCarrier(List<Hikeout> dataCarrier) {
        this.dataCarrier = dataCarrier;
    }

    //Tenda
    @SerializedName("tenda")
    List<Hikeout> dataTenda;

    public List<Hikeout> getDataTenda() {
        return dataTenda;
    }
    public void setDataTenda(List<Hikeout> dataTenda) {
        this.dataTenda = dataTenda;
    }

    //Aksesoris
    @SerializedName("aksesoris")
    List<Hikeout> dataAks;

    public List<Hikeout> getDataAks() {
        return dataAks;
    }
    public void setDataAksr(List<Hikeout> dataAks) {
        this.dataAks = dataCarrier;
    }
}
