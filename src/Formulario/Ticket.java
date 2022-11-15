package Formulario;
import static Formulario.Login.tip;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList; // import the ArrayList class
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import omorfia.Conexion;

public final class Ticket extends javax.swing.JFrame {
    String tipo,em;
    int id_usuario = 0;
    int folio = 0;
    int canti,ca_b,id_p,cont=0,con_i=0, tablavi=0;
    int ca_a = 0,id_para_eliminar = -1;
    // Tabla de productos
    
    ArrayList<Object[]> productos_vendidos = new ArrayList<>(); 
    double pre, prea=0,his=0,cambi=0;
    DefaultTableModel modelo;
    DefaultTableModel modeloT;
    
    public Ticket() {
        initComponents();
        setTitle("Ticket");
        tipo = Login.tip;
        id_usuario = Login.id_usuario;
        this.setLocationRelativeTo(null);//para centrar la Interfaz  
        dbox();
        tabla();
        tabla.setVisible(false);
    }
    void tabla(){
        modeloT = (DefaultTableModel)art.getModel();
            art.setModel(modeloT);
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
                modeloT.addRow(imgan);
            }
            art.setModel(modeloT);    
            }catch(SQLException e){           
            }
    }
    void dbox(){
    try {
            ArrayList<String> nombres = new ArrayList<>();         
            Connection cn = Conexion.conectar();//se conecta a la base de datos 
            PreparedStatement pst;
            if (tip.equals("Admin")) {
                pst = cn.prepareStatement("select Nombre from usuario");   // selecciona el tipo y checa si el usuario y la contra es la misma que la interfaz                            
                nombres.add("Seleccionar");
            } else {
                pst = cn.prepareStatement("select Nombre from usuario where ID='"+id_usuario+"'");
            }
            
            ResultSet rs = pst.executeQuery();
        
            while (rs.next()) {
                nombres.add(rs.getString("Nombre"));
            }
            String[] usuarios = nombres.toArray(new String[0]);
            ven.setModel(new javax.swing.DefaultComboBoxModel<>(usuarios));
        } catch (SQLException e) {       
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
        Regresar = new javax.swing.JButton();
        car = new javax.swing.JScrollPane();
        ca = new javax.swing.JTable();
        ven = new javax.swing.JComboBox<>();
        pag = new javax.swing.JTextField();
        cam = new javax.swing.JTextField();
        to = new javax.swing.JTextField();
        pro = new javax.swing.JTextField();
        ticket = new javax.swing.JButton();
        Producto = new javax.swing.JLabel();
        vendedor = new javax.swing.JLabel();
        Pgo1 = new javax.swing.JLabel();
        Pgo = new javax.swing.JLabel();
        cambio1 = new javax.swing.JLabel();
        cambio = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        $1 = new javax.swing.JLabel();
        $ = new javax.swing.JLabel();
        cant = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        c = new javax.swing.JLabel();
        Inf = new javax.swing.JButton();
        cliente = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        tabla = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        art = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(229, 213, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Regresar.setForeground(new java.awt.Color(0, 0, 0));
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/re.png"))); // NOI18N
        Regresar.setText("Regresar");
        Regresar.setBorder(null);
        Regresar.setBorderPainted(false);
        Regresar.setContentAreaFilled(false);
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Regresar.setFocusPainted(false);
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ca.setBackground(new java.awt.Color(0, 153, 153));
        ca.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        ca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Cantidad"
            }
        ));
        ca.setRowHeight(30);
        ca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caMouseClicked(evt);
            }
        });
        car.setViewportView(ca);

        jPanel1.add(car, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 750, 140));

        ven.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        ven.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Diego", "Juan", "Diogo", "Karen", "Jesus" }));
        ven.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venActionPerformed(evt);
            }
        });
        jPanel1.add(ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 190, 40));

        pag.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagActionPerformed(evt);
            }
        });
        pag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pagKeyTyped(evt);
            }
        });
        jPanel1.add(pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 170, 40));

        cam.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        cam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camActionPerformed(evt);
            }
        });
        cam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                camKeyTyped(evt);
            }
        });
        jPanel1.add(cam, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 170, 40));

        to.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        to.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                toKeyTyped(evt);
            }
        });
        jPanel1.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 160, 50));

        pro.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        pro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                proKeyTyped(evt);
            }
        });
        jPanel1.add(pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 190, 40));

        ticket.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        ticket.setText("Generar Ticket");
        ticket.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketActionPerformed(evt);
            }
        });
        jPanel1.add(ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 210, 40));

        Producto.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Producto.setForeground(new java.awt.Color(0, 0, 0));
        Producto.setText("Producto:");
        jPanel1.add(Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        vendedor.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        vendedor.setForeground(new java.awt.Color(0, 0, 0));
        vendedor.setText("Vendedor:");
        jPanel1.add(vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 120, -1));

        Pgo1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Pgo1.setForeground(new java.awt.Color(0, 0, 0));
        Pgo1.setText("Cantidad:");
        jPanel1.add(Pgo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        Pgo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Pgo.setForeground(new java.awt.Color(0, 0, 0));
        Pgo.setText("Pago:");
        jPanel1.add(Pgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        cambio1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        cambio1.setForeground(new java.awt.Color(0, 0, 0));
        cambio1.setText("Cliente:");
        jPanel1.add(cambio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 90, -1));

        cambio.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        cambio.setForeground(new java.awt.Color(0, 0, 0));
        cambio.setText("Cambio:");
        jPanel1.add(cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 90, -1));

        total.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 0));
        total.setText("Total: $");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 100, -1));

        $1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        $1.setForeground(new java.awt.Color(0, 0, 0));
        $1.setText("$");
        jPanel1.add($1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, -1, -1));

        $.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        $.setForeground(new java.awt.Color(0, 0, 0));
        $.setText("$");
        jPanel1.add($, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, -1));

        cant.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantActionPerformed(evt);
            }
        });
        cant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantKeyTyped(evt);
            }
        });
        jPanel1.add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 140, 40));

        agregar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        agregar.setText("Agregar");
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 130, 40));
        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Inf.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Inf.setText("Informacion");
        Inf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfActionPerformed(evt);
            }
        });
        jPanel1.add(Inf, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 140, 50));

        cliente.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clienteKeyTyped(evt);
            }
        });
        jPanel1.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 170, 50));

        eliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, -1, -1));

        tabla.setVisible(true);

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

        javax.swing.GroupLayout tablaLayout = new javax.swing.GroupLayout(tabla.getContentPane());
        tabla.getContentPane().setLayout(tablaLayout);
        tablaLayout.setHorizontalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tablaLayout.setVerticalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        jPanel1.add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 760, 190));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
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
    }//GEN-LAST:event_RegresarActionPerformed

    private void pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagActionPerformed

    private void camActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camActionPerformed

    private void cantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        String cos = cant.getText().trim(); 
        String id = pro.getText().trim();
        modelo = (DefaultTableModel)ca.getModel();
        ca.setModel(modelo);
        Object[] imgan = new Object[5];
        try{ 
        if(!id.equals("") && !cos.equals("")){ 
            canti = Integer.parseInt(cant.getText());
            int np = 0;
            Connection cn = Conexion.conectar(); 
            PreparedStatement pst = cn.prepareStatement("select ID,Nombre,Precio,Cantidad from img WHERE ID ='"+id+"'");
            ResultSet rs = pst.executeQuery();
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null,"¡El producto no fue encontrado!");
                np=1;
            }
            while(rs.next()){    
                imgan [0] = rs.getInt("ID");
                imgan [1] = rs.getString("Nombre");
                imgan [2] = rs.getDouble("Precio");
                imgan [3] = canti;
                ca_b = rs.getInt("Cantidad"); 
                pre = rs.getDouble("Precio");
                if (ca_b - canti < 0) {
                    JOptionPane.showMessageDialog(null,"¡No hay suficiente Stock!");
                } else {
                    modelo.addRow(imgan);
                    productos_vendidos.add(imgan);
                }
            } 
            cont=cont+1;
            ca_a = ca_b - canti;
            if (ca_a >= 0 && np == 0) {               
                prea = pre * canti;
                his = his + prea;
                imgan[4] = ca_a; 
                to.setText(String.format("%.2f",his));
                this.ca.setModel(modelo);
            }
            pro.setText("");
            cant.setText("");          
        }
        else{
           JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");
        }
        }catch (HeadlessException | NumberFormatException | SQLException e){      
        }             
    }//GEN-LAST:event_agregarActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        
    }//GEN-LAST:event_clienteActionPerformed

    private void ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketActionPerformed
        String p = pag.getText().trim();
        String u = ven.getSelectedItem().toString();
        String cli = cliente.getText().trim();
       
        if(p.equals("") || u.equals("Seleccionar") || cli.equals("")){
            JOptionPane.showMessageDialog(null,"Debes llenar los datos");          
        } 
        double pagocli = Double.parseDouble(p);
        cambi= pagocli-his;       
        if(his<=pagocli){          
          cam.setText(String.format("%.2f", cambi));
          Locale locale = new Locale("es", "ES");
          DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM, locale);
          Date fecha = new Date();
          String fecha_con_formato = dateFormat.format(fecha);         
          
          JOptionPane.showMessageDialog(null,"Gracias por tu compra " + cli + " el " + fecha_con_formato);
          
          // Aquí se guarda todo en la BD
          try {
              // Obtener la cantidad total
            int cantidad_total = 0;
            Object[] temp = new Object[4];
            for (int i = 0; i < productos_vendidos.size(); i++) {   
                int cant = (int) productos_vendidos.get(i)[3];
                cantidad_total += cant;
            }
            Connection cn = Conexion.conectar(); // conexion a  la base de datos 
            PreparedStatement pst = cn.prepareStatement("insert into pedido values(?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);//Para dar Instrucciones a la base de datos               
            pst.setString(1, "0");
            pst.setInt(2, cantidad_total);
            pst.setDouble(3, his);
            pst.setDouble(4, cambi);
            pst.setString(5, cli);
            pst.setInt(6, id_usuario);
            pst.setLong(7, fecha.getTime());
            pst.executeUpdate(); //  ejecuta la indicacion 
            ResultSet res = pst.getGeneratedKeys();
            while (res.next()) {
                folio = res.getInt(1);
            }            
            for (int i = 0; i < productos_vendidos.size(); i++) {
                PreparedStatement dpedido = cn.prepareStatement("insert into dpedido values(?,?,?,?,?)");//Para dar Instrucciones a la base de datos               
                dpedido.setString(1, "0");
                dpedido.setInt(2, (int) productos_vendidos.get(i)[0]);
                dpedido.setDouble(3, (double) productos_vendidos.get(i)[2]);
                dpedido.setInt(4, (int) productos_vendidos.get(i)[3]);
                dpedido.setInt(5, folio);
                dpedido.executeUpdate();
                
                PreparedStatement update_cantidad = cn.prepareStatement("UPDATE img SET Cantidad = ? WHERE ID = ?");
                update_cantidad.setInt(1, (int) productos_vendidos.get(i)[4]); 
                update_cantidad.setString(2, productos_vendidos.get(i)[0].toString()); 
                update_cantidad.executeUpdate(); 
            }  
          } catch (SQLException e) {
              System.out.println(e);
          }          
        try{
            Connection cn = Conexion.conectar(); 
            PreparedStatement pst;
            pst = cn.prepareStatement("select Nombre from usuario WHERE ID= '"+id_usuario+"'"); 
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                em = rs.getString("Nombre");   
        }
        }catch(SQLException e){
        }
        Document documento = new Document();  
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/"+cli+".pdf"));
            
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/Imagenes/logo.jpeg");
            header.scaleToFit(100,100);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph linea = new Paragraph();
            linea.setAlignment(Paragraph.ALIGN_CENTER);
            linea.add("----------------------------------------------------------------------------------------------------------------------------------");
            
            Paragraph local = new Paragraph();
            local.setAlignment(Paragraph.ALIGN_CENTER);
            local.add("Sucursal: Jorge González Camarena #622, San Nicolás de los Garza, Nuevo León\n");
            
            Paragraph datos = new Paragraph();
            datos.setAlignment(Paragraph.ALIGN_CENTER);
            datos.add("ID Vendedor: "+id_usuario+"\n"
                    + "Nombre del Vendedor: "+em+"\n"
                    + "Nombre del Cliente: "+cli+"\n"
                    + "Folio de la Venta: "+folio+"\n");
            datos.setFont(FontFactory.getFont("Tahoma",14,Font.BOLD, BaseColor.DARK_GRAY));
            
            Paragraph venta = new Paragraph();
            venta.setAlignment(Paragraph.ALIGN_CENTER);
            venta.add("Venta");
            venta.setFont(FontFactory.getFont("Tahoma",14,Font.BOLD, BaseColor.DARK_GRAY));
            
            Paragraph prelist = new Paragraph();
            prelist.setAlignment(Paragraph.ALIGN_LEFT);
            prelist.add(""
          + "                             ID         Productos -------------------------------------------- Cantidad");
            prelist.setFont(FontFactory.getFont("Tahoma",14,Font.BOLD, BaseColor.DARK_GRAY));
            
            Paragraph list = new Paragraph();
            list.setAlignment(Paragraph.LIST);
            list.setFont(FontFactory.getFont("Tahoma",14,Font.BOLD, BaseColor.DARK_GRAY));           
            
            Paragraph fin = new Paragraph();
            fin.setAlignment(Paragraph.ALIGN_RIGHT);
            fin.add("\nTotal: $"+String.format("%.2f",his)+" Pesos\n"
                  + "Pago: $"+p+" Pesos\n"
                  + "Cambio: $"+String.format("%.2f",cambi)+" Pesos");
            fin.setFont(FontFactory.getFont("Tahoma",14,Font.BOLD, BaseColor.DARK_GRAY));            
            
            Paragraph fe = new Paragraph();
            fe.setAlignment(Paragraph.ALIGN_CENTER);
            fe.add("Fecha de la compra: "+fecha_con_formato);
            fe.setFont(FontFactory.getFont("Tahoma",14,Font.BOLD, BaseColor.DARK_GRAY));
            
            Paragraph credito = new Paragraph();
            credito.setAlignment(Paragraph.ALIGN_CENTER);
            credito.add("Original-Cliente\n"
                    + "Jorge González Camarena #622, San Nicolás de los Garza, Nuevo León\n"
                    + "<GRACIAS POR SU COMPRA>\n"
                    + "Favor de Verificar su Cambio\n"
                    + "No Hay Cambio o Devoluciones\n"
                    + "No se Admite Reclamaciones");
            credito.setFont(FontFactory.getFont("Tahoma",14,Font.BOLD, BaseColor.DARK_GRAY));
            
            Paragraph redes = new Paragraph();
            redes.setAlignment(Paragraph.ALIGN_CENTER);
            redes.add("Redes Sociales\n"
                    + "Contacto Directo (WhatsApp): 8120659599\n"
                    + "Correo Personal: ale_loz_nev@hotmail.com\n"
                    + "Facebook de la Tienda: D Amelia Boutique\n"
                    + "Facebook Personal: Alexa Lozano (Soy Alex)\n"
                    + "Instagram Personal: @esta_tipa_de_aqui");
            redes.setFont(FontFactory.getFont("Tahoma",14,Font.BOLD, BaseColor.DARK_GRAY));
            
            documento.open();
            documento.add(header);
            documento.add(linea);
            documento.add(local);
            documento.add(datos);
            documento.add(fe);            
            documento.add(linea);
            documento.add(venta);
            documento.add(prelist);      
            
            for (int i = 0; i < productos_vendidos.size(); i++) {                             
                list.add("\n"
          + "                     "+(int) productos_vendidos.get(i)[0]+"       "+productos_vendidos.get(i)[1]+" ---------------------------------------- "+(int) productos_vendidos.get(i)[3]);              
                con_i=con_i+1;
                if(cont == con_i){
                documento.add(list);
                }
            }           
            documento.add(fin);
            documento.add(linea);
            documento.add(credito);
            documento.add(linea);
            documento.add(redes);
            documento.add(linea);
            documento.close();
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        } catch (IOException ex) {
                Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }  
        else{
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
        }
    }//GEN-LAST:event_ticketActionPerformed

    private void venActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venActionPerformed
        // Obtiene el ID del vendedor:
        String nombre_del_vendedor = ven.getSelectedItem().toString();
        try {
            Connection cn = Conexion.conectar();//se conecta a la base de datos              
            PreparedStatement pst = cn.prepareStatement("select ID from usuario where Nombre='"+nombre_del_vendedor+"'");   // selecciona el tipo y checa si el usuario y la contra es la misma que la interfaz                            
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                id_usuario = rs.getInt("ID");
            }
        } catch (SQLException e) {
            
        }
    }//GEN-LAST:event_venActionPerformed

    private void proKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proKeyTyped
        //producto
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9')evt.consume(); //esto permite solo escribir numeros
    }//GEN-LAST:event_proKeyTyped

    private void cantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantKeyTyped
        //cantidad
        char c = evt.getKeyChar();        
        if(c<'0' || c>'9')evt.consume(); //esto permite solo escribir numeros
    }//GEN-LAST:event_cantKeyTyped

    private void pagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagKeyTyped
        //pago
        char c = evt.getKeyChar();        
        if((c<'0' || c>'9') && (c!='.'))evt.consume(); //esto permite solo escribir numeros
    }//GEN-LAST:event_pagKeyTyped

    private void camKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camKeyTyped
        //cambio
        char c = evt.getKeyChar();        
        if((c<'0' || c>'9') && (c!='.'))evt.consume(); //esto permite solo escribir numeros
    }//GEN-LAST:event_camKeyTyped

    private void clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienteKeyTyped
       //Nombre
        char c = evt.getKeyChar(); //se crea un caracter c         
        if((c<'a' || c>'z')&&(c<'A'|c>'Z') 
           && (c !='á') && (c !='é') && (c !='í') && (c !='ó') && (c !='ú') && (c !='ñ')&& (c !='Ñ')
           && (c != (char) KeyEvent.VK_SPACE))evt.consume(); // esto permite que solo se pueda escribir letras
    }//GEN-LAST:event_clienteKeyTyped

    private void toKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toKeyTyped
        //Total
        char c = evt.getKeyChar();        
        if((c<'0' || c>'9') && (c!='.'))evt.consume(); //esto permite solo escribir numeros
    }//GEN-LAST:event_toKeyTyped

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int fila = ca.getSelectedRow();
        if(fila>-1){
            double precio_a_eliminar = (double) productos_vendidos.get(id_para_eliminar)[2];
            int cant_a_eliminar = (int) productos_vendidos.get(id_para_eliminar)[3];
            double subtotal_a_eliminar = precio_a_eliminar * cant_a_eliminar;
            his = his - subtotal_a_eliminar;
            cont--;
            productos_vendidos.remove(id_para_eliminar);
            modelo = (DefaultTableModel)ca.getModel();
            modelo.removeRow(id_para_eliminar);
            ca.setModel(modelo);
            to.setText(String.format("%.2f",his));  
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione un Producto");
        }                                 
    }//GEN-LAST:event_eliminarActionPerformed

    private void caMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caMouseClicked
        // TODO add your handling code here: 
        id_para_eliminar = ca.getSelectedRow();
    }//GEN-LAST:event_caMouseClicked

    private void InfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfActionPerformed
       if(tablavi==0){
            tabla.setVisible(true);
            tablavi=1;
        }
        else{
            tabla.setVisible(false);
            tablavi=0;
        }
    }//GEN-LAST:event_InfActionPerformed
  
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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel $;
    private javax.swing.JLabel $1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JButton Inf;
    private javax.swing.JLabel Pgo;
    private javax.swing.JLabel Pgo1;
    private javax.swing.JLabel Producto;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton agregar;
    private javax.swing.JTable art;
    private javax.swing.JLabel c;
    private javax.swing.JTable ca;
    private javax.swing.JTextField cam;
    private javax.swing.JLabel cambio;
    private javax.swing.JLabel cambio1;
    private javax.swing.JTextField cant;
    private javax.swing.JScrollPane car;
    private javax.swing.JTextField cliente;
    private javax.swing.JButton eliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pag;
    private javax.swing.JTextField pro;
    private javax.swing.JInternalFrame tabla;
    private javax.swing.JButton ticket;
    private javax.swing.JTextField to;
    private javax.swing.JLabel total;
    private javax.swing.JComboBox<String> ven;
    private javax.swing.JLabel vendedor;
    // End of variables declaration//GEN-END:variables
}
