/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorHQL;

import ModeloHQL.*;
import ControladorHQL.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian Garcia
 */
public class Main {

    public static void main(String[] args) {
        try {
            Computadora computadora = new Computadora();
            Componente componente = new Componente();
            Componente componente2 = new Componente();
            List<Componente> componentes = new ArrayList<Componente>();
            GestorComputadora gestor = new GestorComputadora();

            computadora.setCodigo("1012");
            computadora.setMarca("Lenovo");
            computadora.setModelo("JK560");

            componente.setNombre("SSD");
            componente.setNroSerie("256GB");

            componente.setComputadora(computadora);

            componente2.setNombre("Procesador");
            componente2.setNroSerie("AZ7899");
            componente2.setComputadora(computadora);
            componentes.add(componente);
            componentes.add(componente2);
            computadora.setComponentes(componentes);
            
            gestor.registrarComputadoraGestor(computadora);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
