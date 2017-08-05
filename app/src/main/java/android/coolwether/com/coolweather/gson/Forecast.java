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


    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
/*
{"HeWeather": [
        {"aqi":{"city":{"aqi":"32","co":"1","no2":"17","o3":"97","pm10":"32","pm25":"18","qlty":"优","so2":"7"}}
        ,"basic":{"city":"苏州","cnty":"中国","id":"CN101190401","lat":"31.29937935","lon":"120.61958313","update":{"loc":"2017-08-02 14:50","utc":"2017-08-02 06:50"}},
        "daily_forecast":
        [{"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},
        "date":"2017-08-02","hum":"73","pcpn":"1.4","pop":"78","pres":"1001",
        "tmp":{"max":"34","min":"29"},"uv":"8","vis":"19",
        "wind":{"deg":"134","dir":"东南风","sc":"3-4","spd":"19"}},


    "now":{"cond":{"code":"101","txt":"多云"},"fl":"36","hum":"54","pcpn":"0","pres":"1002","tmp":"34","vis":"5","wind":{"deg":"162","dir":"东南风","sc":"3-4","spd":"13"}},

        "status":"ok",

        "suggestion":{"air":{"brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"},"comf":{"brf":"较不舒适","txt":"白天天气多云，有风，但会感到有些热，不很舒适。"},"cw":{"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},"drsg":{"brf":"炎热","txt":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"},"flu":{"brf":"少发","txt":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"},"sport":{"brf":"较适宜","txt":"天气较好，但因气温较高且风力较强，请适当降低运动强度并注意户外防风。"},"trav":{"brf":"较适宜","txt":"天气较好，较热，但风稍大，能缓解较热的天气。较适宜旅游，您仍可陶醉于大自然的美丽风光中。"},"uv":{"brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"}}}]}
*/