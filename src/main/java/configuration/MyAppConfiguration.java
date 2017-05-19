package configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;


public class MyAppConfiguration extends Configuration{

    //same variables as in yml file

    private String message;
    private String ftpserverurl;

    private String doing;
    private String something;

    private String yourmood;
    private String yourthing;
    private int yourscale;

    private String yourdrink;
    private String yourfood;
    private String yourdessert;


    @JsonProperty
    public String getDoing() {
        return doing;
    }

    @JsonProperty
    public void setDoing(String doing) {
        this.doing = doing;
    }

    @JsonProperty
    public String getSomething() {
        return something;
    }

    @JsonProperty
    public void setSomething(String something) {
        this.something = something;
    }



    @JsonProperty
    public String getMessage() {
        return message;
    }

    @JsonProperty
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty
    public String getFtpserverurl() {
        return ftpserverurl;
    }

    @JsonProperty
    public void setFtpserverurl(String ftpserverurl) {
        this.ftpserverurl = ftpserverurl;
    }



    @JsonProperty
    public String getYourmood() {
        return yourmood;
    }
    @JsonProperty
    public void setYourmood(String yourmood) {
        this.yourmood = yourmood;
    }
    @JsonProperty
    public String getYourthing() {
        return yourthing;
    }
    @JsonProperty
    public void setYourthing(String yourthing) {
        this.yourthing = yourthing;
    }
    @JsonProperty
    public int getYourscale() {
        return yourscale;
    }
    @JsonProperty
    public void setYourscale(int yourscale) {
        this.yourscale = yourscale;
    }



    @JsonProperty
    public String getYourdrink() {
        return yourdrink;
    }
    @JsonProperty
    public void setYourdrink(String yourdrink) {
        this.yourdrink = yourdrink;
    }
    @JsonProperty
    public String getYourfood() {
        return yourfood;
    }
    @JsonProperty
    public void setYourfood(String yourfood) {
        this.yourfood = yourfood;
    }
    @JsonProperty
    public String getYourdessert() {
        return yourdessert;
    }
    @JsonProperty
    public void setYourdessert(String yourdessert) {
        this.yourdessert = yourdessert;
    }
}
