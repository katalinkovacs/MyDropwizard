package resources;

import representation.SaySomething;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;


@Path("/saysomething")
public class SaySomethingResource {

    private String message;
    private String serverurl;

    //constructor
    public  SaySomethingResource(String message, String serverulr){
        this.message = message;
        this.serverurl = serverulr;
    }


    /*

    @GET
    @Path("/text")
    @Produces(MediaType.TEXT_PLAIN)
    public String saySomething2() throws IOException {
        return "welcome kati";
        //return new SaySomething("welcome" , message);
    }





*/

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public SaySomething saySomething() throws IOException {
        return new SaySomething("welcome" , "Kati");
        //return new SaySomething("welcome" , message);
    }


    @GET
    @Path("/serverurl")
    public SaySomething saySomethingUrl() throws IOException {
        return new SaySomething("serverurl" ,serverurl );
    }




}
