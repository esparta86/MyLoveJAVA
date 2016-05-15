/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Interface.ITVenta;
import java.util.Calendar;
import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Tventa;

/**
 *
 * @author Esparta_86
 */
public class DaoTVenta  implements ITVenta{

    @Override
    public boolean insert(Session session, Tventa tventa) throws Exception {
        tventa.setFechaRegistro(Calendar.getInstance().getTime());
        session.save(tventa);
        return true;
    }

    @Override
    public Tventa getUltimoRegistro(Session session) throws Exception {
      String hql="from Tventa order by idVenta desc";
      Query query=session.createQuery(hql).setMaxResults(1);
      return (Tventa)query.uniqueResult();
    }
    
    
}
