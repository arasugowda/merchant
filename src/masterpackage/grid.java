/*
 * Developed By Infiniteglobe
 */

package masterpackage;

import GuiPackage.MainFrame;
import java.awt.GridLayout;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import supportingpackage.*;
import java.sql.*;
import javax.swing.JButton;
import java.util.Date;
import javax.swing.JOptionPane;
import pattipackage.*;
import reportspackage.*;
import entriespackage.*;


public class grid extends javax.swing.JFrame {

    public static int row_value = 20; // Setting the default row value;
    public static int ind = 400; // Setting the default grid value 
    public static int count = 0; // initializing count to zero
   
    // Creating object the perform all the database 
    // related operations
    Database db = new Database();
    
    //calling grid class default constructor  
    public grid() {
        
       // setUndecorated(true); //Removing the frame header
        setExtendedState(JFrame.MAXIMIZED_BOTH); // frame size is maximized as windows 
        initComponents();
        
     }

    
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        display_grid = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        datepanel = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
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
        setTitle("Transaction Master");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout display_gridLayout = new javax.swing.GroupLayout(display_grid);
        display_grid.setLayout(display_gridLayout);
        display_gridLayout.setHorizontalGroup(
            display_gridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1301, Short.MAX_VALUE)
        );
        display_gridLayout.setVerticalGroup(
            display_gridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(display_grid);

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
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        datepanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout datepanelLayout = new javax.swing.GroupLayout(datepanel);
        datepanel.setLayout(datepanelLayout);
        datepanelLayout.setHorizontalGroup(
            datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datepanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datepanelLayout.createSequentialGroup()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datepanelLayout.createSequentialGroup()
                        .addComponent(related_button)
                        .addGap(18, 18, 18)
                        .addComponent(add_row, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        datepanelLayout.setVerticalGroup(
            datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datepanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(datepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_row, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(related_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(420, Short.MAX_VALUE)
                .addComponent(datepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(datepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void add_rowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_rowActionPerformed
        
        try
        {
                display_grid.removeAll();
                int cols = 19;
                if(count == 0) { row_value++; count = 1;}    
                display_grid.setLayout(new GridLayout(row_value, 20));
                    
               // String[] headings = {"FarmerName","Weight","LotNo","NoofBags","A BillNo","Date","RatePerKg","TradersName","Rmc(%)","Commission(%)","Vat","Surcharge","Hamali","RoundOff","InvoiceNo","TransactionNo","ID","Operation"};
                 String[] headings = {"FARMERNAME","ITEMNAME","WEIGHT","LOTNO","NOOFBAGS","A BILLNO","DATE","RATEPERKG","TRADERSNAME","RMC(%)","COMMISSION(%)","VAT","SURCHARGE","HAMALI","B BILLNO","INVOICENO","TOTAL","GRAND TOTAL","ID","OPERATION"};
                 final JLabel jlabel[] = new JLabel[headings.length];
                
                int btn_ind = (ind / 20);
                JTextField jtf[] = new JTextField[(ind - btn_ind)];
                final JTextField jtf_one[] = new JTextField[(ind - btn_ind)];
                final JButton btn[] = new JButton[btn_ind];
                int n=0;
                
                
                
                
                
                while(n < headings.length)
                {
                        jlabel[n] = new JLabel(headings[n]);
                        jlabel[n].setHorizontalAlignment(SwingConstants.CENTER);
                        display_grid.add(jlabel[n]);
                        n++;
                }
                
                
                
                
                
                        
                    Connection con =  db.dbConnect();
                    Statement stmt = con.createStatement();
                    ResultSet select_result = stmt.executeQuery("select count(*) as Count_value from transaction");
                    long value = 0L; 
                    if (select_result.next())
                    {
                            value = select_result.getLong("Count_value");
                    }
                    
                    
                    Date date = jDateChooser2.getDate();
                    String dateString = String.format("%1$td-%1$tm-%1$tY",date); 
                    
                    
                    
                    if(!dateString.equalsIgnoreCase("null-null-null"))
                    {
                        String sql_check = "select count(*) as noofcounts from transaction where date='"+dateString+"'";
                        int result = Integer.parseInt(db.getRequestedValue(sql_check, "noofcounts", "STRING-FORMAT"));
                        if(result<=0)
                        {
                            JOptionPane.showMessageDialog(null, "NO DATA FOUND FOR THE DATE: "+ dateString);
                        }
                    }    
                            
                         
      /*                      
     if(value!=0)
     {
               System.out.println("Data Present Condition");
               int m=0;
               final JButton btn_one[] = new JButton[btn_ind];
               String[][] ret_val = new String[row_value][19];
               ret_val = getValueFromTable(row_value , 19);
                     
               
                      long ret_count = 0;
                      long getCount = 0;
                      for(int s1 = 0;s1 < value;s1++)
                      {
                            for(int s2 = 0;s2 < 19;s2++)
                            {
                                System.out.print("ret_val["+s1+"]["+s2+"]"+ret_val[s1][s2]+"\n");
                                ret_count++;
                            }
                                System.out.println("\n");
                      } 
               
                       getCount = Long.parseLong(db.getRequestedValue("select count(*) as Coloumns from transaction", "Coloumns", "LONG-FORMAT"));
                       ret_count = getCount * (19 + 1);   
                       
               int row = 0;
               int col = 0;
               int pos = 1;
               
               int bindex = 0;
               int jindex = 0;
               
               long ret = (ret_count / getCount)-1;
               long temp_ret = ret;
               while(m < ind)
               {
                        //This condition will get all the data 
                        //from the table and display in textfield
                        if(m < (ret_count))
                        {
                                //condition for displaying update button for each row
                                //in the grid
                                if(m == ret)
                                {
                                        btn_one[bindex] = new JButton("UPDATE");
                                        btn_one[bindex].addActionListener(new MyAction(m,btn_one[bindex],jtf_one[jindex-1],jtf_one[jindex-2],jtf_one[jindex-3],jtf_one[jindex-4],jtf_one[jindex-5],jtf_one[jindex-6],jtf_one[jindex-7],jtf_one[jindex-8],jtf_one[jindex-9],jtf_one[jindex-10],jtf_one[jindex-11],jtf_one[jindex-12],jtf_one[jindex-13],jtf_one[jindex-14],jtf_one[jindex-15],jtf_one[jindex-16],jtf_one[jindex-17],jtf_one[jindex-18],jtf_one[jindex-19]));
                                        display_grid.add(btn_one[bindex]);
                                        bindex++;
                                        col = 0;
                                        temp_ret = ret;
                                        ret = ret + 20;
                                        pos = 1;
                                        row++;
                                        
                                }
                                
                                //This condition will display textfield 
                                //with the values fetch from table
                                if(m != temp_ret)
                                {
                                        if(col == 18)
                                        {
                                            
                                            jtf_one[jindex] = new JTextField(ret_val[row][col]);
                                            jtf_one[jindex].setEditable(false);
                                            display_grid.add(jtf_one[jindex]);
                                            col = 0;
                                        }
                                        else
                                        {
                                            jtf_one[jindex] = new JTextField(ret_val[row][col]);
                                            display_grid.add(jtf_one[jindex]);
                                            jtf_one[jindex].addKeyListener(new UpdateKeyListener(jindex,jtf_one,pos));
                                            jtf_one[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
                                            col++;
                                        }
                                        pos++;
                                        jindex++;
                                }
                                
                       }
                       else
                       {
                                //This field will display the remaining 
                                //textfields with no values
                                if(m == ret)
                                {
                                        btn_one[bindex] = new JButton("ADD");
 btn_one[bindex].addActionListener(new MyActionForChecking(m,btn_one[bindex],jtf_one[jindex-1],jtf_one[jindex-2],jtf_one[jindex-3],jtf_one[jindex-4],jtf_one[jindex-5],jtf_one[jindex-6],jtf_one[jindex-7],jtf_one[jindex-8],jtf_one[jindex-9],jtf_one[jindex-10],jtf_one[jindex-11],jtf_one[jindex-12],jtf_one[jindex-13],jtf_one[jindex-14],jtf_one[jindex-15],jtf_one[jindex-16],jtf_one[jindex-17],jtf_one[jindex-18],jtf_one[jindex-19],btn_one,bindex));
 
                                        display_grid.add(btn_one[bindex]);
                                        bindex++;
                                        ret = ret + 20;
                                        pos = 1;
                                }
                                else
                                {
                                        if(m == (ret - 1))
                                        {
                                                jtf_one[jindex] = new JTextField();
                                                jtf_one[jindex].setEditable(false);
                                              
                                                display_grid.add(jtf_one[jindex]);
                                        }
                                        
                                        if(m != (ret-1))
                                        {
                                                jtf_one[jindex] = new JTextField();
                           jtf_one[jindex].addKeyListener(new UpdateKeyListener(jindex,jtf_one,pos));
                           jtf_one[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
                                                                 
                                                display_grid.add(jtf_one[jindex]);
                                            
                                        }
                                        pos++;
                                        jindex++;
                                }
                       }
                       
                      
                      m++;  
                        
               }
              
    }
    else
    {  */
          System.out.println("Data Not Present Condition");
          
          int m = 0;
          int bindex = 0;
          int jindex = 0;
          int rmc_count = 9 , comm_count = 10 ,pos = 1;
          
          int id_col = 18;
          while(m < ind)
          {     
                // Condition for displaying 
                // 'ADD' Button at end of each row
                if(m == cols)
                {
                        // ADD Button for the first row
                        if(cols == 19){
                            btn[bindex] = new JButton("ADD");
btn[bindex].addActionListener(new MyAction(m,btn[bindex],jtf[jindex-1],jtf[jindex-2],jtf[jindex-3],jtf[jindex-4],jtf[jindex-5],jtf[jindex-6],jtf[jindex-7],jtf[jindex-8],jtf[jindex-9],jtf[jindex-10],jtf[jindex-11],jtf[jindex-12],jtf[jindex-13],jtf[jindex-14],jtf[jindex-15],jtf[jindex-16],jtf[jindex-17],jtf[jindex-18],jtf[jindex-19]));
                        }
                        
                        //ADD Button for the remaining 
                        if(cols!=19){
                            btn[bindex] = new JButton("ADD");
btn[bindex].addActionListener(new MyActionForChecking(m,btn[bindex],jtf[jindex-1],jtf[jindex-2],jtf[jindex-3],jtf[jindex-4],jtf[jindex-5],jtf[jindex-6],jtf[jindex-7],jtf[jindex-8],jtf[jindex-9],jtf[jindex-10],jtf[jindex-11],jtf[jindex-12],jtf[jindex-13],jtf[jindex-14],jtf[jindex-15],jtf[jindex-16],jtf[jindex-17],jtf[jindex-18],jtf[jindex-19],btn,bindex));
                        }
                        //Adding Button Component into 
                        //GridLayout
                        display_grid.add(btn[bindex]); 
                        
                        //incrementing the coloumn to point
                        //to next button display position
                        cols = cols + 20;
                        
                        // assigning the position to the 
                        // first for next row
                        pos = 1;
                       
                        //incrementing button array index 
                        bindex++;
                }
                // else conditioln for displaying all
                //textfield component in the grid
                else
                {
                    // This condition is for displaying the
                    // id coloumn for unique rows
                    if(id_col == m)
                    {
                            
                            jtf[jindex] = new JTextField(); // creating textfiled
                            jtf[jindex].setEditable(false); // making textfiled not editable
                            //jtf[jindex].setVisible(false); // making textfield invisible
                            display_grid.add(jtf[jindex]); // adding to the grid layout
                            
                            // incrementing the position to 
                            //point to next coloumn position
                            pos++; 
                            
                            //incrementing the coloumn to point
                            //to next id display position
                            id_col+=20;
                            
                            //incrementing the textfield index
                            jindex++;
                    }
                    else
                    {
                            if(jindex!=rmc_count && jindex!=comm_count)
                            {
                                     if(m < 18)
                                     {
                                                jtf[jindex] = new JTextField();
                                                jtf[jindex].addKeyListener(new MyKeyListener(jindex,jtf,pos,"initial"));
                                                jtf[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
                                      
                                     }
                                       
                                     if(m>=18)
                                     {
                                                jtf[jindex] = new JTextField();
                                              //  jtf[jindex].addKeyListener(new MyKeyListener(jtf[jindex],jtf[ind_pos-2],jtf[ind_pos-3],jtf[ind_pos-4],jtf[ind_pos-5]));
                                                 jtf[jindex].addKeyListener(new MyKeyListener(jindex,jtf,pos,"remaining"));
                                                 jtf[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
                                     }
                           }
                                            
                           if(jindex == rmc_count)
                           {
                                   rmc_count = rmc_count + 19;
                                   jtf[jindex] = new JTextField();
                           }
                                            
                           if(jindex == comm_count)
                           {
                                    comm_count = comm_count + 19;
                                    jtf[jindex] = new JTextField();
                           }
                                            
                                            
                                            
                           display_grid.add(jtf[jindex]);
                                                                     
                           pos++; 
                           jindex++;      
                    }        
                }
                                                
                m++;     
        }
          
    //}
                            
           row_value = row_value + 20; 
           ind = ind + 400;
           display_grid.updateUI();
    }
    catch(Exception e){}
        
        
        
    }//GEN-LAST:event_add_rowActionPerformed

    
    
    
    
    
    
    
    
    private void related_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_related_buttonActionPerformed
      
        try
        {
                Date date = jDateChooser2.getDate();
                String dateString = String.format("%1$td-%1$tm-%1$tY",date); 
                JOptionPane.showMessageDialog(this, "DATE:"+dateString);
                
               // System.out.println(dateString); 
                String sql_check = "select count(*) as noofcounts from transaction where date='"+dateString+"'";
                int result = Integer.parseInt(db.getRequestedValue(sql_check, "noofcounts", "STRING-FORMAT"));
            if(result>0)
            {
                 
                 display_grid.removeAll();
                 int cols = 19;
                 if(count == 0) { row_value++; count = 1;}    
                 display_grid.setLayout(new GridLayout(row_value, 20));
                    
               // String[] headings = {"FarmerName","Weight","LotNo","NoofBags","A BillNo","Date","RatePerKg","TradersName","Rmc(%)","Commission(%)","Vat","Surcharge","Hamali","RoundOff","InvoiceNo","TransactionNo","ID","Operation"};
                 String[] headings = {"FARMERNAME","ITEMNAME","WEIGHT","LOTNO","NOOFBAGS","A BILLNO","DATE","RATEPERKG","TRADERSNAME","RMC(%)","COMMISSION(%)","VAT","SURCHARGE","HAMALI","ROUNDOFF","INVOICENO","TOTAL","GRAND TOTAL","ID","OPERATION"};
                 final JLabel jlabel[] = new JLabel[headings.length];
                
                int btn_ind = (ind / 20);
                JTextField jtf[] = new JTextField[(ind - btn_ind)];
                final JTextField jtf_one[] = new JTextField[(ind - btn_ind)];
                final JButton btn[] = new JButton[btn_ind];
                int n=0;
                
                
                
                
                
                while(n < headings.length)
                {
                        jlabel[n] = new JLabel(headings[n]);
                        jlabel[n].setHorizontalAlignment(SwingConstants.CENTER);
                        display_grid.add(jlabel[n]);
                        n++;
                }
                
                
                
                
                
                        
                    Connection con =  db.dbConnect();
                    Statement stmt = con.createStatement();
                    ResultSet select_result = stmt.executeQuery("select count(*) as Count_value from transaction");
                    long value = 0L; 
                    if (select_result.next())
                    {
                            value = select_result.getLong("Count_value");
                    }
            
            
             int m=0;
               final JButton btn_one[] = new JButton[btn_ind];
               String[][] ret_val = new String[row_value][19];
               ret_val = getDateRelatedValueFromTable(row_value , 19,dateString);
                     
               
                      long ret_count = 0;
                      long getCount = 0;
                      System.out.println("Date Displayer");
                      for(int s1 = 0;s1 < value;s1++)
                      {
                            for(int s2 = 0;s2 < 19;s2++)
                            {
                                System.out.print("ret_val["+s1+"]["+s2+"]"+ret_val[s1][s2]+"\n");
                                ret_count++;
                            }
                                System.out.println("\n");
                      } 
                  
                       getCount = Long.parseLong(db.getRequestedValue("select count(*) as Coloumns from transaction where date='"+dateString+"'", "Coloumns", "LONG-FORMAT"));
                       ret_count = getCount * (19 + 1);   
                       
               int row = 0;
               int col = 0;
               int pos = 1;
               
               int bindex = 0;
               int jindex = 0;
               
               long ret = (ret_count / getCount)-1;
               long temp_ret = ret;
               while(m < ind)
               {
                        if(m < (ret_count))
                        {
                                if(m == ret)
                                {
                                        btn_one[bindex] = new JButton("UPDATE");
                                      //  btn_one[bindex].addActionListener(new MyAction(m,btn_one[bindex],jtf_one[jindex-1],jtf_one[jindex-2],jtf_one[jindex-3],jtf_one[jindex-4],jtf_one[jindex-5],jtf_one[jindex-6],jtf_one[jindex-7],jtf_one[jindex-8],jtf_one[jindex-9],jtf_one[jindex-10],jtf_one[jindex-11],jtf_one[jindex-12],jtf_one[jindex-13],jtf_one[jindex-14],jtf_one[jindex-15],jtf_one[jindex-16],jtf_one[jindex-17]));
btn_one[bindex].addActionListener(new MyAction(m,btn_one[bindex],jtf_one[jindex-1],jtf_one[jindex-2],jtf_one[jindex-3],jtf_one[jindex-4],jtf_one[jindex-5],jtf_one[jindex-6],jtf_one[jindex-7],jtf_one[jindex-8],jtf_one[jindex-9],jtf_one[jindex-10],jtf_one[jindex-11],jtf_one[jindex-12],jtf_one[jindex-13],jtf_one[jindex-14],jtf_one[jindex-15],jtf_one[jindex-16],jtf_one[jindex-17],jtf_one[jindex-18],jtf_one[jindex-19]));
                                        display_grid.add(btn_one[bindex]);
                                        bindex++;
                                        col = 0;
                                        temp_ret = ret;
                                        ret = ret + 20;
                                        pos = 1;
                                        row++;
                                        
                                }
                                
                                if(m != temp_ret)
                                {
                                        //if(col == (ret - 1))
                                        if(col == 18)
                                        {
                                            
                                            jtf_one[jindex] = new JTextField(ret_val[row][col]);
                                            jtf_one[jindex].setEditable(false);
                                           // jtf_one[jindex].setVisible(false);
                                            display_grid.add(jtf_one[jindex]);
                                            col = 0;
                                        }
                                        else
                                        {
                                            jtf_one[jindex] = new JTextField(ret_val[row][col]);
                                            display_grid.add(jtf_one[jindex]);
                                            jtf_one[jindex].addKeyListener(new UpdateKeyListener(jindex,jtf_one,pos));
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
// btn_one[bindex].addActionListener(new MyAction(m,btn_one[bindex],jtf_one[jindex-1],jtf_one[jindex-2],jtf_one[jindex-3],jtf_one[jindex-4],jtf_one[jindex-5],jtf_one[jindex-6],jtf_one[jindex-7],jtf_one[jindex-8],jtf_one[jindex-9],jtf_one[jindex-10],jtf_one[jindex-11],jtf_one[jindex-12],jtf_one[jindex-13],jtf_one[jindex-14],jtf_one[jindex-15],jtf_one[jindex-16],jtf_one[jindex-17],jtf_one[jindex-18],jtf_one[jindex-19]));
 btn_one[bindex].addActionListener(new MyActionForChecking(m,btn_one[bindex],jtf_one[jindex-1],jtf_one[jindex-2],jtf_one[jindex-3],jtf_one[jindex-4],jtf_one[jindex-5],jtf_one[jindex-6],jtf_one[jindex-7],jtf_one[jindex-8],jtf_one[jindex-9],jtf_one[jindex-10],jtf_one[jindex-11],jtf_one[jindex-12],jtf_one[jindex-13],jtf_one[jindex-14],jtf_one[jindex-15],jtf_one[jindex-16],jtf_one[jindex-17],jtf_one[jindex-18],jtf_one[jindex-19],btn_one,bindex));
 
                                        display_grid.add(btn_one[bindex]);
                                        bindex++;
                                        ret = ret + 20;
                                        pos = 1;
                                }
                                else
                                {
                                        if(m == (ret - 1))
                                        {
                                                jtf_one[jindex] = new JTextField();
                                                jtf_one[jindex].setEditable(false);
                                               // jtf_one[jindex].setVisible(false);
                                                display_grid.add(jtf_one[jindex]);
                                        }
                                        
                                        if(m != (ret-1))
                                        {
                                                jtf_one[jindex] = new JTextField();
                           jtf_one[jindex].addKeyListener(new UpdateKeyListener(jindex,jtf_one,pos));
                           jtf_one[jindex].setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
                                                                 
                                                display_grid.add(jtf_one[jindex]);
                                            
                                        }
                                        pos++;
                                        jindex++;
                                }
                       }
                       
                      
                      m++;  
                        
               }
            
            
                row_value = row_value + 20; 
                ind = ind + 400;
                display_grid.updateUI();
            
            }
            else
            {
                JOptionPane.showMessageDialog(null, "NO TRANSACTION FOUND FOR THE DATE: "+dateString);
            }
        }
        catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_related_buttonActionPerformed

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

    
   class MyAction implements ActionListener
    {
        
        JButton btn = null;
        int m = 0;
        Database db = new Database(); 
                                                                                                                                       
        JTextField MyAction_id,total,grand_total,invoice_no,round_off,hamali,surcharge,vat,commission,rmc,traders_name,rate_per_kg,date,A_bill_no,no_of_bags,lot_no,weight,item_name,farmer_name;
        
        public MyAction(int m,JButton btn,JTextField id,JTextField grand_total,JTextField total,JTextField invoice_no,JTextField round_off,JTextField hamali,JTextField surcharge,JTextField vat,JTextField commission,JTextField rmc,JTextField traders_name,JTextField rate_per_kg,JTextField date,JTextField A_bill_no,JTextField no_of_bags,JTextField lot_no,JTextField weight,JTextField item_name,JTextField farmer_name)
        {
                this.m = m;
                this.btn = btn;
                MyAction_id = id;
                this.total = total;
                this.grand_total = grand_total;
                this.invoice_no = invoice_no;
                this.round_off = round_off;
                this.hamali = hamali;
                this.surcharge = surcharge;
                this.vat = vat;
                this.commission = commission;
                this.rmc = rmc;
                this.traders_name = traders_name;
                this.rate_per_kg = rate_per_kg;
                this.date = date;
                this.A_bill_no = A_bill_no;
                this.no_of_bags = no_of_bags;
                this.lot_no = lot_no;
                this.weight = weight;
                this.item_name = item_name;
                this.farmer_name = farmer_name;
                
              //  System.out.println("ID:"+this.id.getText()+"| TOTAL:"+this.total.getText()+"|GRANDTOTAL:"+this.grand_total.getText()+"| INVOICE NO:"+this.invoice_no.getText()+"|ROUNDOFF :"+this.round_off.getText()+"|HAMALI:"+this.hamali.getText()+"|SURCHARGE:"+this.surcharge.getText()+"|VAT:"+this.vat.getText()+"|COMMISSION:"+this.commission.getText()+"|RMC:"+this.rmc.getText()+"|TRADERS NAME:"+this.traders_name.getText()+"|RATE PER KG:"+this.rate_per_kg.getText()+"|DATE:"+this.date.getText()+"|A BILL NO:"+this.A_bill_no.getText()+"|NO OF BAGS:"+this.no_of_bags.getText()+"|LOT NO:"+this.lot_no.getText()+"|WEIGHT:"+this.weight.getText()+"|ITEM NAME:"+this.item_name.getText()+"|FARMER NAME:"+this.farmer_name.getText());
        }
        
        
        
        public void actionPerformed(ActionEvent aevent)
        {
            if(aevent.getActionCommand().equals("ADD"))
            {
                    String sql = "insert into transaction (farmername,itemname,weight,lotno,noofbags,abillno,date,rateperkg,tradersname,rmc,commission,vat,surcharge,hamali,bbillno,invoiceno,total,grandtotal) values('1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1')";    
                    System.out.println(sql);
                    long id =  db.addToTable("transaction", sql);
                    MyAction_id.setText(Long.toString(id));
                    String sql_update = "update transaction set farmername='"+farmer_name.getText()+"',itemname='"+item_name.getText()+"',weight='"+weight.getText()+"',lotno='"+lot_no.getText()+"',noofbags='"+no_of_bags.getText()+"',abillno='"+A_bill_no.getText()+"',date='"+date.getText()+"',rateperkg='"+rate_per_kg.getText()+"',tradersname='"+traders_name.getText()+"',rmc='"+rmc.getText()+"',commission='"+commission.getText()+"',vat='"+vat.getText()+"',surcharge='"+surcharge.getText()+"',hamali='"+hamali.getText()+"',bbillno='"+round_off.getText()+"',invoiceno='"+invoice_no.getText()+"',total='"+total.getText()+"',grandtotal='"+grand_total.getText()+"' where id="+id;    
                    db.insertRow("transaction", sql_update);   
                    btn.setText("UPDATE");
            }
            
            if(aevent.getActionCommand().equals("UPDATE"))
            {
                    String sql = "update transaction set farmername='"+farmer_name.getText()+"',itemname='"+item_name.getText()+"',weight='"+weight.getText()+"',lotno='"+lot_no.getText()+"',noofbags='"+no_of_bags.getText()+"',abillno='"+A_bill_no.getText()+"',date='"+date.getText()+"',rateperkg='"+rate_per_kg.getText()+"',tradersname='"+traders_name.getText()+"',rmc='"+rmc.getText()+"',commission='"+commission.getText()+"',vat='"+vat.getText()+"',surcharge='"+surcharge.getText()+"',hamali='"+hamali.getText()+"',bbillno='"+round_off.getText()+"',invoiceno='"+invoice_no.getText()+"',total='"+total.getText()+"',grandtotal='"+grand_total.getText()+"' where id="+MyAction_id.getText();    
                    //System.out.println(sql);
                    db.insertRow("transaction", sql);   
                    
            }
        }
    }
    
   
   
   
   
class MyActionForChecking implements ActionListener
{
        
        JButton btn = null;
        int m = 0;
        Database db = new Database(); 
        JTextField jtf[];
        JButton btn_array[];
        int cols,pos,ind_pos,bindex;
                                                                                                                                       
        JTextField MyAction_id,total,grand_total,invoice_no,round_off,hamali,surcharge,vat,commission,rmc,traders_name,rate_per_kg,date,A_bill_no,no_of_bags,lot_no,weight,item_name,farmer_name;
        
        public MyActionForChecking(int m,JButton btn,JTextField id,JTextField grand_total,JTextField total,JTextField invoice_no,JTextField round_off,JTextField hamali,JTextField surcharge,JTextField vat,JTextField commission,JTextField rmc,JTextField traders_name,JTextField rate_per_kg,JTextField date,JTextField A_bill_no,JTextField no_of_bags,JTextField lot_no,JTextField weight,JTextField item_name,JTextField farmer_name,JButton btn_array[],int bindex)
        {
                this.m = m;
                this.btn = btn;
                MyAction_id = id;
                this.total = total;
                this.grand_total = grand_total;
                this.invoice_no = invoice_no;
                this.round_off = round_off;
                this.hamali = hamali;
                this.surcharge = surcharge;
                this.vat = vat;
                this.commission = commission;
                this.rmc = rmc;
                this.traders_name = traders_name;
                this.rate_per_kg = rate_per_kg;
                this.date = date;
                this.A_bill_no = A_bill_no;
                this.no_of_bags = no_of_bags;
                this.lot_no = lot_no;
                this.weight = weight;
                this.item_name = item_name;
                this.farmer_name = farmer_name;
                this.btn_array = btn_array;
                this.bindex = bindex;
              //  System.out.println("ID:"+this.id.getText()+"| TOTAL:"+this.total.getText()+"|GRANDTOTAL:"+this.grand_total.getText()+"| INVOICE NO:"+this.invoice_no.getText()+"|ROUNDOFF :"+this.round_off.getText()+"|HAMALI:"+this.hamali.getText()+"|SURCHARGE:"+this.surcharge.getText()+"|VAT:"+this.vat.getText()+"|COMMISSION:"+this.commission.getText()+"|RMC:"+this.rmc.getText()+"|TRADERS NAME:"+this.traders_name.getText()+"|RATE PER KG:"+this.rate_per_kg.getText()+"|DATE:"+this.date.getText()+"|A BILL NO:"+this.A_bill_no.getText()+"|NO OF BAGS:"+this.no_of_bags.getText()+"|LOT NO:"+this.lot_no.getText()+"|WEIGHT:"+this.weight.getText()+"|ITEM NAME:"+this.item_name.getText()+"|FARMER NAME:"+this.farmer_name.getText());
        }
        
        
        
        public void actionPerformed(ActionEvent aevent)
        {
            try
            {
                if(aevent.getActionCommand().equals("ADD"))
                {
                     System.out.println("PREVIOUS BUTTON :"+btn_array[(bindex-1)].getActionCommand());
                
                    if(btn_array[(bindex-1)].getActionCommand().equals("ADD"))
                    {
                        JOptionPane.showMessageDialog(null, "Please Insert Rows in Order");
                    }
                    else
                    {
                        if(farmer_name.getText().equals("") || item_name.getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill Up The Coloumns");
                        }   
                        else
                        {
                            String sql = "insert into transaction (farmername,itemname,weight,lotno,noofbags,abillno,date,rateperkg,tradersname,rmc,commission,vat,surcharge,hamali,bbillno,invoiceno,total,grandtotal) values('1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1')";    
                            System.out.println(sql);
                            long id =  db.addToTable("transaction", sql);
                            MyAction_id.setText(Long.toString(id));
                            String sql_update = "update transaction set farmername='"+farmer_name.getText()+"',itemname='"+item_name.getText()+"',weight='"+weight.getText()+"',lotno='"+lot_no.getText()+"',noofbags='"+no_of_bags.getText()+"',abillno='"+A_bill_no.getText()+"',date='"+date.getText()+"',rateperkg='"+rate_per_kg.getText()+"',tradersname='"+traders_name.getText()+"',rmc='"+rmc.getText()+"',commission='"+commission.getText()+"',vat='"+vat.getText()+"',surcharge='"+surcharge.getText()+"',hamali='"+hamali.getText()+"',bbillno='"+round_off.getText()+"',invoiceno='"+invoice_no.getText()+"',total='"+total.getText()+"',grandtotal='"+grand_total.getText()+"' where id="+id;    
                            db.insertRow("transaction", sql_update);   
                            btn.setText("UPDATE");
                        }    
                    }   
                }
            
                
                
                if(aevent.getActionCommand().equals("UPDATE"))
                {
                        String sql = "update transaction set farmername='"+farmer_name.getText()+"',itemname='"+item_name.getText()+"',weight='"+weight.getText()+"',lotno='"+lot_no.getText()+"',noofbags='"+no_of_bags.getText()+"',abillno='"+A_bill_no.getText()+"',date='"+date.getText()+"',rateperkg='"+rate_per_kg.getText()+"',tradersname='"+traders_name.getText()+"',rmc='"+rmc.getText()+"',commission='"+commission.getText()+"',vat='"+vat.getText()+"',surcharge='"+surcharge.getText()+"',hamali='"+hamali.getText()+"',bbillno='"+round_off.getText()+"',invoiceno='"+invoice_no.getText()+"',total='"+total.getText()+"',grandtotal='"+grand_total.getText()+"' where id="+MyAction_id.getText();    
                        System.out.println(sql);
                        db.insertRow("transaction", sql);   
                        //btn.setText("ADD");
                }
            }
            catch(Exception e){}
        }
    }
    
   
    
    
    
    public String[][] getValueFromTable(int row , int col)
    {
            String[][] return_value = new String[row][col];
            try
            {
                    Connection con =  db.dbConnect();
                    Statement stmt = con.createStatement();
                    ResultSet select_result = stmt.executeQuery("select * from transaction");
                    int i = 0; 
                    
                    while (select_result.next())
                    {
                            if(i < row)
                            {
                                        
                                        return_value[i][0] = select_result.getString("farmername");
                                        return_value[i][1] = select_result.getString("itemname");
                                        return_value[i][2] = select_result.getString("weight");
                                        return_value[i][3] = select_result.getString("lotno");
                                        return_value[i][4] = select_result.getString("noofbags");
                                        return_value[i][5] = select_result.getString("abillno");
                                        return_value[i][6] = select_result.getString("date");
                                        return_value[i][7] = select_result.getString("rateperkg");
                                        return_value[i][8] = select_result.getString("tradersname");
                                        return_value[i][9] = select_result.getString("rmc");
                                        return_value[i][10] = select_result.getString("commission");
                                        return_value[i][11] = select_result.getString("vat");
                                        return_value[i][12] = select_result.getString("surcharge");
                                        return_value[i][13] = select_result.getString("hamali");
                                        return_value[i][14] = select_result.getString("bbillno");
                                        return_value[i][15] = select_result.getString("invoiceno");
                                        return_value[i][16] = select_result.getString("total");
                                        return_value[i][17] = select_result.getString("grandtotal");
                                        return_value[i][18] = select_result.getString("id");
                                        
                                        
                                        System.out.println("i value:"+i);
                                        i++;
                            }      
                   }
            }
            catch(Exception e){}
            
            
            return return_value;
    }
    
    
    
    
     public String[][] getDateRelatedValueFromTable(int row , int col , String date_value)
    {
            String[][] return_value = new String[row][col];
            try
            {
                    Connection con =  db.dbConnect();
                    Statement stmt = con.createStatement();
                    String query = "select * from transaction where date = '"+date_value+"'";
                    System.out.println(query);
                    ResultSet select_result = stmt.executeQuery(query);
                    int i = 0; 
                    
                    while (select_result.next())
                    {
                            if(i < row)
                            {
                                        
                                        return_value[i][0] = select_result.getString("farmername");
                                        return_value[i][1] = select_result.getString("itemname");
                                        return_value[i][2] = select_result.getString("weight");
                                        return_value[i][3] = select_result.getString("lotno");
                                        return_value[i][4] = select_result.getString("noofbags");
                                        return_value[i][5] = select_result.getString("abillno");
                                        return_value[i][6] = select_result.getString("date");
                                        return_value[i][7] = select_result.getString("rateperkg");
                                        return_value[i][8] = select_result.getString("tradersname");
                                        return_value[i][9] = select_result.getString("rmc");
                                        return_value[i][10] = select_result.getString("commission");
                                        return_value[i][11] = select_result.getString("vat");
                                        return_value[i][12] = select_result.getString("surcharge");
                                        return_value[i][13] = select_result.getString("hamali");
                                        return_value[i][14] = select_result.getString("bbillno");
                                        return_value[i][15] = select_result.getString("invoiceno");
                                        return_value[i][16] = select_result.getString("total");
                                        return_value[i][17] = select_result.getString("grandtotal");
                                        return_value[i][18] = select_result.getString("id");
                                        
                                        
                                        System.out.println("i value:"+i);
                                        i++;
                            }      
                   }
            }
            catch(Exception e){}
            
            
            return return_value;
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
                System.out.println("IND:"+ind);
        }
        
        
        public void keyPressed(KeyEvent kevent)
        {
              // msg+=kevent.getKeyChar();
                if(kevent.getKeyCode() == kevent.VK_TAB)
                {
                    if(parts.equals("remaining"))
                    {
                            System.out.println("IND:"+ind+" and POSITION:"+pos+" and INDEX POS:"+ind_pos);
                            
                                if((jtf[(ind_pos-1)].getText().equals("")&&jtf[(ind_pos-2)].getText().equals("")&&jtf[(ind_pos-3)].getText().equals("")&&jtf[(ind_pos-4)].getText().equals("")))
                                {
                                        JOptionPane.showMessageDialog(null,"Please Fill Your Previous Row");
                                        jtf[ind].setText("");
                                }    
                                else
                                {   
                                        jtf[ind].transferFocus();
                                }
                    }
                    else
                    {
                            jtf[ind].transferFocus();
                    }
                }
                
                    
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
                    
                    
                    
                    
if(pos == 8)
{
    msg+=kevent.getKeyChar();
    /*if(jtf[ind+5].getText().equals(""))
    {
         JOptionPane.showMessageDialog(null, "Please Add The ItemName... So Surcharge can be Calculated");
    }
    else
    {*/
            if(jtf[ind-5].getText().equals(""))
            {
                  JOptionPane.showMessageDialog(null, "WEIGHT FIELD IS EMPTY!!!");
                  jtf[ind].setText("");
            }
            else
            {
                    
                    
                    String sql_query = "select * from commodity where itemname='"+jtf[ind-6].getText().trim()+"'";
                    String sql_query1 = "select * from buyer where initial='"+jtf[ind+1].getText().trim()+"'";
                    
                    
                    double rmc = Double.parseDouble(db.getRequestedValue(sql_query, "rmc", "STRING-FORMAT"));
                    double commission = Double.parseDouble(db.getRequestedValue(sql_query1, "commission", "STRING-FORMAT"));
                    double vat = Double.parseDouble(db.getRequestedValue(sql_query, "vat", "STRING-FORMAT"));
                    double surcharge = Double.parseDouble(db.getRequestedValue(sql_query, "surcharge", "STRING-FORMAT"));
                    double hamali = Double.parseDouble(db.getRequestedValue(sql_query, "purchasehamali", "STRING-FORMAT"));
                    
                    //vat calculation
                    vat_value = (Double.parseDouble(jtf[ind - 5].getText()) * Double.parseDouble(jtf[ind].getText())) * (vat / 100);
                    jtf[ind + 4].setText(Double.toString(vat_value));
                
                    //surcharge calculation
                    surcharge_value = (Double.parseDouble(jtf[ind - 5].getText()) * Double.parseDouble(jtf[ind].getText())) * (surcharge / 100);
                    jtf[ind + 5].setText(Double.toString(surcharge_value));
                    
                    //hamali calculation
                    hamali_value = (Double.parseDouble(jtf[ind - 5].getText()) * Double.parseDouble(jtf[ind].getText())) * (hamali / 100);
                    jtf[ind + 6].setText(Double.toString(hamali_value));
                    
                    //rmc calculation
                    rmc_value = (Double.parseDouble(jtf[ind - 5].getText()) * Double.parseDouble(jtf[ind].getText())) * (rmc / 100);
                    jtf[ind + 2].setText(Double.toString(rmc_value));
               
                    //commission calculation
                    commission_value = (Double.parseDouble(jtf[ind - 5].getText()) * Double.parseDouble(jtf[ind].getText())) * (commission / 100);
                    jtf[ind + 3].setText(Double.toString(commission_value));
                
                    //total calculation
                    jtf[ind + 9].setText(Double.toString(Double.parseDouble(jtf[ind].getText()) * Double.parseDouble(jtf[ind-5].getText())));
                    
                   
                    //grandtotal calculation
                    double sur = Double.parseDouble(jtf[ind + 9].getText()) + Double.parseDouble(jtf[ind + 4].getText()) + Double.parseDouble(jtf[ind + 5].getText()) + Double.parseDouble(jtf[ind + 6].getText()) + Double.parseDouble(jtf[ind + 2].getText()) + Double.parseDouble(jtf[ind + 3].getText());
                    jtf[ind + 10].setText(Double.toString(sur));
            }
    //}
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







class UpdateKeyListener implements KeyListener
{
    
        String msg="";
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
        
        public UpdateKeyListener(int ind,JTextField jtf[] ,int pos)
        {
                this.jtf = jtf;
                this.ind = ind;
                this.pos = pos;
                ind_pos = ind - (pos + 1);
        }
        
        
        public void keyPressed(KeyEvent kevent)
        {
              // msg+=kevent.getKeyChar();
                if(kevent.getKeyCode() == kevent.VK_TAB)
                {
                    System.out.println("IND:"+ind+" and POSITION:"+pos+" and INDEX POS:"+ind_pos);
                    System.out.println("ID:"+jtf[ind_pos].getText()+"CURRENT TEXT:"+jtf[ind].getText()+"GRAND TOTAL:"+jtf[(ind_pos-1)].getText()+"TOTAL:"+jtf[(ind_pos-2)].getText()+"INVOICE NO:"+jtf[(ind_pos-3)].getText()+"Round off:"+jtf[(ind_pos-4)].getText());
                    if((jtf[ind_pos].getText().equals("")) && (jtf[(ind_pos-1)].getText().equals("")||jtf[(ind_pos-2)].getText().equals("")||jtf[(ind_pos-3)].getText().equals("")||jtf[(ind_pos-4)].getText().equals("")) )
                    {
                            JOptionPane.showMessageDialog(null,"Please Fill Your Previous Row");
                            jtf[ind].setText("");
                    }
                    else
                    {    
                            jtf[ind].transferFocus();
                           
                    }   
                        
                }
                
                    
       }
         
        
        
        public void keyReleased(KeyEvent kevent)
        {
             try
             {
                    double surcharge_value,vat_value,rmc_value,commission_value,hamali_value;
           
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
                                  //  jtf[ind+12].setText(Long.toString(select_result.getLong("purchasehamali")));
                                   // jtf[ind+10].setText(Integer.toString(select_result.getInt("vat")));
                                   // jtf[ind+11].setText(Long.toString(select_result.getLong("surcharge")));
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
                           /*  Connection con = db.dbConnect();
                            Statement stmt = con.createStatement(); // Create Statement
                            ResultSet select_result = stmt.executeQuery(sql_query); // Execute the query
                            if (select_result.next())
                            {
                                   // jtf[ind+2].setText(Long.toString(select_result.getLong("commission"))); 
                              
                            }*/
                            
                               
                        
                        double commission = Double.parseDouble(db.getRequestedValue(sql_query, "commission", "STRING-FORMAT"));
                        commission_value = (Double.parseDouble(jtf[ind - 1].getText()) * Double.parseDouble(jtf[ind-6].getText())) * (commission / 100);
                        jtf[ind + 2].setText(Double.toString(commission_value));
                    }
                    
                    
                    
                    
                    if(pos == 8)
                    {
                        msg+=kevent.getKeyChar();
                        
                            if(jtf[ind-5].getText().equals(""))
                            {
                                   JOptionPane.showMessageDialog(null, "WEIGHT FIELD IS EMPTY!!!");
                                   jtf[ind].setText("");
                            }
                            else
                            {
                                
                                
                             /*   String sql_query = "select * from commodity where itemname='"+jtf[ind-6].getText().trim()+"'";
            
                                double vat = Double.parseDouble(db.getRequestedValue(sql_query, "vat", "STRING-FORMAT"));
                                double surcharge = Double.parseDouble(db.getRequestedValue(sql_query, "surcharge", "STRING-FORMAT"));
                 
                    vat_value = (Double.parseDouble(jtf[ind - 5].getText()) * Double.parseDouble(jtf[ind].getText())) * (vat / 100);
                    jtf[ind + 4].setText(Double.toString(vat_value));
                
                    surcharge_value = (Double.parseDouble(jtf[ind - 5].getText()) * Double.parseDouble(jtf[ind].getText())) * (surcharge / 100);
                    jtf[ind + 5].setText(Double.toString(surcharge_value));
                
                    
                                
                                
                                
                                
                                
                                
                                    jtf[ind + 9].setText(Double.toString(Double.parseDouble(jtf[ind].getText()) * Double.parseDouble(jtf[ind-5].getText())));
                                    
                                    double sur_cal = (Double.parseDouble(jtf[ind+5].getText()) / 100);
                                    double sur = Double.parseDouble(jtf[ind + 9].getText()) + sur_cal;
                                    jtf[ind + 10].setText(Double.toString(sur));
                                    * 
                                    * */
                                
                                
                          
                    String sql_query = "select * from commodity where itemname='"+jtf[ind-6].getText().trim()+"'";
                    String sql_query1 = "select * from buyer where initial='"+jtf[ind+1].getText().trim()+"'";
                    
                    
                    double rmc = Double.parseDouble(db.getRequestedValue(sql_query, "rmc", "STRING-FORMAT"));
                    double commission = Double.parseDouble(db.getRequestedValue(sql_query1, "commission", "STRING-FORMAT"));
                    double vat = Double.parseDouble(db.getRequestedValue(sql_query, "vat", "STRING-FORMAT"));
                    double surcharge = Double.parseDouble(db.getRequestedValue(sql_query, "surcharge", "STRING-FORMAT"));
                    double hamali = Double.parseDouble(db.getRequestedValue(sql_query, "purchasehamali", "STRING-FORMAT"));
                    
                    //vat calculation
                    vat_value = (Double.parseDouble(jtf[ind - 5].getText()) * Double.parseDouble(jtf[ind].getText())) * (vat / 100);
                    jtf[ind + 4].setText(Double.toString(vat_value));
                
                    //surcharge calculation
                    surcharge_value = (Double.parseDouble(jtf[ind - 5].getText()) * Double.parseDouble(jtf[ind].getText())) * (surcharge / 100);
                    jtf[ind + 5].setText(Double.toString(surcharge_value));
                    
                    //hamali calculation
                    hamali_value = (Double.parseDouble(jtf[ind - 5].getText()) * Double.parseDouble(jtf[ind].getText())) * (hamali / 100);
                    jtf[ind + 6].setText(Double.toString(hamali_value));
                    
                    //rmc calculation
                    rmc_value = (Double.parseDouble(jtf[ind - 5].getText()) * Double.parseDouble(jtf[ind].getText())) * (rmc / 100);
                    jtf[ind + 2].setText(Double.toString(rmc_value));
               
                    //commission calculation
                    commission_value = (Double.parseDouble(jtf[ind - 5].getText()) * Double.parseDouble(jtf[ind].getText())) * (commission / 100);
                    jtf[ind + 3].setText(Double.toString(commission_value));
                
                    //total calculation
                    jtf[ind + 9].setText(Double.toString(Double.parseDouble(jtf[ind].getText()) * Double.parseDouble(jtf[ind-5].getText())));
                    
                   
                    //grandtotal calculation
                    double sur = Double.parseDouble(jtf[ind + 9].getText()) + Double.parseDouble(jtf[ind + 4].getText()) + Double.parseDouble(jtf[ind + 5].getText()) + Double.parseDouble(jtf[ind + 6].getText()) + Double.parseDouble(jtf[ind + 2].getText()) + Double.parseDouble(jtf[ind + 3].getText());
                    jtf[ind + 10].setText(Double.toString(sur));
                                
                                
                            }
                        
                    }
                    
                    
                    
                   
                }
                catch(Exception e){}
        }
         
        public void keyTyped(KeyEvent kevent)
        {
                    msg+=kevent.getKeyChar();    
                   // System.out.println(msg); 
        }
        
        
 }











class MyMouseListener implements MouseListener
{
    
    public void mouseClicked(MouseEvent me)
    {
            
            System.out.println("Mouse Clicked");
    }
    
    public void mouseEntered(MouseEvent me)
    {}
    
    public void mousePressed(MouseEvent me)
    {}
    
    public void mouseReleased(MouseEvent me)
    {}
    
    public void mouseExited(MouseEvent me)
    {}
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
            java.util.logging.Logger.getLogger(grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grid().setVisible(true);
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
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
