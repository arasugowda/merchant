
package reportspackage;

import GuiPackage.*;
import MerchantPackage.*;
import entriespackage.*;
import javax.swing.JFrame;
import masterpackage.*;
import pattipackage.*;
import reportspackage.*;
import supportingpackage.*;
import java.sql.*;
import java.util.Date;
import javax.swing.JOptionPane;


public class margindayreport extends javax.swing.JFrame {
    
    Database db = new Database();
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    double margin_value = 0.0;
    public static int counting = 0;  
    
    public margindayreport() {
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
        datepanel = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        generate_buyer_report = new javax.swing.JButton();
        buyer_name = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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

        datepanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        generate_buyer_report.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        generate_buyer_report.setText("G E N E R A T E    M A R G I N D A Y    R E P O R T");
        generate_buyer_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_buyer_reportActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("D A T E :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("B U Y E R :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout datepanelLayout = new javax.swing.GroupLayout(datepanel);
        datepanel.setLayout(datepanelLayout);
        datepanelLayout.setHorizontalGroup(
            datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datepanelLayout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datepanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(buyer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
            .addGroup(datepanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(generate_buyer_report)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        datepanelLayout.setVerticalGroup(
            datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datepanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addGap(32, 32, 32)
                .addGroup(datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(generate_buyer_report, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("M A R G I N   D A Y   R E P O R T");

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
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(datepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 105, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(datepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
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

    private void generate_buyer_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_buyer_reportActionPerformed

        try
        {
            Date date = jDateChooser2.getDate();
            String dateString = String.format("%1$td-%1$tm-%1$tY",date);
            JOptionPane.showMessageDialog(this, "DATE:"+dateString);
            
            
                con = db.dbConnect();
                stmt = con.createStatement();
                rs = stmt.executeQuery("select * from buyer where initial = '"+buyer_name.getSelectedItem().toString()+"'");
                if(rs.next())
                {
                    margin_value = Double.parseDouble(rs.getString("margin"));
                    System.out.println("Margin value:"+margin_value);
                }
            

            Connection con = db.dbConnect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from manditransaction where date='"+dateString+"' and tradersname='"+buyer_name.getSelectedItem().toString()+"'");
            int no_of_bags = (int)db.return_row_count("select count(noofbags)as MAX_COUNT from manditransaction where date='"+dateString+"'", "MAX_COUNT");
            int no_of_items = (int)db.return_row_count("select count(itemname)as MAX_COUNT from manditransaction where date='"+dateString+"'", "MAX_COUNT");

            String comm_query = "select * from buyer where initial='"+buyer_name.getSelectedItem().toString()+"'";
            Double getCommission = Double.parseDouble(db.getRequestedValue(comm_query, "commission", "STRING-FORMAT"));

            System.out.println(dateString+"  "+buyer_name.getSelectedItem().toString());
            System.out.println("BAGS:"+no_of_bags+"\t ITEMS:"+no_of_items+"\t PACKING:31+1");
            System.out.println("LOTNO \t RATE/KG \t KG \t      AMOUNT");
            System.out.println("==================================================================");
            double amount = 0.0;
            double kg = 0.0;
            double rpk = 0.0;
            
            while(rs.next())
            {
                kg = kg + Double.parseDouble(rs.getString("weight"));
                amount = amount + Double.parseDouble(rs.getString("total"));
                rpk = (Double.parseDouble(rs.getString("rateperkg")) + margin_value) * Double.parseDouble(rs.getString("weight"));   
    System.out.println(rs.getString("lotno")+" \t   "+rpk+"    \t "+rs.getString("weight")+" \t      "+rs.getString("total"));
                         
               // System.out.println(rs.getString("lotno")+" \t   "+rs.getString("rateperkg")+"    \t "+rs.getString("weight")+" \t      "+rs.getString("total"));
            }

            System.out.println("-----------------------------------------------------------------");
            System.out.println("\t\t\t"+kg+"      "+amount);

            double commission = (getCommission / 100) * amount;

            
            System.out.println("\t\t\tCommission: "+commission);
            String hamli_query = "select * from manditransaction where tradersname='"+buyer_name.getSelectedItem().toString()+"' and date='"+dateString+"'";
            double hamli = Double.parseDouble(db.getRequestedValue(hamli_query, "hamali", "STRING-FORMAT"));
            System.out.println("\t\t\tHamali:     "+hamli);

            System.out.println("------------------------------------------------------------------");
            System.out.println("\t\t\tGRAND TOTAL:"+(amount+commission+hamli));

        }
        catch(Exception e){}
    }//GEN-LAST:event_generate_buyer_reportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try
        {
            java.util.Date date = jDateChooser2.getDate();
            String dateString = String.format("%1$td-%1$tm-%1$tY",date);

            con = db.dbConnect();
            stmt = con.createStatement();

            rs = stmt.executeQuery("select distinct tradersname from manditransaction where date='"+dateString+"'");
            buyer_name.removeAllItems();

            while(rs.next()) {
                counting = 1;
                buyer_name.addItem(rs.getString("tradersname"));
            }
            counting = 2;

            /*
            rs = stmt.executeQuery("select distinct itemname from manditransaction where date='"+dateString+"'");
            while(rs.next()) {
                item_name_for_A_bill.addItem(rs.getString("itemname"));
            }
            */
        }
        catch(Exception e){}

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(margindayreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(margindayreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(margindayreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(margindayreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new margindayreport().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem buyer_day_report;
    private javax.swing.JComboBox buyer_name;
    private javax.swing.JMenuItem commoditymaster;
    private javax.swing.JPanel datepanel;
    private javax.swing.JMenuItem day_report;
    private javax.swing.JMenuItem farmer_A_B_Bill_report;
    private javax.swing.JMenuItem farmer_kg_patti;
    private javax.swing.JMenuItem farmer_patti;
    private javax.swing.JMenuItem farmermaster;
    private javax.swing.JButton generate_buyer_report;
    private javax.swing.JMenuItem government_transaction;
    private javax.swing.JMenuItem item_day_report;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
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
