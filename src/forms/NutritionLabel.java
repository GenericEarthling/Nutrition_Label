/*
 * This class displays the final recipe for printing or saving
 */
package forms;

import beans.Ingredient;
import static forms.MainWindow.ingredientList;
import static forms.MainWindow.ingredientRunningTotals;
import static forms.MainWindow.recipe;
import static forms.MainWindow.table;
import static forms.MainWindow.tableIngredientList;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilities.Calculate;
import static utilities.Calculate.totalNutrientForWholeRecipe;

/**
 *
 * @author Tender
 */
public class NutritionLabel extends javax.swing.JFrame {

    static DefaultTableModel tableIngredients;
    /**
     * Creates new form NutritionLabel
     */
    public NutritionLabel() {
        initComponents();
        
        // display recipe name and notes 
        jLabelName.setText(recipe.getrName());
        jTextAreaNotes.setText(recipe.getNotes());        
        
        // get total ingredient nutrient values for display in label
        jLabelCalories.setText(String.valueOf(ingredientRunningTotals.getCalories()));
        jLabelFat.setText(String.valueOf(ingredientRunningTotals.getFat()));
        jLabelCholesterol.setText(String.valueOf(ingredientRunningTotals.getCholesterol()));
        jLabelSodium.setText(String.valueOf(ingredientRunningTotals.getSodium()));
        jLabelCarbohydrates.setText(String.valueOf(ingredientRunningTotals.getCarbohydrates()));
        jLabelFiber.setText(String.valueOf(ingredientRunningTotals.getFiber()));
        jLabelProtein.setText(String.valueOf(ingredientRunningTotals.getProtein()));                      

        // table initiator with a for-each loop to populate the table
        tableIngredients = (DefaultTableModel)jTableIngredients.getModel();
        
        if (tableIngredientList == null) {
            JOptionPane.showMessageDialog(null, "Please close window and input ingredients for the recipe.",
                "Error!", JOptionPane.ERROR_MESSAGE);            
        } 
        
        for (Ingredient s: tableIngredientList) {
            double ingredAmt = s.getIngredAmt();
            String measure = s.getMeasure();
            String name = s.getiName();
            double servingSize = s.getServingSize();
            double calorieTotal = s.getCalories();
            double fatTotal = s.getFat();
            double cholTotal = s.getCholesterol();
            double sodiumTotal = s.getSodium();
            double carbTotal = s.getCarbohydrates();
            double fiberTotal = s.getFiber();
            double proteinTotal = s.getProtein();
            
//            jLabelArrayList.setText(String.valueOf(s));
            tableIngredients.insertRow(table.getRowCount(), new Object[]{ingredAmt, measure, name, servingSize, calorieTotal, fatTotal, cholTotal, sodiumTotal, carbTotal, fiberTotal, proteinTotal});
            System.out.println("NutritionLabel Class:: foreach s: " + s);
        }

        // arrayList display
        jLabelArrayList.setText(String.valueOf(tableIngredientList));
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogNameError = new javax.swing.JDialog();
        jPanelMainBkgd = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaNotes = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jPanelNutritionLabel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelCarbohydrates = new javax.swing.JLabel();
        jLabelFiber = new javax.swing.JLabel();
        jLabelSingleServingWeight = new javax.swing.JLabel();
        jLabelProtein = new javax.swing.JLabel();
        jLabelFat = new javax.swing.JLabel();
        jLabelCalories = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabelCholesterol = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelSodium = new javax.swing.JLabel();
        jButtonNumberServings = new javax.swing.JButton();
        jtfieldNumberServings = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtfieldWeight = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabelName = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableIngredients = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabelArrayList = new javax.swing.JLabel();
        jLabelArrayListHeading = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialogNameErrorLayout = new javax.swing.GroupLayout(jDialogNameError.getContentPane());
        jDialogNameError.getContentPane().setLayout(jDialogNameErrorLayout);
        jDialogNameErrorLayout.setHorizontalGroup(
            jDialogNameErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialogNameErrorLayout.setVerticalGroup(
            jDialogNameErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMainBkgd.setBackground(new java.awt.Color(255, 255, 255));

        jTextAreaNotes.setColumns(20);
        jTextAreaNotes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextAreaNotes.setLineWrap(true);
        jTextAreaNotes.setRows(5);
        jTextAreaNotes.setBorder(null);
        jScrollPane3.setViewportView(jTextAreaNotes);

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 0, 0));
        jLabel20.setText("Recipe Notes");

        jPanelNutritionLabel.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNutritionLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 72, 72));
        jLabel3.setText("Number of Servings");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(72, 72, 72));
        jLabel4.setText("Serving Size (grams)");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(72, 72, 72));
        jLabel5.setText("Calories");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(72, 72, 72));
        jLabel6.setText("Total Fat");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(72, 72, 72));
        jLabel7.setText("Carbohydrates");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(72, 72, 72));
        jLabel8.setText("Dietary Fiber");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(72, 72, 72));
        jLabel9.setText("Protein");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jLabelCarbohydrates.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelCarbohydrates.setText(" ");

        jLabelFiber.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelFiber.setText(" ");

        jLabelSingleServingWeight.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelSingleServingWeight.setText(" ");

        jLabelProtein.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelProtein.setText(" ");

        jLabelFat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelFat.setText(" ");

        jLabelCalories.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelCalories.setText(" ");

        jLabel1.setFont(new java.awt.Font("Impact", 0, 44)); // NOI18N
        jLabel1.setText("Nutrition Label");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(72, 72, 72));
        jLabel10.setText("Cholesterol");

        jLabelCholesterol.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelCholesterol.setText(" ");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(72, 72, 72));
        jLabel11.setText("Sodium");

        jLabelSodium.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelSodium.setText(" ");

        jButtonNumberServings.setBackground(new java.awt.Color(255, 102, 0));
        jButtonNumberServings.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jButtonNumberServings.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNumberServings.setText("ENTER");
        jButtonNumberServings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumberServingsActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(72, 72, 72));
        jLabel12.setText("Total Weight (grams)");

        jtfieldWeight.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jtfieldWeight.setText("Optional");

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelNutritionLabelLayout = new javax.swing.GroupLayout(jPanelNutritionLabel);
        jPanelNutritionLabel.setLayout(jPanelNutritionLabelLayout);
        jPanelNutritionLabelLayout.setHorizontalGroup(
            jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNutritionLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNutritionLabelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator3)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNutritionLabelLayout.createSequentialGroup()
                                    .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelProtein, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                        .addComponent(jLabelFiber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelCarbohydrates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanelNutritionLabelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jtfieldWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNutritionLabelLayout.createSequentialGroup()
                        .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNutritionLabelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelSingleServingWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelNutritionLabelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfieldNumberServings, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNumberServings))
                            .addGroup(jPanelNutritionLabelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelNutritionLabelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabelCalories, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelNutritionLabelLayout.createSequentialGroup()
                                        .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addGap(92, 92, 92)
                                        .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelSodium, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                            .addComponent(jLabelCholesterol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelFat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(23, 23, 23))))
        );
        jPanelNutritionLabelLayout.setVerticalGroup(
            jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNutritionLabelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtfieldWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNumberServings, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtfieldNumberServings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabelSingleServingWeight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabelCalories))
                .addGap(9, 9, 9)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabelFat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabelCholesterol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabelSodium))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabelCarbohydrates))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFiber)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNutritionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelProtein))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelName.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(153, 0, 0));
        jLabelName.setText("Recipe Name");

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 0, 0));
        jLabel21.setText("Ingredient List");

        jTableIngredients.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jTableIngredients.setForeground(new java.awt.Color(102, 102, 102));
        jTableIngredients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Amount", "Unit", "Ingredient", "Serving Size", "Calories", "Fat", "Cholesterol", "Sodium", "Carbohydrates", "Fiber", "Protein"
            }
        ));
        jTableIngredients.setToolTipText("");
        jTableIngredients.setFocusable(false);
        jTableIngredients.setGridColor(new java.awt.Color(102, 102, 102));
        jTableIngredients.setRowHeight(20);
        jTableIngredients.setRowMargin(3);
        jTableIngredients.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTableIngredients.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTableIngredients.setShowHorizontalLines(false);
        jTableIngredients.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTableIngredients);

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 0, 0));
        jLabel22.setText("Ingredient List");

        jLabelArrayList.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelArrayList.setForeground(new java.awt.Color(72, 72, 72));
        jLabelArrayList.setText("array list");

        jLabelArrayListHeading.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabelArrayListHeading.setForeground(new java.awt.Color(72, 72, 72));
        jLabelArrayListHeading.setText("Amount        Unit  Ingredient          Serve Size     Cal.      Fat    Chol.   Sodium    Carb.    Fiber  Protein");

        javax.swing.GroupLayout jPanelMainBkgdLayout = new javax.swing.GroupLayout(jPanelMainBkgd);
        jPanelMainBkgd.setLayout(jPanelMainBkgdLayout);
        jPanelMainBkgdLayout.setHorizontalGroup(
            jPanelMainBkgdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainBkgdLayout.createSequentialGroup()
                .addGroup(jPanelMainBkgdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainBkgdLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(jPanelMainBkgdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMainBkgdLayout.createSequentialGroup()
                                .addComponent(jPanelNutritionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanelMainBkgdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelMainBkgdLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanelMainBkgdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelArrayList)
                            .addComponent(jLabel22)
                            .addComponent(jLabelArrayListHeading))))
                .addGap(109, 109, 109))
        );
        jPanelMainBkgdLayout.setVerticalGroup(
            jPanelMainBkgdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainBkgdLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainBkgdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMainBkgdLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addComponent(jPanelNutritionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(8, 8, 8)
                .addComponent(jLabelArrayListHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelArrayList)
                .addGap(64, 64, 64))
        );

        getContentPane().add(jPanelMainBkgd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNumberServingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumberServingsActionPerformed
        
        int servings = Integer.parseInt(jtfieldNumberServings.getText());
        double weight = Double.parseDouble(jtfieldWeight.getText());
        double singleServingWeight = 0.0;
        // get total nutrient values for display in label

        if ( (weight > 0) && (servings > 0) ) {
            singleServingWeight = ( weight / servings );
            jLabelSingleServingWeight.setText(String.valueOf(singleServingWeight));
        } else {
            JOptionPane.showMessageDialog(null, "Please close window and input ingredients into the recipe.",
                "Error!", JOptionPane.ERROR_MESSAGE);
        }

        // get running totals
        double calories = ingredientRunningTotals.getCalories();
        double fat = ingredientRunningTotals.getFat();
        double cholesterol = ingredientRunningTotals.getCholesterol();
        double sodium = ingredientRunningTotals.getSodium();
        double carbs = ingredientRunningTotals.getCarbohydrates();
        double fiber = ingredientRunningTotals.getFiber();
        double protein = ingredientRunningTotals.getProtein();
        // calculate the nutrient per serving
        double caloriesPerServing = totalNutrientForWholeRecipe(calories, servings);
        double fatPerServing = totalNutrientForWholeRecipe(fat, servings);
        double cholPerServing = totalNutrientForWholeRecipe(cholesterol, servings);
        double sodiumPerServing = totalNutrientForWholeRecipe(sodium, servings);
        double carbsPerServing = totalNutrientForWholeRecipe(carbs, servings);
        double fiberPerServing = totalNutrientForWholeRecipe(fiber, servings);
        double proteinPerServing = totalNutrientForWholeRecipe(protein, servings); 
        
        // set the total ingredient nutrient values for display in label
        jLabelCalories.setText(String.valueOf(caloriesPerServing));
        jLabelFat.setText(String.valueOf(fatPerServing));
        jLabelCholesterol.setText(String.valueOf(cholPerServing));
        jLabelSodium.setText(String.valueOf(sodiumPerServing));
        jLabelCarbohydrates.setText(String.valueOf(carbsPerServing));
        jLabelFiber.setText(String.valueOf(fiberPerServing));
        jLabelProtein.setText(String.valueOf(proteinPerServing));        
    }//GEN-LAST:event_jButtonNumberServingsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NutritionLabel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNumberServings;
    private javax.swing.JDialog jDialogNameError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelArrayList;
    private javax.swing.JLabel jLabelArrayListHeading;
    private javax.swing.JLabel jLabelCalories;
    private javax.swing.JLabel jLabelCarbohydrates;
    private javax.swing.JLabel jLabelCholesterol;
    private javax.swing.JLabel jLabelFat;
    private javax.swing.JLabel jLabelFiber;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelProtein;
    private javax.swing.JLabel jLabelSingleServingWeight;
    private javax.swing.JLabel jLabelSodium;
    private javax.swing.JPanel jPanelMainBkgd;
    private javax.swing.JPanel jPanelNutritionLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTableIngredients;
    private javax.swing.JTextArea jTextAreaNotes;
    private javax.swing.JTextField jtfieldNumberServings;
    private javax.swing.JTextField jtfieldWeight;
    // End of variables declaration//GEN-END:variables
}
