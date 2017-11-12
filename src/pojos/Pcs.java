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
@Table(name = "pcs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pcs.findAll", query = "SELECT p FROM Pcs p")
    , @NamedQuery(name = "Pcs.findByIdpcs", query = "SELECT p FROM Pcs p WHERE p.idpcs = :idpcs")
    , @NamedQuery(name = "Pcs.findByPcs", query = "SELECT p FROM Pcs p WHERE p.pcs = :pcs")})
public class Pcs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpcs")
    private Integer idpcs;
    @Column(name = "pcs")
    private String pcs;

    public Pcs() {
    }

    public Pcs(Integer idpcs) {
        this.idpcs = idpcs;
    }

    public Integer getIdpcs() {
        return idpcs;
    }

    public void setIdpcs(Integer idpcs) {
        this.idpcs = idpcs;
    }

    public String getPcs() {
        return pcs;
    }

    public void setPcs(String pcs) {
        this.pcs = pcs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpcs != null ? idpcs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pcs)) {
            return false;
        }
        Pcs other = (Pcs) object;
        if ((this.idpcs == null && other.idpcs != null) || (this.idpcs != null && !this.idpcs.equals(other.idpcs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojos.Pcs[ idpcs=" + idpcs + " ]";
    }
    
}
