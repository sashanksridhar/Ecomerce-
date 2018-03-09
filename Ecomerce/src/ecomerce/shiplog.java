/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ecomerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sashank
 */
public class shiplog extends javax.swing.JFrame {
int sid;
String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "project";
        String pass = "password";
        
    /** Creates new form shiplog */
    public shiplog(int s) {
        sid = s;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        deliveries = new java.awt.List();
        deliver = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        order = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        accept = new javax.swing.JButton();
        view = new javax.swing.JButton();
        orders_list = new java.awt.List();
        order_details = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deliver.setText("View Deliveries");
        deliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliverActionPerformed(evt);
            }
        });

        customer.setText("View Customer details");
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });

        order.setText("View Order Details");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(deliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deliver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(deliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(deliver)
                        .addGap(18, 18, 18)
                        .addComponent(customer)
                        .addGap(18, 18, 18)
                        .addComponent(order)))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Deliveries", jPanel1);

        accept.setText("Accept Order");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        view.setText("View Orders");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        order_details.setText("Order Details");
        order_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_detailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(orders_list, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order_details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orders_list, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(view)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(order_details)
                        .addGap(18, 18, 18)
                        .addComponent(accept)))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Orders", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliverActionPerformed
        // TODO add your handling code here:
        Connection con=null;
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

            //Reference to connection interface
            con = DriverManager.getConnection(url,user,pass);
            String sql = "SELECT c_id,order_id from ships where ship_id ="+sid;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                int c = rs.getInt("c_id");
                int o = rs.getInt("order_id");
                deliveries.add(c+" "+o);
                
                
            }
            con.close();
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }   
    }//GEN-LAST:event_deliverActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        // TODO add your handling code here:
        String s = deliveries.getSelectedItem();
        String []x = s.split(" ");
        int customer = Integer.parseInt(x[0]);
        Connection con=null;
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

            //Reference to connection interface
            con = DriverManager.getConnection(url,user,pass);
            String sql = "SELECT first_name,last_name,address,email from customer where c_id ="+customer;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String fn = rs.getString("first_name");
            String ln = rs.getString("last_name");
            String addr = rs.getString("address");
            String em = rs.getString("email");
            String msg = "First Name :"+fn+"\nLast name :"+ln+"\naddress :"+addr+"\nMail id :"+em;
            JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,msg);
                
                
                
            
            con.close();
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }   
    }//GEN-LAST:event_customerActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
        String s = deliveries.getSelectedItem();
        String []x = s.split(" ");
        int order = Integer.parseInt(x[1]);
        Connection con=null;
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

            //Reference to connection interface
            con = DriverManager.getConnection(url,user,pass);
            String sql = "SELECT count(*) from order_placed where order_id ="+order;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            int count = rs.getInt("count(*)");
            sql = "SELECT item_code,quantity,price,total from order_placed where order_id ="+order;
            st = con.createStatement();
            rs = st.executeQuery(sql);
            int []item_code = new int[count];
            int []quantity = new int[count];
            int []price = new int[count];
            int []total = new int[count];
            String []name = new String[count];
            String []type = new String[count];
            int i = 0;
            while(rs.next())
            {
            item_code[i] = rs.getInt("item_code");
            quantity[i] = rs.getInt("quantity");
            price[i] = rs.getInt("price");
            total[i] = rs.getInt("total");
            String sql1 = "select name,type from items where item_code = "+item_code[i];
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery(sql1);
            rs1.next();
            name[i] = rs1.getString("name");
            type[i] = rs1.getString("type");
            i++;
            }    
            String msg = null;
            for(int j =0;j<i;j++)
            { if(msg!=null)
            { msg = msg+"\n"+(j+1)+".\nName :"+name[j]+"\nType :"+type[j]+"\nQuantity :"+quantity[j]+"\nPrice :"+price[j]+"\nTotal :"+total[j];
            }
            else
            {
             msg = (j+1)+".\nName :"+name[j]+"\nType :"+type[j]+"\nQuantity :"+quantity[j]+"\nPrice :"+price[j]+"\nTotal :"+total[j];   
            }
            }
            JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,msg);    
                
            
            con.close();
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }   
    }//GEN-LAST:event_orderActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        Connection con=null;
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

            //Reference to connection interface
            con = DriverManager.getConnection(url,user,pass);
            String sql = "SELECT distinct(order_id) from order_placed where order_id not in(select order_id from ships)";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                
                int o = rs.getInt("order_id");
                orders_list.add(Integer.toString(o));
                
                
            }
            con.close();
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }   
    }//GEN-LAST:event_viewActionPerformed

    private void order_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_detailsActionPerformed
        // TODO add your handling code here:
        String s = orders_list.getSelectedItem();
        
        int order = Integer.parseInt(s);
        Connection con=null;
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

            //Reference to connection interface
            con = DriverManager.getConnection(url,user,pass);
            String sql = "SELECT count(*) from order_placed where order_id ="+order;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            int count = rs.getInt("count(*)");
            sql = "SELECT item_code,quantity,price,total from order_placed where order_id ="+order;
            st = con.createStatement();
            rs = st.executeQuery(sql);
            int []item_code = new int[count];
            int []quantity = new int[count];
            int []price = new int[count];
            int []total = new int[count];
            String []name = new String[count];
            String []type = new String[count];
            int i = 0;
            while(rs.next())
            {
            item_code[i] = rs.getInt("item_code");
            quantity[i] = rs.getInt("quantity");
            price[i] = rs.getInt("price");
            total[i] = rs.getInt("total");
            String sql1 = "select name,type from items where item_code = "+item_code[i];
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery(sql1);
            rs1.next();
            name[i] = rs1.getString("name");
            type[i] = rs1.getString("type");
            i++;
            }    
            String msg = null;
            for(int j =0;j<i;j++)
            { if(msg!=null)
            { msg = msg+"\n"+(j+1)+".\nName :"+name[j]+"\nType :"+type[j]+"\nQuantity :"+quantity[j]+"\nPrice :"+price[j]+"\nTotal :"+total[j];
            }
            else
            {
             msg = (j+1)+".\nName :"+name[j]+"\nType :"+type[j]+"\nQuantity :"+quantity[j]+"\nPrice :"+price[j]+"\nTotal :"+total[j];   
            }
            }
            JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,msg);    
                
            
            con.close();
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }   
    }//GEN-LAST:event_order_detailsActionPerformed

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        // TODO add your handling code here:
        String s = orders_list.getSelectedItem();
        
        int order = Integer.parseInt(s);
        Connection con=null;
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

            //Reference to connection interface
            con = DriverManager.getConnection(url,user,pass);
            String sql = "SELECT cart_id from myorder where order_id ="+order;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            int cart = rs.getInt("cart_id");
            int customer = cart - 400;        
            sql = "insert into ships values ("+sid+","+customer+","+order+")";
            int m = st.executeUpdate(sql);
            if(m==1)
            {
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,"Order is accepted");
            }
                
            
            con.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }   
    }//GEN-LAST:event_acceptActionPerformed

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
            java.util.logging.Logger.getLogger(shiplog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shiplog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shiplog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shiplog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shiplog(706).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JButton customer;
    private javax.swing.JButton deliver;
    private java.awt.List deliveries;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton order;
    private javax.swing.JButton order_details;
    private java.awt.List orders_list;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables

}
