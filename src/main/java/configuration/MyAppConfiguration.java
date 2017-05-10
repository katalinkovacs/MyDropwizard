package configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.dropwizard.Configuration;


public class MyAppConfiguration extends Configuration{

    @JsonPropertyOrder
    public String getMessage() {
        return message;
    }

    @JsonProperty
    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    private String ftpserverurl;

    @JsonProperty
    public String getFtpserverurl() {
        return ftpserverurl;
    }

    @JsonProperty
    public void setFtpserverurl(String ftpserverurl) {
        this.ftpserverurl = ftpserverurl;
    }
}
