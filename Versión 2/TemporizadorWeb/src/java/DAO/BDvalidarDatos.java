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
public class BDvalidarDatos {
    
    BDConexion conexion;
    
    public BDvalidarDatos(){
        conexion = new BDConexion();
        System.out.println(conexion.getMensaje());
    }
    
    public void datos_usuario(String usuario, String contraseña){
        try {
            String strSQL = "SELECT * FROM usuarios WHERE usuario = '" + usuario +"' AND contraseña = '" + contraseña + "';";
            System.out.println(strSQL);
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            ResultSet res = pstm.executeQuery();
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
        }*/ } catch (SQLException ex) {
            System.out.println("ERRRRRRRRRRROOOOOOOOOOOOOR");
            System.out.println(ex.toString());
            Logger.getLogger(BDvalidarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getMensaje() {
        return conexion.getMensaje();
    }
    
}
