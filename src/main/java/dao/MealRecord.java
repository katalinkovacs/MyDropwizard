package dao;


public class MealRecord {

    public MealRecord(String drink, String food, String dessert){
        this.drink = drink;
        this.food = food;
        this.dessert = dessert;
    }

    private String drink;

    private String food;

    private String dessert;

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }
}
