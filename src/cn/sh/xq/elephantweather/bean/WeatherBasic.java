package cn.sh.xq.elephantweather.bean;

/**
 * Created by HomeStudio on 2015/8/5.
 */
public class WeatherBasic {
    private String city;        //城市名称
    private String cnty;        //国家
    private String id;          //城市ID，参见http://www.heweather.com/documents/cn-city-list
    private String lat;         //城市维度
    private String lon;          //城市经度
    private String updateLoc;     //更新时间 当地时间
    private String updateUtc;     //更新时间 UTC时间

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCnty() {
        return cnty;
    }

    public void setCnty(String cnty) {
        this.cnty = cnty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getUpdateLoc() {
        return updateLoc;
    }

    public void setUpdateLoc(String updateLoc) {
        this.updateLoc = updateLoc;
    }

    public String getUpdateUtc() {
        return updateUtc;
    }

    public void setUpdateUtc(String updateUtc) {
        this.updateUtc = updateUtc;
    }
}
