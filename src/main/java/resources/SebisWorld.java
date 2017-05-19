package resources;

import representation.Mood;
import representation.Meal;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/sebi")
public class SebisWorld {

    private String yourmood;
    private String yourthing;
    private int yourscale;

    private String yourdrink;
    private String yourfood;
    private String yourdessert;


    //constructor
    public SebisWorld(String yourmood, String yourthing, int yourscale){
        this.yourmood = yourmood;
        this.yourthing = yourthing;
        this.yourscale = yourscale;
    }

    public SebisWorld(String yourdrink, String yourfood, String yourdessert){
        this.yourdrink = yourdrink;
        this.yourfood = yourfood;
        this.yourdessert = yourdessert;
    }

    @GET
    @Path("/mood1")
    @Produces(MediaType.APPLICATION_JSON)
    public Mood mood() throws IOException {
        return new Mood( "good", 9);
    }

    @GET
    @Path("/mood2")
    @Produces(MediaType.APPLICATION_JSON)
    public Mood mood2() throws IOException {
        return new Mood(yourmood, 4);
    }

    @GET
    @Path("/mood3")
    @Produces(MediaType.APPLICATION_JSON)
    public Mood mood3() throws IOException {
        return new Mood( yourthing, yourscale);
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
        return new Meal( yourdrink, yourfood, yourdessert);
    }





}
