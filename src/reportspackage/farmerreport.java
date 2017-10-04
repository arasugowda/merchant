/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportspackage;

import java.sql.*;

import GuiPackage.MainFrame;
import com.itextpdf.text.Chunk;

import entriespackage.ledgerentries;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import com.itextpdf.text.Element;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import java.awt.Desktop;
import java.io.File;
import masterpackage.*;
import masterpackage.farmermaster;
import masterpackage.grid;
import masterpackage.purchasemaster;
import pattipackage.farmerpatti;
import pattipackage.farmertransactionpatti;
import supportingpackage.Database;


public class farmerreport extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    Database db = new Database();
    public static int counting = 0;        
    
    public farmerreport() {
         setUndecorated(true); //Removing the frame header
        setExtendedState(JFrame.MAXIMIZED_BOTH); // frame size is maximized as windows 
        initComponents();
      //  load_farmer_and_item();
    }

    public void load_farmer_and_item()
    {
        try
        {
                con = db.dbConnect();
                stmt = con.createStatement();
                
                rs = stmt.executeQuery("select distinct abillno from governmenttransaction");
                while(rs.next()) {
                    a_bill_no.addItem(rs.getString("abillno"));
                }
                
               
                
                rs = stmt.executeQuery("select distinct itemname from governmenttransaction");
                while(rs.next()) {
                    item_name_for_A_bill.addItem(rs.getString("itemname"));
                }
        }
        catch(Exception e){}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        a_bill_no = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        item_name_for_A_bill = new javax.swing.JComboBox();
        a_bill_report = new javax.swing.JButton();
        b_bill_report = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        A_Bill_date = new com.toedter.calendar.JDateChooser();
        display_details = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        purchasemaster = new javax.swing.JMenuItem();
        commoditymaster = new javax.swing.JMenuItem();
        farmermaster = new javax.swing.JMenuItem();
        mandi_transaction = new javax.swing.JMenuItem();
        government_transaction = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        ledger_entries = new javax.swing.JMenuItem();
        margin_day_report = new javax.swing.JMenu();
        tax_rmc_total = new javax.swing.JMenuItem();
        farmer_A_B_Bill_report = new javax.swing.JMenuItem();
        ledger_report = new javax.swing.JMenuItem();
        day_report = new javax.swing.JMenuItem();
        item_day_report = new javax.swing.JMenuItem();
        buyer_day_report = new javax.swing.JMenuItem();
        lot_report = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        farmer_patti = new javax.swing.JMenuItem();
        farmer_kg_patti = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\MerchantTransactor\\images\\close-icon.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\MerchantTransactor\\images\\min.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("A - B I L L  and  B - B I L L  R E P O R T");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("A-BILL NUMBER");

        a_bill_no.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                a_bill_noItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("ITEM NAME");

        a_bill_report.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        a_bill_report.setText("A-BILL REPORT");
        a_bill_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_bill_reportActionPerformed(evt);
            }
        });

        b_bill_report.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_bill_report.setText("B-BILL REPORT");
        b_bill_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bill_reportActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("DATE");

        display_details.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        display_details.setText("Display");
        display_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_detailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A_Bill_date, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item_name_for_A_bill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_bill_no, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display_details)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(a_bill_report, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_bill_report)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Bill_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(display_details))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_bill_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_name_for_A_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_bill_report, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_bill_report, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jMenu6.setText("MASTER");

        purchasemaster.setText("PURCHASE MASTER");
        purchasemaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasemasterActionPerformed(evt);
            }
        });
        jMenu6.add(purchasemaster);

        commoditymaster.setText("COMMODITY MASTER");
        commoditymaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commoditymasterActionPerformed(evt);
            }
        });
        jMenu6.add(commoditymaster);

        farmermaster.setText("FARMER MASTER");
        farmermaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmermasterActionPerformed(evt);
            }
        });
        jMenu6.add(farmermaster);

        mandi_transaction.setText("MANDI TRANSACTION");
        mandi_transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mandi_transactionActionPerformed(evt);
            }
        });
        jMenu6.add(mandi_transaction);

        government_transaction.setText("GOVERNMENT TRANSACTION");
        government_transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                government_transactionActionPerformed(evt);
            }
        });
        jMenu6.add(government_transaction);

        jMenuBar2.add(jMenu6);

        jMenu7.setText("ENTRIES");

        ledger_entries.setText("LEDGER ENTRIES");
        ledger_entries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ledger_entriesActionPerformed(evt);
            }
        });
        jMenu7.add(ledger_entries);

        jMenuBar2.add(jMenu7);

        margin_day_report.setText("REPORTS");
        margin_day_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                margin_day_reportActionPerformed(evt);
            }
        });

        tax_rmc_total.setText("TAX & RMC REPORT");
        tax_rmc_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tax_rmc_totalActionPerformed(evt);
            }
        });
        margin_day_report.add(tax_rmc_total);

        farmer_A_B_Bill_report.setText("FARMER A&B BILL REPORT");
        farmer_A_B_Bill_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmer_A_B_Bill_reportActionPerformed(evt);
            }
        });
        margin_day_report.add(farmer_A_B_Bill_report);

        ledger_report.setText("LEDGER REPORT");
        ledger_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ledger_reportActionPerformed(evt);
            }
        });
        margin_day_report.add(ledger_report);

        day_report.setText("DAY REPORT");
        day_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day_reportActionPerformed(evt);
            }
        });
        margin_day_report.add(day_report);

        item_day_report.setText("ITEM DAY REPORT");
        item_day_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_day_reportActionPerformed(evt);
            }
        });
        margin_day_report.add(item_day_report);

        buyer_day_report.setText("BUYER DAY REPORT");
        buyer_day_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyer_day_reportActionPerformed(evt);
            }
        });
        margin_day_report.add(buyer_day_report);

        lot_report.setText("LOT REPORT");
        lot_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lot_reportActionPerformed(evt);
            }
        });
        margin_day_report.add(lot_report);

        jMenuItem2.setText("MARGIN DAY REPORT");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        margin_day_report.add(jMenuItem2);

        jMenuBar2.add(margin_day_report);

        jMenu10.setText("PATTI");

        farmer_patti.setText("FARMER PATTI");
        farmer_patti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmer_pattiActionPerformed(evt);
            }
        });
        jMenu10.add(farmer_patti);

        farmer_kg_patti.setText("FARMER TRANSACTION PATTI");
        farmer_kg_patti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmer_kg_pattiActionPerformed(evt);
            }
        });
        jMenu10.add(farmer_kg_patti);

        jMenuBar2.add(jMenu10);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(629, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        //Closing the Frame
        this.dispose();
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        //Minimizing the Frame
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void a_bill_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_bill_reportActionPerformed
        try
        {
            
            java.util.Date date = A_Bill_date.getDate();
            String dateString = String.format("%1$td-%1$tm-%1$tY",date); 
            //JOptionPane.showMessageDialog(this, "DATE:"+dateString);
            
             Document document = new Document(PageSize.B4.rotate());
             PdfWriter.getInstance(document, new FileOutputStream("Farmer_Abill_Report.pdf"));
             document.open();
             
                document.add(new Paragraph("\n\n\n\n\n"));
                
                Paragraph abill_paragraph = new Paragraph(a_bill_no.getSelectedItem().toString());
                abill_paragraph.setAlignment(Element.ALIGN_CENTER);
                abill_paragraph.setIndentationRight(200);
                document.add(abill_paragraph);
                
                
                Paragraph date_paragraph = new Paragraph(dateString);
                date_paragraph.setAlignment(Element.ALIGN_RIGHT);
                date_paragraph.setIndentationRight(200);
                document.add(date_paragraph);
                
                document.add(new Paragraph("\n\n\n"));
            
             String fname = db.getRequestedValue("select * from governmenttransaction where abillno='"+a_bill_no.getSelectedItem().toString()+"' and date='"+dateString+"'","farmername","STRING-FORMAT");
             Chunk ch = new Chunk(fname);
             Paragraph paragraph = new Paragraph();
             paragraph.setAlignment(Element.ALIGN_CENTER);
             paragraph.setIndentationRight(200);
             paragraph.add(ch);
             document.add(paragraph);
             
            
             
             
             document.add(new Paragraph("\n\n\n\n"));
             
             
                int row = 0;
                row = (int)db.return_row_count("select count(*) as noofcounts from governmenttransaction where date='"+dateString+"' and itemname='"+item_name_for_A_bill.getSelectedItem().toString()+"' and abillno='"+a_bill_no.getSelectedItem().toString()+"'", "noofcounts");
                
                PdfPTable table = new PdfPTable(7);
                table.setWidthPercentage(80.11F);
                //table.getDefaultCell().setFixedHeight(200);
                table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
                table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
                PdfPCell[][] cell = new PdfPCell[row][7];
                
                con = db.dbConnect();
                stmt = con.createStatement();
                rs = stmt.executeQuery("select * from governmenttransaction where date='"+dateString+"' and itemname='"+item_name_for_A_bill.getSelectedItem().toString()+"' and abillno='"+a_bill_no.getSelectedItem().toString()+"'");
                
                    
                
                    int row_count = 0;
                    while(rs.next())
                    {
                            if(row_count == 0)
                            {
                                // Item Name Coloumn
                                cell[row_count][0] = new PdfPCell(new Paragraph(item_name_for_A_bill.getSelectedItem().toString()));
                                cell[row_count][0].setRowspan(row);
                               
                                cell[row_count][0].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][0].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][0].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][0]);
                            } 
                            
                            // Second Colomn
                            cell[row_count][1] = new PdfPCell(new Paragraph(""));
                            cell[row_count][1].setHorizontalAlignment(Element.ALIGN_CENTER);
                            cell[row_count][1].setVerticalAlignment(Element.ALIGN_MIDDLE);
                            cell[row_count][1].setBorder(Rectangle.NO_BORDER);
                            table.addCell(cell[row_count][1]);

                            // Third Colomn
                            cell[row_count][2] = new PdfPCell(new Paragraph(""));
                            cell[row_count][2].setHorizontalAlignment(Element.ALIGN_CENTER);
                            cell[row_count][2].setVerticalAlignment(Element.ALIGN_MIDDLE);
                            cell[row_count][2].setBorder(Rectangle.NO_BORDER);
                            table.addCell(cell[row_count][2]);
                            
                            // Weigth Colomn
                            cell[row_count][3] = new PdfPCell(new Paragraph(rs.getString("weight")));
                            cell[row_count][3].setHorizontalAlignment(Element.ALIGN_CENTER);
                            cell[row_count][3].setVerticalAlignment(Element.ALIGN_MIDDLE);
                            cell[row_count][3].setBorder(Rectangle.NO_BORDER);
                            table.addCell(cell[row_count][3]);
                            
                            // Fifth Colomn
                            cell[row_count][4] = new PdfPCell(new Paragraph(""));
                            cell[row_count][4].setHorizontalAlignment(Element.ALIGN_CENTER);
                            cell[row_count][4].setVerticalAlignment(Element.ALIGN_MIDDLE);
                            cell[row_count][4].setBorder(Rectangle.NO_BORDER);
                            table.addCell(cell[row_count][4]);
                            
                            // Lot Colomn
                            cell[row_count][5] = new PdfPCell(new Paragraph(rs.getString("lotno")));
                            cell[row_count][5].setHorizontalAlignment(Element.ALIGN_CENTER);
                            cell[row_count][5].setVerticalAlignment(Element.ALIGN_MIDDLE);
                            cell[row_count][5].setBorder(Rectangle.NO_BORDER);
                            table.addCell(cell[row_count][5]);
                            
                            // Seventh Colomn
                            cell[row_count][6] = new PdfPCell(new Paragraph(""));
                            cell[row_count][6].setHorizontalAlignment(Element.ALIGN_CENTER);
                            cell[row_count][6].setVerticalAlignment(Element.ALIGN_MIDDLE);
                            cell[row_count][6].setBorder(Rectangle.NO_BORDER);
                            table.addCell(cell[row_count][6]);
                        
                       
                        row_count++;
                    }
                
                
                
                
                document.add(table);
                document.close();
                
                File file = new File("Farmer_Abill_Report.pdf");
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e+"  OR PLEASE CLOSE PDF FILE OPENED");
        }
    }//GEN-LAST:event_a_bill_reportActionPerformed

    private void b_bill_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_bill_reportActionPerformed
        
        try
        {
            
            java.util.Date date = A_Bill_date.getDate();
            String dateString = String.format("%1$td-%1$tm-%1$tY",date); 
            //JOptionPane.showMessageDialog(this, "DATE:"+dateString);
            
             Document document = new Document(PageSize.B4.rotate());
             PdfWriter.getInstance(document, new FileOutputStream("Farmer_Bbill_Report.pdf"));
             document.open();
             
                document.add(new Paragraph("\n\n\n\n\n"));
                
                String bbill = db.getRequestedValue("select * from governmenttransaction where abillno='"+a_bill_no.getSelectedItem().toString()+"' and date='"+dateString+"'","bbillno","STRING-FORMAT");
                Paragraph bbill_paragraph = new Paragraph(bbill);
                bbill_paragraph.setAlignment(Element.ALIGN_CENTER);
                bbill_paragraph.setIndentationRight(200);
                document.add(bbill_paragraph);
                
                
                Paragraph date_paragraph = new Paragraph(dateString);
                date_paragraph.setAlignment(Element.ALIGN_RIGHT);
                date_paragraph.setIndentationRight(200);
                document.add(date_paragraph);
                
                document.add(new Paragraph("\n\n"));
            
                
                
             String fname = db.getRequestedValue("select * from governmenttransaction where abillno='"+a_bill_no.getSelectedItem().toString()+"' and date='"+dateString+"'","farmername","STRING-FORMAT");
             Chunk ch = new Chunk(fname);
             Paragraph paragraph = new Paragraph();
             paragraph.setAlignment(Element.ALIGN_CENTER);
             paragraph.setIndentationRight(200);
             paragraph.add(ch);
             document.add(paragraph);
             
             
             document.add(new Paragraph("\n"));
             
                String tradersname = db.getRequestedValue("select * from governmenttransaction where abillno='"+a_bill_no.getSelectedItem().toString()+"' and date='"+dateString+"'","tradersname","STRING-FORMAT");
                Chunk ch_traders = new Chunk(tradersname);
                Paragraph paragraph_traders = new Paragraph();
                paragraph_traders.setAlignment(Element.ALIGN_CENTER);
                paragraph_traders.setIndentationRight(200);
                paragraph_traders.add(ch_traders);
                document.add(paragraph_traders);
             
             
                document.add(new Paragraph("\n"));
             
                
                Paragraph Abill_paragraph = new Paragraph(a_bill_no.getSelectedItem().toString());
                Abill_paragraph.setAlignment(Element.ALIGN_RIGHT);
                Abill_paragraph.setIndentationRight(200);
                document.add(Abill_paragraph);
                
                document.add(new Paragraph("\n"));
             
                int row = 0;
                row = (int)db.return_row_count("select count(*) as noofcounts from governmenttransaction where date='"+dateString+"' and itemname='"+item_name_for_A_bill.getSelectedItem().toString()+"' and abillno='"+a_bill_no.getSelectedItem().toString()+"'", "noofcounts");
                
                PdfPTable table = new PdfPTable(8);
                table.setWidthPercentage(80.11F);
                //table.getDefaultCell().setFixedHeight(200);
                table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
                table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
                PdfPCell[][] cell = new PdfPCell[row][8];
                
                con = db.dbConnect();
                stmt = con.createStatement();
                rs = stmt.executeQuery("select * from governmenttransaction where date='"+dateString+"' and itemname='"+item_name_for_A_bill.getSelectedItem().toString()+"' and abillno='"+a_bill_no.getSelectedItem().toString()+"'");
                
                    
                
                    int row_count = 0;
                    while(rs.next())
                    {
                            
                                Double total = Double.parseDouble(rs.getString("weight")) * Double.parseDouble(rs.getString("rateperkg"));
                                
                                // Multiplication calculation Coloumn
                                cell[row_count][0] = new PdfPCell(new Paragraph(total.toString()));
                               // cell[row_count][0].setRowspan(row);
                               
                                cell[row_count][0].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][0].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][0].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][0]);
                            
                            
                                // Second Colomn
                                cell[row_count][1] = new PdfPCell(new Paragraph(""));
                                cell[row_count][1].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][1].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][1].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][1]);

                                // Third Colomn
                                cell[row_count][2] = new PdfPCell(new Paragraph(""));
                                cell[row_count][2].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][2].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][2].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][2]);
                                
                                // Third Colomn
                                cell[row_count][3] = new PdfPCell(new Paragraph(""));
                                cell[row_count][3].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][3].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][3].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][3]);

                                // Weigth Colomn
                                cell[row_count][4] = new PdfPCell(new Paragraph(rs.getString("weight")));
                                cell[row_count][4].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][4].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][4].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][4]);

                                // Fifth Colomn
                                cell[row_count][5] = new PdfPCell(new Paragraph(""));
                                cell[row_count][5].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][5].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][5].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][5]);

                                // Lot Colomn
                                cell[row_count][6] = new PdfPCell(new Paragraph(rs.getString("rateperkg")));
                                cell[row_count][6].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][6].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][6].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][6]);
                            
                                // Seventh Colomn
                                cell[row_count][7] = new PdfPCell(new Paragraph(rs.getString("lotno")));
                                cell[row_count][7].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][7].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][7].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][7]);
                        
                        
                        row_count++;
                    }
                
                
                
                
                document.add(table);
                document.close();
                
                File file = new File("Farmer_Bbill_Report.pdf");
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e+"  OR PLEASE CLOSE PDF FILE OPENED");
        }
    }//GEN-LAST:event_b_bill_reportActionPerformed

    private void display_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_detailsActionPerformed
        
        try
        {
                java.util.Date date = A_Bill_date.getDate();
                String dateString = String.format("%1$td-%1$tm-%1$tY",date); 
                
                
                con = db.dbConnect();
                stmt = con.createStatement();
                
                rs = stmt.executeQuery("select distinct abillno from governmenttransaction where date='"+dateString+"'");
                //System.out.println("select distinct abillno from governmenttransaction where date='"+dateString+"'");
                while(rs.next()) {
                    counting = 1;
                    a_bill_no.addItem(rs.getString("abillno"));
                }
                counting = 2;
               
               
        }
        catch(Exception e){}
        
    }//GEN-LAST:event_display_detailsActionPerformed

    private void a_bill_noItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_a_bill_noItemStateChanged
       
        try
        {
                if(counting == 2)
                {
                        java.util.Date date = A_Bill_date.getDate();
                        String dateString = String.format("%1$td-%1$tm-%1$tY",date); 
                        String abill = a_bill_no.getSelectedItem().toString();
                
                            con = db.dbConnect();
                            stmt = con.createStatement();
                
                            rs = stmt.executeQuery("select distinct itemname from governmenttransaction where abillno='"+abill+"' and date='"+dateString+"'");
                            //System.out.println("select distinct itemname from governmenttransaction where abillno='"+abill+"' and date='"+dateString+"'");
                            item_name_for_A_bill.removeAllItems();
                            while(rs.next()) {
                                item_name_for_A_bill.addItem(rs.getString("itemname"));
                            }
                }
        }
        catch(Exception e){}
        
        
        
        
    }//GEN-LAST:event_a_bill_noItemStateChanged

    private void purchasemasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasemasterActionPerformed
        // Redirecting to Purchase Master Frame
        new purchasemaster().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_purchasemasterActionPerformed

    private void commoditymasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commoditymasterActionPerformed
        //Redirecting to Commodity Master Frame
        new commoditymaster().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_commoditymasterActionPerformed

    private void farmermasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmermasterActionPerformed
        // Redirecting to Farmer Master Frame
        new farmermaster().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_farmermasterActionPerformed

    private void mandi_transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mandi_transactionActionPerformed
        // Redirects to mandi transaction form
        new MandiTransactionGrid().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mandi_transactionActionPerformed

    private void government_transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_government_transactionActionPerformed
        // Redirects to government transaction form
        new GovernmentTransactionGrid().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_government_transactionActionPerformed

    private void ledger_entriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ledger_entriesActionPerformed
        //Redirects to ledger emtries form
        new ledgerentries().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ledger_entriesActionPerformed

    private void tax_rmc_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tax_rmc_totalActionPerformed
        // Redirects to total report form
        new totalReport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tax_rmc_totalActionPerformed

    private void farmer_A_B_Bill_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmer_A_B_Bill_reportActionPerformed
        //Redirects to farmerreport form
        new farmerreport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_farmer_A_B_Bill_reportActionPerformed

    private void ledger_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ledger_reportActionPerformed

        //Redirects to ledger report
        new ledgerreport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ledger_reportActionPerformed

    private void day_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day_reportActionPerformed

        //Redirects to invoice day report form
        new dayreport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_day_reportActionPerformed

    private void item_day_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_day_reportActionPerformed

        // Redirects to item day report form
        new itemdayreport().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_item_day_reportActionPerformed

    private void buyer_day_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyer_day_reportActionPerformed

        //Redirects to buyer day report form
        new buyerdayreport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buyer_day_reportActionPerformed

    private void lot_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lot_reportActionPerformed

        //Redirects to lot report form
        new lotreport().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lot_reportActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //Redirects to margin day report form
        new margindayreport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void margin_day_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_margin_day_reportActionPerformed

    }//GEN-LAST:event_margin_day_reportActionPerformed

    private void farmer_pattiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmer_pattiActionPerformed

        //Redirects to farmer patti transaction form
        new farmerpatti().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_farmer_pattiActionPerformed

    private void farmer_kg_pattiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmer_kg_pattiActionPerformed

        //Redirects to farmer kg transaction patti form
        new farmertransactionpatti().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_farmer_kg_pattiActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(farmerreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(farmerreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(farmerreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(farmerreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new farmerreport().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser A_Bill_date;
    private javax.swing.JComboBox a_bill_no;
    private javax.swing.JButton a_bill_report;
    private javax.swing.JButton b_bill_report;
    private javax.swing.JMenuItem buyer_day_report;
    private javax.swing.JMenuItem commoditymaster;
    private javax.swing.JMenuItem day_report;
    private javax.swing.JButton display_details;
    private javax.swing.JMenuItem farmer_A_B_Bill_report;
    private javax.swing.JMenuItem farmer_kg_patti;
    private javax.swing.JMenuItem farmer_patti;
    private javax.swing.JMenuItem farmermaster;
    private javax.swing.JMenuItem government_transaction;
    private javax.swing.JMenuItem item_day_report;
    private javax.swing.JComboBox item_name_for_A_bill;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem ledger_entries;
    private javax.swing.JMenuItem ledger_report;
    private javax.swing.JMenuItem lot_report;
    private javax.swing.JMenuItem mandi_transaction;
    private javax.swing.JMenu margin_day_report;
    private javax.swing.JMenuItem purchasemaster;
    private javax.swing.JMenuItem tax_rmc_total;
    // End of variables declaration//GEN-END:variables
}
