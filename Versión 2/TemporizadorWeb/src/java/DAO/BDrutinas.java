/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public String consulta_rutinas(String usuario) {
        try {
            String strSQL = "SELECT t_descanso, t_ejercicio, t_totale, f_rutina \n"
                    + "FROM rutinasusuario WHERE usuario = '" + usuario + "';";
            System.out.println(strSQL);
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            ResultSet res = pstm.executeQuery();
            String lectura = ""; 
            while (res.next()) {
                lectura = lectura + "Descanso: " + res.getString(1) + " segundos " + "Ejercicio: " + res.getString(2) +" segundos " + "Duración:" + res.getString(3) + " minutos " + "Fecha: " + res.getString(4) + "<br>";
            }
            
            return lectura;

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(BDvalidarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
