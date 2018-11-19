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

import Logica.Avion;

/**
 *
 * @author Fernando
 */
public class ServicioAvion  extends Servicio{
    
    
  
    private static final String INSERTARAVION = "{call insertarAvion(?,?)}";
    private static final String ELIMINARAVION = "{call eliminarAvion(?)}";
    private static final String LISTARAVION = "{?=call listarAvion}";
    private static final String CONSULTARAVION = "{?=call buscarAvion(?)}";

    
    private static ServicioAvion servicioAvion = new ServicioAvion();
    
    public void insertarBien(Avion elAvion) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(INSERTARAVION);

            pstmt.setString(1, elAvion.getIdentificador());
            pstmt.setString(2, elAvion.getRuta());
            pstmt.setString(3, elAvion.getHorario());
            pstmt.setString(4, elAvion.getTipo());
            
            
            
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

    public void eliminarAvion(String identificador) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;
        ResultSet rs = null;
        Avion elAvion = null;

        try {
            pstmt = conexion.prepareCall(ELIMINARAVION);
            pstmt.setString(1, identificador);
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

    

    public Avion buscarBien(String elIdentificador) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }

        ResultSet rs = null;
        CallableStatement pstmt = null;
        Avion elAvion = null;
        ArrayList<Avion> coleccion = new ArrayList();

        try {
            pstmt = conexion.prepareCall(CONSULTARAVION);
            //pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.setString(2, elIdentificador);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);

            while (rs.next()) {
                if (rs.getString("serial").equals(elIdentificador)) {
                    elAvion = new Avion(rs.getString("identificador"),
                            rs.getString("ruta"),
                            rs.getString("horario"),
                            rs.getString("tipo")
                    );
                    break;
                }
            }
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
        if (elAvion == null) {
            throw new NoDataException("No existe una transferencia con este número");
        }
        return elAvion;
    }

    public ArrayList<Avion> listarAvion() throws GlobalException, NoDataException, SQLException {

        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        Avion elAvion = null;
        ArrayList<Avion> coleccion = new ArrayList();
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(LISTARAVION);
           // pstmt.registerOutParameter(1, OracleTypes.CURSOR);	
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);
            while (rs.next()) {
                elAvion = new Avion(rs.getString("identificador"),
                        rs.getString("ruta"),
                        rs.getString("horario"),
                        rs.getString("tipo")
                );
                coleccion.add(elAvion);
            }
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
        if (coleccion == null) {
            throw new NoDataException("No hay datos");
        }
        return coleccion;
    }
    
    
    
}

    
