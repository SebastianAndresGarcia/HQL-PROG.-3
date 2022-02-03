/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloHQL;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Sebastian Garcia
 */
@Entity
//@Table(name = "componentes")
public class Componente  extends EntityBean implements java.io.Serializable {
    
    private String nombre;
    private String NroSerie;
    //private long idComputadora;  //me genera conflicto con la foreingkey porque se llama igual por eso tengo que sacar esta variable
    private Computadora computadora;

    public Componente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroSerie() {
        return NroSerie;
    }

    public void setNroSerie(String NroSerie) {
        this.NroSerie = NroSerie;
    }
    
//    public long getIdComputadora() {
//        return idComputadora;
//    }
//
//    public void setIdComputadora(long idComputadora) {
//        this.idComputadora = idComputadora;
//    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idComputadora")
    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

}
