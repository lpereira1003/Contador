package pojos;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pojos.Compras;
import pojos.Ventas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-14T22:03:21")
@StaticMetamodel(Empresas.class)
public class Empresas_ { 

    public static volatile SingularAttribute<Empresas, Boolean> gcontrib;
    public static volatile SingularAttribute<Empresas, Integer> idempresa;
    public static volatile CollectionAttribute<Empresas, Compras> comprasCollection;
    public static volatile SingularAttribute<Empresas, String> nit;
    public static volatile CollectionAttribute<Empresas, Ventas> ventasCollection;
    public static volatile SingularAttribute<Empresas, String> ncr;
    public static volatile SingularAttribute<Empresas, String> nombre;
    public static volatile SingularAttribute<Empresas, String> giro;

}