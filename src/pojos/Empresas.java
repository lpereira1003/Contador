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
@Table(name = "empresas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e")
    , @NamedQuery(name = "Empresas.findByNombre", query = "SELECT e FROM Empresas e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empresas.findByGiro", query = "SELECT e FROM Empresas e WHERE e.giro = :giro")
    , @NamedQuery(name = "Empresas.findByNit", query = "SELECT e FROM Empresas e WHERE e.nit = :nit")
    , @NamedQuery(name = "Empresas.findByNcr", query = "SELECT e FROM Empresas e WHERE e.ncr = :ncr")
    , @NamedQuery(name = "Empresas.findByGcontrib", query = "SELECT e FROM Empresas e WHERE e.gcontrib = :gcontrib")
    , @NamedQuery(name = "Empresas.findByIdempresa", query = "SELECT e FROM Empresas e WHERE e.idempresa = :idempresa")})
public class Empresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "giro")
    private String giro;
    @Column(name = "nit")
    private String nit;
    @Column(name = "ncr")
    private String ncr;
    @Column(name = "gcontrib")
    private Boolean gcontrib;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempresa")
    private Integer idempresa;
    @OneToMany(mappedBy = "idempresa")
    private Collection<Compras> comprasCollection;
    @OneToMany(mappedBy = "idempresa")
    private Collection<Ventas> ventasCollection;

    public Empresas() {
    }

    public Empresas(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNcr() {
        return ncr;
    }

    public void setNcr(String ncr) {
        this.ncr = ncr;
    }

    public Boolean getGcontrib() {
        return gcontrib;
    }

    public void setGcontrib(Boolean gcontrib) {
        this.gcontrib = gcontrib;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
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
        hash += (idempresa != null ? idempresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.idempresa == null && other.idempresa != null) || (this.idempresa != null && !this.idempresa.equals(other.idempresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojos.Empresas[ idempresa=" + idempresa + " ]";
    }
    
}
