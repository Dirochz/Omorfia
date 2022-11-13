package Formulario;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import omorfia.Conexion;

public final class Login extends javax.swing.JFrame {

    public static String user = "";//para declarar variable que permite inviar datos entre interfaz
    String pass = "";//para declarar variable que almacenara su contedido temporalmente
    public static String tip = "";//para declarar variable que almacenara su contedido temporalmente
    public static int id_usuario = 0;
   
    public Login() {
        initComponents();
        setTitle("Login");//pone el titulo a la interfaz
        this.setLocationRelativeTo(null);//centra la Interfaz      
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
        Login = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        bo_ing = new javax.swing.JButton();
        txt_usu = new javax.swing.JTextField();
        txt_con = new javax.swing.JPasswordField();
        co_tip = new javax.swing.JComboBox<>();
        contra = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        Tipo.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Tipo.setForeground(new java.awt.Color(255, 255, 0));
        Tipo.setText("Tipo:");
        jPanel1.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        Usuario.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 0));
        Usuario.setText("Usuario:");
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        Nombre.setBackground(new java.awt.Color(153, 153, 153));
        Nombre.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("D’ Amelia Boutique");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bo_ing.setBackground(new java.awt.Color(0, 0, 0));
        bo_ing.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        bo_ing.setForeground(new java.awt.Color(255, 255, 255));
        bo_ing.setText("Ingresar");
        bo_ing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_ing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_ingActionPerformed(evt);
            }
        });
        jPanel1.add(bo_ing, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        txt_usu.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txt_usu.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_usu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuKeyTyped(evt);
            }
        });
        jPanel1.add(txt_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 190, 50));

        txt_con.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jPanel1.add(txt_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 190, -1));

        co_tip.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        co_tip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Admin", "Empleado" }));
        co_tip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(co_tip, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, 50));

        contra.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        contra.setForeground(new java.awt.Color(255, 255, 0));
        contra.setText("Contraseña:");
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Intelogin.jpeg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void bo_ingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_ingActionPerformed
        user = txt_usu.getText().trim(); //se guarda en user lo que se ingreso en el texto de Usuario
        pass = txt_con.getText().trim(); //se guarda en pass lo que se ingreso en contraseña
        tip = co_tip.getSelectedItem().toString();//se guarda en tipo lo que se ingreso en tipo
        
        if(!user.equals("") || !pass.equals("") || !tip.equals("Seleccinar")){ //declara que si el user es diferente a vacio hara lo que hay abajo
            
            try{//Ejecuta las excepciones
                Connection cn = Conexion.conectar();//se conecta a la base de datos              
                PreparedStatement pst = cn.prepareStatement("select ID, Tipo from usuario where Nombre ='"+user
                +"'and Contraseña ='"+pass+"'and Tipo='"+tip+"'");   // selecciona el tipo y checa si el usuario y la contra es la misma que la interfaz                            
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    id_usuario = rs.getInt("ID");
                   String tusu = rs.getString("Tipo"); //se guarda en tipo lo que hay en tipo
                   
                   if(tusu.equalsIgnoreCase("Admin")){ //tipo es igual a  admin
                      dispose(); // cierra la Interfaz
                      new Menu().setVisible(true); // nos manda al menu de Admin
                   }
                   else{
                      dispose(); // cierra la Interfaz
                      new MenuEm().setVisible(true); // nos manda al menu de Empleado
                   }
                }
                else{ //si no se hace las dos condiciones anteriores se ejecuta lo siguiente
                   JOptionPane.showMessageDialog(null,"Datos Incorrectos\nIntentelo de nuevo");//sale un cuadro de mensaje diciendo que lo intente de nuevo 
                   txt_usu.setText("");//borra lo que esta escrito en los recuadros
                   txt_con.setText("");//borra lo que esta escrito en los recuadros
                }               
            }catch (SQLException e){
            }
        }
        else{ //si el user o el pass estan vacio saldra el mensaje de error
            JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");//sale un mensaje diciendo que debes llenar los campos
        }
    }//GEN-LAST:event_bo_ingActionPerformed

    private void txt_usuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuKeyTyped
        char c = evt.getKeyChar(); //se crea un caracter c         
        if((c<'a' || c>'z')&&(c<'A'|c>'Z') 
           && (c !='á') && (c !='é') && (c !='í') && (c !='ó') && (c !='ú') && (c !='ñ')&& (c !='Ñ')
           && (c != (char) KeyEvent.VK_SPACE))evt.consume(); // esto permite que solo se pueda escribir letras
    }//GEN-LAST:event_txt_usuKeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Tipo;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton bo_ing;
    private javax.swing.JComboBox<String> co_tip;
    private javax.swing.JLabel contra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_con;
    private javax.swing.JTextField txt_usu;
    // End of variables declaration//GEN-END:variables
}
