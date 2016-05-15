/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Interface.ITVentaDetalle;
import org.hibernate.Session;
import pojo.Tventadetalle;

/**
 *
 * @author Esparta_86
 */
public class DaoTVentaDetalle implements ITVentaDetalle {

    @Override
    public boolean insert(Session session, Tventadetalle tVentaDetalle) throws Exception {
       session.save(tVentaDetalle);
       return true;
    }
    
}
