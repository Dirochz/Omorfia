package Formulario;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import omorfia.Conexion;

public final class imagen extends javax.swing.JFrame {

  int ida;
  
  public imagen() throws IOException {
    initComponents();
    ida = Articulo.id_ar;
    this.setLocationRelativeTo(null);
    img();
  }
  void img() throws IOException{
    ImageIcon foto;
    InputStream is; 
    try{
      Connection cn = Conexion.conectar();
      PreparedStatement pst = cn.prepareStatement("SELECT img from img where Id='"+ida+"'");             
      ResultSet rs = pst.executeQuery();
      while(rs.next()){
        is = rs.getBinaryStream("img");
        BufferedImage bi = ImageIO.read(is);
        foto = new ImageIcon (bi);
        Image img = foto.getImage();
        Image newimg = img.getScaledInstance(410,410, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newicon = new ImageIcon (newimg);
        lb_foto.setIcon(newicon);
      }
    }catch(SQLException e){           
    }
  }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_foto = new javax.swing.JLabel();
        reg = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(229, 213, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_foto.setRequestFocusEnabled(false);
        jPanel1.add(lb_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 410, 410));

        reg.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        reg.setText("Regresar");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        jPanel1.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m3.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -30, 140, 180));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m2.png"))); // NOI18N
        jPanel1.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 290, 210));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/me1.png"))); // NOI18N
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 190, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
    this.setVisible(false);
  }//GEN-LAST:event_regActionPerformed

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
      java.util.logging.Logger.getLogger(imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          new imagen().setVisible(true);
        } catch (IOException ex) {
          Logger.getLogger(imagen.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_foto;
    private javax.swing.JButton reg;
    // End of variables declaration//GEN-END:variables
}
