
package My_Forms;

import My_Classes.Author;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author you
 */
public class AuthorsListForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageGenresForm
     */
    
     My_Classes.Author author = new My_Classes.Author();
     public String formType = "";
     
    public AuthorsListForm() {
        initComponents();
        
        // center the form 
        this.setLocationRelativeTo(null);
        
        // add  border to the panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(1,50,67));
      jPanel1.setBorder(panelHeaderBorder);
      
      // display image in the top
         My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(75, 60,null, "/My_Images/author.png", jLabel_FormTitle);
        
        
       // customize the jtable
       
         func.customTable(jTable_Authors_);
        // customize the jtable header row
      /*  jTable_Authors_.getTableHeader().setBackground(new Color(34,167,240)); // we will fix it later
        jTable_Authors_.getTableHeader().setForeground(Color.white);
        jTable_Authors_.getTableHeader().setFont(new Font("verdana",Font.BOLD,16));
        jTable_Authors_.getTableHeader().setOpaque(false);*/
      
      func.customTableHeader(jTable_Authors_, new Color(34,167,240), 16);
        
      
      
        // populate Jtable with Authors
        populateJtableWithAuthors();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Authors_ = new javax.swing.JTable();
        jButton_Select_Author_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(1, 50, 67));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Authors List");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(1, 50, 67));
        jLabel_CloseForm_.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_CloseForm_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseForm_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_.setText("x");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jTable_Authors_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_Authors_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Authors_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Authors_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Authors_);

        jButton_Select_Author_.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jButton_Select_Author_.setText("Select Author");
        jButton_Select_Author_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Select_Author_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Select_Author_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Select_Author_, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
    
        // close the form
        this.dispose();
        
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jTable_Authors_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Authors_MouseClicked
      
      
       
       
    }//GEN-LAST:event_jTable_Authors_MouseClicked

    private void jButton_Select_Author_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Select_Author_ActionPerformed
          // display the selected author
        
       // get the selected row index
       int index = jTable_Authors_.getSelectedRow();
       
       //get values
       int id = Integer.parseInt(jTable_Authors_.getValueAt(index,0).toString());
       
       String firstName = jTable_Authors_.getValueAt(index,1).toString();
       
       String lastName = jTable_Authors_.getValueAt(index,2).toString();
       
      
       String full_name = firstName +" "+lastName; 
       
       if(formType.equals("edit")) // if this form is called from the edit book form
      EditBookForm.displayAuthorData(id, full_name); 
       else
      AddBookForm.displayAuthorData(id, full_name); 
       
       // close this form
       this.dispose();
       
    }//GEN-LAST:event_jButton_Select_Author_ActionPerformed

    // create a function to populate the jtable with authors
    public void populateJtableWithAuthors()
    {
        
        ArrayList<My_Classes.Author> authorsList = author.authorsListe();
        
        // jtable columns
        String[] colNames = {"ID","F-Name","L-Name","Expertise","About"};
        
        // row
        Object[][] rows = new Object[authorsList.size()][colNames.length];
        
        for(int i = 0; i < authorsList.size(); i++){
            
              rows[i][0] = authorsList.get(i).getId();
              rows[i][1] = authorsList.get(i).getFirstName();
              rows[i][2] = authorsList.get(i).getLastName();
              rows[i][3] = authorsList.get(i).getField_Of_Expertise();
              rows[i][4] = authorsList.get(i).getAbout();

        }
        
        DefaultTableModel model = new DefaultTableModel(rows,colNames);
        jTable_Authors_.setModel(model);
        
        
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Select_Author_;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable_Authors_;
    // End of variables declaration//GEN-END:variables
}
