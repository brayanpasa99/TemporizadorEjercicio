/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author braya
 */
public class BDregistrarUsuario {
    
    BDConexion conexion;
    
    public BDregistrarUsuario(){
        conexion = new BDConexion();
    }
    
    public void inserta_usuario(String usuario, String contraseña){
        try {
            String strSQL = "INSERT INTO usuarios (usuario, contraseña) VALUES ('" + usuario + "', '" + contraseña + "');";
            System.out.println(strSQL);
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            ResultSet res = pstm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(BDregistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getMensaje() {
        return conexion.getMensaje();
    }
    
}
