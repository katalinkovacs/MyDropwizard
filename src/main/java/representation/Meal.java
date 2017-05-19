package representation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meal {

    private String drink;
    private String food;
    private String dessert;

    public Meal(String drink, String food, String dessert) {
        this.drink = drink;
        this.food = food;
        this.dessert = dessert;
    }

    @JsonProperty
    public String getDrink() {
        return drink;
    }

    @JsonProperty
    public String getFood() {
        return food;
    }

    @JsonProperty
    public String getDessert() {
        return dessert;
    }
}
