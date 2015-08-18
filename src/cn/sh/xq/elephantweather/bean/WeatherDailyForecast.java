package cn.sh.xq.elephantweather.bean;

/**
 * Created by HomeStudio on 2015/8/5.
 */
public class WeatherDailyForecast {
    private String date;        //预报日期
    private String astroSr;     //日出时间
    private String astroSs;     //日落时间
    private String condCode_d;  //白天天气状况代码，参考http://www.heweather.com/documents/condition-code
    private String condCode_n;  //夜间天气状况代码
    private String condTxt_d;   //白天天气状况描述
    private String condTxt_n;   //夜间天气状况描述
    private String hum;         //相对湿度（%）
    private String pcpn;        //降水量（mm）
    private String pop;         //降水概率
    private String pres;        //气压
    private String tmpMax;      //最高温度
    private String tmpMin;       //最低温度
    private String vis;         //能见度（km）
    private String windDeg;     //风向（360度）
    private String windDir;      //风向
    private String windSc;       //风力
    private String windSpd;      //风速（kmph）

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAstroSr() {
        return astroSr;
    }

    public void setAstroSr(String astroSr) {
        this.astroSr = astroSr;
    }

    public String getAstroSs() {
        return astroSs;
    }

    public void setAstroSs(String astroSs) {
        this.astroSs = astroSs;
    }

    public String getCondCode_d() {
        return condCode_d;
    }

    public void setCondCode_d(String condCode_d) {
        this.condCode_d = condCode_d;
    }

    public String getCondCode_n() {
        return condCode_n;
    }

    public void setCondCode_n(String condCode_n) {
        this.condCode_n = condCode_n;
    }

    public String getCondTxt_d() {
        return condTxt_d;
    }

    public void setCondTxt_d(String condTxt_d) {
        this.condTxt_d = condTxt_d;
    }

    public String getCondTxt_n() {
        return condTxt_n;
    }

    public void setCondTxt_n(String condTxt_n) {
        this.condTxt_n = condTxt_n;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getPcpn() {
        return pcpn;
    }

    public void setPcpn(String pcpn) {
        this.pcpn = pcpn;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getPres() {
        return pres;
    }

    public void setPres(String pres) {
        this.pres = pres;
    }

    public String getTmpMax() {
        return tmpMax;
    }

    public void setTmpMax(String tmpMax) {
        this.tmpMax = tmpMax;
    }

    public String getTmpMin() {
        return tmpMin;
    }

    public void setTmpMin(String tmpMin) {
        this.tmpMin = tmpMin;
    }

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public String getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(String windDeg) {
        this.windDeg = windDeg;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public String getWindSc() {
        return windSc;
    }

    public void setWindSc(String windSc) {
        this.windSc = windSc;
    }

    public String getWindSpd() {
        return windSpd;
    }

    public void setWindSpd(String windSpd) {
        this.windSpd = windSpd;
    }
}
