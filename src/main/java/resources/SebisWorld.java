package resources;

import representation.Meal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/sebi")
public class SebisWorld {

    private String yourdrink;
    private String yourfood;
    private String yourdessert;



    public SebisWorld(){

    }



    @GET
    @Path("/breakfast")
    @Produces(MediaType.APPLICATION_JSON)
    public Meal breakfast() throws IOException {
        return new Meal( "milk", "cereal", "fruit");
    }

    @GET
    @Path("/lunch")
    @Produces(MediaType.APPLICATION_JSON)
    public Meal lunch() throws IOException {
        //return new Meal( yourdrink, yourfood, yourdessert);
        return new Meal( "orange juice", "pasta", "pudding");
    }

    @GET
    @Path("/dinner")
    @Produces(MediaType.APPLICATION_JSON)
    public Meal dinner() throws IOException {
        return new Meal( "tea", "chicken with rice", "pancake");
    }





}
