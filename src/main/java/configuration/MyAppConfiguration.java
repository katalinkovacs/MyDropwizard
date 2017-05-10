package configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.dropwizard.Configuration;


public class MyAppConfiguration extends Configuration{


    private String message;
    private String ftpserverurl;


    private String doing;
    private String something;


    @JsonPropertyOrder
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


    @JsonPropertyOrder
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
}
