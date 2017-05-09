package resources;

import representation.SaySomething;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * Created by kati on 8/05/2017.
 */


@Path("/saysomething")
@Produces(MediaType.APPLICATION_JSON)

public class SaySomethingResource {

    private String message;
    private String serverurl;

    public  SaySomethingResource(String message, String serverulr){
        this.message = message;
        this.serverurl = serverulr;
    }

    @GET
    public SaySomething saySomething() throws IOException {
        // return new SaySomething("welcome" , "Kati");
        return new SaySomething("welcome" , message);
    }


    @GET
    @Path("/serverurl")
    public SaySomething saySomethingUrl() throws IOException {
        // return new SaySomething("welcome" , "Kati");
        return new SaySomething("serverulr" ,serverurl );
    }



}
