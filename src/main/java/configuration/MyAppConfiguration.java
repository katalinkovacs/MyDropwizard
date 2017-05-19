package configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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


}
