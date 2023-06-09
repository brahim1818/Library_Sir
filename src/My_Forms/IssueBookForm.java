/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package My_Forms;

import My_Classes.Member;

import java.awt.Color;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author you
 */
public class IssueBookForm extends javax.swing.JFrame {

    /**
     * Creates new form MembersListForm
     */
    
    My_Classes.Member member = new My_Classes.Member();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
     My_Classes.Book book = new My_Classes.Book();
     My_Classes.Issue_Book issue = new My_Classes.Issue_Book();
     
     // these variables will help us check if the book and member exist
    boolean book_Exist = false;
    boolean member_Exist = false;
     
    
    public IssueBookForm() {
        initComponents();
        
        // center the form 
        this.setLocationRelativeTo(null);
        
        // add  border to the panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(108,122,137));
        jPanel1.setBorder(panelHeaderBorder);
        
           // display image in the top
        func.displayImage(90, 60,null, "/My_Images/agenda.jpg", jLabel_FormTitle);
         
        
      
        // add a white border  in the botton of the book name and member full name jlabel
        setBorderToJlabel(jLabel_BookName_,Color.white);
        setBorderToJlabel(jLabel_MemberFullName_,Color.white);
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton_Issue_ = new javax.swing.JButton();
        jButton_Cancel_ = new javax.swing.JButton();
        jDateChooser_IssueDate = new com.toedter.calendar.JDateChooser();
        jButton_search_book_ = new javax.swing.JButton();
        jLabel_BookName_ = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_MemberFullName_ = new javax.swing.JLabel();
        jButton_search_member_ = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel_Available = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser_Return_Date = new com.toedter.calendar.JDateChooser();
        jSpinner_BookId = new javax.swing.JSpinner();
        jSpinner_MemberID = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Note = new javax.swing.JTextArea();

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("Enter Member ID:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(108, 122, 137));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Issue Book");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(108, 122, 137));
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

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("Enter Book ID:");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setText("Issue Date :");

        jButton_Issue_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Issue_.setText("Issue");
        jButton_Issue_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Issue_ActionPerformed(evt);
            }
        });

        jButton_Cancel_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Cancel_.setText("Cancel");
        jButton_Cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel_ActionPerformed(evt);
            }
        });

        jButton_search_book_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_search_book_.setText("search book");
        jButton_search_book_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_book_ActionPerformed(evt);
            }
        });

        jLabel_BookName_.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel_BookName_.setForeground(new java.awt.Color(0, 51, 255));
        jLabel_BookName_.setText("Book Name");
        jLabel_BookName_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_BookName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BookName_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_BookName_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_BookName_MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setText("Enter Member ID:");

        jLabel_MemberFullName_.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel_MemberFullName_.setForeground(new java.awt.Color(0, 51, 255));
        jLabel_MemberFullName_.setText("Member Full-Name");
        jLabel_MemberFullName_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MemberFullName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullName_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullName_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullName_MouseExited(evt);
            }
        });

        jButton_search_member_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_search_member_.setText("search member");
        jButton_search_member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_member_ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setText("Is This Book Available:");

        jLabel_Available.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Available.setForeground(new java.awt.Color(0, 51, 255));
        jLabel_Available.setText("Yes-or-No");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel13.setText("Return Date :");

        jSpinner_BookId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jSpinner_MemberID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setText("Note :");

        jTextArea_Note.setColumns(20);
        jTextArea_Note.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Note);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSpinner_BookId))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_MemberID)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_search_member_)
                            .addComponent(jButton_search_book_, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 63, Short.MAX_VALUE)
                        .addComponent(jButton_Issue_, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel_BookName_))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel_MemberFullName_))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Available)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser_IssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_search_book_)
                    .addComponent(jSpinner_BookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_BookName_, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_search_member_))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel_MemberFullName_, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jLabel_Available, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jDateChooser_IssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Issue_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

    private void jButton_Issue_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Issue_ActionPerformed
       // issue a book 
       int _book_id = (int)jSpinner_BookId.getValue();
       int _member_id = (int)jSpinner_MemberID.getValue();
       String _note = jTextArea_Note.getText();
       
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       
       try{
           
            String _issue_date = dateFormat.format( jDateChooser_IssueDate.getDate());
             String _return_date = dateFormat.format( jDateChooser_Return_Date.getDate());
             
             // before issuing a book we need to check
             // if the return date came the issued date
             // we need to check if the book and member exists
             Date issDate = dateFormat.parse(_issue_date);
             Date rtnDate = dateFormat.parse(_return_date);
             
             
             if(!book_Exist){ // if the book doesn't exist
                 
              JOptionPane.showMessageDialog(null,"You Need To Check if this Book Exist First By clicking the Search Book Button","Check If The Book Exist",2);
    
             }
             else if(!member_Exist){ // if the member doesn't exist
                 
               JOptionPane.showMessageDialog(null,"You Need To Check if this Member Exist First By clicking the Search Member Button","Check If The Member Exist",2);
             }
             
             // we need to check if this book is available
             else if (!issue.checkBookAvailability(_book_id)){
                 JOptionPane.showMessageDialog(null,"This Book Is Not Available Right Now","Book Not Available",2);
             }
             
             else if(rtnDate.before(issDate)){  // if the return date is higher than the issue date
                 
                  JOptionPane.showMessageDialog(null,"The Return Date Must Be After The Issue Date","Wrong Return Date",2);
             }else{
                 issue.addIssue(_book_id, _member_id, "issued", _issue_date, _return_date, _note);
                 // reset fields
                 jSpinner_BookId.setValue(0);
                 jSpinner_MemberID.setValue(0);
                  jLabel_BookName_.setText("Book Name");
                  jLabel_MemberFullName_.setText("Member Full-Name");
                  jLabel_Available.setText("Yes-or-No");
                 jLabel_Available.setForeground(new Color(0,51,255));
                 jDateChooser_IssueDate.setDate(new Date());
                 jDateChooser_Return_Date.setDate(new Date());
                 book_Exist = false;
                 member_Exist = false;
             }
       
            
       }catch (HeadlessException | NullPointerException | ParseException ex) {
           JOptionPane.showMessageDialog(null,"Select Issue Date & Return Date","Select Date",2);

        }
      

    }//GEN-LAST:event_jButton_Issue_ActionPerformed

    private void jButton_Cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel_ActionPerformed
        // close the window
        this.dispose();
    }//GEN-LAST:event_jButton_Cancel_ActionPerformed

    private void jButton_search_book_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_book_ActionPerformed
          // search book by id
          // display the book title
           // check if this book is available or not
           
           // get the book id
           int book_id = (int)jSpinner_BookId.getValue();
        try {
             // get the book by id
            My_Classes.Book selectedBook = book.getBookById(book_id);
            
             if(selectedBook != null){
                  // display the book title/name
                  jLabel_BookName_.setText(selectedBook.getName());
                  // set the book exist to true
                  book_Exist = true;
                  
                  // display availability
                  if(issue.checkBookAvailability(book_id)){
                      
                      jLabel_Available.setText("Yes");
                      jLabel_Available.setForeground(Color.green);
                  }else{
                      jLabel_Available.setText("No");
                      jLabel_Available.setForeground(Color.red);
                  }
             }
             else{ // if this book doesn't exist
                 JOptionPane.showMessageDialog(null,"this book doesn't exist","Book Not Found",2);
                 jLabel_BookName_.setText("Book Name");
                 book_Exist = false;
                 jLabel_Available.setText("Yes-or-No");
                 jLabel_Available.setForeground(new Color(0,51,255));
             }
           
        } catch (SQLException ex) {
              Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        
    }//GEN-LAST:event_jButton_search_book_ActionPerformed

    private void jButton_search_member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_member_ActionPerformed
        // search member by id and display his full name
         
           // get the member id
           int member_id = (int)jSpinner_MemberID.getValue();
        try {
             // get the member by id
            My_Classes.Member selectedMember = member.getMemberById(member_id);
            
             if(selectedMember != null){
                  // display the member full-name
                  jLabel_MemberFullName_.setText(selectedMember.getFirstName()+" "+selectedMember.getLastName());
                  // set the member exist to true
                  member_Exist = true;
             
             }
             else{ // if this member doesn't exist
                 JOptionPane.showMessageDialog(null,"this member doesn't exist","Member Not Found",2);
                 jLabel_MemberFullName_.setText("Member Full-Name");
                 member_Exist = false;
             }
           
        } catch (SQLException ex) {
              Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        
    }//GEN-LAST:event_jButton_search_member_ActionPerformed

    private void jLabel_BookName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookName_MouseClicked
        // display the book info card
        int book_id = (int)jSpinner_BookId.getValue();
        BookInfoCardForm bookCardF = new BookInfoCardForm(book_id);
        bookCardF.setVisible(true);
    }//GEN-LAST:event_jLabel_BookName_MouseClicked

    private void jLabel_MemberFullName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberFullName_MouseClicked
        // display the member info card
         int member_id = (int)jSpinner_MemberID.getValue();
        MemberInfoCardForm memberCardF = new MemberInfoCardForm(member_id);
        memberCardF.setVisible(true);
        
    }//GEN-LAST:event_jLabel_MemberFullName_MouseClicked

    private void jLabel_BookName_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookName_MouseEntered
        // add a border in the botton of the book name jlabel       
        setBorderToJlabel(jLabel_BookName_,new Color(0,51,255));
        
    }//GEN-LAST:event_jLabel_BookName_MouseEntered

    private void jLabel_BookName_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookName_MouseExited
        // add a white border  in the botton of the book name jlabel
        setBorderToJlabel(jLabel_BookName_,Color.white);
    }//GEN-LAST:event_jLabel_BookName_MouseExited

    private void jLabel_MemberFullName_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberFullName_MouseEntered
          // add a border in the botton of the member full name jlabel       
        setBorderToJlabel(jLabel_MemberFullName_,new Color(0,51,255));
    }//GEN-LAST:event_jLabel_MemberFullName_MouseEntered

    private void jLabel_MemberFullName_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberFullName_MouseExited
            // add a white border  in the botton of the member full name jlabel
        setBorderToJlabel(jLabel_MemberFullName_,Color.white);
    }//GEN-LAST:event_jLabel_MemberFullName_MouseExited
    
    
    // create a little function to set border 
    public void setBorderToJlabel(JLabel label,Color color){
         Border border = BorderFactory.createMatteBorder(0,0,1,0,color);
        label.setBorder(border);
    }
   
  
    
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
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel_;
    private javax.swing.JButton jButton_Issue_;
    private javax.swing.JButton jButton_search_book_;
    private javax.swing.JButton jButton_search_member_;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser_IssueDate;
    private com.toedter.calendar.JDateChooser jDateChooser_Return_Date;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Available;
    private javax.swing.JLabel jLabel_BookName_;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_MemberFullName_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_BookId;
    private javax.swing.JSpinner jSpinner_MemberID;
    private javax.swing.JTextArea jTextArea_Note;
    // End of variables declaration//GEN-END:variables
}
