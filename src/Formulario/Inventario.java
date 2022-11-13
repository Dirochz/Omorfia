package Formulario;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import omorfia.Conexion;

public class Inventario extends javax.swing.JFrame {

    public Inventario() {
        initComponents();
        setTitle("Inventario");
        this.setLocationRelativeTo(null);//centa la Intefaz
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
        Usuarios = new javax.swing.JButton();
        Articulos = new javax.swing.JButton();
        Articulo = new javax.swing.JLabel();
        Pro = new javax.swing.JButton();
        Provedores = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        Pedidos = new javax.swing.JButton();
        his_ven = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(229, 213, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bo_reg.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        bo_reg.setForeground(new java.awt.Color(0, 0, 0));
        bo_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/re.png"))); // NOI18N
        bo_reg.setText("Regresar");
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
        jPanel1.add(bo_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 50));

        Usuarios.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        Usuarios.setToolTipText("");
        Usuarios.setBorder(null);
        Usuarios.setBorderPainted(false);
        Usuarios.setContentAreaFilled(false);
        Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Usuarios.setDefaultCapable(false);
        Usuarios.setFocusPainted(false);
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, 120));

        Articulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Articulos.png"))); // NOI18N
        Articulos.setBorder(null);
        Articulos.setBorderPainted(false);
        Articulos.setContentAreaFilled(false);
        Articulos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Articulos.setDefaultCapable(false);
        Articulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArticulosActionPerformed(evt);
            }
        });
        jPanel1.add(Articulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, -1, -1));

        Articulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Articulo.setForeground(new java.awt.Color(0, 0, 0));
        Articulo.setText("Articulos");
        jPanel1.add(Articulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 110, -1));

        Pro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Proveedores.png"))); // NOI18N
        Pro.setBorder(null);
        Pro.setBorderPainted(false);
        Pro.setContentAreaFilled(false);
        Pro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pro.setDefaultCapable(false);
        Pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProActionPerformed(evt);
            }
        });
        jPanel1.add(Pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        Provedores.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Provedores.setForeground(new java.awt.Color(0, 0, 0));
        Provedores.setText("Proveedores");
        jPanel1.add(Provedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 150, -1));

        usuario.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("Usuario");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 90, -1));

        titulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Generar Reportes de las Tablas");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 360, -1));

        Pedidos.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Pedidos.setText("Pedidos");
        Pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosActionPerformed(evt);
            }
        });
        jPanel1.add(Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 240, 50));

        his_ven.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        his_ven.setText("Historial de ventas");
        his_ven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        his_ven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                his_venActionPerformed(evt);
            }
        });
        jPanel1.add(his_ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 240, 50));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bo_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_regActionPerformed
        Menu me = new Menu(); // declarar y llamar a la interfaz que quieres ir
        me.setVisible(true); // te mostrara lo que declarate en la variable 
        this.setVisible(false); //te oculta esta interfaz
    }//GEN-LAST:event_bo_regActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        Document documento = new Document();
       
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Usuario.pdf"));
            
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/Imagenes/logo.jpeg");
            header.scaleToFit(100,100);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph linea = new Paragraph();
            linea.setAlignment(Paragraph.ALIGN_CENTER);
            linea.add("----------------------------------------------------------------------------------------------------------------------------------");
            
            Paragraph Titulo = new Paragraph();
            Titulo.setAlignment(Paragraph.ALIGN_CENTER);
            Titulo.add("Usuarios \n\n");
            Titulo.setFont(FontFactory.getFont("Arial",30,Font.BOLD, BaseColor.DARK_GRAY));
            
            documento.open();
            documento.add(header);
            documento.add(linea);
            documento.add(Titulo);
            
            PdfPTable tabla = new PdfPTable(7);
            tabla.addCell("ID");
            tabla.addCell("Tipo");
            tabla.addCell("Nombre");
            tabla.addCell("Apellido Paterno");
            tabla.addCell("Apellido Materno");
            tabla.addCell("Correo");
            tabla.addCell("Contraseña");
            
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from usuario");    
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){                               
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                    } while (rs.next());
                    documento.add(tabla);                    
                }
                
            } catch (DocumentException | SQLException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        } catch (IOException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UsuariosActionPerformed

    private void ProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProActionPerformed
        Document documento = new Document();     
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Proveedores.pdf"));
            Paragraph Titulo = new Paragraph();
            
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/Imagenes/logo.jpeg");
            header.scaleToFit(100,100);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph linea = new Paragraph();
            linea.setAlignment(Paragraph.ALIGN_CENTER);
            linea.add("----------------------------------------------------------------------------------------------------------------------------------");
            
            Titulo.setAlignment(Paragraph.ALIGN_CENTER);
            Titulo.add("Proveedores \n\n");
            Titulo.setFont(FontFactory.getFont("Tahoma",30,Font.BOLD, BaseColor.DARK_GRAY));
            
            documento.open();
            documento.add(header);
            documento.add(linea);
            documento.add(Titulo);
            
            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell("ID");
            tabla.addCell("Empresa");
            tabla.addCell("Correo");
            tabla.addCell("Telefono");
            
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from proveedores");    
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){                               
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                    } while (rs.next());
                    documento.add(tabla);                    
                }
                
            } catch (DocumentException | SQLException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        } catch (IOException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ProActionPerformed

    private void ArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArticulosActionPerformed
        Document documento = new Document();     
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Articulos.pdf"));
            
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/Imagenes/logo.jpeg");
            header.scaleToFit(100,100);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph linea = new Paragraph();
            linea.setAlignment(Paragraph.ALIGN_CENTER);
            linea.add("----------------------------------------------------------------------------------------------------------------------------------");
            
            Paragraph Titulo = new Paragraph();           
            Titulo.setAlignment(Paragraph.ALIGN_CENTER);
            Titulo.add("Articulos \n\n");
            Titulo.setFont(FontFactory.getFont("Tahoma",30,Font.BOLD, BaseColor.DARK_GRAY));
            
            documento.open();
            documento.add(header);
            documento.add(linea);
            documento.add(Titulo);
            
            PdfPTable tabla = new PdfPTable(7);
            tabla.addCell("ID");
            tabla.addCell("Nombre");
            tabla.addCell("Marca");
            tabla.addCell("Talla");
            tabla.addCell("Cantidad");
            tabla.addCell("Precio");
            tabla.addCell("Descripción");
            
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from img");    
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){                               
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                    } while (rs.next());
                    documento.add(tabla);                    
                }
                
            } catch (DocumentException | SQLException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        } catch (IOException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ArticulosActionPerformed

    private void his_venActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_his_venActionPerformed
        Document documento = new Document();     
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Ventas.pdf"));
            
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/Imagenes/logo.jpeg");
            header.scaleToFit(100,100);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph linea = new Paragraph();
            linea.setAlignment(Paragraph.ALIGN_CENTER);
            linea.add("----------------------------------------------------------------------------------------------------------------------------------");
            
            Paragraph Titulo = new Paragraph();
            Titulo.setAlignment(Paragraph.ALIGN_CENTER);
            Titulo.add("Historial de Ventas \n\n");
            Titulo.setFont(FontFactory.getFont("Tahoma",30,Font.BOLD, BaseColor.DARK_GRAY));
            
            documento.open();
            documento.add(header);
            documento.add(linea);
            documento.add(Titulo);
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("ID");
            tabla.addCell("ID_Proveedor");
            tabla.addCell("Precio");
            tabla.addCell("Cantidad");
            tabla.addCell("Folio");            
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from dpedido");    
                ResultSet rs = pst.executeQuery();                
                if(rs.next()){                               
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    } while (rs.next());
                    documento.add(tabla);                    
                }                
            } catch (DocumentException | SQLException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        } catch (IOException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_his_venActionPerformed

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed
        Document documento = new Document();     
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Pedido.pdf"));
            
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/Imagenes/logo.jpeg");
            header.scaleToFit(100,100);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph linea = new Paragraph();
            linea.setAlignment(Paragraph.ALIGN_CENTER);
            linea.add("----------------------------------------------------------------------------------------------------------------------------------");
            
            Paragraph Titulo = new Paragraph();
            Titulo.setAlignment(Paragraph.ALIGN_CENTER);
            Titulo.add("Pedidos \n\n");
            Titulo.setFont(FontFactory.getFont("Tahoma",30,Font.BOLD, BaseColor.DARK_GRAY));
           
            documento.open();
            documento.add(header);
            documento.add(linea);
            documento.add(Titulo);
            
            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell("ID");
            tabla.addCell("Cantidad");
            tabla.addCell("Total");
            tabla.addCell("Cambio");
            tabla.addCell("cliente"); 
            tabla.addCell("ID_usuario");             
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from pedido");    
                ResultSet rs = pst.executeQuery();                
                if(rs.next()){                               
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                    } while (rs.next());
                    documento.add(tabla);                    
                }                
            } catch (DocumentException | SQLException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        } catch (IOException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_PedidosActionPerformed

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Articulo;
    private javax.swing.JButton Articulos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JButton Pedidos;
    private javax.swing.JButton Pro;
    private javax.swing.JLabel Provedores;
    private javax.swing.JButton Usuarios;
    private javax.swing.JButton bo_reg;
    private javax.swing.JButton his_ven;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
