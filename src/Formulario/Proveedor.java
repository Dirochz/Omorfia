package Formulario;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableModel;
import omorfia.Conexion;

public final class Proveedor extends javax.swing.JFrame {   
    DefaultTableModel modelo;
    int id;
    public Proveedor() {
        initComponents();
        setTitle("Proveedor");
        this.setLocationRelativeTo(null); // centra la interfaz cuando se ejecuta
        tuproo();
    }
    
    @Override //hace que compile esto primero 
    public Image getIconImage(){ //que la variable imagen obtendra lo que este en IconImage
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("iconos/logo.png"));//hace que el icono de la interfaz cambie al lo que agregamos en iconImage
        return retValue;
    }
    
    void Mod(){
        id = Integer.parseInt(this.Po.getValueAt(Po.getSelectedRow(),0).toString());
        String emp = Po.getValueAt(Po.getSelectedRow(),1).toString();
        String co = Po.getValueAt(Po.getSelectedRow(),2).toString();   
        String tel = Po.getValueAt(Po.getSelectedRow(),3).toString();
        try{
           Connection cn = Conexion.conectar();
           PreparedStatement pst = cn.prepareStatement("UPDATE proveedores SET "
                   + "Empresa='"+emp+"',Correo='"+co+"',Telefono='"+tel+"' WHERE ID = '"+id+"'");
           pst.executeUpdate();           
        }catch(SQLException e){
        }
    }
    void tuproo(){        
        modelo = (DefaultTableModel)Po.getModel();
        Po.setModel(modelo);
        Object[] prove = new Object[4];
        try{       
        Connection cn = Conexion.conectar();//se conecta a la base de datos    
        PreparedStatement pst = cn.prepareStatement("select ID,Empresa,Correo,Telefono from proveedores");// selecciona el tipo y checa si el usuario y la contra es la misma que la interfaz            
        ResultSet rs = pst.executeQuery();// Para consultas con Query, el tipo de retorno es tabla bidimensional       
        while(rs.next()){// Devuelve verdadero, significa que hay datos para leer
            
            prove[0] = rs.getInt("ID"); 
            prove[1] = rs.getString("Empresa");
            prove[2] = rs.getString("Correo");
            prove[3] = rs.getString("Telefono");
            modelo.addRow(prove);
        }
        Po.setModel(modelo);    
        }catch(Exception e){           
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bo_re = new javax.swing.JButton();
        bo_agpo = new javax.swing.JButton();
        bo_elipo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Po = new javax.swing.JTable();
        mod = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(229, 213, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bo_re.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        bo_re.setForeground(new java.awt.Color(0, 0, 0));
        bo_re.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/re.png"))); // NOI18N
        bo_re.setText("Regresar");
        bo_re.setBorder(null);
        bo_re.setBorderPainted(false);
        bo_re.setContentAreaFilled(false);
        bo_re.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_re.setFocusPainted(false);
        bo_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_reActionPerformed(evt);
            }
        });
        jPanel1.add(bo_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bo_agpo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        bo_agpo.setForeground(new java.awt.Color(0, 0, 0));
        bo_agpo.setText("Agregar");
        bo_agpo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_agpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_agpoActionPerformed(evt);
            }
        });
        jPanel1.add(bo_agpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, 30));

        bo_elipo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        bo_elipo.setForeground(new java.awt.Color(0, 0, 0));
        bo_elipo.setText("Eliminar");
        bo_elipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_elipo.setFocusPainted(false);
        bo_elipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_elipoActionPerformed(evt);
            }
        });
        jPanel1.add(bo_elipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 120, 30));

        Po.setBackground(new java.awt.Color(0, 153, 153));
        Po.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Po.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Empresa", "Correo", "Numero"
            }
        ));
        Po.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Po.setRowHeight(30);
        jScrollPane1.setViewportView(Po);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 780, 350));

        mod.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        mod.setForeground(new java.awt.Color(0, 0, 0));
        mod.setText("Modificar");
        mod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        jPanel1.add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m3.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, -30, 150, 180));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m2.png"))); // NOI18N
        jPanel1.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 290, 210));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/me1.png"))); // NOI18N
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 190, 170));

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Proveedores.png"))); // NOI18N
        jPanel1.add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bo_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_reActionPerformed
        Menu me = new Menu(); // declarar y llamar a la interfaz que quieres ir
        me.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz
    }//GEN-LAST:event_bo_reActionPerformed

    private void bo_agpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_agpoActionPerformed
        Agpro ap = new Agpro(); // declarar y llamar a la interfaz que quieres ir
        ap.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz
    }//GEN-LAST:event_bo_agpoActionPerformed

    private void bo_elipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_elipoActionPerformed
        int fila = Po.getSelectedRow(),resp;
        String id = Po.getValueAt(fila,0).toString();
        try{
            if(fila<0){
                JOptionPane.showMessageDialog(null,"Seleccione un Proveedor");
            }
            else{ 
                ImageIcon icon = new ImageIcon("src\\iconos\\Eliucon.png");
                resp = JOptionPane.showConfirmDialog(null,"¿Seguro que quiere eliminar este Proveedor?","Eliminar Proveedor",YES_NO_OPTION,INFORMATION_MESSAGE,icon);
                if(resp==0){
                    Connection cn = Conexion.conectar();//se conecta a la base de datos
                    // selecciona el tipo y checa si el usuario y la contra es la misma que la interfaz
                    PreparedStatement pst = cn.prepareStatement("delete from proveedores where Id='"+id+"'");             
                    pst.executeUpdate();  
                    Proveedor po = new Proveedor(); // declarar y llamar a la interfaz que quieres ir
                    po.setVisible(true); // te mostrara lo que declarate en la variable 
                    this.setVisible(false); //te oculta esta interfaz    
                }
            }
        }catch(SQLException e){           
        }
    }//GEN-LAST:event_bo_elipoActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        Mod();
        Proveedor po = new Proveedor(); // declarar y llamar a la interfaz que quieres ir
        po.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz  
    }//GEN-LAST:event_modActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JTable Po;
    private javax.swing.JButton bo_agpo;
    private javax.swing.JButton bo_elipo;
    private javax.swing.JButton bo_re;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mod;
    // End of variables declaration//GEN-END:variables

    void setid_pro(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setemp(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
