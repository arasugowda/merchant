
package masterpackage;


import supportingpackage.Database;
import GuiPackage.MainFrame;
import java.awt.GridLayout;
import java.awt.KeyboardFocusManager;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.sql.*;
import javax.swing.JButton;
import java.util.Date;
import javax.swing.JOptionPane;
import pattipackage.*;
import reportspackage.*;
import entriespackage.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author DELL
 */
public class GovernmentTransactionGrid extends javax.swing.JFrame {

    public  static int row_value = 20; // Setting the default row value;
    public  static int ind = 340; // Setting the default grid value 
    public  static int count = 0; // initializing count to zero
    
    
    // Creating object the perform all the database 
    // related operations
    Database db = new Database();
    Connection item_con = null;
    Statement item_stmt = null;
    ResultSet item_rs = null;
    
    public GovernmentTransactionGrid() {
      // setUndecorated(true); //Removing the frame header
        setExtendedState(JFrame.MAXIMIZED_BOTH); // frame size is maximized as windows 
        initComponents();
        load_items();
    }

   
    
    public void load_items()
    {
        try
        {
              item_con = db.dbConnect();
              item_stmt = item_con.createStatement();
              item_rs = item_stmt.executeQuery("select DISTINCT itemname from commodity");
              item_name.addItem("SELECT");
              while(item_rs.next()) {
                  item_name.addItem(item_rs.getString("itemname"));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        display_grid = new javax.swing.JPanel();
        datepanel = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        item_name = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        related_button = new javax.swing.JButton();
        add_row = new javax.swing.JButton();
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

        jLabel4.setIcon(new javax.swing.ImageIcon("images\\close-icon.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("images\\min.png")); // NOI18N
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
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout display_gridLayout = new javax.swing.GroupLayout(display_grid);
        display_grid.setLayout(display_gridLayout);
        display_gridLayout.setHorizontalGroup(
            display_gridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 919, Short.MAX_VALUE)
        );
        display_gridLayout.setVerticalGroup(
            display_gridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(display_grid);

        datepanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Item Name");

        item_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Date");

        javax.swing.GroupLayout datepanelLayout = new javax.swing.GroupLayout(datepanel);
        datepanel.setLayout(datepanelLayout);
        datepanelLayout.setHorizontalGroup(
            datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datepanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        datepanelLayout.setVerticalGroup(
            datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("G O V E R N M E N T   T R A N S A C T I O N   G R I D");

        related_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        related_button.setText("GET SPECIFIED DATE VALUES");
        related_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                related_buttonActionPerformed(evt);
            }
        });

        add_row.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add_row.setText("ADD ROW");
        add_row.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_rowActionPerformed(evt);
            }
        });

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
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(datepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(related_button)
                            .addComponent(add_row)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_row, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(related_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(datepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void related_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_related_buttonActionPerformed

        try
        {
            Date date = jDateChooser2.getDate();
            String dateString = String.format("%1$td-%1$tm-%1$tY",date);
            if(!item_name.getSelectedItem().toString().equals("SELECT"))
            {
            
            if(!dateString.equals("null-null-null"))
            {

            // System.out.println(dateString);
            String sql_check = "select count(*) as noofcounts from governmenttransaction where date='"+dateString+"' and itemname='"+item_name.getSelectedItem().toString()+"'";
            int result = Integer.parseInt(db.getRequestedValue(sql_check, "noofcounts", "STRING-FORMAT"));
            if(result>0)
            {

                display_grid.removeAll();
                int cols = 19;
                if(count == 0) { row_value++; count = 1;}
                row_value = result;
                display_grid.setLayout(new GridLayout(row_value, 17));
                
                
                
                // getting the number of records from the table
                //for specified date
                long value = 0;
                Connection con =  db.dbConnect();
                Statement stmt = con.createStatement();
                ResultSet select_result = stmt.executeQuery("select count(*) as Count_value from governmenttransaction where date='"+dateString+"' and itemname='"+item_name.getSelectedItem().toString()+"'");
                    
                 if (select_result.next()) {
                        value = select_result.getLong("Count_value");
                 }
                  
                 
                 //int row_value_for_grid = row_value + (int)value;
                 int row_value_for_grid = (int)value;
                 display_grid.setLayout(new GridLayout((row_value_for_grid + 1), 17));
                 ind = row_value_for_grid * 17;
                 
                

                //String[] headings = {"FARMERNAME","ITEMNAME","WEIGHT","LOTNO","NOOFBAGS","A BILLNO","DATE","RATEPERKG","TRADERSNAME","RMC(%)","COMMISSION(%)","VAT","SURCHARGE","HAMALI","ROUNDOFF","INVOICENO","TOTAL","GRAND TOTAL","ID","OPERATION"};
                String[] headings = {"LOT NO","VILLAGE NAME","FARMER NAME","WEIGHT","BUYER INITIAL","RATE PER KG","ABILL NO","BBILL NO","INVOICE NO","RMC","VAT","SURCHARGE","HAMALI","DATE","ID","OPERATION","DELETE"};
                final JLabel jlabel[] = new JLabel[headings.length];

                int btn_ind = (ind / 17) * 2;
                
               
                final JTextField jtf_one[] = new JTextField[(ind - btn_ind)];
                
                int n=0;

                while(n < headings.length)
                {
                    jlabel[n] = new JLabel(headings[n]);
                    jlabel[n].setHorizontalAlignment(SwingConstants.CENTER);
                    display_grid.add(jlabel[n]);
                    n++;
                }

               

                int m = 0;
                final JButton btn_one[] = new JButton[btn_ind];
                String[][] ret_val = new String[row_value][15];
                ret_val = getDateRelatedValueFromTable(row_value , 15,dateString);

                long ret_count = 0;
                long getCount = 0;
                
                
               /* for(int s1 = 0;s1 < row_value;s1++)
                {
                    for(int s2 = 0;s2 < 15;s2++)
                    {
                        System.out.print("ret_val["+s1+"]["+s2+"]"+ret_val[s1][s2]+"\n");
                        ret_count++;
                    }
                    System.out.println("\n");
                }
                */               
                getCount = Long.parseLong(db.getRequestedValue("select count(*) as Coloumns from governmenttransaction where date='"+dateString+"' and itemname='"+item_name.getSelectedItem().toString()+"'", "Coloumns", "LONG-FORMAT"));
                ret_count = getCount * 17;

                int row = 0;
                int col = 0;
                int pos = 1;

                int bindex = 0;
                int jindex = 0;

                long ret = (ret_count / getCount) - 2;
                long ret_del = (ret_count / getCount) - 1;
                long temp_ret = ret;
                long temp_del_ret = ret_del;
                String status = "active";
                
                while(m < ind)
                {
                        //System.out.println(m+" ITTERATION START");
                        if(m < (ret_count))
                        {
                                if(m == ret)
                                {
                                        //System.out.println("update btn called");
                                        btn_one[bindex] = new JButton("UPDATE");
                                        btn_one[bindex].addActionListener(new MyAction(jindex,jtf_one,m,btn_one[bindex],jtf_one[jindex-1],jtf_one[jindex-2],jtf_one[jindex-3],jtf_one[jindex-4],jtf_one[jindex-5],jtf_one[jindex-6],jtf_one[jindex-7],jtf_one[jindex-8],jtf_one[jindex-9],jtf_one[jindex-10],jtf_one[jindex-11],jtf_one[jindex-12],jtf_one[jindex-13],jtf_one[jindex-14],jtf_one[jindex-15]));
                                        display_grid.add(btn_one[bindex]);
                                        bindex++;
                                        temp_ret = ret;
                                        ret = ret + 17;
                                        pos++;
                                }
                            
                                if(m == ret_del)
                                {
                                        //System.out.println("delete btn called");
                                        btn_one[bindex] = new JButton("DELETE");
                                        btn_one[bindex].addActionListener(new MyActionDelete(jindex,jtf_one,m,btn_one[bindex-1],btn_one[bindex],jtf_one[jindex-1],jtf_one[jindex-2],jtf_one[jindex-3],jtf_one[jindex-4],jtf_one[jindex-5],jtf_one[jindex-6],jtf_one[jindex-7],jtf_one[jindex-8],jtf_one[jindex-9],jtf_one[jindex-10],jtf_one[jindex-11],jtf_one[jindex-12],jtf_one[jindex-13],jtf_one[jindex-14],jtf_one[jindex-15]));
                                        
                                        display_grid.add(btn_one[bindex]);
                                        bindex++;
                                        col = 0;
                                        temp_del_ret = ret_del;
                                        ret_del = ret_del + 17;
                                        pos = 1;
                                        row++;
                                }

                                if(m != temp_ret && m != temp_del_ret)
                                {
                                        if(col == 14)
                                        {
                                            //System.out.println("id btn called");
                                            jtf_one[jindex] = new JTextField(ret_val[row][col]);
                                            jtf_one[jindex].setEditable(false);
                                            jtf_one[jindex].setVisible(false);
                                            display_grid.add(jtf_one[jindex]);
                                            col = 0;
                                        }
                                        else
                                        {
                                            //System.out.println("normal text called");
                                            jtf_one[jindex] = new JTextField(ret_val[row][col]);
                                            display_grid.add(jtf_one[jindex]);
                                            //jtf_one[jindex].addKeyListener(new UpdateKeyListener(jindex,jtf_one,pos));
                                            jtf_one[jindex].addKeyListener(new MyKeyListener(jindex,jtf_one,pos,"remaining"));
                                            jtf_one[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);

                                            col++;
                                        }

                                        pos++;
                                        jindex++;
                                        // col++;
                                 }

                       }
                       else
                       {
                                    if(m == ret)
                                    {
                                        btn_one[bindex] = new JButton("ADD");
                                        btn_one[bindex].addActionListener(new MyAction(jindex,jtf_one,m,btn_one[bindex],jtf_one[jindex-1],jtf_one[jindex-2],jtf_one[jindex-3],jtf_one[jindex-4],jtf_one[jindex-5],jtf_one[jindex-6],jtf_one[jindex-7],jtf_one[jindex-8],jtf_one[jindex-9],jtf_one[jindex-10],jtf_one[jindex-11],jtf_one[jindex-12],jtf_one[jindex-13],jtf_one[jindex-14],jtf_one[jindex-15]));
                                        
                                        display_grid.add(btn_one[bindex]);
                                        bindex++;
                                        ret = ret + 17;
                                        pos++;
                                        status = "deactive";
                                    }
                                    
                                    if(m == ret_del)
                                    {
                                        btn_one[bindex] = new JButton("DELETE");
                                        btn_one[bindex].addActionListener(new MyActionDelete(jindex,jtf_one,m,btn_one[bindex-1],btn_one[bindex],jtf_one[jindex-1],jtf_one[jindex-2],jtf_one[jindex-3],jtf_one[jindex-4],jtf_one[jindex-5],jtf_one[jindex-6],jtf_one[jindex-7],jtf_one[jindex-8],jtf_one[jindex-9],jtf_one[jindex-10],jtf_one[jindex-11],jtf_one[jindex-12],jtf_one[jindex-13],jtf_one[jindex-14],jtf_one[jindex-15]));
                                        
                                        display_grid.add(btn_one[bindex]);
                                        bindex++;
                                        ret_del = ret_del + 17;
                                        pos = 1;
                                        status = "deactive";
                                    }
                                    
                                    if(m != ret && m != ret_del && status.equals("active"))
                                    {
                                            if(m == (ret - 1))
                                            {
                                                    jtf_one[jindex] = new JTextField();
                                                    jtf_one[jindex].setEditable(false);
                                                    jtf_one[jindex].setVisible(false);
                                                    display_grid.add(jtf_one[jindex]);
                                            }

                                            
                                            if(m != (ret-1))
                                            {
                                                    jtf_one[jindex] = new JTextField();
                                                    // jtf_one[jindex].addKeyListener(new UpdateKeyListener(jindex,jtf_one,pos));
                                                    jtf_one[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
                                                    display_grid.add(jtf_one[jindex]);
                                            }
                                        
                                            pos++;
                                            jindex++;
                                        }
                                    status = "active";
                                }
                                 //System.out.println(m+" ITTERATION ENDS");
                            m++;

                    }

                    row_value = row_value + 20;
                    ind = ind + 340;
                    display_grid.updateUI();

            }
            else
            {
                    JOptionPane.showMessageDialog(null, "NO TRANSACTION FOUND FOR THE DATE: "+dateString);
                    display_grid.removeAll();
            }
            }
            else
            {
                    JOptionPane.showMessageDialog(null, "PLEASE SELECT THE DATE ");
                    display_grid.removeAll();
            }
            }
            else
            {
                    JOptionPane.showMessageDialog(null, "PLEASE SELECT THE ITEM ");
                    display_grid.removeAll();
            }
        }
            
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_related_buttonActionPerformed

    private void add_rowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_rowActionPerformed

        try
        {
                int lotcount = 1;
                // Removing all the components from
                // the grid
                display_grid.removeAll();
                
                // gets the unformatted date value from datachooser 
                Date date = jDateChooser2.getDate(); 
                // formatting the date
                String dateString = String.format("%1$td-%1$tm-%1$tY",date);

            if(!item_name.getSelectedItem().toString().equals("SELECT"))     
            {     
                
                if(!dateString.equals("null-null-null"))
                {
                
                long cols = 15; // position for ADD/UPDATE button in the grid
                long del_col = 16; // position for DELETE button in the grid

                
                // This Condition is for increaseing the row from 20 to 21
                // for displaying coloumn labels
                if(count == 0) { row_value++; count = 1;}
                
                
                    // getting the number of records from the table
                    //for specified date
                    long value = 0;
                    Connection con =  db.dbConnect();
                    Statement stmt = con.createStatement();
                    ResultSet select_result = stmt.executeQuery("select count(*) as Count_value from governmenttransaction where date='"+dateString+"' and itemname='"+item_name.getSelectedItem().toString()+"'");
                    
                    if (select_result.next()) {
                        value = select_result.getLong("Count_value");
                    }
                    
                        int row_value_for_grid = row_value + (int)value;
                        //System.out.println("ROW GRID:"+row_value_for_grid);
                        display_grid.setLayout(new GridLayout((row_value_for_grid + 1), 17));
                    
                        ind = row_value_for_grid * 17;
                        //System.out.println("IND:"+ind);

                        
                String[] headings = {"LOT NO","VILLAGE NAME","FARMER NAME","WEIGHT","BUYER INITIAL","RATE PER KG","ABILL NO","BBILL NO","INVOICE NO","RMC","VAT","SURCHARGE","HAMALI","DATE","ID","OPERATION","DELETE"};
                final JLabel jlabel[] = new JLabel[headings.length];

                int btn_ind = (ind / 17) * 2;
                JTextField jtf[] = new JTextField[(ind - btn_ind)];
                final JButton btn[] = new JButton[btn_ind];
                int n = 0;

                //System.out.println("Heading:"+headings.length);
                while(n < headings.length) {
                    //System.out.println("CALLING LABEL "+n);
                    jlabel[n] = new JLabel(headings[n]);
                    jlabel[n].setHorizontalAlignment(SwingConstants.CENTER);
                    display_grid.add(jlabel[n]);
                    n++;
                }
                
                
           

           int result = 0;
           
            if(!dateString.equalsIgnoreCase("null-null-null"))
            {
                String sql_check = "select count(*) as noofcounts from governmenttransaction where date='"+dateString+"' and itemname='"+item_name.getSelectedItem().toString()+"'";
                result = Integer.parseInt(db.getRequestedValue(sql_check, "noofcounts", "STRING-FORMAT"));
                if(result<=0)
                {
                    JOptionPane.showMessageDialog(null, "NO DATA FOUND FOR THE DATE: "+ dateString);
                }
            }
            //System.out.println("step1");
            long ret_count = 0;
            long getCount = 0;
            long ret = 0;
            long ret_del = 0;
            long temp_ret = 0;
            long temp_del_ret = ret_del;
            String status = "active";
            String[][] ret_val = new String[row_value_for_grid][15];
            //System.out.println("step2");
            
            if(result>0)
            {
                 ret_val = getDateRelatedValueFromTable(row_value_for_grid , 15,dateString);
            
                getCount = Long.parseLong(db.getRequestedValue("select count(*) as Coloumns from governmenttransaction where date='"+dateString+"' and itemname='"+item_name.getSelectedItem().toString()+"'", "Coloumns", "LONG-FORMAT"));
                ret_count = getCount * 17;
            
                
                
                ret = (ret_count / getCount) - 2;
                ret_del = (ret_count / getCount) - 1;
                temp_ret = ret;
                temp_del_ret = ret_del;
                status = "active";
                //System.out.println("STATUS:"+status);
            }   
                
            int m = 0;
            int bindex = 0;
            int jindex = 0;
            int row = 0;
            int col = 0;
            int pos = 1;
            int datepos = 13;
            int id_col = 14;
            int lotno_count = 0;
            
            while(m < ind)
            {
                
                 if(m < (ret_count))
                 {
                                if(m == ret)
                                {
                                        
                                        btn[bindex] = new JButton("UPDATE");
                                        btn[bindex].addActionListener(new MyAction(jindex,jtf,m,btn[bindex],jtf[jindex-1],jtf[jindex-2],jtf[jindex-3],jtf[jindex-4],jtf[jindex-5],jtf[jindex-6],jtf[jindex-7],jtf[jindex-8],jtf[jindex-9],jtf[jindex-10],jtf[jindex-11],jtf[jindex-12],jtf[jindex-13],jtf[jindex-14],jtf[jindex-15]));
                                        display_grid.add(btn[bindex]);
                                        bindex++;
                                        temp_ret = ret;
                                        ret = ret + 17;
                                        pos++;
                                        
                                }
                            
                                if(m == ret_del)
                                {
                                       
                                        btn[bindex] = new JButton("DELETE");
                                        btn[bindex].addActionListener(new MyActionDelete(jindex,jtf,m,btn[bindex-1],btn[bindex],jtf[jindex-1],jtf[jindex-2],jtf[jindex-3],jtf[jindex-4],jtf[jindex-5],jtf[jindex-6],jtf[jindex-7],jtf[jindex-8],jtf[jindex-9],jtf[jindex-10],jtf[jindex-11],jtf[jindex-12],jtf[jindex-13],jtf[jindex-14],jtf[jindex-15]));
                                        
                                        display_grid.add(btn[bindex]);
                                        bindex++;
                                        col = 0;
                                        temp_del_ret = ret_del;
                                        ret_del = ret_del + 17;
                                        pos = 1;
                                        row++;
                                        
                                }

                                if(m != temp_ret && m != temp_del_ret)
                                {
                                        
                                        if(col == 14)
                                        {
                                            
                                            jtf[jindex] = new JTextField(ret_val[row][col]);
                                            jtf[jindex].setEditable(false);
                                            jtf[jindex].setVisible(false);
                                            display_grid.add(jtf[jindex]);
                                            col = 0;
                                            id_col = id_col + 17;
                                        }
                                        else
                                        {
                                            
                                            jtf[jindex] = new JTextField(ret_val[row][col]);
                                            display_grid.add(jtf[jindex]);
                                           // jtf_one[jindex].addKeyListener(new UpdateKeyListener(jindex,jtf_one,pos));
                                            //jtf[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);

                                            col++;
                                        }
                                        
                                        
                                        if(m == datepos){
                                            datepos+=17;
                                        }

                                        
                                        if(m == lotno_count){
                                            lotno_count+=17;
                                            lotcount++;
                                        }
                                        pos++;
                                        jindex++;
                                        // col++;
                                 }
                                   
                                cols = ret;
                                del_col = ret_del;

                }
                else
                {
                      
                        // This condition for displaying all
                        //textfield component in the grid
                        if(m != cols && m != del_col)
                        {
                            
                              // This condition is for displaying the
                                // id coloumn for unique rows
                                if(id_col == m)
                                {
                                    
                                    jtf[jindex] = new JTextField(); // creating textfiled
                                    jtf[jindex].setEditable(false); // making textfiled not editable
                                    jtf[jindex].setVisible(false); // making textfield invisible
                                    display_grid.add(jtf[jindex]); // adding to the grid layout

                                    // incrementing the position to
                                    //point to next coloumn position
                                    pos++;

                                    //incrementing the coloumn to point
                                    //to next id display position
                                    id_col+=17;

                                    //incrementing the textfield index
                                    jindex++;
                                }
                                else
                                {
                                        //System.out.println("text condition");
                                        if(m <= 13)
                                        {
                                            if(m == 13)
                                            {
                                                
                                                jtf[jindex] = new JTextField(dateString);
                                                jtf[jindex].setEditable(false);
                                                jtf[jindex].addKeyListener(new MyKeyListener(jindex,jtf,pos,"initial"));
                                                jtf[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
                                                datepos+=17;
                                            }
                                            else
                                            {
                                                if(lotno_count == m)
                                                {
                                                        //System.out.println("NORMAL TEXT "+m);
                                                        jtf[jindex] = new JTextField();
                                                        jtf[jindex].setText(Integer.toString(lotcount));
                                                        jtf[jindex].addKeyListener(new MyKeyListener(jindex,jtf,pos,"remaining"));
                                                        jtf[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
                                                        lotcount++;
                                                        lotno_count+=17;   
                                                }
                                                else
                                                {
                                                    jtf[jindex] = new JTextField();
                                                    jtf[jindex].addKeyListener(new MyKeyListener(jindex,jtf,pos,"remaining"));
                                                    jtf[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
                                                }
                                            }
                                         }

                                        if(m > 13)
                                        {
                                            if(m == datepos)
                                            {
                                                //System.out.println("DATE TEXT "+m);
                                                jtf[jindex] = new JTextField(dateString);
                                                jtf[jindex].setEditable(false);
                                                jtf[jindex].addKeyListener(new MyKeyListener(jindex,jtf,pos,"remaining"));
                                                jtf[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
                                                datepos+=17;
                                            }
                                            else
                                            {
                                                
                                                if(lotno_count == m)
                                                {
                                                        //System.out.println("NORMAL TEXT "+m);
                                                        jtf[jindex] = new JTextField();
                                                        jtf[jindex].setText(Integer.toString(lotcount));
                                                        jtf[jindex].addKeyListener(new MyKeyListener(jindex,jtf,pos,"remaining"));
                                                        jtf[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
                                                        lotcount++;
                                                        lotno_count+=17;   
                                                }
                                                else
                                                {
                                                        //System.out.println("NORMAL TEXT "+m);
                                                        jtf[jindex] = new JTextField();
                                                        jtf[jindex].addKeyListener(new MyKeyListener(jindex,jtf,pos,"remaining"));
                                                        jtf[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
                                                }       
                                            }
                                        }
                                        
                                        
                                        
                                        

                                        display_grid.add(jtf[jindex]);

                                            pos++;
                                            jindex++;
                                }
                        }

                        
                        // Condition for displaying
                        // 'ADD' Button at end of each row
                        if(m == cols)
                        {
                                
                                // ADD Button for the first row
                                if(cols == 16 ){
                                    btn[bindex] = new JButton("ADD");
                                    btn[bindex].addActionListener(new MyAction(jindex,jtf,m,btn[bindex],jtf[jindex-1],jtf[jindex-2],jtf[jindex-3],jtf[jindex-4],jtf[jindex-5],jtf[jindex-6],jtf[jindex-7],jtf[jindex-8],jtf[jindex-9],jtf[jindex-10],jtf[jindex-11],jtf[jindex-12],jtf[jindex-13],jtf[jindex-14],jtf[jindex-15]));
                                }

                                //ADD Button for the remaining
                                if(cols != 16){
                                   // System.out.println("NORMAL ADD "+m);
                                    btn[bindex] = new JButton("ADD");
                                    btn[bindex].addActionListener(new MyAction(jindex,jtf,m,btn[bindex],jtf[jindex-1],jtf[jindex-2],jtf[jindex-3],jtf[jindex-4],jtf[jindex-5],jtf[jindex-6],jtf[jindex-7],jtf[jindex-8],jtf[jindex-9],jtf[jindex-10],jtf[jindex-11],jtf[jindex-12],jtf[jindex-13],jtf[jindex-14],jtf[jindex-15]));
                                }
                    
                                //Adding Button Component into
                                //GridLayout
                                display_grid.add(btn[bindex]);

                                //incrementing the coloumn to point
                                //to next button display position
                                cols = cols + 17;

                                // assigning the position to the
                                // first for next row
                                pos = 1;

                                //incrementing button array index
                                bindex++;
                        }

                
                        // Condition for displaying
                        // 'ADD' Button at end of each row
                        if(m == del_col)
                        {
                                
                                // ADD Button for the first row
                                if(del_col == 17 ){
                                    btn[bindex] = new JButton("DELETE");
                                    btn[bindex].addActionListener(new MyActionDelete(jindex,jtf,m,btn[bindex-1],btn[bindex],jtf[jindex-1],jtf[jindex-2],jtf[jindex-3],jtf[jindex-4],jtf[jindex-5],jtf[jindex-6],jtf[jindex-7],jtf[jindex-8],jtf[jindex-9],jtf[jindex-10],jtf[jindex-11],jtf[jindex-12],jtf[jindex-13],jtf[jindex-14],jtf[jindex-15]));
                                }

                                // ADD Button for the first row
                                if(del_col != 17 ){
                                    btn[bindex] = new JButton("DELETE");
                                    btn[bindex].addActionListener(new MyActionDelete(jindex,jtf,m,btn[bindex-1],btn[bindex],jtf[jindex-1],jtf[jindex-2],jtf[jindex-3],jtf[jindex-4],jtf[jindex-5],jtf[jindex-6],jtf[jindex-7],jtf[jindex-8],jtf[jindex-9],jtf[jindex-10],jtf[jindex-11],jtf[jindex-12],jtf[jindex-13],jtf[jindex-14],jtf[jindex-15]));
                                }

                                //Adding Button Component into
                                //GridLayout
                                display_grid.add(btn[bindex]);

                                //incrementing the coloumn to point
                                //to next button display position
                                del_col = del_col + 17;

                                // assigning the position to the
                                // first for next row
                                pos = 1;

                                //incrementing button array index
                                bindex++;
                        }
                }   

                
                m++;

            }

            row_value = row_value + 20;
            ind = ind + 340;
            display_grid.updateUI();
            
            
                }
                else
                {
                            JOptionPane.showMessageDialog(null, "PLEASE SELECT THE DATE ");
                            display_grid.removeAll();
                
                }
            } 
            else
             {
                            JOptionPane.showMessageDialog(null, "PLEASE SELECT THE ITEM NAME ");
                            display_grid.removeAll();
                
             }
            
            
        }
        catch(Exception e){}
    }//GEN-LAST:event_add_rowActionPerformed

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

    
    public String[][] getDateRelatedValueFromTable(int row , int col , String date_value)
    {
            String[][] return_value = new String[row][col];
            try
            {
                    Connection con =  db.dbConnect();
                    Statement stmt = con.createStatement();
                    String query = "select * from governmenttransaction where date = '"+date_value+"' and itemname='"+item_name.getSelectedItem().toString()+"'";
                    System.out.println(query);
                    ResultSet select_result = stmt.executeQuery(query);
                    int i = 0; 
                    
                    while (select_result.next())
                    {
                            if(i < row)
                            {
                                        
                                        return_value[i][0] = select_result.getString("lotno");
                                        return_value[i][1] = select_result.getString("villagename");
                                        return_value[i][2] = select_result.getString("farmername");
                                        return_value[i][3] = select_result.getString("weight");
                                        return_value[i][4] = select_result.getString("buyerinitial");
                                        return_value[i][5] = select_result.getString("rateperkg");
                                        return_value[i][6] = select_result.getString("abillno");
                                        return_value[i][7] = select_result.getString("bbillno");
                                        return_value[i][8] = select_result.getString("invoiceno");
                                        return_value[i][9] = select_result.getString("rmc");
                                        return_value[i][10] = select_result.getString("vat");
                                        return_value[i][11] = select_result.getString("surcharge");
                                        return_value[i][12] = select_result.getString("hamali");
                                        return_value[i][13] = select_result.getString("date");
                                        return_value[i][14] = select_result.getString("id");
                                        
                                        
                                        
                                        System.out.println("i value:"+i);
                                        i++;
                            }      
                   }
            }
            catch(Exception e){}
            
            
            return return_value;
    }
    
    
    
    
    
    
    // This Class is for ADD/UPDATE Button 
    class MyAction implements ActionListener
    {
        
        JButton btn = null;
        int m = 0;
        int jindex = 0;
        int jindex_cal = 0;
        Database db = new Database(); 
        JTextField[] jtf;                                                                                                                               
        JTextField MyAction_id,lotno,villagename,farmername,rateperkg,weight,buyerinitial,abillno,bbillno,invoiceno,rmc,vat,surcharge,hamali,date;
        
        public MyAction(int jindex,JTextField[] jtf,int m,JButton btn,JTextField id,JTextField date,JTextField hamali,JTextField surcharge,JTextField vat,JTextField rmc,JTextField invoiceno,JTextField bbillno,JTextField abillno,JTextField rateperkg,JTextField buyerinitial,JTextField weight,JTextField farmername,JTextField villagename,JTextField lotno)
        {
                this.jindex = jindex;
                this.jtf = jtf;
                this.m = m;
                this.btn = btn;
                MyAction_id = id;
                this.lotno = lotno;
                this.villagename = villagename;
                this.farmername = farmername;
                this.rateperkg = rateperkg;
                this.weight = weight;
                this.buyerinitial = buyerinitial;
                this.abillno = abillno;
                this.bbillno = bbillno;
                this.invoiceno = invoiceno;
                this.rmc = rmc;
                this.vat = vat;
                this.surcharge = surcharge;
                this.hamali = hamali;
                this.date = date;
                
             //  System.out.println("ID:"+this.id.getText()+"| TOTAL:"+this.total.getText()+"|GRANDTOTAL:"+this.grand_total.getText()+"| INVOICE NO:"+this.invoice_no.getText()+"|ROUNDOFF :"+this.round_off.getText()+"|HAMALI:"+this.hamali.getText()+"|SURCHARGE:"+this.surcharge.getText()+"|VAT:"+this.vat.getText()+"|COMMISSION:"+this.commission.getText()+"|RMC:"+this.rmc.getText()+"|TRADERS NAME:"+this.traders_name.getText()+"|RATE PER KG:"+this.rate_per_kg.getText()+"|DATE:"+this.date.getText()+"|A BILL NO:"+this.A_bill_no.getText()+"|NO OF BAGS:"+this.no_of_bags.getText()+"|LOT NO:"+this.lot_no.getText()+"|WEIGHT:"+this.weight.getText()+"|ITEM NAME:"+this.item_name.getText()+"|FARMER NAME:"+this.farmer_name.getText());
        }
        
        
        
        public void actionPerformed(ActionEvent aevent)
        {
                if(aevent.getActionCommand().equals("ADD"))
                {
                    jindex_cal = jindex - 15;
                     if(jindex_cal > 0) 
                     {   
                         boolean condition  = checkvalue(jtf[jindex-2],jtf[jindex-3],jtf[jindex-4],jtf[jindex-5]);
                        if(condition && !jtf[jindex_cal-2].getText().equals("") && !jtf[jindex_cal-3].getText().equals("") && !jtf[jindex_cal-4].getText().equals("") && !jtf[jindex_cal-5].getText().equals(""))
                        {
                            String sql = "insert into governmenttransaction (lotno,itemname,villagename,farmername,weight,buyerinitial,rateperkg,abillno,bbillno,invoiceno,rmc,vat,surcharge,hamali,date,commission,total,grandtotal) values('1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18')";    
                            long id =  db.addToTable("governmenttransaction", sql);
                            MyAction_id.setText(Long.toString(id));
                            
                            String sql_query1 = "select * from buyer where initial='"+buyerinitial.getText().trim()+"'";
                            double commission = Double.parseDouble(db.getRequestedValue(sql_query1, "commission", "STRING-FORMAT"));           
     
                            double commission_value = (Double.parseDouble(weight.getText()) * Double.parseDouble(rateperkg.getText())) * (commission / 100);
                            double total = Double.parseDouble(weight.getText()) * Double.parseDouble(rateperkg.getText());
                            double grandtotal = Double.parseDouble(vat.getText()) + Double.parseDouble(surcharge.getText()) + Double.parseDouble(hamali.getText()) + total + Double.parseDouble(rmc.getText()) + commission_value;
                            
                            
                            String sql_update = "update governmenttransaction set itemname='"+item_name.getSelectedItem().toString()+"',grandtotal='"+grandtotal+"', total = '"+total+"', commission='"+commission_value+"',lotno='"+lotno.getText()+"',villagename='"+villagename.getText()+"',farmername='"+farmername.getText()+"',rateperkg='"+rateperkg.getText()+"',weight='"+weight.getText()+"',buyerinitial='"+buyerinitial.getText()+"',abillno='"+abillno.getText()+"',bbillno='"+bbillno.getText()+"',invoiceno='"+invoiceno.getText()+"',rmc='"+rmc.getText()+"',vat='"+vat.getText()+"',surcharge='"+surcharge.getText()+"',hamali='"+hamali.getText()+"',date='"+date.getText()+"' where id="+id;    
                            db.insertRow("governmenttransaction", sql_update);   
                            btn.setText("UPDATE");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "ROW IS EMPTY!!! PLEASE CHECK AGAIN");
                        }
                     }
                     else
                     {
                            
                            String sql = "insert into governmenttransaction (lotno,itemname,villagename,farmername,weight,buyerinitial,rateperkg,abillno,bbillno,invoiceno,rmc,vat,surcharge,hamali,date,commission,total,grandtotal) values('1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18')";    
                            long id =  db.addToTable("governmenttransaction", sql);
                            MyAction_id.setText(Long.toString(id));
                            
                            String sql_query1 = "select * from buyer where initial='"+buyerinitial.getText().trim()+"'";
                            double commission = Double.parseDouble(db.getRequestedValue(sql_query1, "commission", "STRING-FORMAT"));           
     
                            double commission_value = (Double.parseDouble(weight.getText()) * Double.parseDouble(rateperkg.getText())) * (commission / 100);
                            double total = Double.parseDouble(weight.getText()) * Double.parseDouble(rateperkg.getText());
                            double grandtotal = Double.parseDouble(vat.getText()) + Double.parseDouble(surcharge.getText()) + Double.parseDouble(hamali.getText()) + total + Double.parseDouble(rmc.getText()) + commission_value;
                            
                            
                            String sql_update = "update governmenttransaction set itemname='"+item_name.getSelectedItem().toString()+"',grandtotal='"+grandtotal+"', total = '"+total+"', commission='"+commission_value+"',lotno='"+lotno.getText()+"',villagename='"+villagename.getText()+"',farmername='"+farmername.getText()+"',rateperkg='"+rateperkg.getText()+"',weight='"+weight.getText()+"',buyerinitial='"+buyerinitial.getText()+"',abillno='"+abillno.getText()+"',bbillno='"+bbillno.getText()+"',invoiceno='"+invoiceno.getText()+"',rmc='"+rmc.getText()+"',vat='"+vat.getText()+"',surcharge='"+surcharge.getText()+"',hamali='"+hamali.getText()+"',date='"+date.getText()+"' where id="+id;    
                            db.insertRow("governmenttransaction", sql_update);   
                            btn.setText("UPDATE");
                     }
                }

                
                
                if(aevent.getActionCommand().equals("UPDATE"))
                {
                    jindex_cal = jindex - 15;
                    
                     if(jindex_cal > 0) 
                     { 
                            if(!jtf[jindex_cal-2].getText().equals("") && !jtf[jindex_cal-3].getText().equals("") && !jtf[jindex_cal-4].getText().equals("") && !jtf[jindex_cal-5].getText().equals(""))
                            {
                                    String sql_query1 = "select * from buyer where initial='"+buyerinitial.getText().trim()+"'";
                                    double commission = Double.parseDouble(db.getRequestedValue(sql_query1, "commission", "STRING-FORMAT"));           
     
                                    double commission_value = (Double.parseDouble(weight.getText()) * Double.parseDouble(rateperkg.getText())) * (commission / 100);
                                    double total = Double.parseDouble(weight.getText()) * Double.parseDouble(rateperkg.getText());
                                    double grandtotal = Double.parseDouble(vat.getText()) + Double.parseDouble(surcharge.getText()) + Double.parseDouble(hamali.getText()) + total + Double.parseDouble(rmc.getText()) + commission_value;
                            
                                
                                    String sql_update = "update governmenttransaction set itemname='"+item_name.getSelectedItem().toString()+"',grandtotal='"+grandtotal+"', total = '"+total+"', commission='"+commission_value+"',lotno='"+lotno.getText()+"',villagename='"+villagename.getText()+"',farmername='"+farmername.getText()+"',rateperkg='"+rateperkg.getText()+"',weight='"+weight.getText()+"',buyerinitial='"+buyerinitial.getText()+"',abillno='"+abillno.getText()+"',bbillno='"+bbillno.getText()+"',invoiceno='"+invoiceno.getText()+"',rmc='"+rmc.getText()+"',vat='"+vat.getText()+"',surcharge='"+surcharge.getText()+"',hamali='"+hamali.getText()+"',date='"+date.getText()+"' where id="+MyAction_id.getText();    
                                    db.update_table("governmenttransaction", sql_update);   
                            }
                            else
                            {
                                    JOptionPane.showMessageDialog(null, " ROW IS EMPTY!!!");
                            }
                     }
                     else
                     {
                                    String sql_query1 = "select * from buyer where initial='"+buyerinitial.getText().trim()+"'";
                                    double commission = Double.parseDouble(db.getRequestedValue(sql_query1, "commission", "STRING-FORMAT"));           
     
                                    double commission_value = (Double.parseDouble(weight.getText()) * Double.parseDouble(rateperkg.getText())) * (commission / 100);
                                    double total = Double.parseDouble(weight.getText()) * Double.parseDouble(rateperkg.getText());
                                    double grandtotal = Double.parseDouble(vat.getText()) + Double.parseDouble(surcharge.getText()) + Double.parseDouble(hamali.getText()) + total + Double.parseDouble(rmc.getText()) + commission_value;
                            
                                    String sql_update = "update governmenttransaction set itemname='"+item_name.getSelectedItem().toString()+"', grandtotal='"+grandtotal+"', total = '"+total+"', commission='"+commission_value+"',lotno='"+lotno.getText()+"',villagename='"+villagename.getText()+"',farmername='"+farmername.getText()+"',rateperkg='"+rateperkg.getText()+"',weight='"+weight.getText()+"',buyerinitial='"+buyerinitial.getText()+"',abillno='"+abillno.getText()+"',bbillno='"+bbillno.getText()+"',invoiceno='"+invoiceno.getText()+"',rmc='"+rmc.getText()+"',vat='"+vat.getText()+"',surcharge='"+surcharge.getText()+"',hamali='"+hamali.getText()+"',date='"+date.getText()+"' where id="+MyAction_id.getText();    
                                    db.update_table("governmenttransaction", sql_update);   
                     }
                }
                
                
        }
    }
    
    
 public boolean checkvalue(JTextField hamali,JTextField surcharge,JTextField vat,JTextField rmc)
 {
     boolean ret_val = true;
     if(hamali.getText().equals("")||surcharge.getText().equals("")||vat.getText().equals("")||rmc.getText().equals(""))
     {
         ret_val = false;
     }
     
     return ret_val;
     
 }       
    
    
    
    
    // This Class is for DELETE Button ActionListener
    class MyActionDelete implements ActionListener
    {
        
        JButton btn = null;
        JButton btn_add_update = null;
        int m = 0;
        int jindex = 0,jindex_cal = 0;
        Database db = new Database(); 
        JTextField[] jtf;                               
        
        JTextField MyAction_id,lotno,villagename,farmername,rateperkg,weight,buyerinitial,abillno,bbillno,invoiceno,rmc,vat,surcharge,hamali,date;
        
        public MyActionDelete(int jindex,JTextField[] jtf,int m,JButton btn_add_update,JButton btn,JTextField id,JTextField date,JTextField hamali,JTextField surcharge,JTextField vat,JTextField rmc,JTextField invoiceno,JTextField bbillno,JTextField abillno,JTextField buyerinitial,JTextField weight,JTextField rateperkg,JTextField farmername,JTextField villagename,JTextField lotno)
        {
                this.jindex = jindex;
                this.jtf = jtf;
                this.m = m;
                this.btn = btn;
                MyAction_id = id;
                this.lotno = lotno;
                this.btn_add_update = btn_add_update;
                this.villagename = villagename;
                this.farmername = farmername;
                this.rateperkg = rateperkg;
                this.weight = weight;
                this.buyerinitial = buyerinitial;
                this.abillno = abillno;
                this.bbillno = bbillno;
                this.invoiceno = invoiceno;
                this.rmc = rmc;
                this.vat = vat;
                this.surcharge = surcharge;
                this.hamali = hamali;
                this.date = date;
                
             //  System.out.println("ID:"+this.id.getText()+"| TOTAL:"+this.total.getText()+"|GRANDTOTAL:"+this.grand_total.getText()+"| INVOICE NO:"+this.invoice_no.getText()+"|ROUNDOFF :"+this.round_off.getText()+"|HAMALI:"+this.hamali.getText()+"|SURCHARGE:"+this.surcharge.getText()+"|VAT:"+this.vat.getText()+"|COMMISSION:"+this.commission.getText()+"|RMC:"+this.rmc.getText()+"|TRADERS NAME:"+this.traders_name.getText()+"|RATE PER KG:"+this.rate_per_kg.getText()+"|DATE:"+this.date.getText()+"|A BILL NO:"+this.A_bill_no.getText()+"|NO OF BAGS:"+this.no_of_bags.getText()+"|LOT NO:"+this.lot_no.getText()+"|WEIGHT:"+this.weight.getText()+"|ITEM NAME:"+this.item_name.getText()+"|FARMER NAME:"+this.farmer_name.getText());
        }
        
        
        
        public void actionPerformed(ActionEvent aevent)
        {
                                
               if(aevent.getActionCommand().equals("DELETE"))
               {
                    jindex_cal = jindex - 15;
                    if(jindex_cal > 0) 
                    {  
                            
                                String date_tmp = date.getText();
                                String lot_num = lotno.getText();
                               
                                String sql_delete = "delete from governmenttransaction where id="+MyAction_id.getText();    
                                db.delete_table("governmenttransaction", sql_delete);  
                                btn_add_update.setText("ADD");
                                MyAction_id.setText("");
                                
                                villagename.setText("");
                                farmername.setText("");
                                rateperkg.setText("");
                                weight.setText("");
                                buyerinitial.setText("");
                                abillno.setText("");
                                bbillno.setText("");
                                invoiceno.setText("");
                                rmc.setText("");
                                vat.setText("");
                                surcharge.setText("");
                                hamali.setText("");
                                date.setText(date_tmp);
                                date.setEditable(false);
                                lotno.setText(lot_num);
                     }
                     else
                     {
                                String date_tmp = date.getText();
                                String lot_num = lotno.getText();
                                String sql_delete = "delete from governmenttransaction where id="+MyAction_id.getText();    
                                db.delete_table("governmenttransaction", sql_delete);  
                                btn_add_update.setText("ADD");
                                MyAction_id.setText("");
                                villagename.setText("");
                                farmername.setText("");
                                rateperkg.setText("");
                                weight.setText("");
                                buyerinitial.setText("");
                                abillno.setText("");
                                bbillno.setText("");
                                invoiceno.setText("");
                                rmc.setText("");
                                vat.setText("");
                                surcharge.setText("");
                                hamali.setText("");
                                date.setText(date_tmp);
                                date.setEditable(false);
                                lotno.setText(lot_num);
                     }

                }
         }
    }
    
   
   
    
class MyKeyListener implements KeyListener
{
    
        String msg="",parts="";
        int pos;
        int ind;
        int text_no = 0;
        int ind_pos;
        JTextField jtf[];
        JTextField id,total,grand_total,invoice_no,round_off;
       
        
        
       /* public MyKeyListener(JTextField jtf, JTextField grand_total,JTextField total,JTextField invoice_no,JTextField round_off)
        {
            this.jtf = jtf;
            this.grand_total = grand_total;
            this.total = total;
            this.invoice_no = invoice_no;
            this.round_off = round_off;
            System.out.println(jtf.getText());
            
        }*/
        
        public MyKeyListener(int ind,JTextField jtf[] ,int pos,String parts)
        {
                this.jtf = jtf;
                this.ind = ind;
                this.pos = pos;
                this.parts = parts;
                ind_pos = ind - pos;
               
                
        }
        
        
        public void keyPressed(KeyEvent kevent)
        {
                 
       }
         
        
        
        
        
        
        public void keyReleased(KeyEvent kevent)
        {
            double surcharge_value,vat_value,rmc_value,commission_value,hamali_value;
             try
             {
                   
                    if(pos == 2)
                    {
                        msg+=kevent.getKeyChar();
                        String sql_query = "select * from commodity where itemname='"+jtf[ind].getText().trim()+"'";
                        Connection con = db.dbConnect();
                        Statement stmt = con.createStatement(); // Create Statement
                        ResultSet select_result = stmt.executeQuery(sql_query); // Execute the query
                            if (select_result.next())
                            {
                                   // jtf[ind+8].setText(Long.toString(select_result.getLong("rmc")));    
                                   // jtf[ind+12].setText(Long.toString(select_result.getLong("purchasehamali")));
                                   
                                    // jtf[ind+10].setText(Integer.toString(select_result.getInt("vat")));
                                  //  jtf[ind+11].setText(Long.toString(select_result.getLong("surcharge")));
                            }
                    }
                    
                    
                    
                    
if(pos == 6)
{
    msg+=kevent.getKeyChar();
    if(jtf[ind-2].getText().equals(""))
    {
        JOptionPane.showMessageDialog(null, "WEIGHT FIELD IS EMPTY!!!");
        jtf[ind].setText("");
    }
    else
    {
        
        String sql_query = "select * from commodity where itemname='"+item_name.getSelectedItem().toString()+"'";
        String sql_query1 = "select * from buyer where initial='"+jtf[ind-1].getText().trim()+"'";
                    
        double rmc = Double.parseDouble(db.getRequestedValue(sql_query, "rmc", "STRING-FORMAT"));
        double vat = Double.parseDouble(db.getRequestedValue(sql_query, "vat", "STRING-FORMAT"));
        double surcharge = Double.parseDouble(db.getRequestedValue(sql_query, "surcharge", "STRING-FORMAT"));
        double hamali = Double.parseDouble(db.getRequestedValue(sql_query, "purchasehamali", "STRING-FORMAT"));
           
        
            //vat calculation
            vat_value = (Double.parseDouble(jtf[ind - 2].getText()) * Double.parseDouble(jtf[ind].getText())) * (vat / 100);
            jtf[ind + 5].setText(Double.toString(vat_value));
               
            
            //surcharge calculation
            surcharge_value = (Double.parseDouble(jtf[ind - 2].getText()) * Double.parseDouble(jtf[ind].getText())) * (surcharge / 100);
            jtf[ind + 6].setText(Double.toString(surcharge_value)); 
            
                   
            //hamali calculation
            hamali_value = (Double.parseDouble(jtf[ind - 2].getText()) * Double.parseDouble(jtf[ind].getText())) * (hamali / 100);
            jtf[ind + 7].setText(Double.toString(hamali_value));
             
                  
            //rmc calculation
            rmc_value = (Double.parseDouble(jtf[ind - 2].getText()) * Double.parseDouble(jtf[ind].getText())) * (rmc / 100);
            jtf[ind + 4].setText(Double.toString(rmc_value));
               
                
            
            
      }
    
}
                    
                    
                    
                    
                    
                     if(pos == 7) 
                     {  
                            if(kevent.getKeyCode() == 47)
                            {
                                JOptionPane.showMessageDialog(null, "date format : dd-mm-yyyy");
                                jtf[ind].setText("");
                            }
                     }
                    
                     
                     
                     
                    if(pos == 9)
                    {
                            String sql_query = "select * from buyer where initial='"+jtf[ind].getText().trim()+"'";
                           /* Connection con = db.dbConnect();
                            Statement stmt = con.createStatement(); // Create Statement
                            ResultSet select_result = stmt.executeQuery(sql_query); // Execute the query
                            if (select_result.next())
                            {
                                    jtf[ind+2].setText(Long.toString(select_result.getLong("commission")));    
                            }*/
                            
                      /*  double commission = Double.parseDouble(db.getRequestedValue(sql_query, "commission", "STRING-FORMAT"));
                        System.out.println("Commission:"+commission);
                        commission_value = (Double.parseDouble(jtf[ind - 1].getText()) * Double.parseDouble(jtf[ind-6].getText())) * (commission / 100);
                        jtf[ind + 2].setText(Double.toString(commission_value));*/
                   
                    }
                    
                    
                    
                   
                }
                catch(Exception e){}
        }
         
        public void keyTyped(KeyEvent kevent)
        {
               
        }
        
        
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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GovernmentTransactionGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GovernmentTransactionGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GovernmentTransactionGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GovernmentTransactionGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GovernmentTransactionGrid().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_row;
    private javax.swing.JMenuItem buyer_day_report;
    private javax.swing.JMenuItem commoditymaster;
    private javax.swing.JPanel datepanel;
    private javax.swing.JMenuItem day_report;
    private javax.swing.JPanel display_grid;
    private javax.swing.JMenuItem farmer_A_B_Bill_report;
    private javax.swing.JMenuItem farmer_kg_patti;
    private javax.swing.JMenuItem farmer_patti;
    private javax.swing.JMenuItem farmermaster;
    private javax.swing.JMenuItem government_transaction;
    private javax.swing.JMenuItem item_day_report;
    private javax.swing.JComboBox item_name;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem ledger_entries;
    private javax.swing.JMenuItem ledger_report;
    private javax.swing.JMenuItem lot_report;
    private javax.swing.JMenuItem mandi_transaction;
    private javax.swing.JMenu margin_day_report;
    private javax.swing.JMenuItem purchasemaster;
    private javax.swing.JButton related_button;
    private javax.swing.JMenuItem tax_rmc_total;
    // End of variables declaration//GEN-END:variables
}
