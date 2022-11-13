package Formulario;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import omorfia.Conexion;

public class MenuEm extends javax.swing.JFrame {
    String user, Nombre, Appa, Apma; //declara las variables
    
    public MenuEm() {
        initComponents();
        user = Login.user;//guarda en user lo que se ingreso en user
        setTitle("Menu Empleado");
        this.setLocationRelativeTo(null); // centra la interfaz cuando se ejecuta
        
        try{//Ejecuta las excepciones
            Connection cn = Conexion.conectar();//conecta con la base de datos
            PreparedStatement pst = cn.prepareStatement("Select Nombre, ApellidoPa, ApellidoMa "
                    + "from usuario where Nombre ='"+user+ "'");
            //seleciona lo que estan en  las columnas que dijiste en la tabla usuario y verifica si en la columna nombre es la 
            //misma que el user
            ResultSet rs = pst.executeQuery();//ejecute lo que pediste 
            if(rs.next()){ //si cumple la condicion ejecuta lo siguiente
                Nombre = rs.getString("Nombre"); //guarda en nombre lo que se consiguio en nombre
                Appa = rs.getString("ApellidoPa"); //se guarda en Appa lo que se encuentra en la columna apellidopa
                Apma = rs.getString("ApellidoMa"); //se guarda en Apma lo que se encuentra en la columna apellidoma
                usuario.setText("Bienvenid@ "+Nombre+" "+Appa+" "+Apma);//lo que el texto usuario va imprimir bienvenido y lo que esta guardado en las variables de string                
            }
        }catch (SQLException e){           
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
        bo_re = new javax.swing.JButton();
        bo_tic = new javax.swing.JButton();
        bo_art = new javax.swing.JButton();
        Art1 = new javax.swing.JLabel();
        Art = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(229, 213, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bo_re.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        bo_re.setForeground(new java.awt.Color(0, 0, 0));
        bo_re.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/re.png"))); // NOI18N
        bo_re.setText("Regresar");
        bo_re.setBorder(null);
        bo_re.setBorderPainted(false);
        bo_re.setContentAreaFilled(false);
        bo_re.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bo_re.setFocusPainted(false);
        bo_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_reActionPerformed(evt);
            }
        });
        jPanel1.add(bo_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bo_tic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ticket.png"))); // NOI18N
        bo_tic.setBorder(null);
        bo_tic.setBorderPainted(false);
        bo_tic.setContentAreaFilled(false);
        bo_tic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bo_tic.setFocusPainted(false);
        bo_tic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_ticActionPerformed(evt);
            }
        });
        jPanel1.add(bo_tic, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        bo_art.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Articulos.png"))); // NOI18N
        bo_art.setBorder(null);
        bo_art.setBorderPainted(false);
        bo_art.setContentAreaFilled(false);
        bo_art.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bo_art.setFocusPainted(false);
        bo_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_artActionPerformed(evt);
            }
        });
        jPanel1.add(bo_art, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        Art1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Art1.setForeground(new java.awt.Color(0, 0, 0));
        Art1.setText("Ticket");
        jPanel1.add(Art1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        Art.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Art.setForeground(new java.awt.Color(0, 0, 0));
        Art.setText("Articulos");
        jPanel1.add(Art, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        usuario.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 790, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m3.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, -30, 150, 180));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m2.png"))); // NOI18N
        jPanel1.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 290, 210));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/me1.png"))); // NOI18N
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 190, 170));

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

    private void bo_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_artActionPerformed
        Articulo ar = new Articulo(); // declarar y llamar a la interfaz que quieres ir
        ar.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz
    }//GEN-LAST:event_bo_artActionPerformed

    private void bo_ticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_ticActionPerformed
        Ticket ti = new Ticket(); // declarar y llamar a la interfaz que quieres ir
        ti.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz
    }//GEN-LAST:event_bo_ticActionPerformed

    private void bo_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_reActionPerformed
        Login l = new Login(); // declarar y llamar a la interfaz que quieres ir
        l.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz
    }//GEN-LAST:event_bo_reActionPerformed

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
            java.util.logging.Logger.getLogger(MenuEm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Art;
    private javax.swing.JLabel Art1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JButton bo_art;
    private javax.swing.JButton bo_re;
    private javax.swing.JButton bo_tic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
