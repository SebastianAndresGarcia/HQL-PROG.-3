/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloHQL;

import ControladorHQL.GestorComputadora;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Sebastian Garcia
 */
@Entity
//@Table(name = "computadora")
public class Computadora  extends EntityBean implements java.io.Serializable{
    //private static final long serialVersionUID = 1L;
    private String codigo;
    private String marca;
    private String modelo;
    
    private List<Componente> componentes=new ArrayList<>();
 
    public Computadora() {
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @OneToMany(mappedBy = "computadora",cascade = CascadeType.ALL)
    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

}
