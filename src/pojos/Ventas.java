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
@Table(name = "ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v")
    , @NamedQuery(name = "Ventas.findByIdventa", query = "SELECT v FROM Ventas v WHERE v.idventa = :idventa")
    , @NamedQuery(name = "Ventas.findByGravado", query = "SELECT v FROM Ventas v WHERE v.gravado = :gravado")
    , @NamedQuery(name = "Ventas.findByValorventa", query = "SELECT v FROM Ventas v WHERE v.valorventa = :valorventa")
    , @NamedQuery(name = "Ventas.findByValoriva", query = "SELECT v FROM Ventas v WHERE v.valoriva = :valoriva")
    , @NamedQuery(name = "Ventas.findByValorpercepcion", query = "SELECT v FROM Ventas v WHERE v.valorpercepcion = :valorpercepcion")
    , @NamedQuery(name = "Ventas.findByTipoventa", query = "SELECT v FROM Ventas v WHERE v.tipoventa = :tipoventa")
    , @NamedQuery(name = "Ventas.findByFechaventa", query = "SELECT v FROM Ventas v WHERE v.fechaventa = :fechaventa")
    , @NamedQuery(name = "Ventas.findByFechadigita", query = "SELECT v FROM Ventas v WHERE v.fechadigita = :fechadigita")
    , @NamedQuery(name = "Ventas.findByNumdocvta", query = "SELECT v FROM Ventas v WHERE v.numdocvta = :numdocvta")})
public class Ventas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idventa")
    private Integer idventa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "gravado")
    private BigDecimal gravado;
    @Column(name = "valorventa")
    private BigDecimal valorventa;
    @Column(name = "valoriva")
    private BigDecimal valoriva;
    @Column(name = "valorpercepcion")
    private BigDecimal valorpercepcion;
    @Column(name = "tipoventa")
    private String tipoventa;
    @Column(name = "fechaventa")
    @Temporal(TemporalType.DATE)
    private Date fechaventa;
    @Column(name = "fechadigita")
    @Temporal(TemporalType.DATE)
    private Date fechadigita;
    @Basic(optional = false)
    @Column(name = "numdocvta")
    private String numdocvta;
    @JoinColumn(name = "idcliente", referencedColumnName = "idclien")
    @ManyToOne
    private Clientes idcliente;
    @JoinColumn(name = "idempresa", referencedColumnName = "idempresa")
    @ManyToOne
    private Empresas idempresa;

    public Ventas() {
    }

    public Ventas(Integer idventa) {
        this.idventa = idventa;
    }

    public Ventas(Integer idventa, String numdocvta) {
        this.idventa = idventa;
        this.numdocvta = numdocvta;
    }

    public Integer getIdventa() {
        return idventa;
    }

    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

    public BigDecimal getGravado() {
        return gravado;
    }

    public void setGravado(BigDecimal gravado) {
        this.gravado = gravado;
    }

    public BigDecimal getValorventa() {
        return valorventa;
    }

    public void setValorventa(BigDecimal valorventa) {
        this.valorventa = valorventa;
    }

    public BigDecimal getValoriva() {
        return valoriva;
    }

    public void setValoriva(BigDecimal valoriva) {
        this.valoriva = valoriva;
    }

    public BigDecimal getValorpercepcion() {
        return valorpercepcion;
    }

    public void setValorpercepcion(BigDecimal valorpercepcion) {
        this.valorpercepcion = valorpercepcion;
    }

    public String getTipoventa() {
        return tipoventa;
    }

    public void setTipoventa(String tipoventa) {
        this.tipoventa = tipoventa;
    }

    public Date getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    public Date getFechadigita() {
        return fechadigita;
    }

    public void setFechadigita(Date fechadigita) {
        this.fechadigita = fechadigita;
    }

    public String getNumdocvta() {
        return numdocvta;
    }

    public void setNumdocvta(String numdocvta) {
        this.numdocvta = numdocvta;
    }

    public Clientes getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Clientes idcliente) {
        this.idcliente = idcliente;
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
        hash += (idventa != null ? idventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if ((this.idventa == null && other.idventa != null) || (this.idventa != null && !this.idventa.equals(other.idventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojos.Ventas[ idventa=" + idventa + " ]";
    }
    
}
