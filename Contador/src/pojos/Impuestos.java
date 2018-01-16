/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Master-Pc
 */
@Entity
@Table(name = "impuestos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Impuestos.findAll", query = "SELECT i FROM Impuestos i")
    , @NamedQuery(name = "Impuestos.findByIdimpuesto", query = "SELECT i FROM Impuestos i WHERE i.idimpuesto = :idimpuesto")
    , @NamedQuery(name = "Impuestos.findByPercepcion", query = "SELECT i FROM Impuestos i WHERE i.percepcion = :percepcion")
    , @NamedQuery(name = "Impuestos.findByIva", query = "SELECT i FROM Impuestos i WHERE i.iva = :iva")
    , @NamedQuery(name = "Impuestos.findByConversion", query = "SELECT i FROM Impuestos i WHERE i.conversion = :conversion")})
public class Impuestos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idimpuesto")
    private Integer idimpuesto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "percepcion")
    private Double percepcion;
    @Column(name = "iva")
    private Double iva;
    @Column(name = "conversion")
    private Double conversion;

    public Impuestos() {
    }

    public Impuestos(Integer idimpuesto) {
        this.idimpuesto = idimpuesto;
    }

    public Integer getIdimpuesto() {
        return idimpuesto;
    }

    public void setIdimpuesto(Integer idimpuesto) {
        this.idimpuesto = idimpuesto;
    }

    public Double getPercepcion() {
        return percepcion;
    }

    public void setPercepcion(Double percepcion) {
        this.percepcion = percepcion;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getConversion() {
        return conversion;
    }

    public void setConversion(Double conversion) {
        this.conversion = conversion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idimpuesto != null ? idimpuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Impuestos)) {
            return false;
        }
        Impuestos other = (Impuestos) object;
        if ((this.idimpuesto == null && other.idimpuesto != null) || (this.idimpuesto != null && !this.idimpuesto.equals(other.idimpuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojos.Impuestos[ idimpuesto=" + idimpuesto + " ]";
    }
    
}
