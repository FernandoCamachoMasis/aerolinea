/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import AccesoADatos.Servicio;
import Logica.Usuario;

/**
 *
 * @author Fernando
 */
public class ServicioUsuario extends Servicio {

    private static final String INSERUSUARIO = "{call insertarUsuario(?,?,?,?,?,?,?,?,?,?)}";
    private static final String ELIMINARUSUARIO = "{call eliminarUsuario(?)}";

    
    private static ServicioUsuario servicioUsuario = new ServicioUsuario();
    
    public void insertarUsuario(Usuario elUsuario) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(INSERUSUARIO);

            pstmt.setString(1, elUsuario.getUsuario());
            pstmt.setString(2, elUsuario.getPassword());
            pstmt.setString(3, elUsuario.getNombre());
            pstmt.setString(4, elUsuario.getApellidos());
            pstmt.setString(5, elUsuario.getEmail());
            pstmt.setString(6, elUsuario.getFecha());
            pstmt.setString(7, elUsuario.getDireccion());
            pstmt.setInt(9, (int)elUsuario.getTelefonoTrabajo());
            pstmt.setInt(10, (int)elUsuario.getCelular());
            
            
            
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la insercion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public void eliminarBien(String password) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;
        ResultSet rs = null;
        Usuario elUsuario = null;

        try {
            pstmt = conexion.prepareCall(ELIMINARUSUARIO);
            pstmt.setString(2, password);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }

    }

    
}
