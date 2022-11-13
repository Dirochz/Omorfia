
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


public final class InUsu extends javax.swing.JFrame {
    int id;
    DefaultTableModel modelo;   
    public InUsu() {
        initComponents(); 
        setTitle("Usuario");//es el titulo que tendra la interfaz
        this.setLocationRelativeTo(null); // centra la interfaz cuando se ejecuta
        tusuario();
    }
        
    void Mod(){
        id = Integer.parseInt(this.us.getValueAt(us.getSelectedRow(),0).toString());
        String tip = us.getValueAt(us.getSelectedRow(),1).toString();
        String nom = us.getValueAt(us.getSelectedRow(),2).toString();
        String ap = us.getValueAt(us.getSelectedRow(),3).toString();
        String am = us.getValueAt(us.getSelectedRow(),4).toString();
        String co = us.getValueAt(us.getSelectedRow(),5).toString();   
        String con = us.getValueAt(us.getSelectedRow(),6).toString();
        try{
           Connection cn = Conexion.conectar();
           PreparedStatement pst = cn.prepareStatement("UPDATE usuario SET "
                   + "Tipo='"+tip+"',Nombre='"+nom+"',ApellidoPa='"+ap+"',ApellidoMa='"+am+""
                           + "',Correo='"+co+"',contraseña='"+con+"' WHERE ID = '"+id+"'");
           pst.executeUpdate();           
        }catch(SQLException e){
        }
    } 
    
    void tusuario(){
    modelo = (DefaultTableModel)us.getModel();
    us.setModel(modelo);
    Object[] usuario = new Object[7];
    try{
    Connection cn = Conexion.conectar();//se conecta a la base de datos
    PreparedStatement pst = cn.prepareStatement("select ID,Tipo,Nombre,ApellidoPa,ApellidoMa,correo,contraseña from usuario");// selecciona el tipo y checa si el usuario y la contra es la misma que la interfaz
    ResultSet rs = pst.executeQuery();// Para consultas con Query, el tipo de retorno es tabla bidimensional
    while(rs.next()){// Devuelve verdadero, significa que hay datos para leer

        usuario[0] = rs.getInt("ID");
        usuario[1] = rs.getString("Tipo");
        usuario[2] = rs.getString("Nombre");
        usuario[3] = rs.getString("ApellidoPa");
        usuario[4] = rs.getString("ApellidoMa");
        usuario[5] = rs.getString("correo");
        usuario[6] = rs.getString("contraseña");
        modelo.addRow(usuario);
    }
    us.setModel(modelo);
    }catch(Exception e){
    }
}
    @Override //hace que compile esto primero 
    public Image getIconImage(){ //que la variable imagen obtendra lo que este en IconImage
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("iconos/logo.png"));//hace que el icono de la interfaz cambie al lo que agregamos en iconImage
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bo_Agu = new javax.swing.JButton();
        Bo_Eli = new javax.swing.JButton();
        bo_re = new javax.swing.JButton();
        tus = new javax.swing.JScrollPane();
        us = new javax.swing.JTable();
        bo_mod = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(229, 213, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bo_Agu.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Bo_Agu.setText("Agregar");
        Bo_Agu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bo_Agu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bo_AguActionPerformed(evt);
            }
        });
        jPanel1.add(Bo_Agu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 100, -1));

        Bo_Eli.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Bo_Eli.setText("Eliminar");
        Bo_Eli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bo_Eli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bo_EliActionPerformed(evt);
            }
        });
        jPanel1.add(Bo_Eli, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 100, 30));

        bo_re.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
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

        us.setBackground(new java.awt.Color(0, 153, 153));
        us.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        us.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Nombre", "Apellido Paterno", "Apellido Materno", "Correo", "Contraseña"
            }
        ));
        us.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        us.setRowHeight(30);
        us.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usKeyReleased(evt);
            }
        });
        tus.setViewportView(us);

        jPanel1.add(tus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 740, 360));

        bo_mod.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        bo_mod.setText("Modificar");
        bo_mod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_modActionPerformed(evt);
            }
        });
        jPanel1.add(bo_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 100, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 120, 120));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m2.png"))); // NOI18N
        jPanel1.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 290, 210));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/me1.png"))); // NOI18N
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 190, 170));

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m3.png"))); // NOI18N
        jPanel1.add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, -30, 150, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bo_AguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bo_AguActionPerformed
        Usuario u = new Usuario(); // declarar y llamar a la interfaz que quieres ir
        u.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz      
    }//GEN-LAST:event_Bo_AguActionPerformed

    private void bo_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_reActionPerformed
        Menu mu = new Menu(); // declarar y llamar a la interfaz que quieres ir
        mu.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz    
    }//GEN-LAST:event_bo_reActionPerformed

    private void Bo_EliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bo_EliActionPerformed
        int fila = us.getSelectedRow(),resp;
        String id = us.getValueAt(fila,0).toString();
        try{
            if(fila<0){
                JOptionPane.showMessageDialog(null,"Seleccione un Proveedor");
            }
            else{ 
                ImageIcon icon = new ImageIcon("src\\iconos\\Eliucon.png");
                resp = JOptionPane.showConfirmDialog(null,"¿Seguro que quiere eliminar este usuario?","Eliminar Usuario",YES_NO_OPTION,INFORMATION_MESSAGE,icon);
                if(resp==0){
                    Connection cn = Conexion.conectar();//se conecta a la base de datos
                    // selecciona el tipo y checa si el usuario y la contra es la misma que la interfaz
                    PreparedStatement pst = cn.prepareStatement("delete from usuario where Id='"+id+"'");             
                    pst.executeUpdate();  
                    InUsu po = new InUsu(); // declarar y llamar a la interfaz que quieres ir
                    po.setVisible(true); // te mostrara lo que declarate en la variable 
                    this.setVisible(false); //te oculta esta interfaz    
                }
            }
        }catch(SQLException e){           
        }
    }//GEN-LAST:event_Bo_EliActionPerformed

    private void usKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usKeyReleased

    }//GEN-LAST:event_usKeyReleased

    private void bo_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_modActionPerformed
       Mod();
       InUsu po = new InUsu(); 
       po.setVisible(true); 
       this.setVisible(false);
    }//GEN-LAST:event_bo_modActionPerformed

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
            java.util.logging.Logger.getLogger(InUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InUsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bo_Agu;
    private javax.swing.JButton Bo_Eli;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JButton bo_mod;
    private javax.swing.JButton bo_re;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane tus;
    private javax.swing.JTable us;
    // End of variables declaration//GEN-END:variables
}
