/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportspackage;

import MerchantPackage.*;
import GuiPackage.*;
import entriespackage.*;
import javax.swing.*;
import masterpackage.*;
import pattipackage.*;
import reportspackage.*;
import supportingpackage.*;

import com.itextpdf.text.Chunk;
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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.*;



public class dayreport extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    Database db = new Database();
    public static int counting = 0;
    
    public dayreport() {
        setUndecorated(true); //Removing the frame header
        setExtendedState(JFrame.MAXIMIZED_BOTH); // frame size is maximized as windows 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        invoice_date = new com.toedter.calendar.JDateChooser();
        display_invoice = new javax.swing.JButton();
        invoice_no = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        item_name = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
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
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("I N V O I C E   R E P O R T");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("DATE :");

        display_invoice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        display_invoice.setText("Display");
        display_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_invoiceActionPerformed(evt);
            }
        });

        invoice_no.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                invoice_noItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("INVOICE NO :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("ITEM NAME:");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("G E N E R A T E    I N V O I C E   R E P O R T");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(invoice_date, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(display_invoice))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(item_name, javax.swing.GroupLayout.Alignment.LEADING, 0, 127, Short.MAX_VALUE)
                                .addComponent(invoice_no, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display_invoice)
                    .addComponent(invoice_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoice_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 624, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        //Closing the Frame
        this.dispose();
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        //Minimizing the Frame
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void display_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_invoiceActionPerformed
        try
        {
                java.util.Date date = invoice_date.getDate();
                String dateString = String.format("%1$td-%1$tm-%1$tY",date); 
                
                
                con = db.dbConnect();
                stmt = con.createStatement();
                
                rs = stmt.executeQuery("select distinct invoiceno from governmenttransaction where date='"+dateString+"'");
                while(rs.next()) {
                    counting = 1;
                    invoice_no.addItem(rs.getString("invoiceno"));
                }
                counting = 2;
               
                /*
                rs = stmt.executeQuery("select distinct itemname from governmenttransaction where date='"+dateString+"'");
                while(rs.next()) {
                    item_name_for_A_bill.addItem(rs.getString("itemname"));
                }
                */ 
        }
        catch(Exception e){}
    }//GEN-LAST:event_display_invoiceActionPerformed

    private void invoice_noItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_invoice_noItemStateChanged
        
        try
        {
            
                if(counting == 2)
                {
                        java.util.Date date = invoice_date.getDate();
                        String dateString = String.format("%1$td-%1$tm-%1$tY",date); 
                        String invoice = invoice_no.getSelectedItem().toString();
                        con = db.dbConnect();
                        stmt = con.createStatement();
                        rs = stmt.executeQuery("select distinct itemname from governmenttransaction where invoiceno='"+invoice+"' and date='"+dateString+"'");
                        item_name.removeAllItems();
                        while(rs.next()) {
                                item_name.addItem(rs.getString("itemname"));
                        }
                }
        }
        catch(Exception e){}
        
    }//GEN-LAST:event_invoice_noItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        try
        {
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);
            
            java.util.Date date = invoice_date.getDate();
            String dateString = String.format("%1$td-%1$tm-%1$tY",date); 
            //JOptionPane.showMessageDialog(this, "DATE:"+dateString);
            
             Document document = new Document(PageSize.B4.rotate());
             PdfWriter.getInstance(document, new FileOutputStream("Invoice_Bill.pdf"));
             document.open();
             
                document.add(new Paragraph("\n\n\n\n\n"));
                
                Paragraph abill_paragraph = new Paragraph(dateString);
                abill_paragraph.setAlignment(Element.ALIGN_RIGHT);
                abill_paragraph.setIndentationRight(200);
                document.add(abill_paragraph);
                
                
                Paragraph date_paragraph = new Paragraph(invoice_no.getSelectedItem().toString());
                date_paragraph.setAlignment(Element.ALIGN_CENTER);
                date_paragraph.setIndentationRight(200);
                document.add(date_paragraph);
                
                document.add(new Paragraph("\n\n\n"));
            
             String buyer_name = db.getRequestedValue("select * from governmenttransaction where itemname='"+item_name.getSelectedItem().toString()+"' and invoiceno='"+invoice_no.getSelectedItem().toString()+"' and date='"+dateString+"'","buyerinitial","STRING-FORMAT");
             Chunk ch = new Chunk(buyer_name);
             Paragraph paragraph = new Paragraph();
             paragraph.setAlignment(Element.ALIGN_CENTER);
             paragraph.setIndentationRight(200);
             paragraph.add(ch);
             document.add(paragraph);
             
            
             
             
             document.add(new Paragraph("\n\n\n\n\n"));
             
             
                int row = 0;
                System.out.println("select count(*) as noofcounts from governmenttransaction where date='"+dateString+"' and itemname='"+item_name.getSelectedItem().toString()+"' and invoiceno='"+invoice_no.getSelectedItem().toString()+"'");
                row = (int)db.return_row_count("select count(*) as noofcounts from governmenttransaction where date='"+dateString+"' and itemname='"+item_name.getSelectedItem().toString()+"' and invoiceno='"+invoice_no.getSelectedItem().toString()+"'", "noofcounts");
                
                int tot_rows = row + 10;
                
                
                PdfPTable table = new PdfPTable(5);
                table.setWidthPercentage(70.11F);
                //table.getDefaultCell().setFixedHeight(200);
                table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
                table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
                PdfPCell[][] cell = new PdfPCell[tot_rows+1][5];
                
                con = db.dbConnect();
                stmt = con.createStatement();
                double rateperkg = 0.0;
                double tot = 0.0;
                double rmc = 0.0;
                double commission = 0.0;
                double vat = 0.0;
                double surcharge = 0.0;
                double hamali = 0.0;
                double roundoff = 0.0;
                double grandtotal = 0.0;
                
                rs = stmt.executeQuery("select sum(rmc) as rmc_tot , sum(vat) as vat_tot , sum(surcharge) as sur_tot , sum(hamali) as hamali_tot from governmenttransaction where date='"+dateString+"' and itemname='"+item_name.getSelectedItem().toString()+"' and invoiceno='"+invoice_no.getSelectedItem().toString()+"'");
                if(rs.next())
                {
                        rmc = Double.parseDouble(rs.getString("rmc_tot"));
                        vat = Double.parseDouble(rs.getString("vat_tot"));
                        surcharge = Double.parseDouble(rs.getString("sur_tot"));
                        hamali = Double.parseDouble(rs.getString("hamali_tot"));
                        
                }
                
                
                
                
                rs = stmt.executeQuery("select * from governmenttransaction where date='"+dateString+"' and itemname='"+item_name.getSelectedItem().toString()+"' and invoiceno='"+invoice_no.getSelectedItem().toString()+"'");
                
                
                
                String _details_name[] = new String[10];
                String _details_cal[] = new String[10];
                
                List<String> _invoice_details = new ArrayList<String>();
                while(rs.next())
                {
                    double total = Double.parseDouble(rs.getString("weight")) * Double.parseDouble(rs.getString("rateperkg")); 
                    tot = tot + total;
                    rateperkg = rateperkg + Double.parseDouble(rs.getString("rateperkg"));            
                    String temp = item_name.getSelectedItem().toString()+"-"+rs.getString("weight")+"-"+rs.getString("rateperkg")+"-1-"+Double.toString(total);
                    _invoice_details.add(temp);
                    
                }
                
                
                rs = stmt.executeQuery("select commission from buyer where initial='"+buyer_name+"'");
                if(rs.next())
                {
                    commission = (tot * Double.parseDouble(rs.getString("commission"))) / 100;
                }
                
                
                    int row_count = 0;
                    int cal_cnt = 0;
                    boolean display_once = true;
                    while(row_count <= tot_rows)
                    {
                            
                            if(row_count < row)
                            {
                               String temp_arr[] =  _invoice_details.get(row_count).split("-");
                                
                                // Item Name Coloumn
                                cell[row_count][0] = new PdfPCell(new Paragraph(temp_arr[0]));
                                //cell[row_count][0].setRowspan(row);
                               
                                cell[row_count][0].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][0].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][0].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][0]);
                            
                            
                                // weight Colomn
                                cell[row_count][1] = new PdfPCell(new Paragraph(temp_arr[1]));
                                cell[row_count][1].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][1].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][1].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][1]);

                                // rateperkg Colomn
                                cell[row_count][2] = new PdfPCell(new Paragraph(temp_arr[2]));
                                cell[row_count][2].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][2].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][2].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][2]);

                                // itemcount Colomn
                                cell[row_count][3] = new PdfPCell(new Paragraph(temp_arr[3]));
                                cell[row_count][3].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][3].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][3].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][3]);

                                // total Colomn
                                cell[row_count][4] = new PdfPCell(new Paragraph(temp_arr[4]));
                                cell[row_count][4].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][4].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][4].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][4]);
                                
                                
                                    if(row_count == (row-1))
                                    {
                                        _details_name[0] = "------\n"+Double.toString(rateperkg);
                                        _details_name[1] = "Total";
                                        _details_name[2] = " ";
                                        _details_name[3] = "R.M.C";
                                        _details_name[4] = "Commission";
                                        _details_name[5] = "VAT";
                                        _details_name[6] = "Sur Charge";
                                        _details_name[7] = "Hamali";
                                        _details_name[8] = "Round Off";
                                        _details_name[9] = "GRAND TOTAL";
                                        
                                        
                                        _details_cal[0] = " ";
                                        _details_cal[1] = df.format(tot);
                                        _details_cal[2] = " ";
                                        _details_cal[3] = df.format(rmc);
                                        _details_cal[4] = df.format(commission);
                                        _details_cal[5] = df.format(vat);
                                        _details_cal[6] = df.format(surcharge);
                                        _details_cal[7] = df.format(hamali);
                                        
                                        roundoff = Math.round(tot+rmc+commission+vat+surcharge+hamali) - (tot+rmc+commission+vat+surcharge+hamali);
                                        //System.out.println("ACTUAL:"+(tot+rmc+commission+vat+surcharge+hamali)+"ROUND OFF:"+Math.round(tot+rmc+commission+vat+surcharge+hamali)+"ROUND OFF FINALVALUE:"+roundoff);
                                        _details_cal[8] = df.format(roundoff);
                                        _details_cal[9] = df.format(tot+rmc+commission+vat+surcharge+hamali+roundoff);
                                        
                                        
                                    }
                                
                                
                                
                            }
                            
                            
                            
                            
                            if(row_count > row)
                            {
                                
                                
                                // Item Name Coloumn
                                cell[row_count][0] = new PdfPCell(new Paragraph(""));
                                
                                cell[row_count][0].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][0].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][0].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][0]);
                            
                            
                                // weight Colomn
                                cell[row_count][1] = new PdfPCell(new Paragraph(""));
                                cell[row_count][1].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][1].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][1].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][1]);

                                // rateperkg Colomn
                                cell[row_count][2] = new PdfPCell(new Paragraph(_details_name[cal_cnt]));
                                cell[row_count][2].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][2].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][2].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][2]);

                                if(display_once == true)
                                {
                                        // itemcount Colomn
                                        cell[row_count][3] = new PdfPCell(new Paragraph(Integer.toString(row)));
                                        cell[row_count][3].setHorizontalAlignment(Element.ALIGN_CENTER);
                                        cell[row_count][3].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                        cell[row_count][3].setBorder(Rectangle.NO_BORDER);
                                        table.addCell(cell[row_count][3]);
                                        display_once = false;
                                }
                                else
                                {
                                        // itemcount Colomn
                                        cell[row_count][3] = new PdfPCell(new Paragraph(""));
                                        cell[row_count][3].setHorizontalAlignment(Element.ALIGN_CENTER);
                                        cell[row_count][3].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                        cell[row_count][3].setBorder(Rectangle.NO_BORDER);
                                        table.addCell(cell[row_count][3]);
                                
                                }
                                
                                
                                // total Colomn
                                cell[row_count][4] = new PdfPCell(new Paragraph(_details_cal[cal_cnt]));
                                cell[row_count][4].setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell[row_count][4].setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cell[row_count][4].setBorder(Rectangle.NO_BORDER);
                                table.addCell(cell[row_count][4]);
                                
                                cal_cnt++;
                            
                            }
                            
                        
                       
                        row_count++;
                    }
                
                document.add(table);
                
                
                
                
                
                
                
             
                
                
                document.close();
                
                File file = new File("Invoice_Bill.pdf");
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e+"  OR PLEASE CLOSE PDF FILE OPENED");
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(dayreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dayreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dayreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dayreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dayreport().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem buyer_day_report;
    private javax.swing.JMenuItem commoditymaster;
    private javax.swing.JMenuItem day_report;
    private javax.swing.JButton display_invoice;
    private javax.swing.JMenuItem farmer_A_B_Bill_report;
    private javax.swing.JMenuItem farmer_kg_patti;
    private javax.swing.JMenuItem farmer_patti;
    private javax.swing.JMenuItem farmermaster;
    private javax.swing.JMenuItem government_transaction;
    private com.toedter.calendar.JDateChooser invoice_date;
    private javax.swing.JComboBox invoice_no;
    private javax.swing.JMenuItem item_day_report;
    private javax.swing.JComboBox item_name;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
