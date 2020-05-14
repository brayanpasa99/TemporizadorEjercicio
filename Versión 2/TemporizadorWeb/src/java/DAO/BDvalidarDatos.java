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

    public BDvalidarDatos() {
        conexion = new BDConexion();
        System.out.println(conexion.getMensaje());
    }

    public String existe_usuario(String usuario, String contraseña) {
        try {
            String strSQL = "SELECT * FROM usuarios WHERE usuario = '" + usuario + "' AND contraseña = '" + contraseña + "';";
            System.out.println(strSQL);
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            ResultSet res = pstm.executeQuery();
            if (!res.next()) {
                return "NoExiste";
            } else {
                return res.getString(1);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(BDvalidarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String[] datos_usuario(String usuario) {
        
        String[] datos = new String[4];
        try {
            String strSQL = "SELECT du.apellido, du.nombre, du.edad, u.usuario \n"
                    + "FROM datosusuario du \n"
                    + "INNER JOIN usuarios u ON du.id_datosu = u.id_datosu \n"
                    + "WHERE usuario = '" + usuario + "';";
            System.out.println(strSQL);
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                datos[0] = res.getString(1);
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
            }
            
            return datos;

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(BDvalidarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getMensaje() {
        return conexion.getMensaje();
    }

}
