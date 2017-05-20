package representation;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MealXML {



    private String kind;
    private String drink;
    private String food;
    private String dessert;

    public MealXML(String kind, String drink, String food, String dessert) {
        this.kind = kind;
        this.drink = drink;
        this.food = food;
        this.dessert = dessert;
    }

    public MealXML(){

    }

    public String getKind() {
        return kind;
    }


    public void setKind(String kind) {
        this.kind = kind;
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
