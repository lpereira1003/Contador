/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Master-Pc
 */
@Entity
@Table(name = "compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compras.findAll", query = "SELECT c FROM Compras c")
    , @NamedQuery(name = "Compras.findByIdcompra", query = "SELECT c FROM Compras c WHERE c.idcompra = :idcompra")
    , @NamedQuery(name = "Compras.findByGravado", query = "SELECT c FROM Compras c WHERE c.gravado = :gravado")
    , @NamedQuery(name = "Compras.findByValorcompra", query = "SELECT c FROM Compras c WHERE c.valorcompra = :valorcompra")
    , @NamedQuery(name = "Compras.findByValoriva", query = "SELECT c FROM Compras c WHERE c.valoriva = :valoriva")
    , @NamedQuery(name = "Compras.findByValorpercibe", query = "SELECT c FROM Compras c WHERE c.valorpercibe = :valorpercibe")
    , @NamedQuery(name = "Compras.findByFechacompra", query = "SELECT c FROM Compras c WHERE c.fechacompra = :fechacompra")
    , @NamedQuery(name = "Compras.findByFechadigitado", query = "SELECT c FROM Compras c WHERE c.fechadigitado = :fechadigitado")})
public class Compras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcompra")
    private Integer idcompra;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "gravado")
    private BigDecimal gravado;
    @Column(name = "valorcompra")
    private BigDecimal valorcompra;
    @Column(name = "valoriva")
    private BigDecimal valoriva;
    @Column(name = "valorpercibe")
    private BigDecimal valorpercibe;
    @Column(name = "fechacompra")
    @Temporal(TemporalType.DATE)
    private Date fechacompra;
    @Column(name = "fechadigitado")
    @Temporal(TemporalType.DATE)
    private Date fechadigitado;
    @JoinColumn(name = "idproveedor", referencedColumnName = "idclien")
    @ManyToOne
    private Clientes idproveedor;
    @JoinColumn(name = "idempresa", referencedColumnName = "idempresa")
    @ManyToOne
    private Empresas idempresa;

    public Compras() {
    }

    public Compras(Integer idcompra) {
        this.idcompra = idcompra;
    }

    public Integer getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(Integer idcompra) {
        this.idcompra = idcompra;
    }

    public BigDecimal getGravado() {
        return gravado;
    }

    public void setGravado(BigDecimal gravado) {
        this.gravado = gravado;
    }

    public BigDecimal getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(BigDecimal valorcompra) {
        this.valorcompra = valorcompra;
    }

    public BigDecimal getValoriva() {
        return valoriva;
    }

    public void setValoriva(BigDecimal valoriva) {
        this.valoriva = valoriva;
    }

    public BigDecimal getValorpercibe() {
        return valorpercibe;
    }

    public void setValorpercibe(BigDecimal valorpercibe) {
        this.valorpercibe = valorpercibe;
    }

    public Date getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }

    public Date getFechadigitado() {
        return fechadigitado;
    }

    public void setFechadigitado(Date fechadigitado) {
        this.fechadigitado = fechadigitado;
    }

    public Clientes getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Clientes idproveedor) {
        this.idproveedor = idproveedor;
    }

    public Empresas getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Empresas idempresa) {
        this.idempresa = idempresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcompra != null ? idcompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compras)) {
            return false;
        }
        Compras other = (Compras) object;
        if ((this.idcompra == null && other.idcompra != null) || (this.idcompra != null && !this.idcompra.equals(other.idcompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojos.Compras[ idcompra=" + idcompra + " ]";
    }
    
}
