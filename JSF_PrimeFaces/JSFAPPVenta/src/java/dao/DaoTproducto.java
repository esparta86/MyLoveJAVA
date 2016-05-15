/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Interface.ITProducto;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Tproducto;

/**
 *
 * @author Esparta_86
 */
public class DaoTproducto implements ITProducto{

    @Override
    public Tproducto getByIdProducto(Session session, Integer idProducto) throws Exception {
        return (Tproducto)session.load(Tproducto.class,idProducto);
    }

    @Override
    public List<Tproducto> getALL(Session session) throws Exception {
        return session.createCriteria(Tproducto.class).list();
    }

    @Override
    public Tproducto getByCodigoBarras(Session session, String codigoBarras) throws Exception {
        String hql="from Tproducto where codigoBarras=:codigoBarras";
        Query query= session.createQuery(hql);
        query.setParameter("codigoBarras", codigoBarras);
        return (Tproducto)query.uniqueResult();
    }
    
}
