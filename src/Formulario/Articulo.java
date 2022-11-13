package Formulario;
import static Formulario.Login.tip;
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

public final class Articulo extends javax.swing.JFrame {

    static int ida;
    String tipo, bus;
    public static int id_ar = 0;
    DefaultTableModel modelo;
    int id,ma,ca,resp;
    Double pr;
    
    public Articulo() {
        initComponents();
        setTitle("Articulo");//titulo que tendra
        tipo = Login.tip;
        this.setLocationRelativeTo(null); // centra la interfaz cuando se ejecuta       
        eliart();
    }
    
    void Mod(){
        int fila = art.getSelectedRow();
        id = Integer.parseInt(this.art.getValueAt(fila,0).toString());
        String nom = art.getValueAt(fila,1).toString();
        ma = Integer.parseInt(this.art.getValueAt(fila,2).toString());   
        String ta = art.getValueAt(fila,3).toString();
        ca = Integer.parseInt(this.art.getValueAt(fila,4).toString());
        pr = (double) this.art.getValueAt(fila,5);
        String de = art.getValueAt(fila,6).toString();
        try{
           Connection cn = Conexion.conectar();
           PreparedStatement pst = cn.prepareStatement("UPDATE img SET "
                   + "Nombre='"+nom+"',id_marca='"+ma+"',Talla='"+ta+"',Cantidad='"+ca+"',Precio='"+pr+"',Descripcion='"+de+"' WHERE ID = '"+id+"'");
           pst.executeUpdate();           
        }catch(SQLException e){
        }
    }
    
    void eliart(){         
        modelo = (DefaultTableModel)art.getModel();
        art.setModel(modelo);
        Object[] imgan = new Object[7];
        try{       
        Connection cn = Conexion.conectar();//se conecta a la base de datos    
        PreparedStatement pst = cn.prepareStatement("select ID,Nombre,id_marca,Talla,Cantidad,Precio,Descripcion from img");// selecciona el tipo y checa si el usuario y la contra es la misma que la interfaz            
        ResultSet rs = pst.executeQuery();// Para consultas con Query, el tipo de retorno es tabla bidimensional       
        while(rs.next()){         
            imgan[0] = rs.getString("ID");
            imgan[1] = rs.getString("Nombre");
            imgan[2] = rs.getInt("id_marca");
            imgan[3] = rs.getString("Talla");
            imgan[4] = rs.getInt("Cantidad");
            imgan[5] = rs.getDouble("Precio");
            imgan[6] = rs.getString("Descripcion");
            modelo.addRow(imgan);
        }
        art.setModel(modelo);    
        }catch(SQLException e){           
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
        bo_eliart = new javax.swing.JButton();
        bo_AgArt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        art = new javax.swing.JTable();
        mod = new javax.swing.JButton();
        txt_bu = new javax.swing.JTextField();
        bu = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(bo_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bo_eliart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarArti.png"))); // NOI18N
        bo_eliart.setBorder(null);
        bo_eliart.setBorderPainted(false);
        bo_eliart.setContentAreaFilled(false);
        bo_eliart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_eliart.setFocusPainted(false);
        bo_eliart.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPress/EliArt.png"))); // NOI18N
        bo_eliart.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencur/EliminarArti.png"))); // NOI18N
        bo_eliart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_eliartActionPerformed(evt);
            }
        });
        jPanel1.add(bo_eliart, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 240, 200));

        bo_AgArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarArt.png"))); // NOI18N
        bo_AgArt.setBorder(null);
        bo_AgArt.setBorderPainted(false);
        bo_AgArt.setContentAreaFilled(false);
        bo_AgArt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bo_AgArt.setFocusPainted(false);
        bo_AgArt.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPress/AgArt.png"))); // NOI18N
        bo_AgArt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencur/AgregarArt.png"))); // NOI18N
        bo_AgArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_AgArtActionPerformed(evt);
            }
        });
        jPanel1.add(bo_AgArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        art.setBackground(new java.awt.Color(0, 153, 153));
        art.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        art.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Marca", "Talla", "Cantidad", "Precio", "Descripcion"
            }
        ));
        art.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        art.setRowHeight(40);
        jScrollPane1.setViewportView(art);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 820, 250));

        mod.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        mod.setText("Modificar");
        mod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        jPanel1.add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        txt_bu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buActionPerformed(evt);
            }
        });
        jPanel1.add(txt_bu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 330, 40));

        bu.setText("Buscar");
        bu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buActionPerformed(evt);
            }
        });
        jPanel1.add(bu, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 130, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.jpeg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

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

    private void bo_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_regActionPerformed
        try{//Ejecuta las excepciones
                Connection cn = Conexion.conectar();//se conecta a la base de datos              
                PreparedStatement pst = cn.prepareStatement("select Tipo from usuario where Tipo='"+tip+"'");   // selecciona el tipo y checa si el usuario y la contra es la misma que la interfaz                            
                ResultSet rs = pst.executeQuery();
                if(rs.next()){    
                   String tusu = rs.getString("Tipo"); //se guarda en tipo lo que hay en tipo           
                   if(tusu.equalsIgnoreCase("Admin")){ //tipo es igual a  admin
                      Menu me = new Menu(); // declarar y llamar a la interfaz que quieres ir
                      me.setVisible(true); // te mostrara lo que declarate en la variable 
                      this.setVisible(false); //te oculta esta interfaz 
                   }
                   else{
                      MenuEm mee = new MenuEm(); // declarar y llamar a la interfaz que quieres ir
                      mee.setVisible(true); // te mostrara lo que declarate en la variable 
                      this.setVisible(false); //te oculta esta interfaz                               
                   }
                }
                else{ 
                }               
            }catch (SQLException e){
        }
    }//GEN-LAST:event_bo_regActionPerformed

    private void bo_AgArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_AgArtActionPerformed
        AgArt ag = new AgArt(); // declarar y llamar a la interfaz que quieres ir
        ag.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz
    }//GEN-LAST:event_bo_AgArtActionPerformed

    private void bo_eliartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_eliartActionPerformed
        int fila = art.getSelectedRow();
        String ida = art.getValueAt(fila, 0).toString();
        try{
            if(fila<0){
                JOptionPane.showMessageDialog(null,"Seleccione un Articulo");               
            }
            else{ 
                ImageIcon icon = new ImageIcon("src\\iconos\\Eliucon.png"); 
                //el cuadro de confirmacion (1,2,3,4,5,6)
                //2. es el texto que tendra
                //3. el titulo del cuadro
                //4. que botones tendra
                //5. Que tipo de cuadro es
                //6. la imagen que tendra en el cuadro , declaras la imagen en una variable y pones la variable que declaraste
                resp = JOptionPane.showConfirmDialog(null,"¿Seguro que quiere eliminar este Articulo?","Eliminar Articulo",YES_NO_OPTION,INFORMATION_MESSAGE,icon);
                if(resp==0){
                    Connection cn = Conexion.conectar();//se conecta a la base de datos
                    // selecciona el tipo y checa si el usuario y la contra es la misma que la interfaz
                    PreparedStatement pst = cn.prepareStatement("delete from img where Id='"+ida+"'");             
                    pst.executeUpdate();  
                    Articulo ea = new Articulo(); // declarar y llamar a la interfaz que quieres ir
                    ea.setVisible(true); // te mostrara lo que declarate en la variable 
                    this.setVisible(false); //te oculta esta interfaz    
                }
            }
        }catch(SQLException e){           
        }
    }//GEN-LAST:event_bo_eliartActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        Mod();
        Articulo ea = new Articulo();
        ea.setVisible(true); 
        this.setVisible(false); 
    }//GEN-LAST:event_modActionPerformed

  private void txt_buActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txt_buActionPerformed

  private void buActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buActionPerformed
        modelo.setRowCount(0);
        bus = txt_bu.getText().trim();
        try{       
        Connection cn = Conexion.conectar();//se conecta a la base de datos    
        String query;
        if(bus.equals("")){
          query = "select * from img";// selecciona el tipo y checa si el usuario y la contra es la misma que la interfaz            
        }
        else{
          query = "select * from img Where ID ='"+bus+"'";
        }
        PreparedStatement pst = cn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();// Para consultas con Query, el tipo de retorno es tabla bidimensional       
        Object[] imgan = new Object[7];
        while(rs.next()){         
            imgan[0] = rs.getString("ID");
            imgan[1] = rs.getString("Nombre");
            imgan[2] = rs.getInt("id_marca");
            imgan[3] = rs.getString("Talla");
            imgan[4] = rs.getInt("Cantidad");
            imgan[5] = rs.getDouble("Precio");
            imgan[6] = rs.getString("Descripcion");
            modelo.addRow(imgan);            
        }
        art.setModel(modelo); 
        }catch(SQLException e){           
        }
        txt_bu.setText("");
  }//GEN-LAST:event_buActionPerformed

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
            java.util.logging.Logger.getLogger(Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Articulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable art;
    private javax.swing.JButton bo_AgArt;
    private javax.swing.JButton bo_eliart;
    private javax.swing.JButton bo_reg;
    private javax.swing.JButton bu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mod;
    private javax.swing.JTextField txt_bu;
    // End of variables declaration//GEN-END:variables
}