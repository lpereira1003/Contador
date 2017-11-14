package pojos;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pojos.Compras;
import pojos.Ventas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-01T17:46:58")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, Boolean> gcontrib;
    public static volatile CollectionAttribute<Clientes, Compras> comprasCollection;
    public static volatile SingularAttribute<Clientes, Integer> idclien;
    public static volatile SingularAttribute<Clientes, String> nit;
    public static volatile CollectionAttribute<Clientes, Ventas> ventasCollection;
    public static volatile SingularAttribute<Clientes, String> nombre;
    public static volatile SingularAttribute<Clientes, String> nrc;
    public static volatile SingularAttribute<Clientes, String> giro;

}