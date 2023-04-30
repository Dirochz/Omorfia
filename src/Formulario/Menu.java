package Formulario;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import omorfia.Conexion;

public class Menu extends javax.swing.JFrame {
    String user, Nombre, Appa, Apma; //declara las variables
    
    public Menu() {
        initComponents();
        user = Login.user;//guarda en user lo que se ingreso en user
        setTitle("Menu Admin"); //se pone el titulo que escribiste entre parentesis
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
        bo_reg = new javax.swing.JButton();
        Bo_Usu = new javax.swing.JButton();
        Bo_Articulo = new javax.swing.JButton();
        Bo_Inv = new javax.swing.JButton();
        Bo_prov = new javax.swing.JButton();
        Bo_Tic = new javax.swing.JButton();
        txt_pro = new javax.swing.JLabel();
        txt_Tck = new javax.swing.JLabel();
        txt_Inv = new javax.swing.JLabel();
        txt_Art = new javax.swing.JLabel();
        txt_Usu = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(229, 213, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bo_reg.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        bo_reg.setForeground(new java.awt.Color(0, 0, 0));
        bo_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/re.png"))); // NOI18N
        bo_reg.setText("Salir");
        bo_reg.setBorder(null);
        bo_reg.setBorderPainted(false);
        bo_reg.setContentAreaFilled(false);
        bo_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_reg.setFocusPainted(false);
        bo_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_regActionPerformed(evt);
            }
        });
        jPanel1.add(bo_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Bo_Usu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        Bo_Usu.setBorder(null);
        Bo_Usu.setBorderPainted(false);
        Bo_Usu.setContentAreaFilled(false);
        Bo_Usu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bo_Usu.setFocusPainted(false);
        Bo_Usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bo_UsuActionPerformed(evt);
            }
        });
        jPanel1.add(Bo_Usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 120));

        Bo_Articulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Articulos.png"))); // NOI18N
        Bo_Articulo.setBorder(null);
        Bo_Articulo.setBorderPainted(false);
        Bo_Articulo.setContentAreaFilled(false);
        Bo_Articulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bo_Articulo.setFocusPainted(false);
        Bo_Articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bo_ArticuloActionPerformed(evt);
            }
        });
        jPanel1.add(Bo_Articulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 100, 120));

        Bo_Inv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reportes.png"))); // NOI18N
        Bo_Inv.setBorder(null);
        Bo_Inv.setBorderPainted(false);
        Bo_Inv.setContentAreaFilled(false);
        Bo_Inv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bo_Inv.setFocusPainted(false);
        Bo_Inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bo_InvActionPerformed(evt);
            }
        });
        jPanel1.add(Bo_Inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 160, 120));

        Bo_prov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Proveedores.png"))); // NOI18N
        Bo_prov.setBorder(null);
        Bo_prov.setBorderPainted(false);
        Bo_prov.setContentAreaFilled(false);
        Bo_prov.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bo_prov.setFocusPainted(false);
        Bo_prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bo_provActionPerformed(evt);
            }
        });
        jPanel1.add(Bo_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        Bo_Tic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ticket.png"))); // NOI18N
        Bo_Tic.setBorder(null);
        Bo_Tic.setBorderPainted(false);
        Bo_Tic.setContentAreaFilled(false);
        Bo_Tic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bo_Tic.setFocusPainted(false);
        Bo_Tic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bo_TicActionPerformed(evt);
            }
        });
        jPanel1.add(Bo_Tic, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 120, 120));

        txt_pro.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        txt_pro.setForeground(new java.awt.Color(0, 0, 0));
        txt_pro.setText("Proveedor");
        jPanel1.add(txt_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        txt_Tck.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        txt_Tck.setForeground(new java.awt.Color(0, 0, 0));
        txt_Tck.setText("Compra");
        jPanel1.add(txt_Tck, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, -1, -1));

        txt_Inv.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        txt_Inv.setForeground(new java.awt.Color(0, 0, 0));
        txt_Inv.setText("Reportes");
        jPanel1.add(txt_Inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, -1, -1));

        txt_Art.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        txt_Art.setForeground(new java.awt.Color(0, 0, 0));
        txt_Art.setText("Articulo");
        jPanel1.add(txt_Art, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        txt_Usu.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        txt_Usu.setForeground(new java.awt.Color(0, 0, 0));
        txt_Usu.setText("Usuario");
        jPanel1.add(txt_Usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 100, -1));

        usuario.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 790, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m3.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, -30, 150, 180));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/me1.png"))); // NOI18N
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 190, 170));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m2.png"))); // NOI18N
        jPanel1.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 290, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bo_UsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bo_UsuActionPerformed
        InUsu Iu = new InUsu(); // declarar y llamar a la interfaz que quieres ir
        Iu.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz    
    }//GEN-LAST:event_Bo_UsuActionPerformed

    private void Bo_provActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bo_provActionPerformed
        Proveedor po = new Proveedor(); // declarar y llamar a la interfaz que quieres ir
        po.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz    
    }//GEN-LAST:event_Bo_provActionPerformed

    private void Bo_ArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bo_ArticuloActionPerformed
        Articulo ar = new Articulo(); // declarar y llamar a la interfaz que quieres ir
        ar.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz
    }//GEN-LAST:event_Bo_ArticuloActionPerformed

    private void Bo_InvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bo_InvActionPerformed
        Inventario i = new Inventario(); // declarar y llamar a la interfaz que quieres ir
        i.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz
    }//GEN-LAST:event_Bo_InvActionPerformed

    private void Bo_TicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bo_TicActionPerformed
        Ticket ti = new Ticket(); // declarar y llamar a la interfaz que quieres ir
        ti.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz
    }//GEN-LAST:event_Bo_TicActionPerformed

    private void bo_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_regActionPerformed
        Login l = new Login(); // declarar y llamar a la interfaz que quieres ir
        l.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz
    }//GEN-LAST:event_bo_regActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bo_Articulo;
    private javax.swing.JButton Bo_Inv;
    private javax.swing.JButton Bo_Tic;
    private javax.swing.JButton Bo_Usu;
    private javax.swing.JButton Bo_prov;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JButton bo_reg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_Art;
    private javax.swing.JLabel txt_Inv;
    private javax.swing.JLabel txt_Tck;
    private javax.swing.JLabel txt_Usu;
    private javax.swing.JLabel txt_pro;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
