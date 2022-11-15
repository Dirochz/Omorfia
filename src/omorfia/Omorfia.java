package omorfia;
import Formulario.AgArt;
import Formulario.Agpro;
import Formulario.Articulo;
import Formulario.InUsu;
import Formulario.Inventario;
import Formulario.Login;
import Formulario.Menu;
import Formulario.MenuEm;
import Formulario.Proveedor;
import Formulario.Ticket;
import Formulario.Usuario;

public class Omorfia {
    public static void main(String[] args) {
        
        Usuario U = new Usuario(); // Para poder hacer visible la imagen de la//
        U.setVisible(true);//Interfaz de Usuario//
        
        Proveedor p = new Proveedor();
        p.setVisible(true);
        
        Agpro Ap = new Agpro();
        Ap.setVisible(true);
        
        InUsu iu = new InUsu();
        iu.setVisible(true);
        
        Articulo Ar = new Articulo();
        Ar.setVisible(true);
        
        AgArt aa = new AgArt();
        aa.setVisible(true);
        
        Inventario i = new Inventario();
        i.setVisible(true);
        
        Ticket t = new Ticket();
        t.setVisible(true);
        
        Login l = new Login();
        l.setVisible(true);
        
        Menu m = new Menu();
        m.setVisible(true);
        
        MenuEm me = new MenuEm();
        me.setVisible(true);
    } 
}
