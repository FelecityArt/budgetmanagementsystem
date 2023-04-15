import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Cursor;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Felicia
 */
public class ExpensesPanel extends javax.swing.JPanel {

    
    private void hideTables() {
        entertainmentScrollPane.setVisible(false);
        entertainmentTable.setVisible(false);
        foodScrollPane.setVisible(false);
        foodTable.setVisible(false);
        travelScrollPane.setVisible(false);
        travelTable.setVisible(false);
        housingScrollPane.setVisible(false);
        housingTable.setVisible(false);
        housingScrollPane.setVisible(false);
        housingTable.setVisible(false);
        otherScrollPane1.setVisible(false);
        otherTable1.setVisible(false);
    }
    
    private JTable visibleTable() {
        if (housingTable.isVisible()) {
            return housingTable;
        } else if (foodTable.isVisible()) {
            return foodTable;
        } else if (entertainmentTable.isVisible()) {
            return entertainmentTable;
        } else if (travelTable.isVisible()) {
            return travelTable;
        } else if (otherTable1.isVisible()) {
            return otherTable1;
        } else {
            return null;
        }
    }
    /**
     * Creates new form ExpensesPanel
     */
    public ExpensesPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        expensesPanel = new javax.swing.JPanel();
        expensesLabel = new javax.swing.JLabel();
        selectDateLabel = new javax.swing.JLabel();
        foodButton = new javax.swing.JButton();
        travelButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        housingButton = new javax.swing.JButton();
        entertainmentButton = new javax.swing.JButton();
        otherButton = new javax.swing.JButton();
        addDataButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        calendar = new com.toedter.calendar.JCalendar();
        entertainmentScrollPane = new javax.swing.JScrollPane();
        entertainmentTable = new javax.swing.JTable();
        foodScrollPane = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        travelScrollPane = new javax.swing.JScrollPane();
        travelTable = new javax.swing.JTable();
        housingScrollPane = new javax.swing.JScrollPane();
        housingTable = new javax.swing.JTable();
        otherScrollPane1 = new javax.swing.JScrollPane();
        otherTable1 = new javax.swing.JTable();
        deleteButton1 = new javax.swing.JButton();
        renameButton1 = new javax.swing.JButton();

        expensesPanel.setBackground(new java.awt.Color(255, 255, 255));
        expensesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        expensesLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        expensesLabel.setText("Expenses");
        expensesPanel.add(expensesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 40));

        selectDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectDateLabel.setText("Select date:");
        expensesPanel.add(selectDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 100, 30));

        foodButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        foodButton.setBackground(new java.awt.Color(255, 204, 204));
        foodButton.setText("Food");
        foodButton.setBorderPainted(false);
        foodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodButtonActionPerformed(evt);
            }
        });
        expensesPanel.add(foodButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        travelButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        travelButton.setBackground(new java.awt.Color(255, 255, 153));
        travelButton.setText("Travel");
        travelButton.setBorderPainted(false);
        travelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelButtonActionPerformed(evt);
            }
        });
        expensesPanel.add(travelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        filterButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        filterButton.setBackground(new java.awt.Color(204, 153, 255));
        filterButton.setText("FILTER");
        expensesPanel.add(filterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        housingButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        housingButton.setBackground(new java.awt.Color(205, 204, 255));
        housingButton.setText("Housing");
        housingButton.setBorderPainted(false);
        housingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                housingButtonActionPerformed(evt);
            }
        });
        expensesPanel.add(housingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        entertainmentButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        entertainmentButton.setBackground(new java.awt.Color(204, 255, 255));
        entertainmentButton.setText("Entertainment");
        entertainmentButton.setBorderPainted(false);
        entertainmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entertainmentButtonActionPerformed(evt);
            }
        });
        expensesPanel.add(entertainmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        otherButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        otherButton.setBackground(new java.awt.Color(235, 255, 204));
        otherButton.setText("Other");
        otherButton.setBorderPainted(false);
        otherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherButtonActionPerformed(evt);
            }
        });
        otherButton.setVisible(true);
        expensesPanel.add(otherButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        addDataButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addDataButton.setBackground(new java.awt.Color(51, 255, 255));
        addDataButton.setText("ADD DATA");
        addDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataButtonActionPerformed(evt);
            }
        });
        expensesPanel.add(addDataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, -1, -1));

        saveButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        saveButton.setBackground(new java.awt.Color(112, 0, 73));
        saveButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("SAVE");
        saveButton.setBorderPainted(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        expensesPanel.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 240, -1));

        calendar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        calendar.setToolTipText("Select a date");
        calendar.setDecorationBackgroundColor(new java.awt.Color(105, 255, 222));
        expensesPanel.add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 240, 150));

        entertainmentTable.setAutoCreateRowSorter(true);
        entertainmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Amusement Park", "$", "$", "$"},
                {"Concert", "$", "$", "$"},
                {"Hotel stay", "$", "$", "$"},
                {"Games", "$", "$", "$"},
                {"Party", "$", "$", "$"}
            },
            new String [] {
                "Expense", "Budget", "Actual Spent", "Difference"
            }
        ));
        entertainmentTable.setToolTipText("Double-click to edit data");
        entertainmentTable.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        entertainmentTable.setGridColor(new java.awt.Color(112, 0, 73));
        entertainmentTable.setInheritsPopupMenu(true);
        entertainmentTable.setName(""); // NOI18N
        entertainmentTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        entertainmentTable.setShowGrid(true);
        entertainmentTable.setSurrendersFocusOnKeystroke(true);
        entertainmentTable.getTableHeader().setReorderingAllowed(false);
        entertainmentScrollPane.setViewportView(entertainmentTable);

        expensesPanel.add(entertainmentScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 600, 450));

        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Breakfast", "", "", ""},
                {"Lunch", null, null, null},
                {"Dinner", null, "", null},
                {"Drinks", null, null, null}
            },
            new String [] {
                "Expense", "Budget", "Actual Spent", "Difference"
            }
        ));
        foodTable.setGridColor(new java.awt.Color(112, 0, 73));
        foodTable.setShowGrid(true);
        foodScrollPane.setViewportView(foodTable);

        expensesPanel.add(foodScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 600, 450));

        travelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Flight", "", "", ""},
                {"Fuel", null, null, null},
                {"Taxi fare", null, "", null},
                {"Bus fare", null, null, null},
                {"Parking", null, null, null}
            },
            new String [] {
                "Expense", "Budget", "Actual Spent", "Difference"
            }
        ));
        travelTable.setGridColor(new java.awt.Color(112, 0, 73));
        travelTable.setShowGrid(true);
        travelScrollPane.setViewportView(travelTable);

        expensesPanel.add(travelScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 600, 450));

        housingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" Rent/Mortgage", "", "", ""},
                {"Taxes", null, null, null},
                {"Water ", null, "", null},
                {"Gas", null, null, null},
                {"Electricity", null, null, null},
                {"Cable/Internet services", null, null, null},
                {"Insurance", null, null, null},
                {"Maintenance", null, null, null}
            },
            new String [] {
                "Expense", "Budget", "Actual Spent", "Difference"
            }
        ));
        housingTable.setGridColor(new java.awt.Color(112, 0, 73));
        housingTable.setShowGrid(true);
        housingScrollPane.setViewportView(housingTable);

        expensesPanel.add(housingScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 600, 450));

        otherTable1.setAutoCreateRowSorter(true);
        otherTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Expense 1", "$", "$", "$"},
                {"Expense 2", "$", "$", "$"},
                {"Expense 3", "$", "$", "$"},
                {"Expense 4", "$", "$", "$"},
                {"Expense 5", "$", "$", "$"}
            },
            new String [] {
                "Expense", "Budget", "Actual Spent", "Difference"
            }
        ));
        otherTable1.setToolTipText("Double-click to edit data");
        otherTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        otherTable1.setGridColor(new java.awt.Color(112, 0, 73));
        otherTable1.setInheritsPopupMenu(true);
        otherTable1.setName(""); // NOI18N
        otherTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        otherTable1.setShowGrid(true);
        otherTable1.setSurrendersFocusOnKeystroke(true);
        otherTable1.getTableHeader().setReorderingAllowed(false);
        otherScrollPane1.setViewportView(otherTable1);

        expensesPanel.add(otherScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 600, 450));

        saveButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        deleteButton1.setBackground(new java.awt.Color(255, 0, 102));
        deleteButton1.setText("DELETE");
        expensesPanel.add(deleteButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, -1, -1));

        saveButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        renameButton1.setBackground(new java.awt.Color(255, 255, 0));
        renameButton1.setText("RENAME");
        expensesPanel.add(renameButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(expensesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(expensesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void foodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodButtonActionPerformed
        hideTables();
        foodScrollPane.setVisible(true);
        foodTable.setVisible(true);
    }//GEN-LAST:event_foodButtonActionPerformed

    private void travelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travelButtonActionPerformed
        hideTables();
        travelScrollPane.setVisible(true);
        travelTable.setVisible(true);
    }//GEN-LAST:event_travelButtonActionPerformed

    private void housingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_housingButtonActionPerformed
        hideTables();
        housingScrollPane.setVisible(true);
        housingTable.setVisible(true);
    }//GEN-LAST:event_housingButtonActionPerformed

    private void entertainmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entertainmentButtonActionPerformed
        hideTables();
        entertainmentScrollPane.setVisible(true);
        entertainmentTable.setVisible(true);
    }//GEN-LAST:event_entertainmentButtonActionPerformed

    private void otherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherButtonActionPerformed
        hideTables();
        otherScrollPane1.setVisible(true);
        otherTable1.setVisible(true);
    }//GEN-LAST:event_otherButtonActionPerformed

    private void addDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataButtonActionPerformed
        // Get the currently visible table
        JTable visibleTable = visibleTable();
        // Get the table model of the visible table
        DefaultTableModel model = (DefaultTableModel) visibleTable.getModel();
        // Create a new row of data to add to the table
        Object[] newRowData = {"New Expense", null, null, null};
        // Add the new row to the table model
        model.addRow(newRowData);
    }//GEN-LAST:event_addDataButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDataButton;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JButton entertainmentButton;
    private javax.swing.JScrollPane entertainmentScrollPane;
    private javax.swing.JTable entertainmentTable;
    private javax.swing.JLabel expensesLabel;
    private javax.swing.JPanel expensesPanel;
    private javax.swing.JButton filterButton;
    private javax.swing.JButton foodButton;
    private javax.swing.JScrollPane foodScrollPane;
    private javax.swing.JTable foodTable;
    private javax.swing.JButton housingButton;
    private javax.swing.JScrollPane housingScrollPane;
    private javax.swing.JTable housingTable;
    private javax.swing.JButton otherButton;
    private javax.swing.JScrollPane otherScrollPane1;
    private javax.swing.JTable otherTable1;
    private javax.swing.JButton renameButton1;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel selectDateLabel;
    private javax.swing.JButton travelButton;
    private javax.swing.JScrollPane travelScrollPane;
    private javax.swing.JTable travelTable;
    // End of variables declaration//GEN-END:variables
}
