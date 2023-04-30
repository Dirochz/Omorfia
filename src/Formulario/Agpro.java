package Formulario;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;

public class Agpro extends javax.swing.JFrame {
    int resp;
    public Agpro() {
        initComponents();
        setTitle("Agregar Proveedor");
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

        jPanel1 = new javax.swing.JPanel();
        Telefono = new javax.swing.JLabel();
        ApPaterno = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        txt_emp = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        Agpro = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        bo_Reg = new javax.swing.JButton();
        Fondo1 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        Fondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(229, 213, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Telefono.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Telefono.setForeground(new java.awt.Color(0, 0, 0));
        Telefono.setText("Telefono:");
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        ApPaterno.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        ApPaterno.setForeground(new java.awt.Color(0, 0, 0));
        ApPaterno.setText("Correo:");
        jPanel1.add(ApPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        Nombre.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setText("Empresa");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        txt_emp.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txt_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_empActionPerformed(evt);
            }
        });
        txt_emp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_empKeyTyped(evt);
            }
        });
        jPanel1.add(txt_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 670, -1));

        txt_correo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_correoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 670, -1));

        txt_tel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txt_tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telKeyTyped(evt);
            }
        });
        jPanel1.add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 670, -1));

        Agpro.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Agpro.setText("Agregar");
        Agpro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgproActionPerformed(evt);
            }
        });
        jPanel1.add(Agpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, -1));

        label_status.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        bo_Reg.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        bo_Reg.setForeground(new java.awt.Color(0, 0, 0));
        bo_Reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/re.png"))); // NOI18N
        bo_Reg.setText("Regresar");
        bo_Reg.setBorder(null);
        bo_Reg.setBorderPainted(false);
        bo_Reg.setContentAreaFilled(false);
        bo_Reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_Reg.setFocusPainted(false);
        bo_Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_RegActionPerformed(evt);
            }
        });
        jPanel1.add(bo_Reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m3.png"))); // NOI18N
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, -30, 150, 180));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/m2.png"))); // NOI18N
        jPanel1.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 290, 210));

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/me1.png"))); // NOI18N
        jPanel1.add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 190, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgproActionPerformed
        String emp = txt_emp.getText().trim(); //lo que hay en el cuadro se guarda en una nueva variable
        String tel = txt_tel.getText().trim();//lo que hay en el cuadro se guarda en una nueva variable
        String co = txt_correo.getText().trim();//lo que hay en el cuadro se guarda en una nueva variable
        try{//Ejecute la excepciones  
           
        if(!emp.equals("") && !tel.equals("") && !co.equals("")){ //declara que si los campos estan vacios es diferente a vacio hara lo que hay abajo           
            ImageIcon icon = new ImageIcon("src\\iconos\\usicon.png"); // declara que en icon se guarda la imagen de ese url
            resp = JOptionPane.showConfirmDialog(null,"¿Quieres Agregar Otro proveedor?","Usuario",YES_NO_CANCEL_OPTION,INFORMATION_MESSAGE,icon); //el cuadro de confirmacion (1,2,3,4,5,6)
            //2. es el texto que tendra
            //3. el titulo del cuadro
            //4. que botones tendra
            //5. Que tipo de cuadro es
            //6. la imagen que tendra en el cuadro , declaras la imagen en una variable y pones la variable que declaraste
            if(resp==0){//si tu respuesta es igual a si==0 ejecutara lo de abajo
                
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/base_dedatos", "root", "");
            //1." ruta y nombre de la base de datos 2."incluir nombre de la base de datos 3." contraseña de la base de datos
            PreparedStatement pst = cn.prepareStatement("insert into proveedores values(?,?,?,?)"); // ? el valor que se desconoce que va en cada columna que este en la tabla
            //Para dar Instrucciones a la base de datos
            pst.setString(1, "0");
            pst.setString(2, txt_emp.getText().trim()); // primero el numero de la columna
            pst.setString(3, txt_correo.getText().trim()); // .get text tomar el texto escrito 
            pst.setString(4, txt_tel.getText().trim());
            pst.executeUpdate(); //ejecutar las lineas pasadas para que salga en la base de datos
                     
            txt_emp.setText("");
            txt_correo.setText("");
            txt_tel.setText("");               
            }
            else if(resp==1){//si tu respuesta es no==1 se ejecutara lo siguiente
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/base_dedatos", "root", "");
                //1." ruta y nombre de la base de datos 2."incluir nombre de la base de datos 3." contraseña de la base de datos
                PreparedStatement pst = cn.prepareStatement("insert into proveedores values(?,?,?,?)"); // ? el valor que se desconoce que va en cada columna que este en la tabla
                //Para dar Instrucciones a la base de datos
                pst.setString(1, "0");
                pst.setString(2, txt_emp.getText().trim()); // primero el numero de la columna
                pst.setString(3, txt_correo.getText().trim()); // .get text tomar el texto escrito 
                pst.setString(4, txt_tel.getText().trim());
                pst.executeUpdate(); //ejecutar las lineas pasadas para que salga en la base de datos  
                Proveedor r = new Proveedor(); //se declara la variable en donde se guarda a llamar a la interfaz que quieres ir
                r.setVisible(true); // sera true= se mostrara lo que declarate en la variable 
                this.setVisible(false); //esta interfaz sera false= no se mostrara
            } 
          }
        else{//si llegan estar vacio los campos se ejecuta lo siguiente
           JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");//sale un cuadro de dialogo diciendo que debes llenar los campos
        }      
        }catch (Exception e){      
        }
    }//GEN-LAST:event_AgproActionPerformed

    private void txt_empKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_empKeyTyped
       //texto empresa
        char c = evt.getKeyChar(); //se crea un caracter c         
        if((c<'a' || c>'z')&&(c<'A'|c>'Z') 
           && (c !='á') && (c !='é') && (c !='í') && (c !='ó') && (c !='ú') && (c !='ñ')&& (c !='Ñ')
           && (c != (char) KeyEvent.VK_SPACE))evt.consume(); // esto permite que solo se pueda escribir letras
    }//GEN-LAST:event_txt_empKeyTyped

    private void txt_telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telKeyTyped
        //texto telefono
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9')evt.consume(); //esto permite solo escribir numeros
    }//GEN-LAST:event_txt_telKeyTyped

    private void txt_correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyTyped
 
    }//GEN-LAST:event_txt_correoKeyTyped

    private void bo_RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_RegActionPerformed
        Proveedor po = new Proveedor(); // declarar y llamar a la interfaz que quieres ir
        po.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz
    }//GEN-LAST:event_bo_RegActionPerformed

    private void txt_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_empActionPerformed

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
            java.util.logging.Logger.getLogger(Agpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agpro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agpro;
    private javax.swing.JLabel ApPaterno;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Telefono;
    private javax.swing.JButton bo_Reg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_emp;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
