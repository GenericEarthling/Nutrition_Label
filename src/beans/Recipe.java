/*
 * gets the whole recipe object
 */
package beans;

/**
 *
 * @author Tender
 */
public class Recipe {
    
    private String rName;
    private int servings;
    private double weight;
    private int temperature;
    private String cookTime;
    private String directions;

    public Recipe() {
        rName = "";
        servings = 0;
        weight = 0;
        temperature = 0;
        cookTime = "";
        directions = "";
    }

    public Recipe(String rName, int servings, double weight, 
            int temperature, String cookTime, String directions) {
        this.rName = rName;
        this.servings = servings;
        this.weight = weight;
        this.temperature = temperature;
        this.cookTime = cookTime;
        this.directions = directions;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCookTime() {
        return cookTime;
    }

    public void setCookTime(String cookTime) {
        this.cookTime = cookTime;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }   

    @Override
    public String toString() {
        return "Recipe{" + "rName=" + rName + ", servings=" + servings + ", weight=" + weight + ", temperature=" + temperature + ", cookTime=" + cookTime + ", directions=" + directions + '}';
    }
    
    
}
