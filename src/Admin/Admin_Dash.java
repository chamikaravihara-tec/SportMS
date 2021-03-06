/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Database.DBConnection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import javax.swing.table.DefaultTableModel;
import sport_ms.Logged_User;

/**
 *
 * @author dinet
 */
public class Admin_Dash extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Dash
     */
    Connection con = null;
    int last_horizontal_coordination = 0, last_vartical_coordination = 0, first_horizontal_coordination = 0, first_vartical_coordination = 0, card_horizontal_space = 0, card_vertical_space = 0;
    int count = 0;
    String loggedUser = null;

    public Admin_Dash() {
        initComponents();
        DBConnection dbcon = DBConnection.getDbConnect();
        this.con = dbcon.connect();

        try {
            getCardLayout();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblAll_filter = new javax.swing.JLabel();
        lblInstructor_filter = new javax.swing.JLabel();
        lblClerk_filter = new javax.swing.JLabel();
        lblDirector_filter = new javax.swing.JLabel();
        lblAssistant_filter = new javax.swing.JLabel();
        lblAdmin_filter = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PnlSpace = new javax.swing.JPanel();
        lblBackgrround = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("jLabe8");
        jLabel17.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add User");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 100, 50));
        jLabel1.getAccessibleContext().setAccessibleParent(this);

        lblAll_filter.setBackground(new java.awt.Color(0, 102, 153));
        lblAll_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAll_filter.setForeground(new java.awt.Color(255, 255, 255));
        lblAll_filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAll_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/all_gray.png"))); // NOI18N
        lblAll_filter.setToolTipText("");
        lblAll_filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAll_filterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAll_filterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAll_filterMouseExited(evt);
            }
        });
        getContentPane().add(lblAll_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 80, 40));

        lblInstructor_filter.setBackground(new java.awt.Color(0, 102, 153));
        lblInstructor_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInstructor_filter.setForeground(new java.awt.Color(255, 255, 255));
        lblInstructor_filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructor_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/inst.png"))); // NOI18N
        lblInstructor_filter.setToolTipText("");
        lblInstructor_filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInstructor_filterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInstructor_filterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInstructor_filterMouseExited(evt);
            }
        });
        getContentPane().add(lblInstructor_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 80, 40));

        lblClerk_filter.setBackground(new java.awt.Color(0, 102, 153));
        lblClerk_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblClerk_filter.setForeground(new java.awt.Color(255, 255, 255));
        lblClerk_filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClerk_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/clerk.png"))); // NOI18N
        lblClerk_filter.setToolTipText("");
        lblClerk_filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClerk_filterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClerk_filterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClerk_filterMouseExited(evt);
            }
        });
        getContentPane().add(lblClerk_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, 80, 40));

        lblDirector_filter.setBackground(new java.awt.Color(0, 102, 153));
        lblDirector_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDirector_filter.setForeground(new java.awt.Color(255, 255, 255));
        lblDirector_filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDirector_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/dir.png"))); // NOI18N
        lblDirector_filter.setToolTipText("");
        lblDirector_filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDirector_filterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDirector_filterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDirector_filterMouseExited(evt);
            }
        });
        getContentPane().add(lblDirector_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 80, 40));

        lblAssistant_filter.setBackground(new java.awt.Color(0, 102, 153));
        lblAssistant_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAssistant_filter.setForeground(new java.awt.Color(255, 255, 255));
        lblAssistant_filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAssistant_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/assistant.png"))); // NOI18N
        lblAssistant_filter.setToolTipText("");
        lblAssistant_filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAssistant_filterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAssistant_filterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAssistant_filterMouseExited(evt);
            }
        });
        getContentPane().add(lblAssistant_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 80, 40));

        lblAdmin_filter.setBackground(new java.awt.Color(0, 102, 153));
        lblAdmin_filter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAdmin_filter.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin_filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmin_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/admin.png"))); // NOI18N
        lblAdmin_filter.setToolTipText("");
        lblAdmin_filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdmin_filterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdmin_filterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdmin_filterMouseExited(evt);
            }
        });
        getContentPane().add(lblAdmin_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, 80, 40));

        jScrollPane2.setBackground(new java.awt.Color(0, 255, 0,0));
        jScrollPane2.setBorder(null);
        jScrollPane2.setAutoscrolls(true);

        PnlSpace.setBackground(new java.awt.Color(255, 255, 255));
        PnlSpace.setForeground(new java.awt.Color(204, 204, 204));
        PnlSpace.setAutoscrolls(true);
        PnlSpace.setFocusTraversalPolicyProvider(true);
        PnlSpace.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane2.setViewportView(PnlSpace);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1080, 380));

        lblBackgrround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Session bg.png"))); // NOI18N
        getContentPane().add(lblBackgrround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153,10));
        jScrollPane1.setBorder(null);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(0, 0, 0,0));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "ID", "Name", "Position", "Password", "Contact", "Email", "NIC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setOpaque(false);
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.setVisible(false);
        jTable1.setVisible(false);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 820, 390));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255,255,255));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void fillSelf() {
//
//        Logged_User log = new Logged_User();
//        log.fill();
//
//        lblAvatarME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_remove_30px.png")));
//        lblIdME.setText(log.getUserId());
//        lblNameME.setText(log.getUserName());
//        lblContactME.setText(String.valueOf(log.getContact()));
//        lblPwMe.setText(log.getPassword());
//        lblEmailME.setText(log.getEmail());
//
//    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //fillSelf();
        
        jTable1.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jTable1.setAlignmentY(CENTER_ALIGNMENT);
        DefaultTableModel model = null;
        String sql_user = "select * from user , staff where user.userId=staff.staffId";

        try {
            Statement stmt_user = con.createStatement();
            ResultSet res_user = stmt_user.executeQuery(sql_user);
            while (res_user.next()) {
                this.count++;
                Object row[] = {count, res_user.getString(1), res_user.getString(2), res_user.getString(5), res_user.getString(6), res_user.getString(7), res_user.getInt(8), res_user.getString(9)};
                model = (DefaultTableModel) jTable1.getModel();
                model.addRow(row);

                User_Count usCount = new User_Count();

                create_card(count, res_user.getString(1), res_user.getString(2),res_user.getBoolean(3), res_user.getString(5), res_user.getString(6), res_user.getString(7), res_user.getInt(8), res_user.getString(9));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_formWindowOpened

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x, y);
    }//GEN-LAST:event_formMouseDragged

    private void getCardLayout() throws FileNotFoundException {
        FileReader reader = new FileReader("src\\Config\\Admin_User_Card.properties");
        Properties prop = new Properties();
        try {
            prop.load(reader);
//            System.out.println(prop.getProperty("last_coordination_horizontal"));
//            System.out.println(prop.getProperty("last_coordination_vertical"));
            String temp_coordination = prop.getProperty("last_coordination_horizontal");
            last_horizontal_coordination = Integer.parseInt(temp_coordination);
            temp_coordination = prop.getProperty("last_coordination_vertical");
            last_vartical_coordination = Integer.parseInt(temp_coordination);

            temp_coordination = prop.getProperty("first_coordination_horizontal");
            first_horizontal_coordination = Integer.parseInt(temp_coordination);
            temp_coordination = prop.getProperty("first_coordination_vertical");
            first_vartical_coordination = Integer.parseInt(temp_coordination);

            temp_coordination = prop.getProperty("card_space_horizontal");
            card_horizontal_space = Integer.parseInt(temp_coordination);

            temp_coordination = prop.getProperty("card_space_vertical");
            card_vertical_space = Integer.parseInt(temp_coordination);

//            this.last_vartical_coordination=Integer.valueOf(prop.getProperty("last_coordination_vartical"));
            reader.close();
            if (last_horizontal_coordination > 710) {
                last_horizontal_coordination = 30;
                last_vartical_coordination = last_vartical_coordination + card_vertical_space;

            }

        } catch (IOException ex) {
            Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void saveNewcoordinates() throws FileNotFoundException, IOException {

        FileReader reader = new FileReader("src\\Config\\Admin_User_Card.properties");
        Properties prop = new Properties();
        prop.load(reader);

        File file = new File("src\\Config\\Admin_User_Card.properties");
        OutputStream out = new FileOutputStream(file);

        prop.setProperty("last_coordination_vertical", String.valueOf(last_vartical_coordination));
        prop.setProperty("last_coordination_horizontal", String.valueOf(last_horizontal_coordination));

        prop.store(out, null);
        out.close();
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
//        for (int i = 0; i < 20; i++) {
//            try {
//                getCardLayout();
//                System.out.println("Horizontal: " + last_horizontal_coordination);
//                System.out.println("Vertical: " + last_vartical_coordination);
//                // create_card();
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

        this.repaint();
        System.out.println("okayed");
    }//GEN-LAST:event_jLabel1MouseClicked

    public void filter(String role) {

        String role_sql = "select * from user , staff where user.userId=staff.staffId AND position='" + role + "'";
        chage_icon(role);
        try {
            Statement stmt_user = con.createStatement();
            ResultSet res_user = stmt_user.executeQuery(role_sql);
            while (res_user.next()) {
                this.count++;
                create_card(count, res_user.getString(1), res_user.getString(2),res_user.getBoolean(3), res_user.getString(5), res_user.getString(6), res_user.getString(7), res_user.getInt(8), res_user.getString(9));

            }
        } catch (SQLException ex) {
            System.out.println("filter error");

        }
    }

    private void lblAdmin_filterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdmin_filterMouseClicked
        PnlSpace.removeAll();
        last_horizontal_coordination = first_horizontal_coordination;
        last_vartical_coordination = first_vartical_coordination;
        try {
            saveNewcoordinates();
        } catch (IOException ex) {
            Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
        }
        filter("Admin");
    }//GEN-LAST:event_lblAdmin_filterMouseClicked

    private void lblAdmin_filterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdmin_filterMouseEntered
        //jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_filter_40px.png"))); // NOI18N
        lblAdmin_filter.setBackground(new java.awt.Color(120, 120, 120));


    }//GEN-LAST:event_lblAdmin_filterMouseEntered

    private void lblAdmin_filterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdmin_filterMouseExited
        // jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_filter_0px.png"))); // NOI18N
//       jLabel2.setBackground(new java.awt.Color(, 0, 0,100));
    }//GEN-LAST:event_lblAdmin_filterMouseExited

    private void lblInstructor_filterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInstructor_filterMouseClicked
        PnlSpace.removeAll();
        last_horizontal_coordination = first_horizontal_coordination;
        last_vartical_coordination = first_vartical_coordination;
        try {
            saveNewcoordinates();
        } catch (IOException ex) {
            Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
        }
        filter("Instructor");
    }//GEN-LAST:event_lblInstructor_filterMouseClicked

    private void lblInstructor_filterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInstructor_filterMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblInstructor_filterMouseEntered

    private void lblInstructor_filterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInstructor_filterMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblInstructor_filterMouseExited

    private void lblClerk_filterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClerk_filterMouseClicked
        PnlSpace.removeAll();
        last_horizontal_coordination = first_horizontal_coordination;
        last_vartical_coordination = first_vartical_coordination;
        try {
            saveNewcoordinates();
        } catch (IOException ex) {
            Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
        }
        filter("Clerk");
    }//GEN-LAST:event_lblClerk_filterMouseClicked

    private void lblClerk_filterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClerk_filterMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClerk_filterMouseEntered

    private void lblClerk_filterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClerk_filterMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClerk_filterMouseExited

    private void chage_icon(String type) {
        if (type.equals("Admin")) {
            lblAll_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/all.png")));
            lblDirector_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/dir.png")));
            lblInstructor_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/inst.png")));
            lblClerk_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/clerk.png")));
            lblAssistant_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/assistant.png")));
            lblAdmin_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/admin_gray.png")));
        } else if (type.equals("Instructor")) {
            lblAll_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/all.png")));
            lblDirector_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/dir.png")));
            lblInstructor_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/instructor_gray.png")));
            lblClerk_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/clerk.png")));
            lblAssistant_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/assistant.png")));
            lblAdmin_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/admin.png")));

        } else if (type.equals("Clerk")) {
            lblAll_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/all.png")));
            lblDirector_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/dir.png")));
            lblInstructor_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/inst.png")));
            lblClerk_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/clerk_gray.png")));
            lblAssistant_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/assistant.png")));
            lblAdmin_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/admin.png")));

        } else if (type.equals("Assistant")) {
            lblAll_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/all.png")));
            lblDirector_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/dir.png")));
            lblInstructor_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/inst.png")));
            lblClerk_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/clerk.png")));
            lblAssistant_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/Assistant_gray.png")));
            lblAdmin_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/admin.png")));

        } else if (type.equals("Director")) {
            lblAll_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/all.png")));
            lblDirector_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/director_gray.png")));
            lblInstructor_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/inst.png")));
            lblClerk_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/clerk.png")));
            lblAssistant_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/assistant.png")));
            lblAdmin_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/admin.png")));

        } else if (type.equals("All")) {
            lblAll_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/all_gray.png")));
            lblDirector_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/dir.png")));
            lblInstructor_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/inst.png")));
            lblClerk_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/clerk.png")));
            lblAssistant_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/assistant.png")));
            lblAdmin_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtter/admin.png")));

        }
    }


    private void lblDirector_filterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDirector_filterMouseClicked
        PnlSpace.removeAll();
        last_horizontal_coordination = first_horizontal_coordination;
        last_vartical_coordination = first_vartical_coordination;
        try {
            saveNewcoordinates();
        } catch (IOException ex) {
            Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
        }
        filter("Director");

        // NOI18N

    }//GEN-LAST:event_lblDirector_filterMouseClicked

    private void lblDirector_filterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDirector_filterMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDirector_filterMouseEntered

    private void lblDirector_filterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDirector_filterMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDirector_filterMouseExited

    private void lblAssistant_filterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAssistant_filterMouseClicked
        PnlSpace.removeAll();
        last_horizontal_coordination = first_horizontal_coordination;
        last_vartical_coordination = first_vartical_coordination;
        try {
            saveNewcoordinates();
        } catch (IOException ex) {
            Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
        }
        filter("Assistant");
    }//GEN-LAST:event_lblAssistant_filterMouseClicked

    private void lblAssistant_filterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAssistant_filterMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAssistant_filterMouseEntered

    private void lblAssistant_filterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAssistant_filterMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAssistant_filterMouseExited

    private void lblAll_filterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAll_filterMouseClicked
        PnlSpace.removeAll();
        chage_icon("All");
        last_horizontal_coordination = first_horizontal_coordination;
        last_vartical_coordination = first_vartical_coordination;
        try {
            saveNewcoordinates();
        } catch (IOException ex) {
            Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql_user = "select * from user , staff where user.userId=staff.staffId";

        try {
            Statement stmt_user = con.createStatement();
            ResultSet res_user = stmt_user.executeQuery(sql_user);
            while (res_user.next()) {
                this.count++;

                User_Count usCount = new User_Count();

                create_card(count, res_user.getString(1), res_user.getString(2),res_user.getBoolean(3), res_user.getString(5), res_user.getString(6), res_user.getString(7), res_user.getInt(8), res_user.getString(9));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_lblAll_filterMouseClicked

    private void lblAll_filterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAll_filterMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAll_filterMouseEntered

    private void lblAll_filterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAll_filterMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAll_filterMouseExited

    private void create_card() {

//        javax.swing.JLabel jLabel123 = new javax.swing.JLabel();
//        jLabel123.setBackground(new java.awt.Color(102, 102, 102));
//        jLabel123.setText("jLabe8");
//        //jLabel123.setOpaque(true);
//        jPanel1.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(last_horizontal_coordination, last_vartical_coordination, 320, 160));
        //String lbl=String.valueOf(last_horizontal_coordination+last_vartical_coordination);
    }

    private void create_card(int count, String id, String password,Boolean ava, String name, String email, String position, int contact, String nic) {
        System.out.println(count + " " + id + " " + name + " " + ava + " " + position + " " + contact + " " + email + " " + nic + " ");
        try {
            getCardLayout();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
        }

        ////////////////////////////////////////////////////////////////////////////////////////
        JLabel lblAvatarME = new JLabel();
        JPanel pnlCard = new JPanel();
        JLabel lblIdME = new JLabel();
        JLabel lblNameME = new JLabel();
        JLabel lblEmailME = new JLabel();
        JLabel lblContactME = new JLabel();
        JLabel lblPwME = new JLabel();

        lblNameME.setText(name);
        lblNameME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNameME.setForeground(new java.awt.Color(255, 255, 255));

        lblIdME.setText(id);
        lblIdME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdME.setForeground(new java.awt.Color(255, 255, 255));

        lblPwME.setText(password);
        lblPwME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPwME.setForeground(new java.awt.Color(255, 255, 255));

        lblEmailME.setText(email);
        lblEmailME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmailME.setForeground(new java.awt.Color(255, 255, 255));

        lblContactME.setText(String.valueOf(contact));
        lblContactME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContactME.setForeground(new java.awt.Color(255, 255, 255));

         pnlCard = new javax.swing.JPanel();
         if (ava==true)
        pnlCard.setBackground(new java.awt.Color(51,51,51));
         else
        pnlCard.setBackground(new java.awt.Color(255,153,153));
         
        pnlCard.setPreferredSize(new java.awt.Dimension(320, 160));
        pnlCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setViewportView(PnlSpace);

// Code of sub-components and layout - not shown here
        PnlSpace.add(pnlCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        if (position.equals("Admin")) {
            lblAvatarME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Microsoft_Admin_50px_1.png")));
        } else if (position.equals("Assistant")) {
            lblAvatarME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_online_support_50px.png")));
        } else if (position.equals("Instructor")) {
            lblAvatarME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_coach_50px.png")));
        } else if (position.equals("Clerk")) {
            lblAvatarME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_front_desk_50px_2.png")));
        } else if (position.equals("Director")) {
            lblAvatarME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_administrator_male_50px.png")));
        }

        pnlCard.add(lblAvatarME, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 120));

        pnlCard.add(lblIdME, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 200, -1));

        pnlCard.add(lblNameME, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 150, -1));

        pnlCard.add(lblContactME, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, -1));

        pnlCard.add(lblEmailME, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 200, -1));

        pnlCard.add(lblPwME, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 150, -1));

        ////////////////////////////////////////////////////////////////////////////////////////
        if (count == 1) {
            PnlSpace.add(pnlCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(first_horizontal_coordination, first_vartical_coordination, 320, 160));
            System.out.println("fitst gone");
            last_horizontal_coordination = first_horizontal_coordination + card_horizontal_space;
            last_horizontal_coordination = first_horizontal_coordination + card_horizontal_space;
            last_vartical_coordination = first_vartical_coordination;
        } else {
            PnlSpace.add(pnlCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(last_horizontal_coordination, last_vartical_coordination, 320, 160));
            last_horizontal_coordination = last_horizontal_coordination + card_horizontal_space;
        }

        // pnlCard.setBackground(new java.awt.Color(0, 0, 0));
//        pnlCard.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 120));
        System.out.println(last_horizontal_coordination + "  " + last_vartical_coordination);

        try {
            saveNewcoordinates();

            //String lbl=String.valueOf(last_horizontal_coordination+last_vartical_coordination);
        } catch (IOException ex) {
            Logger.getLogger(Admin_Dash.class.getName()).log(Level.SEVERE, null, ex);
        }
//         

        ////////////////////////////////////////////////////////////
       
        pnlCard.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
                    openMenu(id);
                }
            }
        });
        
        
//        
    }
    private void openMenu(String id){
        User_customize uc=new User_customize();
        uc.setId(id);
       
        uc.loguserdata();
        uc.setVisible(true);
        this.dispose();
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlSpace;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAdmin_filter;
    private javax.swing.JLabel lblAll_filter;
    private javax.swing.JLabel lblAssistant_filter;
    private javax.swing.JLabel lblBackgrround;
    private javax.swing.JLabel lblClerk_filter;
    private javax.swing.JLabel lblDirector_filter;
    private javax.swing.JLabel lblInstructor_filter;
    // End of variables declaration//GEN-END:variables
}
