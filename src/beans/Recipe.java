/**
 * gets the whole recipe object
 * zoo/animal example: 
 * https://stackoverflow.com/questions/8273409/how-to-assign-multiple-objects-to-another-class-object
 */
package beans;

/**
 *
 * @author Tender
 */
public class Recipe {
    
    private String name;
    private int servings;
    private String notes;
    private Ingredient[] ingredient;
    private int ingredientSize;

    public Recipe() {
        name = "";
        servings = 0;
        notes = "";
    }

    public Recipe(String name, String notes, int servings, int ingredientCapacity) {
        ingredientSize = 0;
        this.name = name;
        this.notes = notes;
        this.servings = servings;
        ingredient = new Ingredient[ingredientCapacity];
    }

    public Recipe(String rName, String notes) {
        this.name = rName;
        this.notes = notes;
    }

    public Recipe(String rName, int servings, String notes) {
        this.name = rName;
        this.servings = servings;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }   

    public Ingredient[] getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingred) {
        ingredient[ingredientSize] = ingred;
        ingredientSize++;
    }
    
    @Override
    public String toString() {
        String recipe = "Recipe: " + name + "\nNotes: " + notes + "\nServings: " + servings + "\nIngredient List:\n";        
        recipe += "NAME\tAMT\tUNIT\tCAL\tFAT\tCHOL\tSODIM\tCARBS\tFIBER\tPROTN\n";
        for ( int i = 0; i < ingredientSize; i++) {
            recipe += ingredient[i].toString() + "\n";
        }            
        return recipe;        
    }
    
    
}
