/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorHQL;

import DatosHQL.*;
import ModeloHQL.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian Garcia
 */
public class GestorComputadora extends Gestor {

    private Computadora cpu;
    private List<Componente> listaComponentes = new ArrayList<Componente>();

    public GestorComputadora() {

        sesion = ConfigHibernate.openSession();

    }
 //No hace falta que haga esta función, directamente en el main puedo crear un objeto GestorComputadora y
    //como dicho objeto hereda de gestor, desde allí accedo a la función guardar y 
    //le mando el objeto que quiero guardar. La dejé para compararlo con el ejercicio SQL
    public void registrarComputadoraGestor(Computadora computadora) {

        try {
            guardar(computadora);

        } catch (Exception ex) {
            Logger.getLogger(GestorComputadora.class.getName()).log(Level.SEVERE, null, ex);
        } 
        ConfigHibernate.closeSession(sesion);

    }

}
