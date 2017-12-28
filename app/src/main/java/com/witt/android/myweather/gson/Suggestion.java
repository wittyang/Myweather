package com.witt.android.myweather.gson;

import com.google.gson.annotations.SerializedName;

import java.lang.ref.SoftReference;

/**
 * Created by Administrator on 2017/12/18.
 */

public class Suggestion {



    @SerializedName("comf")
    public  Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public  Sport sport;

    public  class Comfort {


        @SerializedName("txt")
        public String info;
    }

    public  class CarWash {


        @SerializedName("txt")
        public String info;
    }

    public  class Sport {


        @SerializedName("txt")
        public String info;
    }
}