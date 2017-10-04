
package entriespackage;

import GuiPackage.MainFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import masterpackage.*;
import supportingpackage.Database;
import supportingpackage.StringOperation;
import pattipackage.*;
import entriespackage.*;
import reportspackage.*;


public class ledgerentries extends javax.swing.JFrame {

    Object[][] data = null; 
    private DefaultListSelectionModel selectionModel; 
    Database db = new Database();
    Connection con = null;
    ResultSet rs = null;
    Statement st = null;
    String cid = "";
    long id_for_update = 0;
    String farmerhamali_temp = "";  
    String initial_hold = "";
    String[] col_names;
    StringOperation so = new StringOperation();
    
    
    
    public ledgerentries() {
    //  setUndecorated(true); // Removing frame header
        initComponents(); // initialising all frame components
        setExtendedState(JFrame.MAXIMIZED_BOTH);// displaying frame to window size
        initialize_table_values();  // calling method to initialize all table values  
        con = db.dbConnect(); // Database Connection
       //load_dates();
                
        
        
        creditradiobutton.setActionCommand("credit");
        debitradiobutton.setActionCommand("debit");
        
        buttonGroup1.add(creditradiobutton);
        buttonGroup1.add(debitradiobutton);
        
        transactionid.setEditable(false);
    }

   
    public void load_dates()
    {
        try
        {
             Calendar calendar = Calendar.getInstance();
             calendar.set(2013, Calendar.FEBRUARY, 9);
            
              ledger_date.setCalendar(calendar);
            
        }
        catch(Exception e){}
    
    }
    
    
    
     // method to get and initialize all table values
    public void initialize_table_values()
    {
            try
            {
                    // Initializing Coloumn names
                    col_names = new String [] {"Amount","Description","Date","CreditorDebit","TransactionID"}; 
                   
                    //gets the total number of rows from the table
                    int count = (int) db.return_row_count("select count(*) as RowCount from ledger","RowCount");
                    
                    //create the array object
                    data = new Object[count][10];
                  
                    con = db.dbConnect(); // Database Connection 
                    st = con.createStatement(); // Creating statement
                    rs = st.executeQuery("select * from ledger"); // Executing the select query
                   
                   int i = 0;
                   // getting coloumn values
                   while(rs.next())
                   {
                            data[i][0] = rs.getString("amount"); // gets kannada value
                            data[i][1] = rs.getString("description");  // gets itemname value
                            data[i][2] = rs.getString("date");  //gets farmerhamali value
                            data[i][3] = rs.getString("creditordebit"); //gets purchasehamali value
                            data[i][4] = rs.getString("transactionid"); // gets rmc value
                            
                            
                            i++; // incrementing i value which point to next row
                   }
                   
                   // Sets the Table model with given data and coloumn values
                   Table_Commodity.setModel(new DefaultTableModel(data, col_names)
                   {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                            //all cells false
                            return false;
                        }   
                   });
                 //  Table_Commodity.getColumn("Button").setCellRenderer(new ButtonRenderer());
                   
            }
            catch(Exception e){}
    }
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Commodity = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        add_commodity = new javax.swing.JButton();
        edit_commodity = new javax.swing.JButton();
        delete_commodity = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        transactionid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        creditradiobutton = new javax.swing.JRadioButton();
        debitradiobutton = new javax.swing.JRadioButton();
        ledger_date = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
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

        Table_Commodity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_Commodity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_CommodityMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Commodity);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Commodity Master"));

        add_commodity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add_commodity.setText("ADD");
        add_commodity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_commodityActionPerformed(evt);
            }
        });

        edit_commodity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edit_commodity.setText("EDIT");
        edit_commodity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_commodityActionPerformed(evt);
            }
        });

        delete_commodity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete_commodity.setText("DELETE");
        delete_commodity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_commodityActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("AMOUNT");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("DATE");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("TRANSACTION ID");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setText("DESCRIPTION");

        creditradiobutton.setText("CREDIT");

        debitradiobutton.setText("DEBIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(description, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ledger_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(add_commodity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit_commodity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_commodity))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(transactionid, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(creditradiobutton)
                        .addGap(18, 18, 18)
                        .addComponent(debitradiobutton)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ledger_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditradiobutton)
                    .addComponent(debitradiobutton))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transactionid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_commodity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_commodity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_commodity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("L E D G E R   E N T R I E S");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // close the current frame and
        // de-allocate the memory
        this.dispose();
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // Minimize the current frame
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void Table_CommodityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_CommodityMouseClicked

        try
        {
            // returns the number of selected rows from the table
            int row = Table_Commodity.getSelectedRow();

            // returns the commodityid coloumn from the table
            cid = (String) Table_Commodity.getModel().getValueAt(row, 4);

            // Connecting to the Database
            con = db.dbConnect();

            //Creating the Statement
            st = con.createStatement();
            //executing the query to get the particular row
            rs = st.executeQuery("select * from ledger where transactionid='"+cid+"'");

            // gets the row value and
            // assign the row value into
            // textfields for updation
            if(rs.next())
            {
                id_for_update = rs.getLong("id");   // gets id value
                amount.setText(rs.getString("amount")); // gets kannadaname value
                description.setText(rs.getString("description")); // gets itemname value
                String date_format[] = rs.getString("date").split("-");
                
                
               // day.setText(date_format[0]);
               // month.setText(date_format[1]);
               // year.setText(date_format[2]);
                
                Calendar cal = Calendar.getInstance();
               // cal.set(Calendar.YEAR,Integer.parseInt(date_format[2]));
               // cal.set(Calendar.MONTH,Integer.parseInt(date_format[1])-1);
               // cal.set(Calendar.DATE,Integer.parseInt(date_format[0]));
                cal.set(Integer.parseInt(date_format[2]), Integer.parseInt(date_format[1])-1, Integer.parseInt(date_format[0]));
                ledger_date.setCalendar(cal);
                
                if(rs.getString("creditordebit").equalsIgnoreCase("credit"))
                {
                    creditradiobutton.setSelected(true);
                    debitradiobutton.setSelected(false);
                }
                else
                {
                    creditradiobutton.setSelected(false);
                    debitradiobutton.setSelected(true);
                }
                transactionid.setText(rs.getString("transactionid"));
            }
            //initials.setEditable(false);
        }
        catch(Exception e){}

    }//GEN-LAST:event_Table_CommodityMouseClicked

    private void add_commodityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_commodityActionPerformed

        try
        {
                // inserting dummy values into table
                String sql_query1 =  "insert into ledger(amount,description,date,creditordebit,transactionid)values('1','1','1','1','1')";

                // gets the ID value for newly added dummy row
                long id = db.addToTable("ledger",sql_query1);

                //Concatenating the user inputed initial value with id retrieved from table
                String transaction =  "TRANSACTION" + Long.toString(id);
                
                
                Date date = ledger_date.getDate();
                String dat = String.format("%1$td-%1$tm-%1$tY",date);
                

                // updating the newly added data using their id
                String sql_query2 = "update ledger set amount='"+amount.getText()+"', description='"+description.getText()+"',date='"+dat+"',creditordebit='"+buttonGroup1.getSelection().getActionCommand()+"',transactionid='"+transaction+"' where id="+id+"";
                db.insert("commodity", sql_query2);

                // After data updated Sccessfully , the
                //user inputed values with be clear from textboxes
                amount.setText("");
                description.setText("");
                transactionid.setText("");
                

                // Once data added and textbox values are cleard
                // then initializing all table values and
                //displaying the table
                initialize_table_values();

            
        }
        catch(Exception e){}
    }//GEN-LAST:event_add_commodityActionPerformed

    private void edit_commodityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_commodityActionPerformed

        try
        {

            // Setting the commodityid with
            // concatenating initial value with id
            String trans_id =  "TRANSACTION" + id_for_update;

            String qu = "select * from ledger where transactionid='"+transactionid.getText()+"'";
            String reqval = db.getRequestedValue(qu,"transactionid","STRING-FORMAT");
            
            Date date = ledger_date.getDate();
            String dat = String.format("%1$td-%1$tm-%1$tY",date);
            
                // updating particular row value
                String sql_query2 = "update ledger set amount='"+amount.getText()+"', description='"+description.getText()+"',date='"+dat+"',creditordebit='"+buttonGroup1.getSelection().getActionCommand()+"',transactionid='"+transactionid.getText()+"' where id="+id_for_update+"";
                db.update_table("Ledger", sql_query2);

                // Once data is updated
                // then initializing all table values and
                //displaying the table
                initialize_table_values();
           
        }
        catch(Exception e){}
    }//GEN-LAST:event_edit_commodityActionPerformed

    private void delete_commodityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_commodityActionPerformed

        try
        {
            // Calling the selectionmodel for selecting the single or multple rows from table
            selectionModel = (DefaultListSelectionModel) Table_Commodity.getSelectionModel();
            long id_for_update1 = 0;
            int result = 0;

            // Prompts the user whether to delete the record or not
            int choice = JOptionPane.showConfirmDialog(this, "Do You Want To Delete The Record ");

            //if user selects yes then the
            //condition executes
            if(choice == 0)
            {
                // loops executes based on numbers of
                // rows in the table
                for (int i1 = 0; i1 < Table_Commodity.getRowCount(); i1++)
                {

                    // Condition executes based on selected
                    //rows in the table
                    if (selectionModel.isSelectedIndex(i1))
                    {
                        // gets the id coloumn value from the table
                        String value = Table_Commodity.getValueAt(i1, 4).toString();

                        // Connecting to Database
                        con = db.dbConnect();

                        //Creating the Statment for executing query
                        st = con.createStatement();

                        // executing query using statement and saving it to
                        // ResultSet
                        rs = st.executeQuery("select * from ledger where transactionid='"+value+"'");

                        // gets the id value from the table
                        if(rs.next()) {  id_for_update1 = rs.getLong("id"); }

                        // Deletes the particular row based on their id
                        // values retrieved
                        String sql = "delete from ledger where id = "+id_for_update1;

                        // Connecting to Database
                        con = db.dbConnect();

                        //Creating the Statment for executing query
                        Statement stmt = con.createStatement();

                        //executing the query and deleting the row
                        // if successfull then value 1 will be returned
                        // otherwise 0 will be returned
                        result =  stmt.executeUpdate(sql);
                    }
                }

                if(result > 0)
                {
                    //  if selected rows are deleted
                    JOptionPane.showMessageDialog(null, " Ledger DELETED SUCCESSFULLY!!!");
                }
                else
                {
                    //  if selected rows are not deleted
                    JOptionPane.showMessageDialog(null, " Ledger NOT DELETED...PLEASE CHECK AGAIN");
                }

                // Closing the Connection to Database
                con.close();

                // Once data is daleted
                // then initializing all table values and
                // displaying the table
                initialize_table_values();
            }

        }
        catch(Exception e){}
    }//GEN-LAST:event_delete_commodityActionPerformed

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

    
    
    
    
    private int getDaysInMonth(int month, int year) 
    {
            Calendar cal = Calendar.getInstance();  // or pick another time zone if necessary
            cal.set(Calendar.MONTH, month);
            cal.set(Calendar.DAY_OF_MONTH, 1);      // 1st day of month
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.HOUR, 0);
            cal.set(Calendar.MINUTE, 0);
            Date startDate = cal.getTime();

            int nextMonth = (month == Calendar.DECEMBER) ? Calendar.JANUARY : month + 1;
            cal.set(Calendar.MONTH, nextMonth);
            if (month == Calendar.DECEMBER) {
               cal.set(Calendar.YEAR, year + 1);
            }
            Date endDate = cal.getTime();

            // get the number of days by measuring the time between the first of this
            //   month, and the first of next month
            return (int)((endDate.getTime() - startDate.getTime()) / (24 * 60 * 60 * 1000));
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
            java.util.logging.Logger.getLogger(ledgerentries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ledgerentries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ledgerentries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ledgerentries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ledgerentries().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Commodity;
    private javax.swing.JButton add_commodity;
    private javax.swing.JTextField amount;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem buyer_day_report;
    private javax.swing.JMenuItem commoditymaster;
    private javax.swing.JRadioButton creditradiobutton;
    private javax.swing.JMenuItem day_report;
    private javax.swing.JRadioButton debitradiobutton;
    private javax.swing.JButton delete_commodity;
    private javax.swing.JTextField description;
    private javax.swing.JButton edit_commodity;
    private javax.swing.JMenuItem farmer_A_B_Bill_report;
    private javax.swing.JMenuItem farmer_kg_patti;
    private javax.swing.JMenuItem farmer_patti;
    private javax.swing.JMenuItem farmermaster;
    private javax.swing.JMenuItem government_transaction;
    private javax.swing.JMenuItem item_day_report;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser ledger_date;
    private javax.swing.JMenuItem ledger_entries;
    private javax.swing.JMenuItem ledger_report;
    private javax.swing.JMenuItem lot_report;
    private javax.swing.JMenuItem mandi_transaction;
    private javax.swing.JMenu margin_day_report;
    private javax.swing.JMenuItem purchasemaster;
    private javax.swing.JMenuItem tax_rmc_total;
    private javax.swing.JTextField transactionid;
    // End of variables declaration//GEN-END:variables
}
