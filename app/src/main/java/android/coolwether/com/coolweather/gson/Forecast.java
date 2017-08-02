package android.coolwether.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/7/27.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;


    private class Temperature {
        public String max;
        public String min;
    }

    private class More {
        @SerializedName("txt_d")
        public String info;
    }
}
