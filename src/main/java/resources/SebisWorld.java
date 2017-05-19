package resources;

import dao.MealRecord;
import dao.MockDB;
import representation.Meal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/sebi")
public class SebisWorld {


    MockDB mDB = new MockDB();


    public SebisWorld(){
    }

    @GET
    @Path("/breakfast")
    @Produces(MediaType.APPLICATION_JSON)
    public Meal breakfast() throws IOException {
        //get breakfast object from map
        MealRecord breakfast = mDB.getMealTable().get("breakfast");
        return new Meal( breakfast.getDrink(), breakfast.getFood(), breakfast.getDessert());
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
