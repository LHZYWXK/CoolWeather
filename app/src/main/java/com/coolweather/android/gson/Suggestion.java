package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;

    public class Comfort {

        @SerializedName("type")
        public String type;

        @SerializedName("brf")
        public String brf;

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("type")
        public String type;

        @SerializedName("brf")
        public String brf;

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("type")
        public String type;

        @SerializedName("brf")
        public String brf;

        @SerializedName("txt")
        public String info;

    }
}
