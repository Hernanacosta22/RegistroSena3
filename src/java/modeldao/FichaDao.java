/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import Interfaz.MeFicha;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import model.Ficha;

/**
 *
 * @author APRENDIZ
 */
public class FichaDao implements MeFicha { 
    
     Ficha fi= new Ficha(); 
    Conexion cn= new  Conexion();
    Connection con; 
    PreparedStatement ps; 
    ResultSet rs;
    
    

    @Override
    public Ficha list(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List liataFichas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean registroFicha(Ficha fi) 
    {
        String sql="insert into ficha (codficha,cantiaprendices,codprograma,doapre)values('"+fi.getCodFicha()+"','"+fi.getCantidadAprendiz()+"','"+fi.getCodprograma()+"','"+fi.getCodFicha()+"')";
        
        try
        {
        
            con=cn.getConnection(); 
            ps=con.prepareStatement(sql); 
            ps.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "ficha registrada");
            
            
            
            
            
            
        }catch(Exception e)
        {
            
            
             JOptionPane.showMessageDialog(null, "ficha  no registrada");
            
            
            
        }
        return false;
     
            
    }

    @Override
    public boolean actualizarFicha(Ficha fi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarFicha(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
