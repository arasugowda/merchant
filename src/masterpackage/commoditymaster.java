/*
 *  Developed By InfiniteGlobe
 * 
 */

package masterpackage;
import GuiPackage.MainFrame;
import com.mysql.jdbc.StringUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.awt.print.*;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import supportingpackage.Database;
import supportingpackage.*;
import pattipackage.*;
import entriespackage.*;
import reportspackage.*;



public class commoditymaster extends javax.swing.JFrame {

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
    
    // Calling Default constructor
    public commoditymaster() {
       // setUndecorated(true); // Removing frame header
        initComponents(); // initialising all frame components
        setExtendedState(JFrame.MAXIMIZED_BOTH);// displaying frame to window size
        initialize_table_values();  // calling method to initialize all table values  
        con = db.dbConnect(); // Database Connection
    }

    
 
    
    // method to get and initialize all table values
    public void initialize_table_values()
    {
            try
            {
                    // Initializing Coloumn names
                    col_names = new String [] {"kannadaname","itemname","farmerhamali","purchasehamali","rmc","farmercommission","vat","surcharge","commodityid","initials"}; 
                   
                    //gets the total number of rows from the table
                    int count = (int) db.return_row_count("select count(*) as RowCount from commodity","RowCount");
                    
                    //create the array object
                    data = new Object[count][10];
                  
                    con = db.dbConnect(); // Database Connection 
                    st = con.createStatement(); // Creating statement
                    rs = st.executeQuery("select * from commodity"); // Executing the select query
                   
                   int i = 0;
                   // getting coloumn values
                   while(rs.next())
                   {
                            data[i][0] = rs.getString("kannadaname"); // gets kannada value
                            data[i][1] = rs.getString("itemname");  // gets itemname value
                            data[i][2] = rs.getString("farmerhamali");  //gets farmerhamali value
                            data[i][3] = rs.getString("purchasehamali"); //gets purchasehamali value
                            data[i][4] = rs.getString("rmc"); // gets rmc value
                            data[i][5] = rs.getString("farmercommission"); // gets farmercommission value
                            data[i][6] = rs.getString("vat"); // gets vat value
                            data[i][7] = rs.getString("surcharge"); // gats surcharge value
                            data[i][8] = rs.getString("commodityid"); // gets commodityid value
                            data[i][9] = rs.getString("initials"); // gets initials value
                            
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

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        add_commodity = new javax.swing.JButton();
        edit_commodity = new javax.swing.JButton();
        delete_commodity = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kannadaname = new javax.swing.JTextField();
        farmerhamali = new javax.swing.JTextField();
        purchasehamali = new javax.swing.JTextField();
        rmc = new javax.swing.JTextField();
        farmercommission = new javax.swing.JTextField();
        vat = new javax.swing.JTextField();
        surcharge = new javax.swing.JTextField();
        initials = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        itemname = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Commodity = new javax.swing.JTable();
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

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Commodity Master");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("C O M M O D I T Y   M A S T E R ");

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
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 566, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
        jLabel2.setText("KANNADA NAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("FARMER HAMALI");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("PURCHASE HAMALI");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("RMC (%)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("FARMER COMMISSION (%)");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("VAT");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("SURCHARGE ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("INITIALS");

        kannadaname.setFont(new java.awt.Font("BRH Kannada", 0, 24)); // NOI18N
        kannadaname.setText("à²µà²¿à²¨à³�à²¥");
        kannadaname.setToolTipText("à²µà²¿à²¨à³�à²¥");

        farmerhamali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                farmerhamaliKeyReleased(evt);
            }
        });

        purchasehamali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                purchasehamaliKeyReleased(evt);
            }
        });

        rmc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rmcKeyReleased(evt);
            }
        });

        farmercommission.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                farmercommissionKeyReleased(evt);
            }
        });

        vat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vatKeyReleased(evt);
            }
        });

        surcharge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                surchargeKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setText("ITEM NAME");

        reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(farmercommission, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(initials, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(purchasehamali, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rmc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(surcharge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(farmerhamali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kannadaname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(add_commodity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_commodity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_commodity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(kannadaname, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(farmerhamali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchasehamali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rmc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(farmercommission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surcharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_commodity)
                    .addComponent(edit_commodity)
                    .addComponent(delete_commodity)
                    .addComponent(reset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
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

    // This method to allows the use to select sinle or multiple rows from
    // the table
    private void Table_CommodityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_CommodityMouseClicked
       
       try
       {
            // returns the number of selected rows from the table
            int row = Table_Commodity.getSelectedRow();
            
            // returns the commodityid coloumn from the table
            cid = (String) Table_Commodity.getModel().getValueAt(row, 8);
            
            // Connecting to the Database
            con = db.dbConnect();
            
            //Creating the Statement
            st = con.createStatement();
            
            //executing the query to get the particular row
            rs = st.executeQuery("select * from commodity where commodityid='"+cid+"'");
            
            // gets the row value and 
            // assign the row value into
            // textfields for updation
            if(rs.next())
            {
                    id_for_update = rs.getLong("id");   // gets id value
                    kannadaname.setText(rs.getString("kannadaname")); // gets kannadaname value
                    itemname.setText(rs.getString("itemname")); // gets itemname value
                    farmerhamali.setText(rs.getString("farmerhamali")); // gets farmerhamali value
                    purchasehamali.setText(Long.toString(rs.getLong("purchasehamali"))); // gets purchasehamali value
                    rmc.setText(rs.getString("rmc")); // gets rmc value
                    farmercommission.setText(rs.getString("farmercommission")); // gets farmercommision value
                    vat.setText(rs.getString("vat")); // gets vat value
                    surcharge.setText(rs.getString("surcharge")); // gets surcharge value
                    initials.setText(rs.getString("initials")); // gets initials value
                    initial_hold = initials.getText();
            }
            //initials.setEditable(false);
       }
       catch(Exception e){}
        
        
        
    }//GEN-LAST:event_Table_CommodityMouseClicked

    private void surchargeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surchargeKeyReleased

        try
        {

            if(Character.isAlphabetic(evt.getKeyChar()))
            {

                JOptionPane.showMessageDialog(null, "You Cant Use Letters for Numbers");
                surcharge.setText(so.filterString(surcharge.getText()));
            }
            else
            {
                //System.out.println(Integer.parseInt(rmc.getText()));
                if(Integer.parseInt(surcharge.getText()) > 100)
                {
                    JOptionPane.showMessageDialog(null, "NumberOverFlow: You cant go beyond 100%");
                    surcharge.setText("");
                }

            }

        }
        catch(Exception e){}

    }//GEN-LAST:event_surchargeKeyReleased

    private void vatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vatKeyReleased

        try
        {

            if(Character.isAlphabetic(evt.getKeyChar()))
            {

                JOptionPane.showMessageDialog(null, "You Cant Use Letters for Numbers");
                vat.setText(so.filterString(vat.getText()));
            }
            else
            {
                //System.out.println(Integer.parseInt(rmc.getText()));
                if(Integer.parseInt(vat.getText()) > 100)
                {
                    JOptionPane.showMessageDialog(null, "NumberOverFlow: You cant go beyond 100%");
                    vat.setText("");
                }

            }

        }
        catch(Exception e){}

    }//GEN-LAST:event_vatKeyReleased

    private void farmercommissionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_farmercommissionKeyReleased

        try
        {

            if(Character.isAlphabetic(evt.getKeyChar()))
            {

                JOptionPane.showMessageDialog(null, "You Cant Use Letters for Numbers");
                farmercommission.setText(so.filterString(farmercommission.getText()));
            }
            else
            {
                //System.out.println(Integer.parseInt(rmc.getText()));
                if(Integer.parseInt(farmercommission.getText()) > 100)
                {
                    JOptionPane.showMessageDialog(null, "NumberOverFlow: You cant go beyond 100%");
                    farmercommission.setText("");
                }

            }

        }
        catch(Exception e){}

    }//GEN-LAST:event_farmercommissionKeyReleased

    private void rmcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rmcKeyReleased

        try
        {

            if(Character.isAlphabetic(evt.getKeyChar()))
            {

                JOptionPane.showMessageDialog(null, "You Cant Use Letters for Numbers");
                rmc.setText(so.filterString(rmc.getText()));
            }
            else
            {
                //System.out.println(Integer.parseInt(rmc.getText()));
                if(Integer.parseInt(rmc.getText()) > 100)
                {
                    JOptionPane.showMessageDialog(null, "NumberOverFlow: You cant go beyond 100%");
                    rmc.setText("");
                }

            }

        }
        catch(Exception e){}

    }//GEN-LAST:event_rmcKeyReleased

    private void purchasehamaliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purchasehamaliKeyReleased

        try
        {

            if(Character.isAlphabetic(evt.getKeyChar()))
            {
                JOptionPane.showMessageDialog(null, "You Cant Use Letters for Numbers");
                int len = purchasehamali.getText().length();
                purchasehamali.setText(so.filterString(purchasehamali.getText()));
            }

        }
        catch(Exception e){}

    }//GEN-LAST:event_purchasehamaliKeyReleased

    private void farmerhamaliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_farmerhamaliKeyReleased

        try
        {

            if(Character.isAlphabetic(evt.getKeyChar()))
            {
                JOptionPane.showMessageDialog(null, "You Cant Use Letters for Numbers");
                int len = farmerhamali.getText().length();
                System.out.println(len);
                // farmerhamali.setText(removeLastChar(farmerhamali.getText()));
                farmerhamali.setText(so.filterString(farmerhamali.getText()));
            }

        }
        catch(Exception e){}

    }//GEN-LAST:event_farmerhamaliKeyReleased

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
                        String value = Table_Commodity.getValueAt(i1, 8).toString();

                        // Connecting to Database
                        con = db.dbConnect();

                        //Creating the Statment for executing query
                        st = con.createStatement();

                        // executing query using statement and saving it to
                        // ResultSet
                        rs = st.executeQuery("select * from commodity where commodityid='"+value+"'");

                        // gets the id value from the table
                        if(rs.next()) {  id_for_update1 = rs.getLong("id"); }

                        // Deletes the particular row based on their id
                        // values retrieved
                        String sql = "delete from commodity where id = "+id_for_update1;

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
                    JOptionPane.showMessageDialog(null, " Commodity DELETED SUCCESSFULLY!!!");
                }
                else
                {
                    //  if selected rows are not deleted
                    JOptionPane.showMessageDialog(null, " Commodity NOT DELETED...PLEASE CHECK AGAIN");
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

    private void edit_commodityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_commodityActionPerformed

        try
        {

            // Setting the commodityid with
            // concatenating initial value with id
            String com_id =  initials.getText() + id_for_update;

            String qu = "select * from commodity where initials='"+initials.getText()+"'";
            String reqval = db.getRequestedValue(qu,"initials","STRING-FORMAT");

            if(!reqval.equals(initials.getText()))
            {
                JOptionPane.showMessageDialog(this, "INITIAL FROM "+initial_hold+" TO "+initials.getText()+" CANNOT BE CHANGED");
            }
            else
            {
                // updating particular row value
                String sql_query2 = "update commodity set kannadaname='"+kannadaname.getText()+"', itemname='"+itemname.getText()+"',farmerhamali='"+farmerhamali.getText()+"',purchasehamali='"+purchasehamali.getText()+"',rmc='"+rmc.getText()+"',farmercommission='"+farmercommission.getText()+"' , vat='"+vat.getText()+"' , surcharge='"+surcharge.getText()+"' ,commodityid='"+com_id+"', initials='"+initials.getText()+"' where id="+id_for_update+"";
                db.update_table("commodity", sql_query2);

                // Once data is updated
                // then initializing all table values and
                //displaying the table
                initialize_table_values();
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_edit_commodityActionPerformed

    private void add_commodityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_commodityActionPerformed

        try
        {
            String qu = "select * from commodity where initials='"+initials.getText()+"'";
            String reqval = db.getRequestedValue(qu,"initials","STRING-FORMAT");
            System.out.println("Requested Value:"+reqval);
            if(reqval.equals(initials.getText()))
            {
                JOptionPane.showMessageDialog(this, "INITIAL  "+initials.getText().toUpperCase()+"  ALREADY AVAILABLE");
            }
            else
            {
                // inserting dummy values into table
                String sql_query1 =  "insert into commodity(kannadaname,itemname,farmerhamali,purchasehamali,rmc,farmercommission,vat,surcharge,commodityid,initials)values('1','1','1','1','1','1','1','1','1','1')";

                // gets the ID value for newly added dummy row
                long id = db.addToTable("commodity",sql_query1);

                //Concatenating the user inputed initial value with id retrieved from table
                String commodityid =  initials.getText() + Long.toString(id);

                // updating the newly added data using their id
                String sql_query2 = "update commodity set kannadaname='"+kannadaname.getText()+"', itemname='"+itemname.getText()+"',farmerhamali='"+farmerhamali.getText()+"',purchasehamali='"+purchasehamali.getText()+"',rmc='"+rmc.getText()+"',farmercommission='"+farmercommission.getText()+"' , vat='"+vat.getText()+"' , surcharge='"+surcharge.getText()+"' ,commodityid='"+commodityid+"', initials='"+initials.getText()+"' where id="+id+"";
                db.insert("commodity", sql_query2);

                // After data updated Sccessfully , the
                //user inputed values with be clear from textboxes
                kannadaname.setText("");
                itemname.setText("");
                farmerhamali.setText("");
                purchasehamali.setText("");
                rmc.setText("");
                farmercommission.setText("");
                vat.setText("");
                surcharge.setText("");
                initials.setText("");

                // Once data added and textbox values are cleard
                // then initializing all table values and
                //displaying the table
                initialize_table_values();

            }
        }
        catch(Exception e){}

    }//GEN-LAST:event_add_commodityActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        
        try
        {
                //Clear all the contents in the textfield
                kannadaname.setText("");
                itemname.setText("");
                farmerhamali.setText("");
                purchasehamali.setText("");
                rmc.setText("");
                farmercommission.setText("");
                vat.setText("");
                surcharge.setText("");
                initials.setText("");
        }
        catch(Exception e){}
        
    }//GEN-LAST:event_resetActionPerformed

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

    
    
	

public String removeLastChar(String str)
{
    String ret_str = "";
    ret_str = str.substring(0, str.length()-1);
    System.out.println(ret_str);
    return ret_str;
}


    
    
    
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
            java.util.logging.Logger.getLogger(commoditymaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(commoditymaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(commoditymaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(commoditymaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new commoditymaster().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Commodity;
    private javax.swing.JButton add_commodity;
    private javax.swing.JMenuItem buyer_day_report;
    private javax.swing.JMenuItem commoditymaster;
    private javax.swing.JMenuItem day_report;
    private javax.swing.JButton delete_commodity;
    private javax.swing.JButton edit_commodity;
    private javax.swing.JMenuItem farmer_A_B_Bill_report;
    private javax.swing.JMenuItem farmer_kg_patti;
    private javax.swing.JMenuItem farmer_patti;
    private javax.swing.JTextField farmercommission;
    private javax.swing.JTextField farmerhamali;
    private javax.swing.JMenuItem farmermaster;
    private javax.swing.JMenuItem government_transaction;
    private javax.swing.JTextField initials;
    private javax.swing.JMenuItem item_day_report;
    private javax.swing.JTextField itemname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kannadaname;
    private javax.swing.JMenuItem ledger_entries;
    private javax.swing.JMenuItem ledger_report;
    private javax.swing.JMenuItem lot_report;
    private javax.swing.JMenuItem mandi_transaction;
    private javax.swing.JMenu margin_day_report;
    private javax.swing.JTextField purchasehamali;
    private javax.swing.JMenuItem purchasemaster;
    private javax.swing.JButton reset;
    private javax.swing.JTextField rmc;
    private javax.swing.JTextField surcharge;
    private javax.swing.JMenuItem tax_rmc_total;
    private javax.swing.JTextField vat;
    // End of variables declaration//GEN-END:variables
}
