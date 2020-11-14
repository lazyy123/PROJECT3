
package project1;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import com.opencsv.CSVWriter; 
import com.opencsv.CSVReader;
import java.io.FileWriter;
import java.io.FileReader; 
import com.opencsv.*; 
import java.io.FileNotFoundException;
import com.opencsv.exceptions.CsvValidationException;

public class form1 extends javax.swing.JFrame {
    public form1() {
        initComponents();
    }
    String str1,str2;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1070, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,60));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel2.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");

        jTextField1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jPasswordField1.setPreferredSize(new java.awt.Dimension(210, 30));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );

        jButton1.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 390, 360));

        jLabel1.setBackground(new java.awt.Color(0, 28, 92));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\LoginJava.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1070, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(1070, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(1070, 600));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1174, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        if (str1 == null || str2 == null ) {
//                        JOptionPane.showMessageDialog(null, "All information is required",
//                                "ERROR", JOptionPane.ERROR_MESSAGE);
//                    } 
//        else if (str1.isEmpty() || str2.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Something is wrong", "ERROR", JOptionPane.PLAIN_MESSAGE);
//        }
//                     
//                     else if (!str1.isEmpty() && !str2.isEmpty()) {
//                        JOptionPane.showMessageDialog(null, "Successfully login", "Success", JOptionPane.PLAIN_MESSAGE);
//                        
//                        form3 formm1=new form3();
//                        formm1.setVisible(true);
//                       
//                        this.dispose();
//                        
//
//                    }
        int flag=-1;
        
        String[] arr = new String[100];

				if (str1 == null || str2 == null) {
					flag = -1;

				} else {
					arr[0] = str1;
					arr[1] = str2;
				}
				File file = new File("Sample.csv");
				try {
					CSVWriter writer = null;
					FileWriter writeFile = null;
					writeFile = new FileWriter(file, true);
					writer = new CSVWriter(writeFile);

					if (!file.exists() && flag != -1) {
						writeFile = new FileWriter("Sample.csv", true);
						writer = new CSVWriter(writeFile);
						writer.writeNext(arr);
						writer.flush();
					}
					if (file.exists() && flag != -1) {
						writer.writeNext(arr);
						writer.flush();
					}
				} catch (IOException ioException) {
					ioException.printStackTrace();
				}
				//Read is alright
				String username = str1;
				String password = str2;
				CSVReader reader = null;
				String[] readArray = new String[5];
				try {
					reader = new CSVReaderBuilder(new FileReader("Sample.csv")).withSkipLines(0).build();

					while ((readArray = reader.readNext()) != null) {
						if (username.equals(readArray[0]) && password.equals(readArray[1])) {
							flag = 1;
							JOptionPane.showMessageDialog(null, "Log in successFull", "Log In ", JOptionPane.INFORMATION_MESSAGE);
							//mainFrame mainFrameObj = new mainFrame();
							break;
						}
					}
					if (flag == -1) {
						JOptionPane.showMessageDialog(null, "Field is Empty,Try again Please", "Log In ", JOptionPane.ERROR_MESSAGE);
					}
					if (flag == 0) {
						JOptionPane.showMessageDialog(null, "Log in Failed", "Log In ", JOptionPane.WARNING_MESSAGE);
					}
				} catch (FileNotFoundException notFoundException) {
					notFoundException.printStackTrace();
				} catch (CsvValidationException validationException) {
					validationException.printStackTrace();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
        
 		
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
       str2 = new String(jPasswordField1.getPassword());
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        str1=jTextField1.getText();
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
