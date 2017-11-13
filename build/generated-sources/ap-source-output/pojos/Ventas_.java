package pojos;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pojos.Clientes;
import pojos.Empresas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-12T20:49:01")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Integer> idventa;
    public static volatile SingularAttribute<Ventas, Date> fechadigita;
    public static volatile SingularAttribute<Ventas, Empresas> idempresa;
    public static volatile SingularAttribute<Ventas, BigDecimal> gravado;
    public static volatile SingularAttribute<Ventas, BigDecimal> valoriva;
    public static volatile SingularAttribute<Ventas, String> tipoventa;
    public static volatile SingularAttribute<Ventas, BigDecimal> valorventa;
    public static volatile SingularAttribute<Ventas, BigDecimal> valorpercepcion;
    public static volatile SingularAttribute<Ventas, String> numdocvta;
    public static volatile SingularAttribute<Ventas, Date> fechaventa;
    public static volatile SingularAttribute<Ventas, Clientes> idcliente;

}