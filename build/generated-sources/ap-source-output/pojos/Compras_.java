package pojos;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pojos.Clientes;
import pojos.Empresas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-12T20:49:01")
@StaticMetamodel(Compras.class)
public class Compras_ { 

    public static volatile SingularAttribute<Compras, Integer> idcompra;
    public static volatile SingularAttribute<Compras, Clientes> idproveedor;
    public static volatile SingularAttribute<Compras, BigDecimal> valorpercibe;
    public static volatile SingularAttribute<Compras, Empresas> idempresa;
    public static volatile SingularAttribute<Compras, BigDecimal> gravado;
    public static volatile SingularAttribute<Compras, BigDecimal> valoriva;
    public static volatile SingularAttribute<Compras, BigDecimal> valorcompra;
    public static volatile SingularAttribute<Compras, Date> fechadigitado;
    public static volatile SingularAttribute<Compras, String> numdoc;
    public static volatile SingularAttribute<Compras, Date> fechacompra;

}