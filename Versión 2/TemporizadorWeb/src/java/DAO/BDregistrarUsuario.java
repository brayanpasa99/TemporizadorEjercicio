/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author braya
 */
public class BDregistrarUsuario {
    
    BDConexion conexion;
    
    public BDregistrarUsuario(){
        conexion = new BDConexion();
    }
    
    public void inserta_usuario(String usuario, String contraseña) throws SQLException{
        String strSQL = "INSERT INTO usuarios (usuario, contraseña) VALUES ('" + usuario + "', '" + contraseña + "');";
        System.out.println(strSQL);
        /*PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
        ResultSet res = pstm.executeQuery();*/
        
    }
    
    /*public double getCopia(String idMaterial) throws SQLException {
        String strSQL = "SELECT * FROM copia WHERE k_isbnissn = '" + idMaterial + "' ORDER BY k_copia";
        System.out.println(strSQL);
        PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
        ResultSet res = pstm.executeQuery();
        double copia1 = 0;
        if (res.next()){
            if (res.getRow() == 1){
                copia1 = res.getDouble("k_copia");
            }  
        }
        return copia1;
    }*/
    
    public String getMensaje() {
        return conexion.getMensaje();
    }
    
}
