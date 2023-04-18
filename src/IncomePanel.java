import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.Cursor;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Kimberly 
 */
public class IncomePanel extends javax.swing.JPanel {

    /**
     * Creates new form IncomePanel
     */
    public IncomePanel() {
        initComponents();
        loadData();
    }

    private void loadData() {
        Driver.loadTableData(incomeTable, Income.incomeFolder, "incomeTable.txt", Income.incomeData);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        budgetPanel = new javax.swing.JPanel();
        incomeLabel = new javax.swing.JLabel();
        sourceOfIncomeLabel = new javax.swing.JLabel();
        incomeField = new javax.swing.JTextField();
        amountLabel = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        incomeScrollPane = new javax.swing.JScrollPane();
        incomeTable = new javax.swing.JTable();
        calendar = new com.toedter.calendar.JCalendar();
        jLabel2 = new javax.swing.JLabel();
        saveTableButton = new javax.swing.JButton();
        loadIncomeButton = new javax.swing.JButton();
        saveIncomeButton = new javax.swing.JButton();
        clearTableButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        budgetPanel.setBackground(new java.awt.Color(255, 255, 255));
        budgetPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        incomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        incomeLabel.setText("Income");
        budgetPanel.add(incomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 40));

        sourceOfIncomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sourceOfIncomeLabel.setText("Source of Income:");
        budgetPanel.add(sourceOfIncomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        incomeField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        budgetPanel.add(incomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 210, 30));

        amountLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amountLabel.setText("Amount:");
        budgetPanel.add(amountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));

        amountField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        budgetPanel.add(amountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 210, 30));

        addButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addButton.setBackground(new java.awt.Color(57, 255, 50));
        addButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        addButton.setText("ADD ROW");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        budgetPanel.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 30));

        deleteButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        deleteButton.setBackground(new java.awt.Color(255, 51, 51));
        deleteButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        deleteButton.setText("DELETE ROW");
        deleteButton.setToolTipText("Type in ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        budgetPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 120, 30));

        incomeScrollPane.setFont(new java.awt.Font("Sinhala MN", 1, 14)); // NOI18N

        incomeTable.setAutoCreateRowSorter(true);
        incomeTable.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        incomeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Source of Income ", "Amount", "Date"
            }
        ));
        incomeTable.setToolTipText("Double click to edit data");
        CurrencyRenderer.formatCurrencyColumns(incomeTable, 1);
        incomeScrollPane.setViewportView(incomeTable);

        budgetPanel.add(incomeScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 490, 290));

        calendar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        calendar.setToolTipText("Select a date");
        calendar.setDecorationBackgroundColor(new java.awt.Color(51, 255, 255));
        budgetPanel.add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 240, 150));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Select Date:");
        budgetPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 100, 30));

        saveTableButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        saveTableButton.setBackground(new java.awt.Color(51, 255, 255));
        saveTableButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        saveTableButton.setText("SAVE TABLE");
        saveTableButton.setToolTipText("Type in ");
        saveTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTableButtonActionPerformed(evt);
            }
        });
        budgetPanel.add(saveTableButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 110, 30));

        loadIncomeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loadIncomeButton.setBackground(new java.awt.Color(57, 255, 50));
        loadIncomeButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loadIncomeButton.setText("LOAD");
        loadIncomeButton.setToolTipText("Load all tables for the selected date");
        loadIncomeButton.setAutoscrolls(true);
        loadIncomeButton.setBorderPainted(false);
        loadIncomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadIncomeButtonActionPerformed(evt);
            }
        });
        budgetPanel.add(loadIncomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 110, -1));

        saveIncomeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        saveIncomeButton.setBackground(new java.awt.Color(51, 255, 255));
        saveIncomeButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saveIncomeButton.setText("SAVE");
        saveIncomeButton.setToolTipText("Save all tables for the selected date");
        saveIncomeButton.setAutoscrolls(true);
        saveIncomeButton.setBorderPainted(false);
        saveIncomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveIncomeButtonActionPerformed(evt);
            }
        });
        budgetPanel.add(saveIncomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 120, -1));

        clearTableButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        clearTableButton.setBackground(new java.awt.Color(255, 0, 0));
        clearTableButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearTableButton.setForeground(new java.awt.Color(255, 255, 255));
        clearTableButton.setText("CLEAR TABLE");
        clearTableButton.setAutoscrolls(true);
        clearTableButton.setBorderPainted(false);
        clearTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTableButtonActionPerformed(evt);
            }
        });
        budgetPanel.add(clearTableButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 240, -1));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/income_bg.jpg"))); // NOI18N
        budgetPanel.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-480, -340, 1380, 940));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(budgetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(budgetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // Get the contents of the text field
        String textSource = incomeField.getText();
        String textAmount = amountField.getText();

        Date selectedDate = calendar.getDate();
        if (selectedDate == null) {
            // Notify the user that no date has been selected
            JOptionPane.showMessageDialog(null, "Please select a date.");
            return;
        }

        // Convert the selectedDate to the desired format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        String formattedDate = formatter.format(selectedDate);
        
        // Check if the text field is not empty
        if (!textSource.isEmpty() && !textAmount.isEmpty()) {
            // Create a new row with the text as data
            String [] rowData = {textSource, textAmount, formattedDate};
            
            // Add the row to the table
            DefaultTableModel model = (DefaultTableModel) incomeTable.getModel();
            
            model.addRow(rowData);
             
             // Clear the text fields
            incomeField.setText("");
            amountField.setText("");
        } else {
        // Display an error message
        JOptionPane.showMessageDialog(this, "Please enter text in both fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // Get the selected row index
        int selectedRowIndex = incomeTable.getSelectedRow();

        // Check if a row is selected
        if (selectedRowIndex != -1) {
            // Show a confirmation dialog to confirm the deletion
            int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this row?", "Confirmation", JOptionPane.YES_NO_OPTION);

            // Check if the user confirmed the deletion
            if (confirmation == JOptionPane.YES_OPTION) {
                // Get the table model
                DefaultTableModel model = (DefaultTableModel) incomeTable.getModel();

                // Remove the selected row from the table
                model.removeRow(selectedRowIndex);

                // Clear the text fields
                incomeField.setText("");
                amountField.setText("");
            }
        } else {
            // Display an error message
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
//GEN-LAST:event_deleteButtonActionPerformed

    private void saveTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTableButtonActionPerformed
        if (incomeTable != null) {
            DefaultTableModel incomeModel = (DefaultTableModel) incomeTable.getModel();
            int rowCount = incomeModel.getRowCount();
        
            if (Income.incomeData != null) {
                if (rowCount > 0) {
                    Income.incomeData.clear();
                    for (int i = 0; i < rowCount; i++) {
                        List<String> row = new ArrayList<>();
                        for (int j = 0; j < incomeModel.getColumnCount(); j++) {
                            row.add(incomeModel.getValueAt(i, j).toString());
                        }
                        Income.incomeData.add(row);
                    }
                    try {
                        String filename = "incomeTable.txt";
                        Driver.exportTable(Income.incomeData, Income.incomeFolder, filename);
                        JOptionPane.showMessageDialog(this, "Table has been saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "There is nothing to save!", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "The table is empty", "Warning", JOptionPane.WARNING_MESSAGE);
             }
        }        
    }//GEN-LAST:event_saveTableButtonActionPerformed

    private void loadIncomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadIncomeButtonActionPerformed
        // Get the selected date from the calendar
        Date selectedDate = calendar.getDate();
        if (selectedDate == null) {
            // Notify the user that no date has been selected
            JOptionPane.showMessageDialog(null, "Please select a date.");
            return;
        }
        // Import the tables using the selected date
        try {
            DefaultTableModel incomeModel = (DefaultTableModel) incomeTable.getModel();

            // Clear out any existing rows in the models
            incomeModel.setRowCount(0);

            Driver.importTable(incomeModel, Income.incomeFolder, "incomeTable.txt", selectedDate);

            // Notify the user that the tables have been imported
            SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
            String dateString = dateFormat.format(selectedDate);

            incomeTable.setModel(incomeModel);

            JOptionPane.showMessageDialog(null, "Tables imported successfully for " + dateString);
        } catch (IOException ex) {
            // Notify the user of any errors during the import process
            JOptionPane.showMessageDialog(null, "Error importing tables: " + ex.getMessage());
        }
    }//GEN-LAST:event_loadIncomeButtonActionPerformed

    private void saveIncomeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Get the selected date from the calendar
        Date selectedDate = calendar.getDate();
        if (selectedDate == null) {
            // Notify the user that no date has been selected
            JOptionPane.showMessageDialog(null, "Please select a date.");
            return;
        }
    
        DefaultTableModel incomeModel = (DefaultTableModel) incomeTable.getModel();
    
        // Check if the table is empty
        if (Income.checkEmpty(incomeModel)) {
            JOptionPane.showMessageDialog(null, "The table is empty.");
            return;
        }
    
        // Export the table using the selected date
        try {
            Driver.exportTable(Income.incomeData, Income.incomeFolder, "incomeTable.txt", selectedDate);
    
            // Format the date string in MMMM, dd, yyyy format
            SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
            String dateString = dateFormat.format(selectedDate);
            // Notify the user that the tables have been exported
            JOptionPane.showMessageDialog(null, "Tables exported successfully for " + dateString);
        } catch (IOException ex) {
            // Notify the user of any errors during the export process
            JOptionPane.showMessageDialog(null, "Error exporting the table: " + ex.getMessage());
        }
    }                                                

    private void clearTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTableButtonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all table data?", "Confirm Clear", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            DefaultTableModel incomeModel = (DefaultTableModel) incomeTable.getModel();
            Income.clearTableData(incomeModel);
        }
    }//GEN-LAST:event_clearTableButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JPanel budgetPanel;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JButton clearTableButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField incomeField;
    private javax.swing.JLabel incomeLabel;
    private javax.swing.JScrollPane incomeScrollPane;
    private javax.swing.JTable incomeTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loadIncomeButton;
    private javax.swing.JButton saveIncomeButton;
    private javax.swing.JButton saveTableButton;
    private javax.swing.JLabel sourceOfIncomeLabel;
    // End of variables declaration//GEN-END:variables
}
