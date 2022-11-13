package Formulario;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*; //Libreria
import javax.swing.ImageIcon;
import omorfia.Conexion;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;

public class Usuario extends javax.swing.JFrame {
    int resp;//declara la variable
    public Usuario() {
        initComponents();
        setTitle("Agregar Usuario"); //se pone un titulo en la Interfaz
        this.setLocationRelativeTo(null); // centra la interfaz cuando se ejecuta
    }
    
    @Override //hace que compile esto primero 
    public Image getIconImage(){ //que la variable imagen obtendra lo que este en IconImage
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("iconos/logo.png"));//hace que el icono de la interfaz cambie al lo que agregamos en iconImage
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        ApMa = new javax.swing.JLabel();
        Contra = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        ApPa = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        txt_Appa = new javax.swing.JTextField();
        txt_Apma = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        bo_reg = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        box_tipo = new javax.swing.JComboBox<>();
        txt_contra = new javax.swing.JPasswordField();
        Img_Fondo = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ApMa.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        ApMa.setText("Apellido Materno:");
        jPanel1.add(ApMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        Contra.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Contra.setText("Contraseña:");
        jPanel1.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        correo.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        correo.setText("Correo:");
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        ApPa.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        ApPa.setText("Apellido Paterno:");
        jPanel1.add(ApPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        Tipo.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Tipo.setText("Tipo:");
        jPanel1.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        Nombre.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Nombre.setText("Nombre:");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        txt_nom.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txt_nom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomActionPerformed(evt);
            }
        });
        txt_nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nomKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 300, 50));

        txt_Appa.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txt_Appa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_Appa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_AppaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Appa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 300, 50));

        txt_Apma.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txt_Apma.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_Apma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ApmaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Apma, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 300, 50));

        txt_correo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txt_correo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 420, 50));

        Aceptar.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Aceptar.setText("Aceptar");
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        jPanel1.add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        bo_reg.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        bo_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/re.png"))); // NOI18N
        bo_reg.setText("Regresar");
        bo_reg.setBorder(null);
        bo_reg.setBorderPainted(false);
        bo_reg.setContentAreaFilled(false);
        bo_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_reg.setFocusPainted(false);
        bo_reg.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPress/Regresar.png"))); // NOI18N
        bo_reg.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencur/re.png"))); // NOI18N
        bo_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_regActionPerformed(evt);
            }
        });
        jPanel1.add(bo_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        label_status.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        box_tipo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        box_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Admin", "Empleado", " " }));
        box_tipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(box_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 190, 40));

        txt_contra.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txt_contra.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 420, 50));

        Img_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.jpeg"))); // NOI18N
        jPanel1.add(Img_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 510));

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

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed

    }//GEN-LAST:event_txt_correoActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        String nom = txt_nom.getText().trim(); //lo que hay en el cuadro se guarda en una nueva variable
        String con = txt_contra.getText().trim();//lo que hay en el cuadro se guarda en una nueva variable
        String ap = txt_Appa.getText().trim();//lo que hay en el cuadro se guarda en una nueva variable
        String am = txt_Apma.getText().trim();//lo que hay en el cuadro se guarda en una nueva variable
        String co = txt_correo.getText().trim();//lo que hay en el cuadro se guarda en una nueva variable
        String tipo= box_tipo.getSelectedItem().toString();//lo que hay en el cuadro se guarda en una nueva variable
        try{//Ejecute la excepciones  
           
        if(!nom.equals("") && !con.equals("") && !ap.equals("") && !am.equals("") && !co.equals("") && !tipo.equals("Seleccionar")){ //declara que si los campos estan vacios es diferente a vacio hara lo que hay abajo           
            ImageIcon icon = new ImageIcon("src\\iconos\\usicon.png"); // declara que en icon se guarda la imagen de ese url
            resp = JOptionPane.showConfirmDialog(null,"¿Quieres Agregar Otro Usuario?","Usuario",YES_NO_CANCEL_OPTION,INFORMATION_MESSAGE,icon); //el cuadro de confirmacion (1,2,3,4,5,6)
            //2. es el texto que tendra
            //3. el titulo del cuadro
            //4. que botones tendra
            //5. Que tipo de cuadro es
            //6. la imagen que tendra en el cuadro , declaras la imagen en una variable y pones la variable que declaraste
            if(resp==0){//si tu respuesta es igual a si==0 ejecutara lo de abajo
                
                Connection cn = Conexion.conectar();//conecta la interfaz con la base de datos
                PreparedStatement pst = cn.prepareStatement("insert into usuario values(?,?,?,?,?,?,?)");//da la instruccion de insertar debtro de usuario los valores ? (este signo significa que no se sabe que valor tendra , se pondra ? por cada columna que tenga tu base de datos              
                pst.setString(1, "0");//no se pone nada por que en la base de datos ya se genera la id por si sola             
                pst.setString(2, tipo);//lo que hay en la variable tipo se va almacenar en la columna 2
                pst.setString(3, txt_nom.getText().trim()); // el primer numero es el numero de columna de la base de datos , txt donde va .getText recoger la informacion .trim() para quitar espacio
                pst.setString(4, txt_Appa.getText().trim());// el primer numero es el numero de columna de la base de datos , txt donde va .getText recoger la informacion .trim() para quitar espacio
                pst.setString(5, txt_Apma.getText().trim());// el primer numero es el numero de columna de la base de datos , txt donde va .getText recoger la informacion .trim() para quitar espacio
                pst.setString(6, txt_correo.getText().trim());// el primer numero es el numero de columna de la base de datos , txt donde va .getText recoger la informacion .trim() para quitar espacio
                pst.setString(7, txt_contra.getText().trim());// el primer numero es el numero de columna de la base de datos , txt donde va .getText recoger la informacion .trim() para quitar espacio
                pst.executeUpdate();
                
                box_tipo.setSelectedItem("Seleccionar");
                txt_nom.setText("");//borra lo que hay en el cuadro de texto
                txt_Appa.setText("");//borra lo que hay en el cuadro de texto
                txt_Apma.setText("");//borra lo que hay en el cuadro de texto
                txt_correo.setText("");//borra lo que hay en el cuadro de texto
                txt_contra.setText("");//borra lo que hay en el cuadro de texto     
            }
            else if(resp==1){//si tu respuesta es no==1 se ejecutara lo siguiente
                Connection cn = Conexion.conectar();//conecta a la base de datos
                PreparedStatement pst = cn.prepareStatement("insert into usuario values(?,?,?,?,?,?,?)");//da la instruccion de insertar debtro de usuario los valores ? (este signo significa que no se sabe que valor tendra , se pondra ? por cada columna que tenga tu base de datos 
                pst.setString(1, "0");//no se pone nada por que en la base de datos ya se genera la id por si sola 
                pst.setString(2, tipo);//lo que hay en la variable tipo se va almacenar en la columna 2
                pst.setString(3, txt_nom.getText().trim());// el primer numero es el numero de columna de la base de datos , txt donde va .getText recoger la informacion .trim() para quitar espacio 
                pst.setString(4, txt_Appa.getText().trim());// el primer numero es el numero de columna de la base de datos , txt donde va .getText recoger la informacion .trim() para quitar espacio
                pst.setString(5, txt_Apma.getText().trim());// el primer numero es el numero de columna de la base de datos , txt donde va .getText recoger la informacion .trim() para quitar espacio
                pst.setString(6, txt_correo.getText().trim());// el primer numero es el numero de columna de la base de datos , txt donde va .getText recoger la informacion .trim() para quitar espacio
                pst.setString(7, txt_contra.getText().trim());// el primer numero es el numero de columna de la base de datos , txt donde va .getText recoger la informacion .trim() para quitar espacio
                pst.executeUpdate();//Se ejecuta la secuencia               
                InUsu r = new InUsu(); //se declara la variable en donde se guarda a llamar a la interfaz que quieres ir
                r.setVisible(true); // sera true= se mostrara lo que declarate en la variable 
                this.setVisible(false); //esta interfaz sera false= no se mostrara
            } 
          }
        else{//si llegan estar vacio los campos se ejecuta lo siguiente
           JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");//sale un cuadro de dialogo diciendo que debes llenar los campos
        }
         
        }catch (Exception e){      
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void txt_nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomKeyTyped
       //Texto nombre
       char c = evt.getKeyChar(); //se crea un caracter c         
        if((c<'a' || c>'z')&&(c<'A'|c>'Z') 
           && (c !='á') && (c !='é') && (c !='í') && (c !='ó') && (c !='ú') && (c !='ñ')&& (c !='Ñ')
           && (c != (char) KeyEvent.VK_SPACE))evt.consume(); // esto permite que solo se pueda escribir letras      
    }//GEN-LAST:event_txt_nomKeyTyped

    private void txt_AppaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AppaKeyTyped
        // Texto Apellido Paterno
        char c = evt.getKeyChar(); //se crea un caracter c         
        if((c<'a' || c>'z')&&(c<'A'|c>'Z') 
           && (c !='á') && (c !='é') && (c !='í') && (c !='ó') && (c !='ú') && (c !='ñ')&& (c !='Ñ')
           && (c != (char) KeyEvent.VK_SPACE))evt.consume(); // esto permite que solo se pueda escribir letras
    }//GEN-LAST:event_txt_AppaKeyTyped

    private void txt_ApmaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ApmaKeyTyped
        // Texto Apellido Materno
       char c = evt.getKeyChar(); //se crea un caracter c         
        if((c<'a' || c>'z')&&(c<'A'|c>'Z') 
           && (c !='á') && (c !='é') && (c !='í') && (c !='ó') && (c !='ú') && (c !='ñ')&& (c !='Ñ')
           && (c != (char) KeyEvent.VK_SPACE))evt.consume(); // esto permite que solo se pueda escribir letras
    }//GEN-LAST:event_txt_ApmaKeyTyped

    private void txt_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomActionPerformed

    private void bo_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_regActionPerformed
        InUsu r = new InUsu(); // declarar y llamar a la interfaz que quieres ir
        r.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz  
    }//GEN-LAST:event_bo_regActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel ApMa;
    private javax.swing.JLabel ApPa;
    private javax.swing.JLabel Contra;
    private javax.swing.JLabel Img_Fondo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Tipo;
    private javax.swing.JButton bo_reg;
    private javax.swing.JComboBox<String> box_tipo;
    private javax.swing.JLabel correo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_Apma;
    private javax.swing.JTextField txt_Appa;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nom;
    // End of variables declaration//GEN-END:variables
}
