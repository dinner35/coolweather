package com.coolweather.android.gson;

/**
 * Created by GuiltyCrown on 2017/7/27.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
