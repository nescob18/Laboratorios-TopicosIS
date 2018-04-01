/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.infoHostBD;

/**
 *
 * @author Nescob18
 */
public final class infoHostBD {
    private static final String bD = "mysql";
    private static final String host = "localhost";
    private static final String puerto = "3306";
    private static final String nombreBD = "estudiantesEafit";
    private static final String usuario = "root";
    private static final String password = "root";

    /**
     * @return the bD
     */
    public static String getbD() {
        return bD;
    }

    /**
     * @return the host
     */
    public static String getHost() {
        return host;
    }

    /**
     * @return the puerto
     */
    public static String getPuerto() {
        return puerto;
    }

    /**
     * @return the nombreBD
     */
    public static String getNombreBD() {
        return nombreBD;
    }

    /**
     * @return the usuario
     */
    public static String getUsuario() {
        return usuario;
    }

    /**
     * @return the password
     */
    public static String getPassword() {
        return password;
    }
}
