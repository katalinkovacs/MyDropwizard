package resources;

import representation.SaySomething;
import representation.SaySomethingXML;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;




@Path("/saysomething")
public class SaySomethingResource {

    private String message;
    private String serverurl;

    public  SaySomethingResource(String message, String serverulr){
        this.message = message;
        this.serverurl = serverulr;
    }

    @GET
    @Path("/text")
    @Produces(MediaType.TEXT_PLAIN)
    public String saySomethingText() throws IOException {
        return "hello zoli";
    }


    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public SaySomething saySomethingJson() throws IOException {
        // return new SaySomething("welcome" , "Kati");
        return new SaySomething("welcome" , "kati");

    }

    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public SaySomethingXML saySomethingXml() throws IOException {
        // return new SaySomething("welcome" , "Kati");
        SaySomethingXML ssxml = new SaySomethingXML();
        ssxml.setGreetings("hello");
        ssxml.setPeople("people");
        return ssxml;

    }


    @GET
    @Path("/serverurl")
    public SaySomething saySomethingUrl() throws IOException {
        return new SaySomething("serverurl" ,serverurl );
    }




}
