package Formulario;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*; 
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
import javax.swing.filechooser.FileNameExtensionFilter;
import omorfia.Conexion;

public final class AgArt extends javax.swing.JFrame {    
    int resp,ca,id_em;//declara variables de tipo Entero
    Double pre; //declara variable de tipo decimal 
        
    public AgArt() {
        initComponents();
        setTitle("Agregar Articulo");
        this.setLocationRelativeTo(null); // centra la interfaz cuando se ejecuta
        dbox();
    }
        void dbox(){
         try {
            ArrayList<String> nombres = new ArrayList<>();         
            Connection cn = Conexion.conectar();//se conecta a la base de datos 
            PreparedStatement pst;
            pst = cn.prepareStatement("select Empresa from proveedores");   // selecciona el tipo y checa si el usuario y la contra es la misma que la interfaz                            
            nombres.add("Seleccionar");          
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                nombres.add(rs.getString("Empresa"));
            }
            String[] usuarios = nombres.toArray(new String[0]);
            ma_box.setModel(new javax.swing.DefaultComboBoxModel<>(usuarios));
        } catch (SQLException e) {       
        }
}
    //Pone a la interfaz un icono 
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
        nombre = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        box_talla = new javax.swing.JComboBox<>();
        talla = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        Marca = new javax.swing.JLabel();
        Des = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        bo_Ace = new javax.swing.JButton();
        Alerta = new javax.swing.JLabel();
        bo_ingf = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        n_f = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_des = new javax.swing.JTextArea();
        ma_box = new javax.swing.JComboBox<>();
        spipre = new javax.swing.JSpinner();
        spica = new javax.swing.JSpinner();
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
        bo_re.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_re.setFocusPainted(false);
        bo_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_reActionPerformed(evt);
            }
        });
        jPanel1.add(bo_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        nombre.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("Nombre:");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 110, 60));

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
        jPanel1.add(txt_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 210, -1));

        box_talla.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        box_talla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "CH", "M", "G", "3", "4", "5", "6", "7", "8", " " }));
        box_talla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(box_talla, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 200, 40));

        talla.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        talla.setForeground(new java.awt.Color(0, 0, 0));
        talla.setText("Talla:");
        jPanel1.add(talla, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 80, 30));

        Precio.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Precio.setForeground(new java.awt.Color(0, 0, 0));
        Precio.setText("Precio: $");
        jPanel1.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 110, -1));

        Marca.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Marca.setForeground(new java.awt.Color(0, 0, 0));
        Marca.setText("Marca:");
        jPanel1.add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 90, 40));

        Des.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        Des.setForeground(new java.awt.Color(0, 0, 0));
        Des.setText("Descripción:");
        jPanel1.add(Des, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 150, 40));

        cantidad.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        cantidad.setForeground(new java.awt.Color(0, 0, 0));
        cantidad.setText("Cantidad:");
        jPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 120, 40));

        bo_Ace.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        bo_Ace.setText("Agregar");
        bo_Ace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_Ace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_AceActionPerformed(evt);
            }
        });
        jPanel1.add(bo_Ace, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, -1));

        Alerta.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jPanel1.add(Alerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, 50));

        bo_ingf.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        bo_ingf.setText("Ingresar");
        bo_ingf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_ingf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_ingfActionPerformed(evt);
            }
        });
        jPanel1.add(bo_ingf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        imagen.setBackground(new java.awt.Color(255, 255, 255));
        imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 290, 260));

        n_f.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        n_f.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        n_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_fActionPerformed(evt);
            }
        });
        jPanel1.add(n_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 290, 60));

        txt_des.setColumns(20);
        txt_des.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txt_des.setRows(5);
        txt_des.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txt_des);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 650, 100));

        ma_box.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        ma_box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ma_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ma_boxActionPerformed(evt);
            }
        });
        jPanel1.add(ma_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 210, 50));

        spipre.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        spipre.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100000.0d, 0.1d));
        spipre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spipre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spipreKeyTyped(evt);
            }
        });
        jPanel1.add(spipre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 190, 40));

        spica.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        spica.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));
        spica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spicaKeyTyped(evt);
            }
        });
        jPanel1.add(spica, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 120, 40));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Manda a la pestaña Artculo
    private void bo_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_reActionPerformed
    Articulo a = new Articulo(); //se declara la variable en donde se guarda a llamar a la interfaz que quieres ir
    a.setVisible(true); // sera true= se mostrara lo que declarate en la variable 
    this.setVisible(false); //esta interfaz sera false= no se mostrara   
    }//GEN-LAST:event_bo_reActionPerformed

    //no hay nada
    private void txt_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomActionPerformed
    
    // lo que va hacer cuando le den al boton de aceptar
    private void bo_AceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_AceActionPerformed
        FileInputStream archivoFoto; 
        String nom = txt_nom.getText().trim();  // recoge la informacion de nombre
        String prec = spipre.getValue().toString(); // recoge la informacion de precio
        String can = spica.getValue().toString(); // regoge la informacion de cantidad
        String ma = ma_box.getSelectedItem().toString(); // recoge la informacion de marca
        String ta = box_talla.getSelectedItem().toString(); // recoge la informacion de talla
        String n = n_f.getText().trim(); // recoge la informacion de link de la foto      
        try{
            Connection cn = Conexion.conectar(); 
            PreparedStatement pst;
            pst = cn.prepareStatement("select ID from proveedores WHERE Empresa= '"+ma+"'"); 
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                id_em = rs.getInt("ID");   
        }
        }catch(SQLException e){
            System.out.println("Empresa: "+e);
        }
        try{
            if(!nom.equals("") && !prec.equals("0") && !can.equals("0") && !ta.equals("Seleccionar") && !n.equals("") && !ma.equals("Seleccionar")){ 
            ImageIcon icon = new ImageIcon("src\\iconos\\Agacon.png"); // declara que en icon se guarda la imagen de ese url
            
            resp = JOptionPane.showConfirmDialog(null,"¿Quieres agregar otro articulo?","Articulo",YES_NO_CANCEL_OPTION,INFORMATION_MESSAGE,icon); //el cuadro de confirmacion
            pre = (double) spipre.getValue();// lo que se pone en el spinner se convierte en decimal 
            ca = (int) spica.getValue(); // lo que este en modo texto de cantidad se va hacer entero

            if(resp==0){//si tu respuesta es igual a si==0 ejecutara lo de abajo
            Connection cn = Conexion.conectar(); // conexion a  la base de datos 
            PreparedStatement pst = cn.prepareStatement("insert into img values(?,?,?,?,?,?,?,?)");//Para dar Instrucciones a la base de datos               
            archivoFoto = new FileInputStream(n_f.getText()); // la foto se guarda en archivofoto
            
            pst.setString(1, "0"); // ID no se pone nada por que es automatico
            pst.setString(2, nom);// Nombre se manda a la columna 2 de la base de datos
            pst.setInt(3, id_em);// Marca se manda a la columna 3 de la base de datos
            pst.setString(4, ta);// Talla se manda a la columna 4 de la base de datos
            pst.setInt(5, ca);// Cantidad se manda a la columna 5 de la base de datos         
            pst.setDouble(6, pre);// Precio se manda a la columna 6 de la base de datos
            pst.setString(7, txt_des.getText().trim());// descripcion se manda a la columna 7 de la base de datos         
            pst.setBinaryStream(8, archivoFoto);// Foto se manda a la columna 8 de la base de datos
            pst.executeUpdate(); //  ejecuta la indicacion           
            
            ImageIcon wall = new ImageIcon("src\\imagenes\\2.png"); // en wall se guarda la imagen 2
            Icon icono = new ImageIcon (wall.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(),Image.SCALE_DEFAULT)); // en icon se guarda el tamaño de la foto de wall
            imagen.setIcon(icono); // lo que este en icon se cologara en imagen
            n_f.setText(""); // en el link de la foto se pondra en blanco 
            box_talla.setSelectedItem("Seleccionar"); // en talla se pondra en seleccionar
            ma_box.setSelectedItem("Seleccionar");
            txt_nom.setText(""); // en nombre se pondra en blanco 
            spipre.setValue(0); // en el precio se pondra en 0
            spica.setValue(0); // en cantidad se pondra en 0
            txt_des.setText(""); // en descripcion se pondra en blanco 
            }
            
            else if(resp==1){//si tu respuesta es no==1 se ejecutara lo siguiente
            Connection cn = Conexion.conectar(); // conecta a la base de datos
            PreparedStatement pst = cn.prepareStatement("insert into img values(?,?,?,?,?,?,?,?)");//Para dar Instrucciones a la base de datos    
            archivoFoto = new FileInputStream(n_f.getText());
            
            pst.setString(1, "0"); // ID se pone 0 por que es automatico
            pst.setString(2, nom);// Nombre se manda a la columna 2 de la base de datos
            pst.setInt(3, id_em);// Marca se manda a la columna 3 de la base de datos
            pst.setString(4, ta);// Talla se manda a la columna 4 de la base de datos
            pst.setInt(5, ca);// Cantidad se manda a la columna 5 de la base de datos         
            pst.setDouble(6, pre);// Precio se manda a la columna 6 de la base de datos
            pst.setString(7, txt_des.getText().trim());// descripcion se manda a la columna 7 de la base de datos         
            pst.setBinaryStream(8, archivoFoto);// Foto se manda a la columna 8 de la base de datos
            pst.executeUpdate(); //  ejecuta la indicacion 
            
            Articulo ar = new Articulo(); // nos lleva a la interfaz de Articulo
            ar.setVisible(true); // te mostrara lo que declarate en la variable 
            this.setVisible(false); //te oculta esta interfaz
            } 
          }
        else{//si llegan estar vacio los campos se ejecuta lo siguiente
           JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");//sale un cuadro de dialogo diciendo que debes llenar los campos
        }   
        }catch (HeadlessException | FileNotFoundException | SQLException e){      
            System.out.println("agregar: "+e);
        }       
    }//GEN-LAST:event_bo_AceActionPerformed

    // Boton de ingresar imagen de articulo
    private void bo_ingfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_ingfActionPerformed
        File archivo;
        JFileChooser flcAbrirArchivo = new JFileChooser();
        flcAbrirArchivo.setFileFilter(new FileNameExtensionFilter("Archivo de imagen","jpg","jpeg","png")); 
        int respuesta=flcAbrirArchivo.showOpenDialog(this);
        
        if(respuesta == JFileChooser.APPROVE_OPTION){
            archivo = flcAbrirArchivo.getSelectedFile();
            n_f.setText(archivo.getAbsolutePath());
            Image foto = Toolkit.getDefaultToolkit().getImage(n_f.getText());
            foto = foto.getScaledInstance(290,290, 1);
            imagen.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_bo_ingfActionPerformed

    private void n_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_fActionPerformed

    private void txt_nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomKeyTyped
        //Nombre
        char c = evt.getKeyChar(); //se crea un caracter c         
        if((c<'a' || c>'z')&&(c<'A'|c>'Z') 
           && (c !='á') && (c !='é') && (c !='í') && (c !='ó') && (c !='ú') && (c !='ñ')&& (c !='Ñ')
           && (c != (char) KeyEvent.VK_SPACE))evt.consume(); // esto permite que solo se pueda escribir letras
    }//GEN-LAST:event_txt_nomKeyTyped

    private void spipreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spipreKeyTyped
        //precio
        char c = evt.getKeyChar();        
        if((c<'0' || c>'9') && (c!='.'))evt.consume(); //esto permite solo escribir numeros
    }//GEN-LAST:event_spipreKeyTyped

    private void spicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spicaKeyTyped
        //Cantidad
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9')evt.consume(); //esto permite solo escribir numeros
    }//GEN-LAST:event_spicaKeyTyped

    private void ma_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ma_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ma_boxActionPerformed

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
            java.util.logging.Logger.getLogger(AgArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgArt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alerta;
    private javax.swing.JLabel Des;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Precio;
    private javax.swing.JButton bo_Ace;
    private javax.swing.JButton bo_ingf;
    private javax.swing.JButton bo_re;
    private javax.swing.JComboBox<String> box_talla;
    private javax.swing.JLabel cantidad;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> ma_box;
    private javax.swing.JTextField n_f;
    private javax.swing.JLabel nombre;
    private javax.swing.JSpinner spica;
    private javax.swing.JSpinner spipre;
    private javax.swing.JLabel talla;
    private javax.swing.JTextArea txt_des;
    private javax.swing.JTextField txt_nom;
    // End of variables declaration//GEN-END:variables
}
