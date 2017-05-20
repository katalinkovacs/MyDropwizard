package representation;

public class Meal {

    
    public String getKind() {
        return kind;
    }

    
    public void setKind(String kind) {
        this.kind = kind;
    }

    private String kind;
    private String drink;
    private String food;
    private String dessert;

    public Meal(String kind, String drink, String food, String dessert) {
        this.kind = kind;
        this.drink = drink;
        this.food = food;
        this.dessert = dessert;
    }

    public Meal(){

    }

    
    public void setDrink(String drink) {
        this.drink = drink;
    }

    
    public void setFood(String food) {
        this.food = food;
    }

    
    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    
    public String getDrink() {
        return drink;
    }

    
    public String getFood() {
        return food;
    }

    
    public String getDessert() {
        return dessert;
    }
}
