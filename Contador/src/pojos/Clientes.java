/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Master-Pc
 */
@Entity
@Table(name = "clientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c")
    , @NamedQuery(name = "Clientes.findByNombre", query = "SELECT c FROM Clientes c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Clientes.findByNit", query = "SELECT c FROM Clientes c WHERE c.nit = :nit")
    , @NamedQuery(name = "Clientes.findByNrc", query = "SELECT c FROM Clientes c WHERE c.nrc = :nrc")
    , @NamedQuery(name = "Clientes.findByGcontrib", query = "SELECT c FROM Clientes c WHERE c.gcontrib = :gcontrib")
    , @NamedQuery(name = "Clientes.findByIdclien", query = "SELECT c FROM Clientes c WHERE c.idclien = :idclien")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nit")
    private String nit;
    @Column(name = "nrc")
    private String nrc;
    @Column(name = "gcontrib")
    private Boolean gcontrib;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idclien")
    private Integer idclien;
    @OneToMany(mappedBy = "idproveedor")
    private Collection<Compras> comprasCollection;
    @OneToMany(mappedBy = "idcliente")
    private Collection<Ventas> ventasCollection;

    public Clientes() {
    }

    public Clientes(Integer idclien) {
        this.idclien = idclien;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public Boolean getGcontrib() {
        return gcontrib;
    }

    public void setGcontrib(Boolean gcontrib) {
        this.gcontrib = gcontrib;
    }

    public Integer getIdclien() {
        return idclien;
    }

    public void setIdclien(Integer idclien) {
        this.idclien = idclien;
    }

    @XmlTransient
    public Collection<Compras> getComprasCollection() {
        return comprasCollection;
    }

    public void setComprasCollection(Collection<Compras> comprasCollection) {
        this.comprasCollection = comprasCollection;
    }

    @XmlTransient
    public Collection<Ventas> getVentasCollection() {
        return ventasCollection;
    }

    public void setVentasCollection(Collection<Ventas> ventasCollection) {
        this.ventasCollection = ventasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclien != null ? idclien.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idclien == null && other.idclien != null) || (this.idclien != null && !this.idclien.equals(other.idclien))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojos.Clientes[ idclien=" + idclien + " ]";
    }
    
}
