/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Logger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import static javax.persistence.TemporalType.DATE;
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
    @GeneratedValue(strategy = IDENTITY)
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
    @Temporal(DATE)
    private Date fechaventa;
    @Column(name = "fechadigita")
    @Temporal(DATE)
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

    /**
     *
     */
    public Ventas() {
    }

    /**
     *
     * @param idventa
     */
    public Ventas(Integer idventa) {
        this.idventa = idventa;
    }

    /**
     *
     * @param idventa
     * @param numdocvta
     */
    public Ventas(Integer idventa, String numdocvta) {
        this.idventa = idventa;
        this.numdocvta = numdocvta;
    }

    /**
     *
     * @return
     */
    public Integer getIdventa() {
        return idventa;
    }

    /**
     *
     * @param idventa
     */
    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

    /**
     *
     * @return
     */
    public BigDecimal getGravado() {
        return gravado;
    }

    /**
     *
     * @param gravado
     */
    public void setGravado(BigDecimal gravado) {
        this.gravado = gravado;
    }

    /**
     *
     * @return
     */
    public BigDecimal getValorventa() {
        return valorventa;
    }

    /**
     *
     * @param valorventa
     */
    public void setValorventa(BigDecimal valorventa) {
        this.valorventa = valorventa;
    }

    /**
     *
     * @return
     */
    public BigDecimal getValoriva() {
        return valoriva;
    }

    /**
     *
     * @param valoriva
     */
    public void setValoriva(BigDecimal valoriva) {
        this.valoriva = valoriva;
    }

    /**
     *
     * @return
     */
    public BigDecimal getValorpercepcion() {
        return valorpercepcion;
    }

    /**
     *
     * @param valorpercepcion
     */
    public void setValorpercepcion(BigDecimal valorpercepcion) {
        this.valorpercepcion = valorpercepcion;
    }

    /**
     *
     * @return
     */
    public String getTipoventa() {
        return tipoventa;
    }

    /**
     *
     * @param tipoventa
     */
    public void setTipoventa(String tipoventa) {
        this.tipoventa = tipoventa;
    }

    /**
     *
     * @return
     */
    public Date getFechaventa() {
        return fechaventa;
    }

    /**
     *
     * @param fechaventa
     */
    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    /**
     *
     * @return
     */
    public Date getFechadigita() {
        return fechadigita;
    }

    /**
     *
     * @param fechadigita
     */
    public void setFechadigita(Date fechadigita) {
        this.fechadigita = fechadigita;
    }

    /**
     *
     * @return
     */
    public String getNumdocvta() {
        return numdocvta;
    }

    /**
     *
     * @param numdocvta
     */
    public void setNumdocvta(String numdocvta) {
        this.numdocvta = numdocvta;
    }

    /**
     *
     * @return
     */
    public Clientes getIdcliente() {
        return idcliente;
    }

    /**
     *
     * @param idcliente
     */
    public void setIdcliente(Clientes idcliente) {
        this.idcliente = idcliente;
    }

    /**
     *
     * @return
     */
    public Empresas getIdempresa() {
        return idempresa;
    }

    /**
     *
     * @param idempresa
     */
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
        return !((this.idventa == null && other.idventa != null) || (this.idventa != null && !this.idventa.equals(other.idventa)));
    }

    @Override
    public String toString() {
        return "pojos.Ventas[ idventa=" + idventa + " ]";
    }
    private static final Logger LOG = Logger.getLogger(Ventas.class.getName());
    
}
