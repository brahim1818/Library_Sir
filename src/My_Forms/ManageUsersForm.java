
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
public class ManageUsersForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageGenresForm
     */
    
     My_Classes.Users user = new My_Classes.Users();
     
    public ManageUsersForm() {
        initComponents();
        
        // center the form 
        this.setLocationRelativeTo(null);
        
        // add  border to the panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(242,217,132));
      jPanel1.setBorder(panelHeaderBorder);
      
      // display image in the top
         My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(75, 60,null, "/My_Images/user.png", jLabel_FormTitle);
        
        
       // customize the jtable
       
         func.customTable(jTable_Users_);
        // customize the jtable header row
      /*  jTable_Authors_.getTableHeader().setBackground(new Color(34,167,240)); // we will fix it later
        jTable_Authors_.getTableHeader().setForeground(Color.white);
        jTable_Authors_.getTableHeader().setFont(new Font("verdana",Font.BOLD,16));
        jTable_Authors_.getTableHeader().setOpaque(false);*/
      
      func.customTableHeader(jTable_Users_, new Color(34,167,240), 16);
        
        // hide the jlabel "empty name messsage"
        // you can make the labels color white
        // so they will not push the other element down
        jLabel_EmptyFirstName_.setForeground(Color.white);
        jLabel_EmptyLastName_.setForeground(Color.white);
        jLabel_EmptyUserName_.setForeground(Color.white);
        jLabel_EmptyPassword_.setForeground(Color.white);
        
        // populate Jtable with Users
          populateJtableWithUsers();

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_FirstName = new javax.swing.JTextField();
        jTextField_ID = new javax.swing.JTextField();
        jButton_Add_ = new javax.swing.JButton();
        jButton_Edit_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Users_ = new javax.swing.JTable();
        jLabel_EmptyFirstName_ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel_EmptyLastName_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField_1 = new javax.swing.JPasswordField();
        jPasswordField_2 = new javax.swing.JPasswordField();
        jLabel_EmptyUserName_ = new javax.swing.JLabel();
        jLabel_EmptyPassword_ = new javax.swing.JLabel();
        jCheckBox_SetAdmin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(242, 217, 132));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("   Manage Users");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(242, 217, 132));
        jLabel_CloseForm_.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_CloseForm_.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_CloseForm_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_.setText("x");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("First Name:");

        jTextField_FirstName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_ID.setEnabled(false);

        jButton_Add_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Add_.setText("Add");
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

        jButton_Edit_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Edit_.setText("Edit");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Delete_.setText("Delete");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jTable_Users_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_Users_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Users_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Users_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Users_);

        jLabel_EmptyFirstName_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_EmptyFirstName_.setForeground(new java.awt.Color(252, 0, 0));
        jLabel_EmptyFirstName_.setText("* enter the first name");
        jLabel_EmptyFirstName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyFirstName_MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Last Name:");

        jTextField_LastName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel_EmptyLastName_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_EmptyLastName_.setForeground(new java.awt.Color(252, 0, 0));
        jLabel_EmptyLastName_.setText("* enter the last name");
        jLabel_EmptyLastName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyLastName_MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Username:");

        jTextField_Username.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("Password:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Retype Password:");

        jPasswordField_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPasswordField_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_EmptyUserName_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_EmptyUserName_.setForeground(new java.awt.Color(252, 0, 0));
        jLabel_EmptyUserName_.setText("* enter the username");
        jLabel_EmptyUserName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyUserName_MouseClicked(evt);
            }
        });

        jLabel_EmptyPassword_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_EmptyPassword_.setForeground(new java.awt.Color(252, 0, 0));
        jLabel_EmptyPassword_.setText("* enter the password");
        jLabel_EmptyPassword_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyPassword_MouseClicked(evt);
            }
        });

        jCheckBox_SetAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox_SetAdmin.setText("Make This User an Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                            .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_EmptyLastName_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_LastName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_EmptyFirstName_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_FirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_EmptyUserName_, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jPasswordField_2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel_EmptyPassword_, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_SetAdmin))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyFirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyLastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyUserName_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyPassword_, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox_SetAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
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

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ActionPerformed
        
        // add a new user
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String username = jTextField_Username.getText();
        String password_1 = String.valueOf(jPasswordField_1.getPassword());
        String password_2 =String.valueOf(jPasswordField_2.getPassword());
        String userType = "user";
        
        if(jCheckBox_SetAdmin.isSelected()){
            userType = "admin";
        }
        
        // check if the textfields are empty
        if(fname.trim().isEmpty()){
            
        jLabel_EmptyFirstName_.setForeground(Color.red);
              
        }
        else if(lname.trim().isEmpty()){
            
        jLabel_EmptyLastName_.setForeground(Color.red);
              
        }
        else if(username.trim().isEmpty()){
            
        //jLabel_EmptyUserName_.setVisible(true);
        jLabel_EmptyUserName_.setForeground(Color.red);
              
        }
        else if(password_1.trim().isEmpty()){
            
        //jLabel_EmptyPassword_.setVisible(true);
          jLabel_EmptyPassword_.setForeground(Color.red);
        }
        else if(!password_1.equals(password_2)){ // check the password_1 doesn't equal the password_2
            
         JOptionPane.showMessageDialog(null,"Retype the correct Password","password error",0);

        }
        
        // we need to check if this username already exists
        else if(user.checkUsernameExists(0,username)){
          JOptionPane.showMessageDialog(null,"This Username Already Exists Try Another One","Username Error",0);
  
        }
        
        else{
         
            user.addUser(fname,lname,username,password_1,userType);
            
             // refresh the Jtable users
               populateJtableWithUsers();
               
                 // clear text form the textfields
                 jTextField_ID.setText("");
                 jTextField_FirstName.setText("");
                 jTextField_LastName.setText("");
                 jTextField_Username.setText("");
                 jPasswordField_1.setText("");
                 jPasswordField_2.setText("");
                 jCheckBox_SetAdmin.setSelected(false);
            
        }
        
    
        
        
    }//GEN-LAST:event_jButton_Add_ActionPerformed

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed
        
         // edit user info
        
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String username = jTextField_Username.getText();
        String password_1 = String.valueOf(jPasswordField_1.getPassword());
        String password_2 =String.valueOf(jPasswordField_2.getPassword());
        String userType = "user";
        
        if(jCheckBox_SetAdmin.isSelected()){
            userType = "admin";
        }
        
        // check if the textfields are empty
        if(fname.trim().isEmpty()){
            
        jLabel_EmptyFirstName_.setForeground(Color.red);
              
        }
        else if(lname.trim().isEmpty()){
            
        jLabel_EmptyLastName_.setForeground(Color.red);
              
        }
        else if(username.trim().isEmpty()){
            
        //jLabel_EmptyUserName_.setVisible(true);
        jLabel_EmptyUserName_.setForeground(Color.red);
              
        }
        else if(password_1.trim().isEmpty()){
            
        //jLabel_EmptyPassword_.setVisible(true);
          jLabel_EmptyPassword_.setForeground(Color.red);
        }
        else if(!password_1.equals(password_2)){ // check the password_1 doesn't equal the password_2
            
         JOptionPane.showMessageDialog(null,"Retype the correct Password","password error",0);

        }
        
        else{
            
            try{
                
                  // we need to check if this username already exists
                  // when we update a user username  we need to check if it's  not also the current user (the user selected from jtable)
                 
                  int id = Integer.parseInt(jTextField_ID.getText());
                  
                  if(user.checkUsernameExists(id,username)){
                  JOptionPane.showMessageDialog(null,"This Username Already Exists Try Another One","Username Error",0);
  
                   }else{
                      user.editUser(id,fname,lname,username,password_1,userType);
                 
                      // refresh the Jtable users
                      populateJtableWithUsers();
                      
                  // clear text form the textfields
                 jTextField_ID.setText("");
                 jTextField_FirstName.setText("");
                 jTextField_LastName.setText("");
                 jTextField_Username.setText("");
                 jPasswordField_1.setText("");
                 jPasswordField_2.setText("");
                 jCheckBox_SetAdmin.setSelected(false);
                      
                  }
                
                  
                 
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Select the user you want to edit from the table","No id selected",0);

            }
         
           
            // refresh the Jtable  Genres
          // populateJtableWithGenres();

            
        }
        
    
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
       
        // delete the selected user
        try{
                 int id = Integer.parseInt(jTextField_ID.getText());
                 
                 // show confirmation message before removing the user
                 
                  int confirm = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Delete This user ?","Confirmation Box",JOptionPane.YES_NO_OPTION);
             
                  if(confirm == JOptionPane.YES_OPTION){
                    user.removeUser(id);  
                  }
                 
                 
                  
                 
                  // refresh the Jtable users
                 populateJtableWithUsers();
                 
                 // clear text form the textfields
                 jTextField_ID.setText("");
                 jTextField_FirstName.setText("");
                 jTextField_LastName.setText("");
                 jTextField_Username.setText("");
                 jPasswordField_1.setText("");
                 jPasswordField_2.setText("");
                 jCheckBox_SetAdmin.setSelected(false);


            }
             catch(NumberFormatException ex){
                
             JOptionPane.showMessageDialog(null,"Invalid User ID - " + ex.getMessage(),"error",0);

            }
        
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jTable_Users_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Users_MouseClicked
      
        // display the selected author
        
       // get the selected row index
       int index = jTable_Users_.getSelectedRow();
       
       //get values
       String id = jTable_Users_.getValueAt(index,0).toString();
       
       String firstName = jTable_Users_.getValueAt(index,1).toString();
       
       String lastName = jTable_Users_.getValueAt(index,2).toString();
       
       String username = jTable_Users_.getValueAt(index,3).toString();
       
       String password = jTable_Users_.getValueAt(index,4).toString();
       
        String userType = jTable_Users_.getValueAt(index,5).toString();
       
       // show data in  textfields
       
       jTextField_ID.setText(id);
       jTextField_FirstName.setText(firstName);
       jTextField_LastName.setText(lastName);
       jTextField_Username.setText(username);
       jPasswordField_1.setText(password);
        jPasswordField_2.setText(password);
       
       if(userType.equals("admin")){
           jCheckBox_SetAdmin.setSelected(true);
       }
       else{
           jCheckBox_SetAdmin.setSelected(false);
       }
       

       
    }//GEN-LAST:event_jTable_Users_MouseClicked

    // create a function to populate the jtable with users
    public void populateJtableWithUsers()
    {
        
        ArrayList<My_Classes.Users> usersList = user.usersList();
        
        // jtable columns
        String[] colNames = {"ID","F-Name","L-Name","U-Name","Pass","Type"};
        
        // row
        Object[][] rows = new Object[usersList.size()][colNames.length];
        
        for(int i = 0; i < usersList.size(); i++){
            
              rows[i][0] = usersList.get(i).getId();
              rows[i][1] = usersList.get(i).getFirstname();
              rows[i][2] = usersList.get(i).getLastname();
              rows[i][3] = usersList.get(i).getUsername();
              rows[i][4] = usersList.get(i).getPassword();
              rows[i][5] = usersList.get(i).getUserType();

        }
        
        DefaultTableModel model = new DefaultTableModel(rows,colNames);
        jTable_Users_.setModel(model);
        
        
    }
    
    
    private void jLabel_EmptyFirstName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyFirstName_MouseClicked
      
        // hide this jlabel on click
        jLabel_EmptyFirstName_.setForeground(Color.white);

    }//GEN-LAST:event_jLabel_EmptyFirstName_MouseClicked

    private void jLabel_EmptyLastName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyLastName_MouseClicked
     
        jLabel_EmptyLastName_.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_EmptyLastName_MouseClicked

    private void jLabel_EmptyUserName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyUserName_MouseClicked
           jLabel_EmptyUserName_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyUserName_MouseClicked

    private void jLabel_EmptyPassword_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyPassword_MouseClicked
          jLabel_EmptyPassword_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyPassword_MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    
                   // javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JCheckBox jCheckBox_SetAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_EmptyFirstName_;
    private javax.swing.JLabel jLabel_EmptyLastName_;
    private javax.swing.JLabel jLabel_EmptyPassword_;
    private javax.swing.JLabel jLabel_EmptyUserName_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_1;
    private javax.swing.JPasswordField jPasswordField_2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Users_;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
