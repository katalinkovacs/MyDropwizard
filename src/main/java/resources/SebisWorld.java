package resources;

import dao.MealRecord;
import dao.MockDB;
import representation.Meal;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
        return new Meal( "breakfast", breakfast.getDrink(), breakfast.getFood(), breakfast.getDessert());
    }

    @GET
    @Path("/lunch")
    @Produces(MediaType.APPLICATION_JSON)
    public Meal lunch() throws IOException {
        //return new Meal( yourdrink, yourfood, yourdessert);
        //return new Meal( "orange juice", "pasta", "pudding");
        //get breakfast object from map
        MealRecord lunch = mDB.getMealTable().get("lunch");
        return new Meal( "lunch", lunch.getDrink(), lunch.getFood(), lunch.getDessert());
    }

    @GET
    @Path("/dinner")
    @Produces(MediaType.APPLICATION_JSON)
    public Meal dinner() throws IOException {
        //return new Meal( "tea", "chicken with rice", "pancake");
        MealRecord dinner = mDB.getMealTable().get("dinner");
        return new Meal("dinner", dinner.getDrink(), dinner.getFood(), dinner.getDessert());
    }


    @GET
    @Path("/mealrequest")
    @Produces(MediaType.APPLICATION_JSON)
    public Meal getSpecialMeal(@QueryParam("kind") String kind){
        MealRecord specialMeal = mDB.getMealTable().get(kind);
        return new Meal(kind, specialMeal.getDrink(), specialMeal.getFood(), specialMeal.getDessert());
    }

    @POST
    @Path("/mealrequest")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response acceptMealRequets(Meal meal){
        mDB.getMealTable().put(meal.getKind(), new MealRecord(meal.getDrink(), meal.getFood(), meal.getDessert()));
        return Response.ok("Meal accpeted").build();
    }





}
