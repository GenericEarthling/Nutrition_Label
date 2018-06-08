/*
 * Save, Edit, and Delete ingredient objects from a file.
 */
package utilities;

import beans.Ingredient;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Tender
 */
public class FileManagement {
    private static final String DELIMITER = "|";
    private static final String NEW_LINE = "\n";
    private static final Path PATH = Paths.get("Data/ingredients.txt");

    public FileManagement() {
    }
    
    public static Boolean isDuplicate(String searchName) {
        File file = PATH.toFile();
        
        // search each line for a match        
        // if match is found, copy data into an ingredient object               
        try (BufferedReader in = new BufferedReader(
                                 new FileReader(file))) {
            String data = in.readLine();
            while (data != null) {
                StringTokenizer t = new StringTokenizer(data, DELIMITER);
                String iName = t.nextToken();
                if (searchName.equalsIgnoreCase(iName)) {
                    searchName = "";
                    return true;
                } 
                data = in.readLine();                
            } 
        } catch (IOException e) {
            System.err.println("Error: FileManagement/isDuplicate/try-catch: " + e);
        } 
        return false;
    }
    
    // saves the ingredient into a file
    public static void saveIngredient(Ingredient ingredient) throws IOException {   
        File file = PATH.toFile();
        // If file does not exist, create one.
        try {
            if (Files.notExists(PATH)) {
                Files.createFile(PATH);
            }
        } catch (IOException e)  {
            System.err.println("Error: FileManagement/saveIngredient/try-catch #1: " + e);
        }

        try (PrintWriter out = new PrintWriter(
                               new BufferedWriter(
                               new FileWriter(file, true)), true)) {
            // save each column of data in this specific order
            out.print(ingredient.getName() + DELIMITER);
            out.print(ingredient.getServingSize() + DELIMITER);
            out.print(ingredient.getCalories() + DELIMITER);
            out.print(ingredient.getFat()+ DELIMITER);
            out.print(ingredient.getCholesterol() + DELIMITER);
            out.print(ingredient.getSodium() + DELIMITER);
            out.print(ingredient.getCarbohydrates() + DELIMITER);
            out.print(ingredient.getFiber() + DELIMITER);
            out.print(ingredient.getProtein() + NEW_LINE);
        } catch (IOException e) {
             System.err.println("Error: FileManagement/saveIngredient/try-catch #2: " + e);
        }            
        
    } 
    
    // retrieve Ingredient object
    public static Ingredient fetchIngredient(String name) {

        Ingredient i = null;
        File file = PATH.toFile();
        
        // search each line for a match        
        // if match is found, copy data into an ingredient object               
        try (BufferedReader in = new BufferedReader(
                                 new FileReader(file))) {
            String data = in.readLine();
            while (data != null) {
                StringTokenizer t = new StringTokenizer(data, DELIMITER);
                String iName = t.nextToken();
                if (name.equalsIgnoreCase(iName)) {
                    Double servingSize = Double.parseDouble(t.nextToken());
                    Double calories = Double.parseDouble(t.nextToken());
                    Double fat = Double.parseDouble(t.nextToken());
                    Double cholesterol = Double.parseDouble(t.nextToken());
                    Double sodium = Double.parseDouble(t.nextToken());
                    Double carbs = Double.parseDouble(t.nextToken());
                    Double fiber = Double.parseDouble(t.nextToken());
                    Double protein = Double.parseDouble(t.nextToken());
                    i = new Ingredient(iName, servingSize, calories, fat, cholesterol, sodium, carbs, fiber, protein);
                    return i;
                } else {
                    data = in.readLine();
                }                
            } 
        } catch (IOException e) {
            System.err.println("Error: FileManagement/fetchIngredient/try-catch: " + e);
        } 
        return i;
    }

}
