/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package My_Forms;

import My_Classes.Member;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author you
 */
public class BookInfoCardForm extends javax.swing.JFrame {

    /**
     * Creates new form MembersListForm
     */
    
    My_Classes.Book book = new My_Classes.Book();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    My_Classes.Author author = new My_Classes.Author();
    My_Classes.Genre genre = new My_Classes.Genre();
    
    
    
    
    public BookInfoCardForm(int book_id) {
        initComponents();
        
        // center the form 
        this.setLocationRelativeTo(null);
        
        // add  border to the panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(211,84,0));
        jPanel1.setBorder(panelHeaderBorder);
        
           // display image in the top
        func.displayImage(90, 60,null, "/My_Images/imgb.png", jLabel_FormTitle);
        
      
        // add a black border to the jlabel image
       Border JlabelImageBorder = BorderFactory.createMatteBorder(1,1,1,1,new Color(0,0,0));
      jLabel_Image.setBorder(JlabelImageBorder);
      
      // add a default image to the jlabel
        func.displayImage(125, 80,null, "/My_Images/inconu.jpeg", jLabel_Image);
      
      displayBookInfo(book_id);  
      
    }
    
    // create a function to display the book info
    public void displayBookInfo(int _book_id){
        try {
            
            My_Classes.Book SelectedBook = book.getBookById(_book_id);
            
            
             if(SelectedBook != null){
                   
                   jLabel_ISBN.setText(SelectedBook.getIsbn());
                   jLabel_Name.setText(SelectedBook.getName());
                   
                   // we need to display the author name 
                   jLabel_Author.setText(author.getAuthorById(SelectedBook.getAuthor_id()).getFirstName()+ " "+author.getAuthorById(SelectedBook.getAuthor_id()).getLastName());
                   
                   // we need to display the genre name
                   jLabel_Genre.setText(genre.getGenreById(SelectedBook.getGenre_id()).getName());
                   
                   jLabel_Publisher.setText(SelectedBook.getPublisher());
                   jLabel_Price.setText(String.valueOf(SelectedBook.getPrice()));
                   jLabel_Quantity.setText(String.valueOf(SelectedBook.getQuantity()));
                   jLabel_Date_Rcv.setText(SelectedBook.getDate_received());
                   jTextArea_Description.setText(SelectedBook.getDescription());
         
               // display the book cover image
               byte[] image = SelectedBook.getCover();
              // we will display the image using the imagebyte
             // so we will make the image path empty
               func.displayImage(145, 230,image, "", jLabel_Image);
             }
        } catch (SQLException ex) {
            Logger.getLogger(BookInfoCardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ISBN = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Author = new javax.swing.JLabel();
        jLabel_Genre = new javax.swing.JLabel();
        jLabel_Publisher = new javax.swing.JLabel();
        jLabel_Price = new javax.swing.JLabel();
        jLabel_Quantity = new javax.swing.JLabel();
        jLabel_Date_Rcv = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(211, 84, 0));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Book Info Card");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(211, 84, 0));
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

        jLabel_Image.setBackground(new java.awt.Color(153, 255, 102));
        jLabel_Image.setOpaque(true);

        jLabel_ISBN.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_ISBN.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_ISBN.setText("ISBN");

        jLabel_Name.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Name.setText("Name");

        jLabel_Author.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_Author.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Author.setText("Author");

        jLabel_Genre.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_Genre.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Genre.setText("genre");

        jLabel_Publisher.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_Publisher.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Publisher.setText("Publisher");

        jLabel_Price.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_Price.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Price.setText("Price");

        jLabel_Quantity.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_Quantity.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Quantity.setText("Quantity");

        jLabel_Date_Rcv.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_Date_Rcv.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Date_Rcv.setText("Date Received");

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setRows(5);
        jTextArea_Description.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea_Description);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Date_Rcv)
                            .addComponent(jLabel_ISBN)
                            .addComponent(jLabel_Author)
                            .addComponent(jLabel_Genre)
                            .addComponent(jLabel_Publisher)
                            .addComponent(jLabel_Price)
                            .addComponent(jLabel_Quantity)
                            .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_ISBN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Author)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Genre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Publisher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Price)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Quantity))
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Date_Rcv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, Short.MAX_VALUE)
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

    
    

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Author;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_Date_Rcv;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_Genre;
    private javax.swing.JLabel jLabel_ISBN;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Price;
    private javax.swing.JLabel jLabel_Publisher;
    private javax.swing.JLabel jLabel_Quantity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Description;
    // End of variables declaration//GEN-END:variables
}
