package cn.yibulz.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 10648 on 2017/1/1 0001.
 *
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
