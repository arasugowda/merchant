
package reportspackage;

import GuiPackage.*;
import entriespackage.*;
import javax.swing.JFrame;
import masterpackage.*;
import pattipackage.*;
import supportingpackage.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import javax.swing.JOptionPane;


public class ledgerreport extends javax.swing.JFrame {

    Database db = new Database();
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
   
    public ledgerreport() {
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
        from_date = new com.toedter.calendar.JDateChooser();
        to_date = new com.toedter.calendar.JDateChooser();
        generate_ledger = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("F R O M   D A T E : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("T O   D A T E :");

        generate_ledger.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        generate_ledger.setText("G E N E R A T E     L E D G E R    R E P O R T");
        generate_ledger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_ledgerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generate_ledger, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(to_date, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(from_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(from_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(to_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(generate_ledger, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("L E D G E R    R E P O R T");

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
                .addGap(194, 194, 194)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(214, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
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

    private void generate_ledgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_ledgerActionPerformed
       
        try
        {
            Double amountBalance = 0.0;    
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);
            
            Date date_select = from_date.getDate();
            String date_String = String.format("%1$td-%1$tm-%1$tY",date_select);
            
            String previous_date = new DateCass().getPreviousDate(date_String);
            
            
            con = db.dbConnect();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select startingbalance from balanceamount where date='"+previous_date+"'");
            if(rs.next()) {
                amountBalance = Double.parseDouble(rs.getString("startingbalance"));
            }
            
            System.out.println("Amount:"+amountBalance);
            
            
                if(amountBalance > 0.0)
                {
                    
                    
                    
                                rs = stmt.executeQuery("select * from balanceamount where date='"+date_String+"'");
                                String date_chk1 = "";
                                if(rs.next()) { date_chk1 = rs.getString("date"); }
                                
                                if(date_chk1.equals(""))
                                {
                                    stmt.executeUpdate("insert into balanceamount(startingbalance,date)values('"+amountBalance+"','"+date_String+"')");
                                }
                                else
                                {
                                    stmt.executeUpdate("update balanceamount set startingbalance='"+amountBalance+"' where date='"+date_String+"'");
                                }
                    
                    
                    
                        System.out.println("LEDGER REPORT");
                        System.out.println("====================\n");



                        List<Date> dates = new ArrayList<Date>();
                        DateFormat formatter ; 
                        formatter = new SimpleDateFormat("dd-MM-yyyy");
                        DateCass dc = new DateCass();
                        Date from = from_date.getDate();
                        Date to = to_date.getDate();
                        dates = dc.getDates(from, to);


                        

                        for(int i=0;i<dates.size();i++)
                        {

                                Date lDate =(Date)dates.get(i);
                                String transaction_date = formatter.format(lDate);  



                                List itemname = new ArrayList();
                                rs = stmt.executeQuery("select distinct itemname from governmenttransaction where date='"+transaction_date+"'");
                                while(rs.next()) {  itemname.add(rs.getString("itemname")); }

                                rs = stmt.executeQuery("select startingbalance from balanceamount where date='"+transaction_date+"'");
                                if(rs.next()) {  amountBalance = Double.parseDouble(rs.getString("startingbalance")); }    
                                System.out.println("\nINITIAL AMOUNT "+amountBalance+" FOR DATE:"+transaction_date+"\n");  


                       //FARMER TRANSACTION PART
                       Iterator item_itr = itemname.iterator();
                       while(item_itr.hasNext())
                       {
                            String item_name = item_itr.next().toString();
                            System.out.println("ITEM : "+item_name.toUpperCase());
                            System.out.println("====================================");
                            System.out.println("\t\t AMOUNT\tPATTI-NO");
                            System.out.println("====================================");
                            List bbillno = new ArrayList();
                            rs = stmt.executeQuery("select distinct bbillno from governmenttransaction where itemname = '"+item_name+"' and date='"+transaction_date+"'");
                            while(rs.next()) {  bbillno.add(rs.getString("bbillno")); }



                                Iterator bbill_itr = bbillno.iterator();
                                Double total = 0.0;
                                while(bbill_itr.hasNext())
                                {
                                    String BBill_number = bbill_itr.next().toString();
                                    rs = stmt.executeQuery("select sum(total) as total_cal from governmenttransaction where bbillno='"+BBill_number+"' and date='"+transaction_date+"'");
                                    if(rs.next())
                                    {
                                        total = total + Double.parseDouble(rs.getString("total_cal"));
                                        System.out.println("\t\t "+rs.getString("total_cal") +"\t"+ BBill_number);
                                    }    
                                }
                                        amountBalance = amountBalance - total;
                                                
                                                
                           System.out.println("====================================");
                           System.out.println("TOTAL\t\t "+total+"  BALANCE:"+df.format(amountBalance));
                           System.out.println("====================================");
                       }

                            System.out.println("\n");






                       //BUYER PART
                       List item_name = new ArrayList();
                       Double itemAmount = 0.0;


                       String commission="";
                       String buyer_address = "";


                       Double rmc_cal = 0.0;
                       Double comm_cal = 0.0;
                       Double vat_cal = 0.0;
                       Double tot_cal = 0.0;

                       rs = stmt.executeQuery("select distinct itemname from governmenttransaction where date='"+transaction_date+"'");
                       while(rs.next()) {  item_name.add(rs.getString("itemname")); }


                       Iterator buyer_itr = item_name.iterator();
                       while(buyer_itr.hasNext())
                       {

                            String item_initial = buyer_itr.next().toString();
                            System.out.println("ITEM :"+item_initial);
                            List buyer_name = new ArrayList();

                            rs = stmt.executeQuery("select distinct buyerinitial from governmenttransaction where itemname='"+item_initial+"' and date='"+transaction_date+"'");
                            while(rs.next()) {  buyer_name.add(rs.getString("buyerinitial")); }


                            Iterator buyer_name_itr = buyer_name.iterator();
                            while(buyer_name_itr.hasNext())
                            {
                                    String buyer_initial_name = buyer_name_itr.next().toString();
                                    System.out.println("BUYER : "+buyer_initial_name+",");

                                    rs = stmt.executeQuery("select commission,address from buyer where initial='"+buyer_initial_name+"'");
                                    if(rs.next()) 
                                    { 
                                            commission = rs.getString("commission"); 
                                            buyer_address = rs.getString("address"); 
                                    }


                                    //System.out.println("select sum(total) as total_cal ,sum(rmc) as rmc_cal , sum(vat) as vat_cal from governmenttransaction where itemname='"+item_initial+"' and buyerinitial='"+buyer_initial_name+"' and date='"+transaction_date+"'");
                                    rs = stmt.executeQuery("select invoiceno,sum(total) as total_cal ,sum(rmc) as rmc_cal , sum(vat) as vat_cal from governmenttransaction where itemname='"+item_initial+"' and buyerinitial='"+buyer_initial_name+"' and date='"+transaction_date+"'");
                                    if(rs.next()) 
                                    {  
                                            itemAmount = Double.parseDouble(rs.getString("total_cal")); 
                                            rmc_cal = Double.parseDouble(rs.getString("rmc_cal"));
                                            vat_cal = Double.parseDouble(rs.getString("vat_cal"));
                                            comm_cal = (itemAmount * Double.parseDouble(commission)) / 100;
                                            tot_cal = itemAmount + rmc_cal + vat_cal + comm_cal;
                                            amountBalance = amountBalance + tot_cal;


                                            System.out.println(buyer_address+"   BILLNO: "+rs.getString("invoiceno"));
                                            System.out.println(itemAmount+"              "+item_initial.toUpperCase());
                                            System.out.println(df.format(rmc_cal)+"              "+"RMC");
                                            System.out.println(df.format(comm_cal)+"             "+"COMMISSION");
                                            System.out.println(df.format(vat_cal)+"              "+"VAT");
                                            System.out.println("========================================");
                                            System.out.println(df.format(tot_cal)+"              "+"TOTAL"+"  BALANCE :"+df.format(amountBalance));
                                            System.out.println("=======================================\n");
                                    }
                           }
                      }









                       // DESCRIPTION PART
                       rs = stmt.executeQuery("select * from ledger where date = '"+transaction_date+"'");
                       while(rs.next()) 
                       {
                           
                           if(rs.getString("creditordebit").equalsIgnoreCase("credit"))
                           {
                               amountBalance = amountBalance + Double.parseDouble(rs.getString("amount"));
                           }
                           else
                           {
                               amountBalance = amountBalance - Double.parseDouble(rs.getString("amount"));
                           }
                           
                           System.out.println("\t"+rs.getString("description")+" BALANCE: "+df.format(amountBalance)); 
                           
                       }
                       System.out.println("====================================\n\n\n");       

                                rs = stmt.executeQuery("select * from balanceamount where date='"+transaction_date+"'");
                                String date_chk = "";
                                if(rs.next()) { date_chk = rs.getString("date"); }
                                
                                if(date_chk.equals(""))
                                {
                                    stmt.executeUpdate("insert into balanceamount(startingbalance,date)values('"+amountBalance+"','"+transaction_date+"')");
                                }
                                else
                                {
                                    stmt.executeUpdate("update balanceamount set startingbalance='"+amountBalance+"' where date='"+transaction_date+"'");
                                }


                        }
            
            }
            else
            {
                rs = stmt.executeQuery("select date from balanceamount where id = (select max(id) from balanceamount)");
                if(rs.next()) {
                        JOptionPane.showMessageDialog(null, "NO BALANCE AMOUNT FOUND FOR THE DATE: "+date_String+" PLEASE CHECK AGAIN");
                        JOptionPane.showMessageDialog(null, "LAST ADDED BALANCE AMOUNT DATE: "+rs.getString("date"));
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "EMPTY TABLE");
                }
            }
                    
        }
        catch(Exception e){}
    }//GEN-LAST:event_generate_ledgerActionPerformed

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
            java.util.logging.Logger.getLogger(ledgerreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ledgerreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ledgerreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ledgerreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ledgerreport().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem buyer_day_report;
    private javax.swing.JMenuItem commoditymaster;
    private javax.swing.JMenuItem day_report;
    private javax.swing.JMenuItem farmer_A_B_Bill_report;
    private javax.swing.JMenuItem farmer_kg_patti;
    private javax.swing.JMenuItem farmer_patti;
    private javax.swing.JMenuItem farmermaster;
    private com.toedter.calendar.JDateChooser from_date;
    private javax.swing.JButton generate_ledger;
    private javax.swing.JMenuItem government_transaction;
    private javax.swing.JMenuItem item_day_report;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private com.toedter.calendar.JDateChooser to_date;
    // End of variables declaration//GEN-END:variables
}
