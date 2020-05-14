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
public class BDrutinas {

    BDConexion conexion;
    int id_rutinas;

    public BDrutinas() {
        conexion = new BDConexion();
    }

    public void consigue_id() {

        id_rutinas = 0;

        try {
            String strSQL = "SELECT * FROM rutinasusuario;";
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                id_rutinas++;
                System.out.println(id_rutinas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BDregistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void guarda_rutina(String usuario, int t_d, int t_e, String t_te) {

        try {
            String strSQL = "INSERT INTO rutinasusuario (id_rutinas, usuario, t_descanso, t_ejercicio, f_rutina, t_totale) \n"
                    + "VALUES ('" + id_rutinas + "', '" + usuario + "', '" + t_d + "', '" + t_e + "', current_timestamp, '" + t_te + "');";
            System.out.println(strSQL);
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            ResultSet res = pstm.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(BDvalidarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consulta_rutinas(String usuario) {

        try {
            String strSQL = "SELECT du.apellido, du.nombre, du.edad, u.usuario \n"
                    + "FROM datosusuario du \n"
                    + "INNER JOIN usuarios u ON du.id_datosu = u.id_datosu \n"
                    + "WHERE usuario = '" + usuario + "';";
            System.out.println(strSQL);
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {

            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(BDvalidarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
