package com.apps.projectakhir.juanlazuardo.model;

import com.google.gson.annotations.SerializedName;

public class HikeoutPOST {

    /**
     * Created by root on 2/3/17.
     */

    public class PostPutDelKontak {
        @SerializedName("status")
        String status;
        @SerializedName("carrier")
        Hikeout mCarrier;

        @SerializedName("tenda")
        Hikeout mTenda;

        @SerializedName("aksesoris")
        Hikeout mAks;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Hikeout getcarrierAPI() {
            return mCarrier;
        }

        public Hikeout gettendaAPI() {
            return mTenda;
        }

        public Hikeout getaksesorisAPI() {
            return mAks;
        }

    }
}
