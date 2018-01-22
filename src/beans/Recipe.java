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
    private String notes;

    public Recipe() {
        rName = "";
        servings = 0;
        weight = 0;
        notes = "";
    }

    public Recipe(String rName, int servings, double weight, String notes) {
        this.rName = rName;
        this.servings = servings;
        this.weight = weight;
        this.notes = notes;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }   

    @Override
    public String toString() {
        return "Recipe{" + "rName=" + rName + ", servings=" + servings + ", weight=" + weight + ", notes=" + notes + '}';
    }
    
    
}
