package configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;


public class MyAppConfiguration extends Configuration{

    //same variables as in yml file

    private String message;
    private String ftpserverurl;

    private String yourdrink;
    private String yourfood;
    private String yourdessert;


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
