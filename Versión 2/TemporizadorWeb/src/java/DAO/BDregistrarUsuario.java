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
    int id_datosu;
    
    public BDregistrarUsuario(){
        conexion = new BDConexion();
    }
    
    public void consigue_id(){
        
        id_datosu = 0;
        
        try {
            String strSQL = "SELECT * FROM datosusuario;";
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            ResultSet res = pstm.executeQuery();
            while(res.next()){
                id_datosu++;
                System.out.println(id_datosu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BDregistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void inserta_tusuarios(String usuario, String contraseña){
        try {
            String strSQL = "INSERT INTO usuarios (usuario, contraseña, id_datosu) VALUES ('" + usuario + "', '" + contraseña + "', '" + id_datosu + "');";
            System.out.println(strSQL);                                                     //('usuario', 'contraseña', 'id_datosu');
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            ResultSet res = pstm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(BDregistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void inserta_tdatosusuario(String apellido, String nombre, String edad){
        try {
            String strSQL = "INSERT INTO datosusuario (apellido, id_datosu, nombre, edad) VALUES ('" + apellido + "', '" + id_datosu + "', '" + nombre + "', '" + Integer.parseInt(edad) +"');";
            System.out.println(strSQL);                                                         //('apellido', 'id_datosu', 'nombre', 'edad');
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
